package com.project75.app;

import com.project75.core.Data;
import com.project75.jforms.MainFrame;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Aryan
 */
public class SignIn extends javax.swing.JFrame {

    private Project75 parent;

    public SignIn(Project75 parent) {
        initComponents();
        this.parent = parent;
        this.textUID.setText("");
        this.passwordPassword.setText("");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textUID))
                    .addComponent(labelSignInHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordPassword)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSignInHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textUID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPasword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(passwordPassword))
                .addGap(46, 46, 46)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignInActionPerformed
        int UID = Integer.parseInt(textUID.getText());

        String folderPath = "saves";
        String fileName = "_DATA" + Integer.toString(UID) + ".ser";

        try {
            FileInputStream fis = new FileInputStream(folderPath + "/" + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Data temp = (Data) ois.readObject();

            if (temp.getStudent().verifyPassword(passwordPassword.getPassword())) {
                System.out.println(fileName + " Retrieved Successfully!");
                parent.setData(temp);

            } else {
                System.out.println("Wrong Password!.");
                System.exit(0);
            }

            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(fileName + ": User File doesnt Exist. Please Create a new One By Siging Up");
            e.printStackTrace();
            System.exit(0);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(parent).setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_buttonSignInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSignIn;
    private javax.swing.JLabel labelPasword;
    private javax.swing.JLabel labelSignInHeading;
    private javax.swing.JLabel labelUID;
    private javax.swing.JPasswordField passwordPassword;
    private javax.swing.JTextField textUID;
    // End of variables declaration//GEN-END:variables
}
