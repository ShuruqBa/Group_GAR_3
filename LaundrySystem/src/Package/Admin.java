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
public class Admin extends Person {

    private ArrayList<Order> orders;

    public Admin(String UserName, String phoneNumber, String Email, String firstName, String lastName, String passWord) {
        super(UserName, phoneNumber, Email, firstName, lastName, passWord);
    }

    public void UpdateOrderInformation() {

    }

    public void searchForOrder(int idOrder) {
        
        boolean foundFlag=false;
        for (int i = 0; i < orders.size(); i++) {
            if (idOrder == orders.get(i).getOrderID()) {
                System.out.println("The order is exist in the system!");
                System.out.println("Here is the order information: ");
                System.out.println("Customer information: ");
                System.out.println("The customer name: " + orders.get(i).getCustomer().getFirstName() +" "+
                orders.get(i).getCustomer().getLastName());
                System.out.println("The customer name: " + orders.get(i).getCustomer().getPhoneNumber());
                System.out.println("The customer name: " + orders.get(i).getCustomer().getEmail());
                System.out.println("Order information: ");
                System.out.println("The order ID: " + orders.get(i).getOrderID());
                System.out.println("The order status: " + orders.get(i).getStatus());
                System.out.println("The service type: " + orders.get(i).getTypeOfService());
                System.out.println("The date of order: " + orders.get(i).getDateOfOrder());
                System.out.println("The date of delivery: " + orders.get(i).getDateOfDelivery());
                System.out.println("The total price is: " + orders.get(i).getTotalPrice());
                foundFlag=true;
                break;
            }
        }
        if (!foundFlag) {
            System.out.println("Sorry the order with "+ idOrder + " is not in the system."); 
        }
    }

    public void getCustomerOrders() {

    }

}
