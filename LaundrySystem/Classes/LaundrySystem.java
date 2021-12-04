package Classes;

import java.util.ArrayList;

public final class LaundrySystem {

    private ArrayList<Customer> Customers;
    public static ArrayList<Order> orders = new ArrayList();
    public static  LaundrySystem LaundrySystem2;
    
    
    
    public LaundrySystem() {
        Customers = new ArrayList<>();
    }
    public static void main(String args[]){
        
    }
    
    public static LaundrySystem getL(){
        return LaundrySystem2;
    }
    
    public static void setLaundrySystem(LaundrySystem LaundrySystem1){
         LaundrySystem2=LaundrySystem1;
     }
    
    // this method adds customer to the list of customers in the system
    public void addCustomer(Customer customer) {
        Customers.add(customer);
    }
    
    public ArrayList<Customer> allCustomers(){
        return Customers;
    } 

    // this method adds order to the list of orders in the system
    public static void addToOrder(Order Order){
         orders.add(Order);
     }

    // this method is used by admin to update order status
   public void UpdateOrderInformation(int idOrder, String status) {
        Order Found =searchForOrder(idOrder);
        if (Found!= null) {
            Found.setStatus(status);
        }
    }
     
    // This method is used to  search for order by id
     public static Order searchForOrder(int idOrder){
                
        for (int i = 0; i < orders.size(); i++) {
            if (idOrder == orders.get(i).getOrderID()) {
                 return  orders.get(i);  
            }
     }
        return null;
     }
       
   // this method is used by admin to search for order by id and remove it from list of orders
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

