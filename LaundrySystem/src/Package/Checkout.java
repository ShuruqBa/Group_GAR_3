package Package;

/**
 *
 * @author hp
 */
public class Checkout {

    private String payMethod;
    private String discound;
    private Order order;
    private double tax;

    public Checkout(String payMethod, String discound, Order order, double tax) {
        this.payMethod = payMethod;
        this.discound = discound;
        this.order = order;
        this.tax = tax;
    }

    public Checkout(String payMethod, Order order, double tax) {
        this.payMethod = payMethod;
        this.order = order;
        this.tax = tax;
    }
    
    

    public String getPayMethod() {
        return payMethod;
    }

    public String getDiscound() {
        return discound;
    }

    public Order getOrder() {
        return order;
    }

    public double getTax() {
        return tax;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public void setDiscound(String discound) {
        this.discound = discound;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public double CalculateTotalPrice(Order Order ){
        return 0;
    }

}
