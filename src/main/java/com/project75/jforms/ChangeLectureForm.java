package com.project75.jforms;

import com.project75.core.Subject;
import com.project75.jpanels.DailySubjectCard;
import javax.swing.DefaultListModel;

/**
 *
 * @author Aryan
 */
public class ChangeLectureForm extends javax.swing.JFrame {
    
    private Subject oldSub;
    private Subject newSub;
    private DailySubjectCard parent;
    
    public ChangeLectureForm(DailySubjectCard parent, Subject oldSub) {
        initComponents();
        DefaultListModel model = new DefaultListModel();
        this.parent = parent;
        this.oldSub = oldSub;
        this.newSub = oldSub;
        this.labelOldSubject.setText("Old Subject: "+oldSub);
        this.labelNewSubject.setText("New Subject: "+newSub);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneList = new javax.swing.JScrollPane();
        listSubjectList = new javax.swing.JList<>();
        labelOldSubject = new javax.swing.JLabel();
        labelNewSubject = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonChange = new javax.swing.JButton();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Change Lecture");
        setAlwaysOnTop(true);
        setResizable(false);

        listSubjectList.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 14)); // NOI18N
        listSubjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSubjectListMouseClicked(evt);
            }
        });
        scrollPaneList.setViewportView(listSubjectList);

        labelOldSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelOldSubject.setText("Old Lecture: [Sub Code: CE201, Subject Name: DataStructures]");

        labelNewSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        labelNewSubject.setText("New Lecture: [Sub Code: CE201, Subject Name: Data Structures]");

        buttonCancel.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonChange.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        buttonChange.setText("Change");
        buttonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneList)
                    .addComponent(labelOldSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNewSubject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneList, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(buttonChange, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listSubjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSubjectListMouseClicked
        
    }//GEN-LAST:event_listSubjectListMouseClicked

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
        
    }//GEN-LAST:event_buttonChangeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonChange;
    private javax.swing.JLabel labelNewSubject;
    private javax.swing.JLabel labelOldSubject;
    private javax.swing.JList<String> listSubjectList;
    private javax.swing.JScrollPane scrollPaneList;
    // End of variables declaration//GEN-END:variables
}
