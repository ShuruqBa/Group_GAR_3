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

    private int price;
    private int numberOfPieces;
    private String PieceType;

    public Piece(String pieceType, int numberOfPieces) {
        this.PieceID = GeneratePieceID();
        PieceType = pieceType;
        this.numberOfPieces = numberOfPieces;
    }

    public String getPieceType() {
        return PieceType;
    }

    public void setPieceType(String pieceType) {
        this.PieceType = pieceType;
    }

    public int getPrice(String serviceType) {
        if (serviceType.equalsIgnoreCase("washing")) {
            price = 30;
        } else if (serviceType.equalsIgnoreCase("ironing")) {
            price = 20;
        } else if (serviceType.equalsIgnoreCase("both")) {
            price = 50;
        }
        return price;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setPrice(int price) {
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

    public int GeneratePieceID() {
        return 10000 + (int) (Math.random() * 90000);
    }

}
