/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author hp
 */
public class Piece {

    private int PieceID;
    private String pieceType;
    private double price;
    private int numberOfPieces;

    public Piece(int PieceID, String pieceType, double price, int numberOfPieces) {
        this.PieceID = PieceID;
        this.pieceType = pieceType;
        this.price = price;
        this.numberOfPieces = numberOfPieces;
    }

    public String getPieceType() {
        return pieceType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setPieceType(String pieceType) {
        this.pieceType = pieceType;
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
        return 0;
    }
    

}
