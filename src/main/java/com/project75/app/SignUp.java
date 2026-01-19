package com.project75.app;

import com.project75.core.Data;
import com.project75.core.Semester;
import com.project75.core.Student;
import com.project75.core.Subject;
import com.project75.jforms.MainFrame;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Aryan
 */
public class SignUp extends javax.swing.JFrame {

    private Project75 parent;

    public SignUp(Project75 parent) {
        initComponents();
        this.parent = parent;
        textStudentBatch.setText("");
        textStudentBranch.setText("");
        textStudentDivision.setText("");
        textStudentName.setText("");
        textStudentSemester.setText("");
        textStudentUID.setText("");
        passwordPassword.setText("");
        passwordConfirmPassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelStudentName = new javax.swing.JLabel();
        textStudentName = new javax.swing.JTextField();
        labelStudentUID = new javax.swing.JLabel();
        textStudentUID = new javax.swing.JTextField();
        labelStudentDivision = new javax.swing.JLabel();
        textStudentDivision = new javax.swing.JTextField();
        labelStudentBatch = new javax.swing.JLabel();
        textStudentBatch = new javax.swing.JTextField();
        labelStudentBranch = new javax.swing.JLabel();
        textStudentBranch = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordPassword = new javax.swing.JPasswordField();
        labelConfirmPassword = new javax.swing.JLabel();
        passwordConfirmPassword = new javax.swing.JPasswordField();
        textStudentSemester = new javax.swing.JTextField();
        labelStudentSemester = new javax.swing.JLabel();
        labelSignUpHeading = new javax.swing.JLabel();
        buttonSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);

        labelStudentName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentName.setText("Student Name:");

        textStudentName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelStudentUID.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentUID.setText("Student UID:");

        textStudentUID.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelStudentDivision.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentDivision.setText("Student Division:");

        textStudentDivision.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelStudentBatch.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentBatch.setText("Student Batch:");

        textStudentBatch.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textStudentBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStudentBatchActionPerformed(evt);
            }
        });

        labelStudentBranch.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentBranch.setText("Student Branch:");

        textStudentBranch.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelPassword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelPassword.setText("Password:");

        passwordPassword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelConfirmPassword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelConfirmPassword.setText("Confirm Password:");

        passwordConfirmPassword.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        textStudentSemester.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N

        labelStudentSemester.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelStudentSemester.setText("Student Semester:");

        labelSignUpHeading.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 48)); // NOI18N
        labelSignUpHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSignUpHeading.setText("Sign Up");

        buttonSignUp.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 32)); // NOI18N
        buttonSignUp.setText("Sign Up");
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSignUpHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(labelStudentSemester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentBranch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentDivision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentUID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                            .addComponent(textStudentUID)
                            .addComponent(textStudentDivision)
                            .addComponent(textStudentBatch)
                            .addComponent(textStudentBranch)
                            .addComponent(textStudentSemester)
                            .addComponent(passwordPassword)
                            .addComponent(passwordConfirmPassword))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSignUpHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentName)
                    .addComponent(labelStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentUID)
                    .addComponent(labelStudentUID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentDivision)
                    .addComponent(labelStudentDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentBatch)
                    .addComponent(labelStudentBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentBranch)
                    .addComponent(labelStudentBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textStudentSemester)
                    .addComponent(labelStudentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textStudentBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStudentBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStudentBatchActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        Student std = new Student(textStudentName.getText(), Integer.parseInt(textStudentUID.getText()), textStudentDivision.getText().charAt(0), textStudentBatch.getText().charAt(0), textStudentBranch.getText(), passwordPassword.getPassword());
        Semester sem = new Semester(Integer.parseInt(textStudentSemester.getText()));

        Subject[][] timeTableData = new Subject[10][5];
        Subject[] listData = new Subject[0];

        String[] tableColumns = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Data d = new Data(std, sem, timeTableData, tableColumns, listData);
        parent.setData(d);

        String folderPath = "saves";
        new java.io.File(folderPath).mkdirs();

        String fileName = "_DATA" + this.textStudentUID.getText() + ".ser";

        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(d);
            System.out.println(fileName + " Succesfully saved in " + folderPath);

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(parent).setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel labelConfirmPassword;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignUpHeading;
    private javax.swing.JLabel labelStudentBatch;
    private javax.swing.JLabel labelStudentBranch;
    private javax.swing.JLabel labelStudentDivision;
    private javax.swing.JLabel labelStudentName;
    private javax.swing.JLabel labelStudentSemester;
    private javax.swing.JLabel labelStudentUID;
    private javax.swing.JPasswordField passwordConfirmPassword;
    private javax.swing.JPasswordField passwordPassword;
    private javax.swing.JTextField textStudentBatch;
    private javax.swing.JTextField textStudentBranch;
    private javax.swing.JTextField textStudentDivision;
    private javax.swing.JTextField textStudentName;
    private javax.swing.JTextField textStudentSemester;
    private javax.swing.JTextField textStudentUID;
    // End of variables declaration//GEN-END:variables
}
