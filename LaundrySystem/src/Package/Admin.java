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

    public static ArrayList<Order> orders = new ArrayList();

    public Admin(String UserName, String phoneNumber, String Email, String firstName, String lastName, String passWord) {
        super(UserName, phoneNumber, Email, firstName, lastName, passWord);
    }
  

    public void UpdateOrderInformation(int idOrder, String status) {
           Order Found =searchForOrder(idOrder);
           if (Found!= null) {
            Found.setStatus(status);
            }
    }
     public static void addToOrder(Order Order){
         orders.add(Order);
     }
    
     public static Order searchForOrder(int idOrder){
                
        for (int i = 0; i < orders.size(); i++) {
            if (idOrder == orders.get(i).getOrderID()) {
                 return  orders.get(i);
                  
            }
            
     }
        return null;
     }
       
   

 

    public void DeleteOrder(int idOrder){
         Order Found = searchForOrder(idOrder);
        
       
            if (Found != null) {
                for (int i = 0; i < orders.size(); i++) {
                    if (orders.get(i).getOrderID()==Found.getOrderID()) {
                        orders.remove(orders.get(i));
                        break;
                    }
   
                }
            }
            
    }
}
