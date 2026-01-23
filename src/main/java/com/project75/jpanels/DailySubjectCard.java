package com.project75.jpanels;

import com.project75.core.Subject;
import com.project75.core.Utility;
import com.project75.jforms.ChangeLectureForm;

/**
 *
 * @author Aryan
 */
public class DailySubjectCard extends javax.swing.JPanel {

    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public DailySubjectCard(Subject subject) {
        initComponents();
        this.subject = subject;
        init();
    }

    void init() {
        this.labelDate.setText(Utility.getDateOfTheMonth());
        this.labelDayOfTheWeek.setText(Utility.getDayOfTheWeek());
        this.labelSubjectName.setText(subject.getSubName());
        this.labelProfessorName.setText("~ " + subject.getSubProfessor());
        int a = subject.getAttendedLectures();
        int b = subject.getTotalLectures();
        int p = subject.getPercent();
        this.progBarPercent.setValue(p);
        this.labelPercent.setText(p + "%");
        this.labelLectures.setText(a + "/" + b);
    }

    public void updateSubject(Subject subject) {
        this.subject = subject;
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonMissing = new javax.swing.JButton();
        buttonChangeLecture = new javax.swing.JButton();
        buttonAttending = new javax.swing.JButton();
        labelPercent = new javax.swing.JLabel();
        labelDayOfTheWeek = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        progBarPercent = new javax.swing.JProgressBar();
        labelSubjectName = new javax.swing.JLabel();
        labelProfessorName = new javax.swing.JLabel();
        labelLectures = new javax.swing.JLabel();
        buttonCanceled = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonMissing.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        buttonMissing.setText("Missing");
        buttonMissing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMissingActionPerformed(evt);
            }
        });

        buttonChangeLecture.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        buttonChangeLecture.setText("Change Lecture");
        buttonChangeLecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeLectureActionPerformed(evt);
            }
        });

        buttonAttending.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        buttonAttending.setText("Attending");
        buttonAttending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAttendingActionPerformed(evt);
            }
        });

        labelPercent.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 36)); // NOI18N
        labelPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPercent.setText("75%");

        labelDayOfTheWeek.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelDayOfTheWeek.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDayOfTheWeek.setText("MONDAY");

        labelDate.setFont(new java.awt.Font("Exo 2 Medium", 3, 16)); // NOI18N
        labelDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDate.setText("19/01/2026");

        labelSubjectName.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelSubjectName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubjectName.setText("Data Structures & Algorithm");

        labelProfessorName.setFont(new java.awt.Font("Exo 2 SemiBold", 2, 14)); // NOI18N
        labelProfessorName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProfessorName.setText("~ Anand Godbole");

        labelLectures.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        labelLectures.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLectures.setText("9/12");

        buttonCanceled.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        buttonCanceled.setText("Canceled");
        buttonCanceled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCanceledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubjectName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progBarPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDayOfTheWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelProfessorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLectures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonAttending, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonChangeLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonMissing, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDayOfTheWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progBarPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(labelLectures)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonChangeLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAttending, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMissing, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChangeLectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeLectureActionPerformed
        ChangeLectureForm fm = new ChangeLectureForm(this, subject);
        fm.setVisible(true);
    }//GEN-LAST:event_buttonChangeLectureActionPerformed

    private void buttonMissingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMissingActionPerformed
        subject.setTotalLectures(subject.getTotalLectures() + 1);
    }//GEN-LAST:event_buttonMissingActionPerformed

    private void buttonCanceledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCanceledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCanceledActionPerformed

    private void buttonAttendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAttendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAttendingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAttending;
    private javax.swing.JButton buttonCanceled;
    private javax.swing.JButton buttonChangeLecture;
    private javax.swing.JButton buttonMissing;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDayOfTheWeek;
    private javax.swing.JLabel labelLectures;
    private javax.swing.JLabel labelPercent;
    private javax.swing.JLabel labelProfessorName;
    private javax.swing.JLabel labelSubjectName;
    private javax.swing.JProgressBar progBarPercent;
    // End of variables declaration//GEN-END:variables
}
