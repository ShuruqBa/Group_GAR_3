
package Frames;

import java.awt.Color;
import java.util.regex.Pattern;
import Classes.*;
import java.util.ArrayList;

public class LoginFrame extends javax.swing.JFrame {

    LaundrySystem System;
    Customer customer;
    
    public LoginFrame() {
        initComponents();
        System = new LaundrySystem();
    }
    
    public LoginFrame(Customer cust, LaundrySystem system) {
        initComponents();
        customer = cust;
        System = system;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        emailErrorMsg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passErrorMsg = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(242, 242, 242));
        MainPanel.setPreferredSize(new java.awt.Dimension(404, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/LoginEdited.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(404, 320));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("E-mail");

        EmailField.setBackground(new java.awt.Color(220, 220, 255));
        EmailField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        EmailField.setForeground(new java.awt.Color(112, 110, 153));
        EmailField.setText("Example@mail.com");
        EmailField.setPreferredSize(new java.awt.Dimension(296, 28));
        EmailField.setSelectionColor(new java.awt.Color(102, 100, 139));
        EmailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailFieldMouseClicked(evt);
            }
        });

        emailErrorMsg.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        emailErrorMsg.setForeground(new java.awt.Color(102, 100, 139));
        emailErrorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailErrorMsg.setPreferredSize(new java.awt.Dimension(296, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password");

        passErrorMsg.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        passErrorMsg.setForeground(new java.awt.Color(102, 100, 139));
        passErrorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passErrorMsg.setPreferredSize(new java.awt.Dimension(296, 25));

        Login.setBackground(new java.awt.Color(102, 100, 139));
        Login.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(229, 229, 229));
        Login.setText("Login");
        Login.setPreferredSize(new java.awt.Dimension(250, 39));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 100, 139));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Don't have an account? ");
        jLabel4.setPreferredSize(new java.awt.Dimension(296, 25));

        Register.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 153, 102));
        Register.setText("Sign up");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(220, 220, 255));
        passwordField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        passwordField.setForeground(new java.awt.Color(112, 110, 153));
        passwordField.setText("jPasswordField1");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(passwordField)))))
                .addGap(72, 72, 72))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Register))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailFieldMouseClicked
        EmailField.setText("");
    }//GEN-LAST:event_EmailFieldMouseClicked

    // this method checks if email is entered in the correct format
    private boolean isValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);

        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        emailErrorMsg.setText("");
        passErrorMsg.setText("");
        //get email and password from user
        String email = EmailField.getText();
        String password = passwordField.getText();

        if (!exists(email)) {
            emailErrorMsg.setText("User not found");
        } else {
            //check if email is valid, else display error msg
            if (isValid(email)) {
                Customer cust = findCustomer(email);
                //check if password's length is equal or more than 8 characters, else display error msg
                if (password.length() >= 8) {
                    new ChooseService(cust).setVisible(true);
                    this.dispose();
                } else {
                    passwordField.setBackground(new Color(255, 153, 153));
                    passErrorMsg.setText("Password is too short!");
                }
            } else {
                EmailField.setBackground(new Color(255, 153, 153));
                emailErrorMsg.setText("Email is not valid!");
            }
        }
        // if the user is an admin, they will be taken to admin page to have access to their functions
        if (EmailField.getText().toLowerCase().startsWith("admin")) {
            new AdminView().setVisible(true);
        }
    }//GEN-LAST:event_LoginActionPerformed

    public boolean exists(String email) {
        ArrayList<Customer> customers = System.allCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getEmail().equalsIgnoreCase(email) || customer.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    public Customer findCustomer(String email) {
        ArrayList<Customer> customers = System.allCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getEmail().equalsIgnoreCase(email)) {
                return customers.get(i);
            }
        }
        return null;
    }

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
       
        new SignUpFrame().setVisible(true);
    }//GEN-LAST:event_RegisterMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton Login;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel emailErrorMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel passErrorMsg;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
