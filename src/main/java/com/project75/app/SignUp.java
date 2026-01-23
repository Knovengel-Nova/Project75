package com.project75.app;

import com.project75.core.Data;
import com.project75.core.Semester;
import com.project75.core.Student;
import com.project75.core.Subject;
import com.project75.core.Utility;
import com.project75.core.Verifier;
import com.project75.jforms.MainFrame;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Aryan
 */
public class SignUp extends javax.swing.JFrame {

    private Student newStudent;

    public SignUp() {
        initComponents();
        textStudentBatch.setText("");
        textStudentBranch.setText("");
        textStudentDivision.setText("");
        textStudentName.setText("");
        textStudentSemester.setText("");
        textStudentUID.setText("");
        passwordPassword.setText("");
        passwordConfirmPassword.setText("");
        textStudentName.requestFocus();
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
        buttonMenu = new javax.swing.JButton();
        separatorTitle = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project75 - SignUp");
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

        buttonMenu.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separatorTitle)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSignUpHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentSemester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentBranch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentDivision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentUID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textStudentName)
                            .addComponent(textStudentUID)
                            .addComponent(textStudentDivision)
                            .addComponent(textStudentBatch)
                            .addComponent(textStudentBranch)
                            .addComponent(textStudentSemester)
                            .addComponent(passwordPassword)
                            .addComponent(passwordConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSignUpHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textStudentBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStudentBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStudentBatchActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        
        //  create a student with the inputed data.
        newStudent = new Student(textStudentName.getText(), Integer.parseInt(textStudentUID.getText()), textStudentDivision.getText().charAt(0), textStudentBatch.getText().charAt(0), textStudentBranch.getText(), passwordPassword.getPassword());
        Semester sem = new Semester(Integer.parseInt(textStudentSemester.getText()));
        newStudent.setSemester(sem);

        //  main data fields
        Subject[][] timeTableData = new Subject[10][5];
        Subject[] listData = new Subject[0];
        String[] tableColumns = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        //  create data class for student
        Data data = new Data(sem, timeTableData, tableColumns, listData);
        newStudent.setStudentData(data);
        

        //  actual saving of .ser file
        String folderPath = "saves/"+newStudent.getStuUID();
        new java.io.File(folderPath).mkdirs();

        //  DATA file
        String fileName = "_"+newStudent.getStuUID()+"_DATA.ser";
        
        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(newStudent);
            System.out.println(fileName + " for "+newStudent.getStuName()+" Succesfully saved in " + folderPath);

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //  VERIFIER file
        Verifier verifier = new Verifier(Integer.toString(newStudent.getStuUID()), newStudent.getSalt(), newStudent.getPasswordHash());
        fileName = "_"+newStudent.getStuUID()+"_VERIFIER.ser";
        
        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(verifier);
            System.out.println(fileName + " for "+newStudent.getStuName()+" Succesfully saved in " + folderPath);

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(newStudent).setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMenu;
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
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JTextField textStudentBatch;
    private javax.swing.JTextField textStudentBranch;
    private javax.swing.JTextField textStudentDivision;
    private javax.swing.JTextField textStudentName;
    private javax.swing.JTextField textStudentSemester;
    private javax.swing.JTextField textStudentUID;
    // End of variables declaration//GEN-END:variables
}
