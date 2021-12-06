package Frames;

import javax.swing.ButtonGroup;
import Classes.*;

import static Classes.LaundrySystem.addToOrder;
import javax.swing.JFrame;

public class Payment extends javax.swing.JFrame {

    double taxRate = 0.15; // 15%
    double delivery = 10.0;
    double finalTotal = 0.0;
    Order CurrentOrder;
    
    public Payment() {
        initComponents();
        ButtonGroup PaymentMethods = new ButtonGroup();
        PaymentMethods.add(CardPay);
        PaymentMethods.add(CashPay);

        ButtonGroup DileveryMethods = new ButtonGroup();
        DileveryMethods.add(DoorDelivery);
        DileveryMethods.add(PickUp);

    }
   
    public Payment(Order order) {
        
        Checkout CheckOut = new Checkout(order);
        order.setCheckout(CheckOut);
        System.out.println(order.getOrderID());
        initComponents();
        ButtonGroup PaymentMethods = new ButtonGroup();
        PaymentMethods.add(CardPay);
        PaymentMethods.add(CashPay);

        ButtonGroup DileveryMethods = new ButtonGroup();
        DileveryMethods.add(DoorDelivery);
        DileveryMethods.add(PickUp);

        CurrentOrder = order;
           if (CardPay.isSelected()) {
            CheckOut.setPayMethod("CardPay");
        }else if(CashPay.isSelected()){
            CheckOut.setPayMethod("CashPay");
        }
           if (DoorDelivery.isSelected()) {
               
             CheckOut.setDeliveryMethod("Door Delivery");
        }else if(PickUp.isSelected()){
            CheckOut.setDeliveryMethod("PickUp"); 
        }
        TotalPrice.setText( CheckOut.CalculateTotalPrice()+ " SR");
        DeliveryLabel.setText(DeliveryLabel.getText()+" "+CheckOut.getDeliveryPrice()+" SR");
        TaxLabel.setText(TaxLabel.getText()+" "+(CheckOut.getTax()*100)+"% SR");
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CardPay = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        CashPay = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DoorDelivery = new javax.swing.JRadioButton();
        PickUp = new javax.swing.JRadioButton();
        TaxLabel = new javax.swing.JLabel();
        DeliveryLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();
        PlaceOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 820));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backButton50.png"))); // NOI18N
        Back.setPreferredSize(new java.awt.Dimension(40, 40));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 100, 139));
        jLabel2.setText("Checkout");
        jLabel2.setPreferredSize(new java.awt.Dimension(41, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 80, 112));
        jLabel3.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(121, 119, 165));
        jLabel4.setText("Payment Method");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(335, 163));

        CardPay.setBackground(new java.awt.Color(255, 255, 255));
        CardPay.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        CardPay.setForeground(new java.awt.Color(102, 100, 139));
        CardPay.setText("Card");
        CardPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardPayActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/card.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(43, 40));

        CashPay.setBackground(new java.awt.Color(255, 255, 255));
        CashPay.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        CashPay.setForeground(new java.awt.Color(102, 100, 139));
        CashPay.setText("Cash");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Wallet.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(42, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardPay)
                    .addComponent(CashPay))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CardPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(CashPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(121, 119, 165));
        jLabel7.setText("Delivery Method");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(335, 163));

        DoorDelivery.setBackground(new java.awt.Color(255, 255, 255));
        DoorDelivery.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        DoorDelivery.setForeground(new java.awt.Color(102, 100, 139));
        DoorDelivery.setText("Door Delivery");
        DoorDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoorDeliveryActionPerformed(evt);
            }
        });

        PickUp.setBackground(new java.awt.Color(255, 255, 255));
        PickUp.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        PickUp.setForeground(new java.awt.Color(102, 100, 139));
        PickUp.setText("Pick Up");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PickUp)
                    .addComponent(DoorDelivery))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(DoorDelivery)
                .addGap(31, 31, 31)
                .addComponent(PickUp)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        TaxLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TaxLabel.setForeground(new java.awt.Color(102, 100, 139));
        TaxLabel.setText("The tax is:");

        DeliveryLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeliveryLabel.setForeground(new java.awt.Color(102, 100, 139));
        DeliveryLabel.setText("The delivery price is:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 73, 102));
        jLabel8.setText("Total");

        TotalPrice.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TotalPrice.setForeground(new java.awt.Color(74, 73, 102));
        TotalPrice.setPreferredSize(new java.awt.Dimension(85, 30));

        PlaceOrder.setBackground(new java.awt.Color(102, 100, 139));
        PlaceOrder.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        PlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrder.setText("Place Order");
        PlaceOrder.setPreferredSize(new java.awt.Dimension(255, 42));
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TaxLabel)
                            .addComponent(DeliveryLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(PlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(TaxLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeliveryLabel)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(PlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        addToOrder(CurrentOrder);
      
        new OrderPlacedPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new CheckOut(CurrentOrder).setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void DoorDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoorDeliveryActionPerformed
     
        
        
    }//GEN-LAST:event_DoorDeliveryActionPerformed

    private void CardPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardPayActionPerformed
        CardInfo cardIn = new CardInfo();
        cardIn.setVisible(true);
        cardIn.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_CardPayActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JRadioButton CardPay;
    private javax.swing.JRadioButton CashPay;
    private javax.swing.JLabel DeliveryLabel;
    private javax.swing.JRadioButton DoorDelivery;
    private javax.swing.JRadioButton PickUp;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JLabel TaxLabel;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
