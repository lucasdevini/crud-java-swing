package view;

import model.User;
import controller.UserController;

public class UserScreen extends javax.swing.JFrame {
    public UserScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        welcomeLabel = new javax.swing.JLabel();
        userEmail = new javax.swing.JLabel();
        mainMenu = new javax.swing.JTabbedPane();
        changePasswordMenu = new javax.swing.JPanel();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JTextField();
        currentPasswordField = new javax.swing.JTextField();
        changePasswordLabel = new javax.swing.JLabel();
        repeatNewPasswordField = new javax.swing.JTextField();
        repeatNewPasswordLabel = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        currentPasswordLabel = new javax.swing.JLabel();
        deleteAccountMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deleteAccountPasswordField = new javax.swing.JPasswordField();
        deleteAccountButton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Bem-vindo,");

        userEmail.setText("user email");

        newPasswordLabel.setText("nova senha:");

        changePasswordLabel.setText("Alterar senha:");

        repeatNewPasswordLabel.setText("repita:");

        changePasswordButton.setText("alterar");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        currentPasswordLabel.setText("senha atual:");

        javax.swing.GroupLayout changePasswordMenuLayout = new javax.swing.GroupLayout(changePasswordMenu);
        changePasswordMenu.setLayout(changePasswordMenuLayout);
        changePasswordMenuLayout.setHorizontalGroup(
            changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePasswordMenuLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(changePasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(changePasswordMenuLayout.createSequentialGroup()
                            .addComponent(currentPasswordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(changePasswordMenuLayout.createSequentialGroup()
                            .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newPasswordLabel)
                                .addComponent(repeatNewPasswordLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(repeatNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(changePasswordButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        changePasswordMenuLayout.setVerticalGroup(
            changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(changePasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentPasswordLabel))
                .addGap(24, 24, 24)
                .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(changePasswordMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatNewPasswordLabel)
                    .addComponent(repeatNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(changePasswordButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        mainMenu.addTab("Alterar senha", changePasswordMenu);

        jLabel1.setText("Para excluir sua conta, digite sua senha");

        deleteAccountButton.setText("Exluir conta");
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteAccountMenuLayout = new javax.swing.GroupLayout(deleteAccountMenu);
        deleteAccountMenu.setLayout(deleteAccountMenuLayout);
        deleteAccountMenuLayout.setHorizontalGroup(
            deleteAccountMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountMenuLayout.createSequentialGroup()
                .addGroup(deleteAccountMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteAccountMenuLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(deleteAccountMenuLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(deleteAccountPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteAccountMenuLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(deleteAccountButton)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        deleteAccountMenuLayout.setVerticalGroup(
            deleteAccountMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAccountPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(deleteAccountButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        mainMenu.addTab("Excluir conta", deleteAccountMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userEmail)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(userEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadUserInformation(User user) {
        userEmail.setText(user.getEmail());
    }
    
    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        String email = userEmail.getText();
        
        String currentPassword = currentPasswordField.getText();
        String newPassword = newPasswordField.getText();
        String repeatNewPassword = repeatNewPasswordField.getText();
        
        UserController.changeUserPassword(email, currentPassword, newPassword, repeatNewPassword);
        
        currentPasswordField.setText("");
        newPasswordField.setText("");
        repeatNewPasswordField.setText("");
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        String email = userEmail.getText();
        String password = String.valueOf(deleteAccountPasswordField.getPassword());
        
        if(UserController.deleteAccount(email, password)) {
            System.out.println("Conta excluída!");
            
            dispose();
        
            SignUpScreen signUp = new SignUpScreen();
            signUp.setVisible(true);
        }
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JPanel changePasswordMenu;
    private javax.swing.JTextField currentPasswordField;
    private javax.swing.JLabel currentPasswordLabel;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JPanel deleteAccountMenu;
    private javax.swing.JPasswordField deleteAccountPasswordField;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane mainMenu;
    private javax.swing.JTextField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField repeatNewPasswordField;
    private javax.swing.JLabel repeatNewPasswordLabel;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
