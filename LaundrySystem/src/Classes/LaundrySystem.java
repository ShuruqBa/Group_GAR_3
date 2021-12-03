package Classes;

import java.util.ArrayList;

public final class LaundrySystem {

    private ArrayList<Customer> Customers;
    public static ArrayList<Order> orders = new ArrayList();
    public static  LaundrySystem LaundrySystem2;
    
    public static LaundrySystem getL(){
        return LaundrySystem2;
    }
     public static void setLaundrySystem(LaundrySystem LaundrySystem1){
         LaundrySystem2=LaundrySystem1;
     }
    
    public LaundrySystem() {
        Customers = new ArrayList<>();
    }
    public static void main(String args[]){
        
    }

    public void addCustomer(Customer customer) {
        Customers.add(customer);
    }
    
    public ArrayList<Customer> allCustomers(){
        return Customers;
    } 
public static void addToOrder(Order Order){
         orders.add(Order);
     }

   public void UpdateOrderInformation(int idOrder, String status) {
           Order Found =searchForOrder(idOrder);
           if (Found!= null) {
            Found.setStatus(status);
            }
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

