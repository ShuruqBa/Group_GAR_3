
package Classes;

import java.util.ArrayList;

public class Customer extends Person {

    private String address;
    private ArrayList<Order> orders = new ArrayList();
    private Checkout Checkout;

    public Checkout getCheckout() {
        return Checkout;
    }

    public void setCheckout(Checkout Checkout) {
        this.Checkout = Checkout;
    }
    
    public Customer(String phoneNumber, String Email, String firstName, String lastName, String passWord,
            String address) {
        super(phoneNumber, Email, firstName, lastName, passWord);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // this method is used to cancel the order from list of orders
    public boolean cancelOrder(Order order) {

        for (int i = 0; i < orders.size(); i++) {
            if (order.getOrderID() == orders.get(i).getOrderID()) {
                orders.remove(orders.get(i));
                return true;

            }
        }
        return false;
    }

    // this method adds order to list of orders
    public void makeOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
