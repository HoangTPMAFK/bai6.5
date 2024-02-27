import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    List<Customer> customers;
    List<Visit> visits;
    CustomerManager () {
        customers = new ArrayList<>();
        visits = new ArrayList<>();
    }
    public void addCustomer(Customer newCustomer) {
        this.customers.add(newCustomer);
    }
    public void printCustomer () {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
    public void becomeMember (String name, boolean member) {
        boolean isExist = false;
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                customer.setMember(member);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Customer doesn't exist!");
        }
    }
    public void removeCustomer (String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                for (int i = 0; i < visits.size(); i++) {
                    if (visits.get(i).getCustomer().equals(customer)) {
                        visits.remove(i);
                        i--;
                    }
                }
                customers.remove(customer);
                break;
            }
        }
    }
    public void addVisit(Visit newVisit) {
        boolean isExist = false;
        for (Customer customer : customers) {
            if (customer.getName().equals(newVisit.getName())) {
                isExist = true;
                break;
            }
        }
        if (isExist) visits.add(newVisit);
        else {
            System.out.println("Customer doesn't exist!");
        }
    }
    public void printVisits () {
        for (Visit visit : visits) {
            System.out.println(visit.toString());
        }
    }
    public void removeVisit(Visit deleteVisit) {
        boolean isExist = false;
        for (Customer customer : customers) {
            if (customer.getName().equals(deleteVisit.getName())) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            for (Visit visit : visits) {
                if (visit.getName().equals(deleteVisit.getName()) && visit.getDate().equals(deleteVisit.getDate())) {
                    visits.remove(visit);
                    break;
                }
            }
        } else {
            System.out.println("Customer doesn't exist!");
        }
    }
}
