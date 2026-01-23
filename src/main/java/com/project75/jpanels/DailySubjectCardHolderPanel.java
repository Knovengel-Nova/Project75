package com.project75.jpanels;

import com.project75.core.SubjectReportCell;
import com.project75.jforms.MainFrame;
import java.awt.GridLayout;
import java.time.LocalDate;
import javax.swing.BorderFactory;

/**
 *
 * @author Aryan
 */
public class DailySubjectCardHolderPanel extends javax.swing.JPanel {

    private MainFrame parent;

    public void removeCard(DailySubjectCard sub, int num) {
        int i = -1;
        for (i = 0; i < num; i++) {
            DailySubjectCard dSC = (DailySubjectCard) this.getComponent(i);
            if (dSC.getSubject().getSubCode().equalsIgnoreCase(sub.getSubject().getSubCode())) {
                break;
            }
        }

        if (i != 1) {
            this.remove(i);
        }
    }

    public void markCard(DailySubjectCard card, int num, int status) {
        SubjectReportCell reportCell;
        reportCell = new SubjectReportCell(card.getSubject(), status);
        parent.getStudentUser().getStudentData().addSubjectToReport(card.getSubject(), status);
    }

    public DailySubjectCardHolderPanel(MainFrame parent) {
        this.parent = parent;
        setLayout(new GridLayout(0, 3, 18, 18));
        setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
    }

    public void addDailyCard(DailySubjectCard card) {
        add(card);
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
