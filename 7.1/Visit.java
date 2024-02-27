import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    
    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }
    public String getName() {
        return this.customer.getName();
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getServiceExpense() {
        return serviceExpense;
    }
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense*DiscountRate.getServiceDiscountRate(this.customer.getMemberType());
    }
    public double getProductExpense() {
        return productExpense;
    }
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense*DiscountRate.getProductDiscountRate(this.customer.getMemberType());
    }
    public double getTotalExpense() {
        double totalExpense = productExpense + serviceExpense;
        return totalExpense;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    @Override
    public String toString() {
        return "Visit [customer=" + customer.getName() + ", date=" + date + ", serviceExpense=" + serviceExpense
                + ", productExpense=" + productExpense + "]";
    }
    
}
