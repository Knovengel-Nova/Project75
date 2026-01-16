package com.project75.jforms;

import com.formdev.flatlaf.*;
import com.project75.app.Project75;
import javax.swing.DefaultListModel;
import com.project75.core.*;
import com.project75.jpanels.SubjectCard;
import com.project75.jpanels.subjectCardsHolderPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Aryan
 */
public class MainFrame extends javax.swing.JFrame {

    DefaultListModel<Subject> model;
    private subjectCardsHolderPanel cardsHolder;
    private Semester semester;
    private int semNo;

    public MainFrame(int sem) {
        semester = new Semester(sem);
        this.semNo = sem;
        initComponents();
        model = new DefaultListModel();
        listSubjectLis.setModel(model);

        cardsHolder = new subjectCardsHolderPanel();

        JScrollPane scroll = new JScrollPane(cardsHolder);
        scroll.setBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(16);

        panelAttendanceStats.setLayout(new java.awt.BorderLayout());
        panelAttendanceStats.add(scroll, java.awt.BorderLayout.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        panelSubjectList = new javax.swing.JPanel();
        scrollPaneListScroll = new javax.swing.JScrollPane();
        listSubjectLis = new javax.swing.JList<>();
        scrollPaneTextScroll = new javax.swing.JScrollPane();
        textAreaText = new javax.swing.JTextArea();
        labelSubjects = new javax.swing.JLabel();
        buttonRemoveSubject = new javax.swing.JButton();
        buttonAddNewSubject = new javax.swing.JButton();
        panelAttendanceStats = new javax.swing.JPanel();
        panelTimeTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainFrame");
        setMaximumSize(new java.awt.Dimension(1016, 580));
        setMinimumSize(new java.awt.Dimension(1016, 580));
        setResizable(false);

        listSubjectLis.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 24)); // NOI18N
        listSubjectLis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSubjectLisMouseClicked(evt);
            }
        });
        scrollPaneListScroll.setViewportView(listSubjectLis);

        textAreaText.setEditable(false);
        textAreaText.setColumns(20);
        textAreaText.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 18)); // NOI18N
        textAreaText.setRows(5);
        scrollPaneTextScroll.setViewportView(textAreaText);

        labelSubjects.setFont(new java.awt.Font("Exo 2 ExtraBold", 1, 36)); // NOI18N
        labelSubjects.setForeground(new java.awt.Color(255, 255, 255));
        labelSubjects.setText("Subjects");

        buttonRemoveSubject.setBackground(new java.awt.Color(214, 48, 49));
        buttonRemoveSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 40)); // NOI18N
        buttonRemoveSubject.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoveSubject.setText("Remove Subject");
        buttonRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveSubjectActionPerformed(evt);
            }
        });

        buttonAddNewSubject.setBackground(new java.awt.Color(0, 184, 148));
        buttonAddNewSubject.setFont(new java.awt.Font("Exo 2 SemiBold", 1, 40)); // NOI18N
        buttonAddNewSubject.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddNewSubject.setText("Add New Subject");
        buttonAddNewSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNewSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSubjectListLayout = new javax.swing.GroupLayout(panelSubjectList);
        panelSubjectList.setLayout(panelSubjectListLayout);
        panelSubjectListLayout.setHorizontalGroup(
            panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTextScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(buttonRemoveSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddNewSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSubjectListLayout.setVerticalGroup(
            panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSubjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSubjectListLayout.createSequentialGroup()
                        .addComponent(labelSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSubjectListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRemoveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTextScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabbedPane.addTab("Subject List", panelSubjectList);

        javax.swing.GroupLayout panelAttendanceStatsLayout = new javax.swing.GroupLayout(panelAttendanceStats);
        panelAttendanceStats.setLayout(panelAttendanceStatsLayout);
        panelAttendanceStatsLayout.setHorizontalGroup(
            panelAttendanceStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        panelAttendanceStatsLayout.setVerticalGroup(
            panelAttendanceStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Attendance Stats", panelAttendanceStats);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Save");

        javax.swing.GroupLayout panelTimeTableLayout = new javax.swing.GroupLayout(panelTimeTable);
        panelTimeTable.setLayout(panelTimeTableLayout);
        panelTimeTableLayout.setHorizontalGroup(
            panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTimeTableLayout.setVerticalGroup(
            panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTimeTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTimeTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Time Table", panelTimeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddNewSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNewSubjectActionPerformed
        AddSubjectForm subForm = new AddSubjectForm(this);
        subForm.setVisible(true);
    }//GEN-LAST:event_buttonAddNewSubjectActionPerformed

    private void buttonRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveSubjectActionPerformed
        textAreaText.setText("");
        if (listSubjectLis.getSelectedIndex() != -1) {
            textAreaText.append("Removed Subject! ");
            model.removeElementAt(listSubjectLis.getSelectedIndex());
        } else if (model.getSize() == 0) {  // if the list is empty
            textAreaText.append("List is Empty!");
        } else {     //if no student is selected
            textAreaText.append("Please select a Subject!");
        }
    }//GEN-LAST:event_buttonRemoveSubjectActionPerformed

    private void listSubjectLisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSubjectLisMouseClicked

        if (listSubjectLis.getSelectedIndex() == -1) { // if the list is empty
            return;
        }

        textAreaText.setText("");
        Subject temp = semester.getSubject(listSubjectLis.getSelectedIndex());
        String str
                = "Subject Code: " + temp.getSubCode() + "\n"
                + "Subject: " + temp.getSubName() + "\n"
                + "Subject Professor: " + temp.getSubProfessor() + "\n";
        textAreaText.append(str);
    }//GEN-LAST:event_listSubjectLisMouseClicked

    public void addSubjectToList(Subject subject) {

        if (semester.hasSubject(subject.getSubCode())) {
            textAreaText.setText("Subject Already present in Subject List!");
            return;
        }
        model.addElement(subject);
        semester.addSub(subject);
        cardsHolder.addCard(new SubjectCard(subject));
        textAreaText.setText("New Subject added!");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddNewSubject;
    private javax.swing.JButton buttonRemoveSubject;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelSubjects;
    private javax.swing.JList<Subject> listSubjectLis;
    private javax.swing.JPanel panelAttendanceStats;
    private javax.swing.JPanel panelSubjectList;
    private javax.swing.JPanel panelTimeTable;
    private javax.swing.JScrollPane scrollPaneListScroll;
    private javax.swing.JScrollPane scrollPaneTextScroll;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextArea textAreaText;
    // End of variables declaration//GEN-END:variables
}
