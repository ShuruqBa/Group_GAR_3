/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author hp
 */
public final class Piece {

    private int PieceID;
   
    private double price;
    private int numberOfPieces;

    public Piece(String pieceType, double price, int numberOfPieces) {
        this.PieceID = GeneratePieceID();
        this.price = price;
        this.numberOfPieces = numberOfPieces;
    }



    public double getPrice() {
        return price;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    public int getPieceID() {
        return PieceID;
    }

    public void setPieceID(int PieceID) {
        this.PieceID = PieceID;
    }
    public int GeneratePieceID(){
        return  10000 + (int)(Math.random() * 90000) ;
    }
    

}
