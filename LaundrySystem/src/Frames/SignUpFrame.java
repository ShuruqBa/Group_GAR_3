package Frames;

import Classes.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class SignUpFrame extends javax.swing.JFrame {
    
    LaundrySystem system = new LaundrySystem();
    
    public SignUpFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PhoneNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        ConfirmPassField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(242, 242, 242));
        MainPanel.setPreferredSize(new java.awt.Dimension(404, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/signUpEdited.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("First Name");

        FirstName.setBackground(new java.awt.Color(220, 220, 255));
        FirstName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        FirstName.setForeground(new java.awt.Color(112, 110, 153));
        FirstName.setPreferredSize(new java.awt.Dimension(118, 28));
        FirstName.setSelectionColor(new java.awt.Color(112, 110, 153));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Email Address");

        EmailField.setBackground(new java.awt.Color(220, 220, 255));
        EmailField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        EmailField.setForeground(new java.awt.Color(112, 110, 153));
        EmailField.setText("Example@mail.com");
        EmailField.setPreferredSize(new java.awt.Dimension(286, 28));
        EmailField.setSelectionColor(new java.awt.Color(112, 110, 153));
        EmailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailFieldMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Phone Number");

        PhoneNo.setBackground(new java.awt.Color(220, 220, 255));
        PhoneNo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        PhoneNo.setForeground(new java.awt.Color(112, 110, 153));
        PhoneNo.setPreferredSize(new java.awt.Dimension(286, 28));
        PhoneNo.setSelectionColor(new java.awt.Color(112, 110, 153));
        PhoneNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneNoMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Password");

        passwordField.setBackground(new java.awt.Color(220, 220, 255));
        passwordField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        passwordField.setForeground(new java.awt.Color(112, 110, 153));
        passwordField.setText("jPasswordField1");
        passwordField.setPreferredSize(new java.awt.Dimension(286, 28));
        passwordField.setSelectionColor(new java.awt.Color(112, 110, 153));
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });

        ConfirmPassField.setBackground(new java.awt.Color(220, 220, 255));
        ConfirmPassField.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        ConfirmPassField.setForeground(new java.awt.Color(112, 110, 153));
        ConfirmPassField.setText("jPasswordField2");
        ConfirmPassField.setPreferredSize(new java.awt.Dimension(286, 28));
        ConfirmPassField.setSelectionColor(new java.awt.Color(112, 110, 153));
        ConfirmPassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmPassFieldMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Confirm Password");

        SignUp.setBackground(new java.awt.Color(102, 100, 139));
        SignUp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SignUp.setForeground(new java.awt.Color(229, 229, 229));
        SignUp.setText("Create Account");
        SignUp.setPreferredSize(new java.awt.Dimension(250, 39));
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        errorMsg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        errorMsg.setForeground(new java.awt.Color(102, 102, 102));
        errorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMsg.setPreferredSize(new java.awt.Dimension(296, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Last Name");

        LastName.setBackground(new java.awt.Color(220, 220, 255));
        LastName.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        LastName.setForeground(new java.awt.Color(112, 110, 153));
        LastName.setPreferredSize(new java.awt.Dimension(118, 28));
        LastName.setSelectionColor(new java.awt.Color(112, 110, 153));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConfirmPassField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(errorMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailFieldMouseClicked
        EmailField.setText("");
    }//GEN-LAST:event_EmailFieldMouseClicked

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String email = EmailField.getText();
        String phoneNo = PhoneNo.getText();
        char[] password = passwordField.getPassword();
        char[] confirmedPass = ConfirmPassField.getPassword();
        
        if (firstName.isEmpty() || lastName.isEmpty()) {
            errorMsg.setText("Please enter your first and last name");
            FirstName.setBackground(new Color(255, 153, 153));
            LastName.setBackground(new Color(255, 153, 153));
        } else {
            if (exists(email)) {
                errorMsg.setText("User with that E-mail already exists");
            } else {
                //check if email is valid, else display error msg
                if (!isValid(email)) {
                    EmailField.setBackground(new Color(255, 153, 153));
                    errorMsg.setText("Email is not valid!");
                    
                } else {
                    if (phoneNoValid(phoneNo)) {
                        if (passValid(password, confirmedPass)) {
                            Customer customer = new Customer(PhoneNo.getText(), email, firstName, lastName, new String(password), null);
                            system.addCustomer(customer);
                            new LoginFrame(customer, system).setVisible(true);
                            this.dispose();
                        }
                    } else {
                        PhoneNo.setBackground(new Color(255, 153, 153));
                        errorMsg.setText("phone Number is not valid!");
                    }
                }
            }
        }
    }//GEN-LAST:event_SignUpActionPerformed
    
    public boolean passValid(char[] password, char[] confirmedPass) {
        if (password.length < 8) {
            passwordField.setBackground(new Color(255, 153, 153));
            ConfirmPassField.setBackground(new Color(255, 153, 153));
            errorMsg.setText("Password is too short!");
            return false;
        } else {
            //check if password's length is equal to or more than 8 characters, else display error msg
            if (!passwordsMatch(password, confirmedPass)) {
                passwordField.setBackground(new Color(255, 153, 153));
                ConfirmPassField.setBackground(new Color(255, 153, 153));
                errorMsg.setText("Your password and confirmed password do not match!");
                return false;
            }
        }
        return true;
    }
    
    public boolean phoneNoValid(String PhoneNo) {
        if (PhoneNo.isEmpty()) {
            return false;
        }
        if (PhoneNo.length() == 10) {
            for (int i = 0; i < PhoneNo.length(); i++) {
                if (!Character.isDigit(PhoneNo.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    public boolean passwordsMatch(char[] pass1, char[] pass2) {
        // If both passwords dont have the same length, then they're not matching 
        if (pass1.length != pass2.length) {
            return false;
        }
        // Check if all characters in both of the passwords are matching
        for (int i = 0; i < pass1.length; i++) {
            if (pass1[i] != pass2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean exists(String email) {
        ArrayList<Customer> customers = system.allCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
    
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

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void ConfirmPassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPassFieldMouseClicked
        ConfirmPassField.setText("");
    }//GEN-LAST:event_ConfirmPassFieldMouseClicked

    private void PhoneNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNoMouseClicked
        PhoneNo.setText("");
    }//GEN-LAST:event_PhoneNoMouseClicked
    
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
