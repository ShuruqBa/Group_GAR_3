package Frames;

import java.awt.Color;

public class CardInfo extends javax.swing.JFrame {

    public CardInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CardNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CardHolderName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Month = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CCV = new javax.swing.JTextField();
        errMsg = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 820));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 100, 139));
        jLabel1.setText("Card Information");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 109, 153));
        jLabel2.setText("Card Number");

        CardNo.setBackground(new java.awt.Color(238, 238, 238));
        CardNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CardNo.setForeground(new java.awt.Color(112, 109, 153));
        CardNo.setPreferredSize(new java.awt.Dimension(220, 30));
        CardNo.setSelectionColor(new java.awt.Color(112, 109, 153));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(112, 109, 153));
        jLabel3.setText("Cardholder Name");

        CardHolderName.setBackground(new java.awt.Color(238, 238, 238));
        CardHolderName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CardHolderName.setForeground(new java.awt.Color(112, 109, 153));
        CardHolderName.setPreferredSize(new java.awt.Dimension(220, 30));
        CardHolderName.setSelectionColor(new java.awt.Color(112, 109, 153));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 109, 153));
        jLabel4.setText("Exp. Date:");

        Month.setBackground(new java.awt.Color(238, 238, 238));
        Month.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Month.setForeground(new java.awt.Color(140, 136, 191));
        Month.setText("MM");
        Month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonthMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 109, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("/");
        jLabel5.setPreferredSize(new java.awt.Dimension(20, 20));

        Year.setBackground(new java.awt.Color(238, 238, 238));
        Year.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Year.setForeground(new java.awt.Color(140, 136, 191));
        Year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Year.setText("YY");
        Year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YearMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 109, 153));
        jLabel6.setText("CCV:");

        CCV.setBackground(new java.awt.Color(238, 238, 238));
        CCV.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CCV.setForeground(new java.awt.Color(140, 136, 191));
        CCV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CCV.setText("***");
        CCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CCVMouseClicked(evt);
            }
        });

        errMsg.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        errMsg.setForeground(new java.awt.Color(112, 109, 153));
        errMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(CardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Month)
                            .addComponent(CCV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CCV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(errMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        Confirm.setBackground(new java.awt.Color(102, 100, 139));
        Confirm.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(Confirm)
                .addContainerGap(152, Short.MAX_VALUE))
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

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        String cardNo = CardNo.getText();
        String cardHolderName = CardHolderName.getText();
        String month = Month.getText();
        String year = Year.getText();
        String ccv = CCV.getText();
        boolean pass = true;

        // invoke a method that checks if the card number the user entered is valid
        if (!cardValid(cardNo)) {
            // if card is invalid error message will be displayed to the user
            errMsg.setText("Please, enter a valid card number");
            CardNo.setBackground(new Color(255, 153, 153));
            pass = false;
        }
        // make sure the user doesnt leave the name field empty
        if (cardHolderName.isEmpty()) {
            // if name field is left empty error message will be displayed
            errMsg.setText("Please, enter a valid name");
            CardHolderName.setBackground(new Color(255, 153, 153));
            pass = false;
        }

        // invoke a method that checks if the month the user entered is valid
        if (!monthValid(month)) {
            // if the month is invalid error message will be displayed to the user
            errMsg.setText("Please, enter a valid month");
            Month.setBackground(new Color(255, 153, 153));
            pass = false;
        }

        // invoke a method that checks if the year the user entered is valid
        if (!yearValid(year)) {
            // if the year is invalid error message will be displayed to the user
            errMsg.setText("Please, enter a valid year");
            Year.setBackground(new Color(255, 153, 153));
            pass = false;
        }

        // check if ccv is less more than 3
        if (ccv.length() > 3) {
            // if the ccv is enterd is more than 3 digitss error message will be displayed to the user
            errMsg.setText("CCV should be 3 digits");
            CCV.setBackground(new Color(255, 153, 153));
            pass = false;
        }

        // if all the information the user entered is correct they will be taken back to payment page
        if (pass) {
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    // method to check month validity
    public boolean monthValid(String month) {
        if (month.isEmpty() || month.length() > 2) {
            errMsg.setText("Please, enter a valid month");
            Month.setBackground(new Color(255, 153, 153));
            return false;
        }
        for (int i = 0; i < month.length(); i++) {
            if (!Character.isDigit(month.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    // method to check year validity
    public boolean yearValid(String year) {
        if (year.isEmpty() || year.length() > 2) {
            errMsg.setText("Please, enter a valid month");
            Month.setBackground(new Color(255, 153, 153));
            return false;
        }
        for (int i = 0; i < year.length(); i++) {
            if (!Character.isDigit(year.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // method to check card number validity
    public boolean cardValid(String cardNo) {
        if (cardNo.isEmpty()) {
            return false;
        }
        if (cardNo.length() == 16) {
            for (int i = 0; i < cardNo.length(); i++) {
                if (!Character.isDigit(cardNo.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private void MonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthMouseClicked
        Month.setText("");
    }//GEN-LAST:event_MonthMouseClicked

    private void YearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YearMouseClicked
        Year.setText("");
    }//GEN-LAST:event_YearMouseClicked

    private void CCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCVMouseClicked
        CCV.setText("");
    }//GEN-LAST:event_CCVMouseClicked

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
            java.util.logging.Logger.getLogger(CardInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCV;
    private javax.swing.JTextField CardHolderName;
    private javax.swing.JTextField CardNo;
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel errMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
