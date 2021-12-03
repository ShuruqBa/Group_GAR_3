/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.Checkout;
import Classes.Customer;
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
    public void test(){
          System.out.println("Test A customer order wasing with 2 pieces ");
         
        Customer Customer= new Customer("0532287492", "sba0015@stu.kau.edu.sa", "rahaf", "Dawood", "12345678", "jeddah");
        Piece Piece= new  Piece("washing", 2);
        Order Order= new Order(Customer, "Done", Piece.getPieceType());
        Order.setTotalPrice(Piece.getPrice("washing")*2);
        Customer.makeOrder(Order);
        Checkout Checkout=new Checkout(Order);
        Customer.setCheckout(Checkout);  
        int expResult= 79;
        int result = (int)Checkout.CalculateTotalPrice();
        assertEquals(expResult, result);
          System.out.println("The Expected Result:  "+ expResult + " and the result is: "+ result);
          
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
