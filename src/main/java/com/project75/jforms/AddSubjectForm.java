package com.project75.jforms;

import com.formdev.flatlaf.FlatDarkLaf;
import com.project75.core.Student;
import com.project75.core.Subject;

/**
 *
 * @author Aryan
 */
public class AddSubjectForm extends javax.swing.JFrame {
    
    private MainFrame parent;
    
    public AddSubjectForm(MainFrame parent) {
        initComponents();
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        lableSubjectName = new javax.swing.JLabel();
        labelSubjectProfessorName = new javax.swing.JLabel();
        labelSubjectCode = new javax.swing.JLabel();
        labelAttendedLectures = new javax.swing.JLabel();
        labelTotalLectures = new javax.swing.JLabel();
        textSubjectName = new javax.swing.JTextField();
        textSubjectProfessorName = new javax.swing.JTextField();
        textSubjectCode = new javax.swing.JTextField();
        textAttendedLectures = new javax.swing.JTextField();
        textTotalLectures = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Subject");
        setAlwaysOnTop(true);
        setResizable(false);

        labelTitle.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 36)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Add New Subject");

        lableSubjectName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        lableSubjectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableSubjectName.setText("Subject Name*");

        labelSubjectProfessorName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelSubjectProfessorName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubjectProfessorName.setText("Subject Professor Name*");

        labelSubjectCode.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelSubjectCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubjectCode.setText("Subject Code*");

        labelAttendedLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelAttendedLectures.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAttendedLectures.setText("Attended Lectures:");

        labelTotalLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelTotalLectures.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalLectures.setText("Total Lectures:");

        textSubjectName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textSubjectName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSubjectName.setText("Data Structures");

        textSubjectProfessorName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textSubjectProfessorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSubjectProfessorName.setText("Anand Godbole");

        textSubjectCode.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textSubjectCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSubjectCode.setText("CE201");

        textAttendedLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textAttendedLectures.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAttendedLectures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAttendedLecturesActionPerformed(evt);
            }
        });

        textTotalLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textTotalLectures.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonCancel.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(textAttendedLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTotalLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textSubjectCode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSubjectCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textSubjectProfessorName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSubjectProfessorName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                                        .addComponent(textSubjectName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lableSubjectName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAttendedLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTotalLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lableSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubjectProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSubjectProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAttendedLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAttendedLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void showError(String msg) {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                msg,
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        String subName = textSubjectName.getText().strip();
        if (subName.isBlank() || subName.isEmpty()) {
            System.out.println("Subject name cannot be Empty. Please enter a valid Subject Name!");
            textSubjectName.grabFocus();
            return;
        }

        String profName = textSubjectProfessorName.getText().strip();
        if (profName.isBlank() || profName.isEmpty()) {
            System.out.println("Subject Professor name cannot be Empty. Please enter a valid Subject Professor Name!");
            textSubjectProfessorName.grabFocus();
            return;
        }

        String subCode = textSubjectCode.getText().strip();
        if (subCode.isBlank() || subCode.isEmpty()) {
            System.out.println("Subject Code cannot be Empty. Please enter a valid Subject Code!");
            textSubjectCode.grabFocus();
            return;
        }

        String attLecStr = textAttendedLectures.getText().strip();

        int attendedLectures = 0;
        int totalLectures = 0;
        
        if (!attLecStr.isEmpty()) {
            textTotalLectures.setEditable(true);

            try {
                attendedLectures = Integer.parseInt(attLecStr);

                if (attendedLectures < 0 || attendedLectures > 100) {
                    System.out.println("Attended Lectures cannot be over 100 or negative!");
                    return;
                }
            } catch (NumberFormatException e) {
                showError("Please Enter a valid Number!");
            }
        }

        if (attendedLectures != 0) {
            String totLecStr = textTotalLectures.getText().strip();
            try {
                if (attendedLectures == 0) {
                    return;
                }
                totalLectures = Integer.parseInt(totLecStr);

                if (totalLectures < 0 || totalLectures > 100 || totalLectures < attendedLectures) {
                    System.out.println("Total Lectures cannot be less than attended lectures or over 100 or negative!");
                    return;
                }
            } catch (NumberFormatException e) {
                showError("Please Enter a valid Number!");
            }
        }

        Subject sub = new Subject(subName, profName, subCode, attendedLectures, totalLectures);
        parent.addSubjectToList(sub);
        dispose();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void textAttendedLecturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAttendedLecturesActionPerformed
        
    }//GEN-LAST:event_textAttendedLecturesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel labelAttendedLectures;
    private javax.swing.JLabel labelSubjectCode;
    private javax.swing.JLabel labelSubjectProfessorName;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalLectures;
    private javax.swing.JLabel lableSubjectName;
    private javax.swing.JTextField textAttendedLectures;
    private javax.swing.JTextField textSubjectCode;
    private javax.swing.JTextField textSubjectName;
    private javax.swing.JTextField textSubjectProfessorName;
    private javax.swing.JTextField textTotalLectures;
    // End of variables declaration//GEN-END:variables
}
