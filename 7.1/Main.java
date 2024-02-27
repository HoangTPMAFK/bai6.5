import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        String name = "";
        boolean member = true;
        String memberType = "";
        String dateString = "";
        Date date;
        int choice = 0;
        int choice1 = 0;
        double serviceExpense = 0;
        double productExpense = 0;
        Visit visit;
        while (true) {
            System.out.println("1. Add customer");
            System.out.println("2. Print customers' information");
            System.out.println("3. Set member type for customer");
            System.out.println("4. Become member for customer");
            System.out.println("5. Remove customer");
            System.out.println("6. Add customer's visit date");
            System.out.println("7. Print customers' visits");
            System.out.println("8. Remove customer's visit date");
            System.out.println("9. Exit");
            System.out.print("> ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 9) break;
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    customerManager.addCustomer(new Customer(name));
                    break;
                case 2:
                    System.out.println("Customers list: ");
                    customerManager.printCustomer();
                    break;
                case 3:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.println("Member type: ");
                    System.out.println("1. Premium");
                    System.out.println("2. Gold");
                    System.out.println("3. Silver");
                    System.out.println("4. Exit");
                    System.out.print("> ");
                    choice1 = sc.nextInt();
                    sc.nextLine();
                    switch (choice1) {
                        case 1:
                            memberType = "Premium";
                            customerManager.becomeMember(name, member);
                            break;
                        case 2:
                            memberType = "Gold";
                            customerManager.becomeMember(name, member);
                            break;
                        case 3:
                            memberType = "Silver";
                            customerManager.becomeMember(name, member);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Please type number again!");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.println("Bemcome member or not?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("> ");
                    choice1 = sc.nextInt();
                    sc.nextLine();
                    switch (choice1) {
                        case 1:
                            member = true;
                            customerManager.becomeMember(name, member);
                            break;
                        case 2:
                            member = false;
                            customerManager.becomeMember(name, member);
                            break;
                        default:
                            System.out.println("Please type number again!");
                            break;
                    }
                    break;
                case 5:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    customerManager.removeCustomer(name);
                    break;
                case 6:
                    System.out.println("Name: ");
                    name = sc.nextLine();
                    System.out.println("Date (dd/MM/yyyy):");
                    dateString = sc.nextLine();
                    System.out.print("Service expensive: ");
                    serviceExpense = sc.nextDouble();
                    System.out.print("Product expense: ");
                    productExpense = sc.nextDouble();
                    sc.nextLine();
                    try {
                        date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
                        visit = new Visit(name, date);
                        visit.setServiceExpense(serviceExpense);
                        visit.setProductExpense(productExpense);
                        customerManager.addVisit(new Visit(name, date));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    System.out.println("Visits lists: ");
                    customerManager.printVisits();
                    break;
                case 8:
                    System.out.println("Name: ");
                    name = sc.nextLine();
                    System.out.println("Date (dd-MM-YYYY):");
                    dateString = sc.nextLine();
                    try {
                        date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
                        customerManager.removeVisit(new Visit(name, date));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    } 
                    break;
                default:
                    System.out.println("Please type number again!");
                    break;
            }
        }
        sc.close();
    }
}