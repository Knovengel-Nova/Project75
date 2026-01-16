package com.project75.jpanels;

import com.project75.core.Subject;
import com.project75.jforms.UpdateSubjectCard;
import java.awt.Dimension;

/**
 *
 * @author Aryan
 */
public class SubjectCard extends javax.swing.JPanel {

    private Subject subject;

    public Subject getSubject() {
        return subject;
    }
    
    public void updateSubjectCardData(Subject temp){
        this.subject = temp;
        init();
    }

    private void init() {
        progBarPercent.setValue(subject.getPercent());
        labelSubName.setText("Subject: "+subject.getSubName());
        labelSubCode.setText(subject.getSubCode());
        labelProfessor.setText("Professor: "+subject.getSubProfessor());
        labelAttendedLectures.setText("Attended Lectures: "+subject.getAttendedLectures());
        labelTotalLectures.setText("Total Lectures: "+subject.getTotalLectures());
        labelPercent.setText(subject.getPercent()+"%");
    }

    public SubjectCard(Subject subject) {
        initComponents();
        setFixedSize();
        this.subject = subject;
        init();
    }

    private void setFixedSize() {
        Dimension d = new Dimension(310, 404);
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progBarPercent = new javax.swing.JProgressBar();
        buttonEdit = new javax.swing.JButton();
        labelPercent = new javax.swing.JLabel();
        labelSubName = new javax.swing.JLabel();
        labelSubCode = new javax.swing.JLabel();
        labelProfessor = new javax.swing.JLabel();
        labelAttendedLectures = new javax.swing.JLabel();
        labelTotalLectures = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(310, 404));
        setMinimumSize(new java.awt.Dimension(310, 404));

        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project75/images/edit.png"))); // NOI18N
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        labelPercent.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 45)); // NOI18N
        labelPercent.setForeground(new java.awt.Color(255, 255, 255));
        labelPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPercent.setText("100%");

        labelSubName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 13)); // NOI18N
        labelSubName.setText("Subject: Data Structures");
        labelSubName.setMaximumSize(new java.awt.Dimension(294, 25));
        labelSubName.setPreferredSize(new java.awt.Dimension(333, 17));

        labelSubCode.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 12)); // NOI18N
        labelSubCode.setForeground(new java.awt.Color(255, 255, 255));
        labelSubCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubCode.setText("CE201");

        labelProfessor.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 13)); // NOI18N
        labelProfessor.setText("Professor: Anand Godbole");
        labelProfessor.setMaximumSize(new java.awt.Dimension(294, 25));
        labelProfessor.setPreferredSize(new java.awt.Dimension(177, 17));

        labelAttendedLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 13)); // NOI18N
        labelAttendedLectures.setText("Attended Lectures: 23");
        labelAttendedLectures.setMaximumSize(new java.awt.Dimension(294, 25));
        labelAttendedLectures.setPreferredSize(new java.awt.Dimension(151, 17));

        labelTotalLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 13)); // NOI18N
        labelTotalLectures.setText("Total Lectures: 23");
        labelTotalLectures.setMaximumSize(new java.awt.Dimension(294, 25));
        labelTotalLectures.setPreferredSize(new java.awt.Dimension(123, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubName, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(progBarPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelSubCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(labelAttendedLectures, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(labelTotalLectures, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelSubName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAttendedLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTotalLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(progBarPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSubCode))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        UpdateSubjectCard update = new UpdateSubjectCard(this);
        update.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel labelAttendedLectures;
    private javax.swing.JLabel labelPercent;
    private javax.swing.JLabel labelProfessor;
    private javax.swing.JLabel labelSubCode;
    private javax.swing.JLabel labelSubName;
    private javax.swing.JLabel labelTotalLectures;
    private javax.swing.JProgressBar progBarPercent;
    // End of variables declaration//GEN-END:variables
}
