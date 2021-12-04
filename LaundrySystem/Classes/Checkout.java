package Classes;

public class Checkout {

    private String payMethod;
    private String discound;
    private Order order;
    private double tax = 0.15;
    private String deliveryMethod;
    private double deliveryPrice=10;
     private  double totalPrice;
    
    // get the Delivery Price
    public double getDeliveryPrice() {
        return deliveryPrice;
    }
    
    // this method will calculate the total price with the tax and the delivery price
    public double CalculateTotalPrice() {
       totalPrice= order.getTotalPrice();
       totalPrice+=(totalPrice * getTax()) + getDeliveryPrice();
        setTotalPrice(totalPrice);
        return totalPrice;
   }
    // set new value for delivry price 
    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
    
    // set new value for delivery method
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
    // get the DeliveryMethod
    public String getDeliveryMethod() {
        return deliveryMethod;
    }
    // checkout object
    public Checkout(Order Order) {
        this.order=Order; 
    }
    // return Payment Method
    public String getPayMethod() {
        return payMethod;
    }
    // get discount
    public String getDiscound() {
        return discound;
    }
    // get the order
    public Order getOrder() {
        return order;
    }
    // get tax
    public double getTax() {
        return tax;
    }
    // set payment method
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
    // set dicount 
    public void setDiscound(String discound) {
        this.discound = discound;
    }
    // set order
    public void setOrder(Order order) {
        this.order = order;
    }
    // set tax
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice=totalPrice;
    }

}
