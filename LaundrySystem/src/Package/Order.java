/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.*;


/**
 *
 * @author hp
 */
public class Order {

   private int orderID;
   private Customer customer;
   private Date dateOfOrder;
   private Date dateOfDelivery;
  private  long timeOfDelivery;
  private  double totalPrice;
  private  String status;
  private ArrayList<Piece> piece;
  private String TypeOfService; 

    public Order(Customer customer, String status, String TypeOfService) {
        this.orderID = GenerateOrderID();
        this.customer = customer;
        this.status = status;
        this.TypeOfService = TypeOfService;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public long getTimeOfDelivery() {
        return timeOfDelivery;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public void setTimeOfDelivery(long timeOfDelivery) {
        this.timeOfDelivery = timeOfDelivery;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public void AddNewOrder(Order order){
        
    }
    public void viewOrderInformation(){
        
    }

    public ArrayList<Piece> getPiece() {
        return piece;
    }

   

    
    public int GenerateOrderID(){
        return 10000 + (int)(Math.random() * 90000) ;
    }
    public void deletePiece(int PieceId){
        
    }
    public void addPiece(Piece Piece){
        
    }
     public String getTypeOfService() {
        return TypeOfService;
    }

    public void setTypeOfService(String TypeOfService) {
        this.TypeOfService = TypeOfService;
    }

    
    
    
}
