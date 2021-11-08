/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Customer extends Person {
   private String address;
   private Order order;
   private ArrayList<Order> orders;
    public Customer(String UserName, String phoneNumber, String Email, String firstName, String lastName, String passWord,
            String address) {
        super(UserName, phoneNumber, Email, firstName, lastName, passWord);
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public Order getOrder() {
        return order;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public void cancelOrder(){
        
    }
    public void makeOrder(){
        
    }
    public void getOrders(){
        
    }
}
