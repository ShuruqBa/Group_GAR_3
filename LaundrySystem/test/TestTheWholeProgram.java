/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Checkout;
import Classes.Customer;
import Classes.LaundrySystem;
import Classes.Order;
import Classes.Piece;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class TestTheWholeProgram {
    
    public TestTheWholeProgram() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
      @Test
    public void testTheWholeProject(){
          System.out.println("Test A customer order wasing with 2 pieces and more");
         // customer can choose one service or more !
        Customer Customer= new Customer("0532287492", "sba0015@stu.kau.edu.sa", "rahaf", "Dawood", "12345678", "jeddah");
        Piece Piece= new  Piece("washing", 2);
        Order Order= new Order(Customer, "Under Proceesing", Piece.getPieceType());
        Order.setPiece(Piece);
        
        Piece Piece1= new  Piece("both", 2);
        Order.setPiece(Piece1);
         
          for (int i = 0; i < Order.getPiece().size(); i++) {
              System.out.println("The service: "+Order.getPiece().get(i).getPieceType()+ 
                      " with number of pieces: "+Order.getPiece().get(i).getNumberOfPieces());
          }
        Order.setTotalPrice(Piece.getPrice("washing")*Piece.getNumberOfPieces()
                +Piece1.getPrice("both")*Piece1.getNumberOfPieces());
        
        LaundrySystem.addToOrder(Order);
        Customer.makeOrder(Order);
        Checkout Checkout=new Checkout(Order);
        Order.setCheckout(Checkout);  
        int expResult= 194;
         
        int result = (int)Checkout.CalculateTotalPrice();
        assertEquals(expResult, result);
        System.out.println("The Expected Result:  "+ expResult + " and the result is: "+ result);
        // ======================================================================================
          System.out.println("===================================================================");
          System.out.println("Search for order");
          System.out.println("The order with "+ Order.getOrderID()+ " should be in the system");
          Order order1 =LaundrySystem.searchForOrder(Order.getOrderID());
          boolean Found_order1= order1 != null;
          System.out.println("The status of the order id: "+Order.getOrderID() );
          if (Found_order1) {
             assertTrue(Found_order1);
            System.out.println("The order with "+Order.getOrderID()+" is in the system");  
          }else{
              assertFalse(Found_order1);
              System.out.println("The order with "+Order.getOrderID()+" is not in the system"); 
          }
          
          Order order2=LaundrySystem.searchForOrder(12345);
          boolean Found_order2= order2 != null;
        
          System.out.println("The status of the order id: "+Order.getOrderID() );
          if (Found_order2) {
              assertTrue(Found_order2);
            System.out.println("The order with "+12345 +" is in the system");  
          }else{
               assertFalse(Found_order2);
              System.out.println("The order with "+12345+" is not in the system"); 
          }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
