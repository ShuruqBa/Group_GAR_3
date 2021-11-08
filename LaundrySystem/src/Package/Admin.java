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

    public boolean searchOrder() {
        return true;
    }

    public void getCustomerOrders() {

    }

  

}
