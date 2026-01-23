package com.project75.app;

import com.project75.core.Data;
import com.project75.core.Student;
import com.project75.core.Utility;
import com.project75.core.Verifier;
import com.project75.jforms.MainFrame;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Aryan
 */
public class SignIn extends javax.swing.JFrame {

    private Student stdData = null;
    private Verifier verifier = null;

    public SignIn() {
        initComponents();
        this.textUID.setText("");
        this.passwordPassword.setText("");
        this.textUID.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSignInHeading = new javax.swing.JLabel();
        labelUID = new javax.swing.JLabel();
        textUID = new javax.swing.JTextField();
        labelPasword = new javax.swing.JLabel();
        passwordPassword = new javax.swing.JPasswordField();
        buttonSignIn = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();
        separatorTitle = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project75 - SignIn");
        setResizable(false);

        labelSignInHeading.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 48)); // NOI18N
        labelSignInHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignInHeading.setText("Sign In");

        labelUID.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelUID.setText("UID:");

        textUID.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelPasword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelPasword.setText("Passwords:");

        passwordPassword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        buttonSignIn.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 32)); // NOI18N
        buttonSignIn.setText("Sign In");
        buttonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignInActionPerformed(evt);
            }
        });

        buttonMenu.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 12)); // NOI18N
        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project75/images/home.png"))); // NOI18N
        buttonMenu.setText("Menu");
        buttonMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSignInHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separatorTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textUID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordPassword)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSignInHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textUID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed
        int UID = Integer.parseInt(textUID.getText());
        String fileName;
        String folderPath = "saves/" + Integer.toString(UID);

        if (!verify(passwordPassword.getPassword(), Integer.toString(UID))) {
            System.out.println("Wrong Password!");
            passwordPassword.requestFocus();
            return;
        }

        stdData = Utility.retrieveStudentDataFile(verifier.getUID());

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(stdData).setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_buttonSignInActionPerformed

    private boolean verify(char[] password, String UID) {
        boolean res = false;

        String folderPath = "saves/" + UID;
        String fileName = "_" + UID + "_VERIFIER.ser";

        try {
            FileInputStream fis = new FileInputStream(folderPath + "/" + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            verifier = (Verifier) ois.readObject();

            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(fileName + ": User File doesnt Exist. Please Create a new One By Siging Up");
            e.printStackTrace();
            System.exit(0);
        }

        if (Utility.getHashedPassword(password, verifier.getSalt()).equals(verifier.getHashedPassword())) {
            res = true;
        }

        return res;
    }

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonSignIn;
    private javax.swing.JLabel labelPasword;
    private javax.swing.JLabel labelSignInHeading;
    private javax.swing.JLabel labelUID;
    private javax.swing.JPasswordField passwordPassword;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JTextField textUID;
    // End of variables declaration//GEN-END:variables
}
