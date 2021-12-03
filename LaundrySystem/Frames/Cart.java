package Frames;

import Classes.*;
import java.util.ArrayList;

public class Cart extends javax.swing.JFrame {

    Customer Customer;
    Order currentOrd;

    public Cart() {
        initComponents();
    }

    public Cart(Order ord) {
        initComponents();
        currentOrd = ord;

        String summar = "";
        ArrayList<Piece> pieces;
        String currType;
        int finalPrice = 0;

        pieces = currentOrd.getPiece();

        for (int j = 0; j < pieces.size(); j++) {
            currType = pieces.get(j).getPieceType();
            summar += " " + currType + "\t          " + pieces.get(j).getNumberOfPieces()
                    + "\t              " + (pieces.get(j).getPrice(currType) * pieces.get(j).getNumberOfPieces()) + "\n";

            finalPrice += pieces.get(j).getPrice(currType) * pieces.get(j).getNumberOfPieces();
        }

        totalPrice.setText(finalPrice + " SR");
        Summary.setText(summar); 

    }

    public Cart(Customer customer, String serviceType, int noOfpcs, Order order) {
        initComponents();
        Customer = customer;
        ArrayList<Order> orders = customer.getOrders();
        Piece currentPc;
        int finalPrice = 0;

        if (serviceType != null) {
            if (order == null) {
                currentOrd = new Order(customer, "Ongoing", serviceType);
                Customer.makeOrder(currentOrd);
                currentOrd.setCustomer(customer);
            } else {
                currentOrd = order;
            }
            currentPc = new Piece(serviceType, noOfpcs);
            currentOrd.setPiece(currentPc);

            String summar = "";
            ArrayList<Piece> pieces;
            String currType;
            for (int i = 0; i < orders.size(); i++) {
                pieces = orders.get(i).getPiece();

                for (int j = 0; j < pieces.size(); j++) {
                    currType = pieces.get(j).getPieceType();
                    summar += " " + currType + "\t          " + pieces.get(j).getNumberOfPieces()
                            + "\t              " + (pieces.get(j).getPrice(currType) * pieces.get(j).getNumberOfPieces()) + "\n";

                    finalPrice += pieces.get(j).getPrice(currType) * pieces.get(j).getNumberOfPieces();
                }
            }
            totalPrice.setText(finalPrice + " SR");
            currentOrd.setTotalPrice(finalPrice);

            Summary.setText(summar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NOPLabel = new javax.swing.JLabel();
        ServiceLabl = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Summary = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        ConfirmOrder = new javax.swing.JButton();
        CancelOrder = new javax.swing.JButton();
        AddToOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 830));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backButton50.png"))); // NOI18N
        Back.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 110, 153));
        jLabel1.setText("Cart");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 234, 234), 4));

        NOPLabel.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        NOPLabel.setForeground(new java.awt.Color(112, 110, 153));
        NOPLabel.setText("No. of Pieces");

        ServiceLabl.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        ServiceLabl.setForeground(new java.awt.Color(112, 110, 153));
        ServiceLabl.setText("Service");

        PriceLabel.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(112, 110, 153));
        PriceLabel.setText("Price");

        Summary.setEditable(false);
        Summary.setBackground(new java.awt.Color(255, 255, 255));
        Summary.setColumns(20);
        Summary.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        Summary.setForeground(new java.awt.Color(126, 124, 173));
        Summary.setRows(6);
        Summary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 234, 234), 4));
        Summary.setSelectionColor(new java.awt.Color(126, 124, 173));
        jScrollPane1.setViewportView(Summary);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(89, 87, 122));
        jLabel2.setText("Total");

        totalPrice.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(89, 87, 122));
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPrice.setMaximumSize(new java.awt.Dimension(59, 26));
        totalPrice.setMinimumSize(new java.awt.Dimension(59, 26));
        totalPrice.setPreferredSize(new java.awt.Dimension(59, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ServiceLabl)
                .addGap(54, 54, 54)
                .addComponent(NOPLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PriceLabel)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServiceLabl)
                    .addComponent(NOPLabel)
                    .addComponent(PriceLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        ConfirmOrder.setBackground(new java.awt.Color(102, 100, 139));
        ConfirmOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ConfirmOrder.setForeground(new java.awt.Color(229, 229, 229));
        ConfirmOrder.setText("Confirm Order");
        ConfirmOrder.setPreferredSize(new java.awt.Dimension(250, 39));
        ConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderActionPerformed(evt);
            }
        });

        CancelOrder.setBackground(new java.awt.Color(102, 100, 139));
        CancelOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CancelOrder.setForeground(new java.awt.Color(229, 229, 229));
        CancelOrder.setText("Cancel Order");
        CancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderActionPerformed(evt);
            }
        });

        AddToOrder.setBackground(new java.awt.Color(102, 100, 139));
        AddToOrder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AddToOrder.setForeground(new java.awt.Color(229, 229, 229));
        AddToOrder.setText("Add to Order");
        AddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddToOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToOrder)
                    .addComponent(CancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderActionPerformed
        new OrderCanceled().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelOrderActionPerformed

    private void ConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderActionPerformed
        new CheckOut(currentOrd).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConfirmOrderActionPerformed

    private void AddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToOrderActionPerformed
        new ChooseService(Customer, currentOrd).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddToOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToOrder;
    private javax.swing.JLabel Back;
    private javax.swing.JButton CancelOrder;
    private javax.swing.JButton ConfirmOrder;
    private javax.swing.JLabel NOPLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel ServiceLabl;
    private javax.swing.JTextArea Summary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
