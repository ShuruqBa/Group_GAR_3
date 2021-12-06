/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.*;

/**
 *
 * @author hp
 */
public final class Order {

    private int orderID;
    private Customer customer;
    private Date dateOfOrder;
    private Date dateOfDelivery;
    private long timeOfDelivery;
    private double totalPrice;
    private String status;
    private ArrayList<Piece> pieces;
    private String TypeOfService;
      private Checkout Checkout;

    public Checkout getCheckout() {
        return Checkout;
    }

    public void setCheckout(Checkout Checkout) {
        this.Checkout = Checkout;
    }
    
    public Order(Customer customer, String status, String TypeOfService) {
        this.pieces = new ArrayList();
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

    public void setPiece(Piece piece) {
        pieces.add(piece);
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

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<Piece> getPiece() {
        return pieces;
    }

    public int GenerateOrderID() {
        return 10000 + (int) (Math.random() * 90000);
    }

    public void deletePiece(int PieceId) {
        
    }

    public String getTypeOfService() {
        return TypeOfService;
    }

    public void setTypeOfService(String TypeOfService) {
        this.TypeOfService = TypeOfService;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
