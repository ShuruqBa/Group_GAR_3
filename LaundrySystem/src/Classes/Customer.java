/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Customer extends Person {

    private String address;
    private ArrayList<Order> orders = new ArrayList();

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

    public boolean cancelOrder(Order order) {

        for (int i = 0; i < orders.size(); i++) {
            if (order.getOrderID() == orders.get(i).getOrderID()) {
                orders.remove(orders.get(i));
                return true;

            }
        }
        return false;
    }

    public void makeOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}