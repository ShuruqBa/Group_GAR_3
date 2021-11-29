package Frames;

import Frames.ChooseService;
import javax.swing.JFrame;

public class OrderDetails extends javax.swing.JFrame {

    static int pricePerPc;
    
    public OrderDetails() {
        initComponents();
        if (ChooseService.ServiceType != null) {
            if (ChooseService.ServiceType.equalsIgnoreCase("cleaning")) {
                IroningPanel.setVisible(false);
                BothPanel.setVisible(false);
            } else if (ChooseService.ServiceType.equalsIgnoreCase("ironing")) {
                CleaningPanel.setVisible(false);
                BothPanel.setVisible(false);
            } else if (ChooseService.ServiceType.equalsIgnoreCase("both")) {
                CleaningPanel.setVisible(false);
                IroningPanel.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Continue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CleaningPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cleaningPcs = new javax.swing.JSpinner();
        cleanPrice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BothPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bothPcs = new javax.swing.JSpinner();
        bothPrice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IroningPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ironingPcs = new javax.swing.JSpinner();
        ironPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(242, 242, 242));
        MainPanel.setPreferredSize(new java.awt.Dimension(364, 600));
        MainPanel.setRequestFocusEnabled(false);

        Continue.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 100, 139));
        jLabel1.setText("Order Details");
        jLabel1.setPreferredSize(new java.awt.Dimension(155, 40));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        CleaningPanel.setBackground(new java.awt.Color(255, 255, 255));
        CleaningPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));
        CleaningPanel.setPreferredSize(new java.awt.Dimension(330, 130));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(116, 113, 158));
        jLabel3.setText("Number of Pieces");

        cleaningPcs.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cleaningPcs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        cleaningPcs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cleaningPcsStateChanged(evt);
            }
        });

        cleanPrice.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cleanPrice.setForeground(new java.awt.Color(116, 113, 158));
        cleanPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanPrice.setText("0 SR");
        cleanPrice.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-washing-machine-40.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 100, 140));
        jLabel12.setText("Washing");

        javax.swing.GroupLayout CleaningPanelLayout = new javax.swing.GroupLayout(CleaningPanel);
        CleaningPanel.setLayout(CleaningPanelLayout);
        CleaningPanelLayout.setHorizontalGroup(
            CleaningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CleaningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CleaningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CleaningPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(cleaningPcs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cleanPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CleaningPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        CleaningPanelLayout.setVerticalGroup(
            CleaningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CleaningPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(CleaningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addGap(21, 21, 21)
                .addGroup(CleaningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cleaningPcs, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BothPanel.setBackground(new java.awt.Color(255, 255, 255));
        BothPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));
        BothPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BothPanel.setPreferredSize(new java.awt.Dimension(330, 130));
        BothPanel.setVerifyInputWhenFocusTarget(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-laundry-40.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(116, 113, 158));
        jLabel8.setText("Number of Pieces");

        bothPcs.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        bothPcs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        bothPcs.setPreferredSize(new java.awt.Dimension(48, 26));
        bothPcs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bothPcsStateChanged(evt);
            }
        });

        bothPrice.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        bothPrice.setForeground(new java.awt.Color(116, 113, 158));
        bothPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bothPrice.setText("0 SR");
        bothPrice.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 100, 140));
        jLabel10.setText("Both");
        jLabel10.setPreferredSize(new java.awt.Dimension(133, 23));

        javax.swing.GroupLayout BothPanelLayout = new javax.swing.GroupLayout(BothPanel);
        BothPanel.setLayout(BothPanelLayout);
        BothPanelLayout.setHorizontalGroup(
            BothPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BothPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BothPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BothPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BothPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(bothPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bothPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        BothPanelLayout.setVerticalGroup(
            BothPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BothPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(BothPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(BothPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bothPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bothPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        IroningPanel.setBackground(new java.awt.Color(255, 255, 255));
        IroningPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229), 4));
        IroningPanel.setPreferredSize(new java.awt.Dimension(330, 130));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(116, 113, 158));
        jLabel4.setText("Number of Pieces");

        ironingPcs.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        ironingPcs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        ironingPcs.setPreferredSize(new java.awt.Dimension(48, 26));
        ironingPcs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ironingPcsStateChanged(evt);
            }
        });

        ironPrice.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        ironPrice.setForeground(new java.awt.Color(116, 113, 158));
        ironPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ironPrice.setText("0 SR");
        ironPrice.setPreferredSize(new java.awt.Dimension(65, 26));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-iron-40.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 100, 140));
        jLabel11.setText("Ironing");

        javax.swing.GroupLayout IroningPanelLayout = new javax.swing.GroupLayout(IroningPanel);
        IroningPanel.setLayout(IroningPanelLayout);
        IroningPanelLayout.setHorizontalGroup(
            IroningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IroningPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IroningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IroningPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(ironingPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(ironPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(IroningPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        IroningPanelLayout.setVerticalGroup(
            IroningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IroningPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(IroningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(21, 21, 21)
                .addGroup(IroningPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ironingPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ironPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CleaningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IroningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BothPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(CleaningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(IroningPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BothPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        Back.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 100, 139));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("<");
        Back.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Back.setPreferredSize(new java.awt.Dimension(40, 40));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Continue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Continue)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleaningPcsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cleaningPcsStateChanged
         pricePerPc = (int) cleaningPcs.getValue();
        cleanPrice.setText((pricePerPc * 30) + " SR");
    }//GEN-LAST:event_cleaningPcsStateChanged

    private void ironingPcsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ironingPcsStateChanged
         pricePerPc = (int) ironingPcs.getValue();
        ironPrice.setText((pricePerPc * 20) + " SR");
    }//GEN-LAST:event_ironingPcsStateChanged

    private void bothPcsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bothPcsStateChanged
         pricePerPc = (int) bothPcs.getValue();
        bothPrice.setText((pricePerPc * 50) + " SR");
    }//GEN-LAST:event_bothPcsStateChanged

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        ChooseService servicesPage = new ChooseService();
        servicesPage.setVisible(true);
        servicesPage.pack();
        servicesPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Cart go_to_cart= new Cart();
        go_to_cart .setVisible(true);
    }//GEN-LAST:event_ContinueActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel BothPanel;
    private javax.swing.JPanel CleaningPanel;
    private javax.swing.JButton Continue;
    private javax.swing.JPanel IroningPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JSpinner bothPcs;
    private javax.swing.JLabel bothPrice;
    private javax.swing.JLabel cleanPrice;
    private javax.swing.JSpinner cleaningPcs;
    private javax.swing.JLabel ironPrice;
    private javax.swing.JSpinner ironingPcs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
