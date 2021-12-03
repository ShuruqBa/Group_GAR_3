package Classes;

/**
 *
 * @author hp
 */
public class Checkout {

    private String payMethod;
    private String discound;
    private Order order;
    private double tax = 0.15;
    private String deliveryMethod;
    private double deliveryPrice=10;

    public double getDeliveryPrice() {
        return deliveryPrice;
    }
    public double CalculateTotalPrice() {
       double totalPrice= order.getTotalPrice();
       totalPrice+=(totalPrice * getTax()) + getDeliveryPrice();
       
        return totalPrice;
   }
    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public Checkout(Order Order) {
        this.order=Order;
      
      
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

    
    

}
