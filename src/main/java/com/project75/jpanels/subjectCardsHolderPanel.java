package com.project75.jpanels;

import com.project75.core.Subject;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

/**
 *
 * @author Aryan
 */
public class subjectCardsHolderPanel extends javax.swing.JPanel {

    public subjectCardsHolderPanel() {
        setLayout(new GridLayout(0, 3, 18, 18));
        setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));

    }

    public void removeCard(Subject subject, int num) {
        int i = -1;
        for (i = 0; i < num; i++) {
            SubjectCard sc = (SubjectCard) this.getComponent(i);
            if (sc.getSubject().getSubCode().equalsIgnoreCase(subject.getSubCode())) {
                break;
            }
        }

        if (i != -1) {
            this.remove(i);
        }

    }

    public void addCard(SubjectCard card) {
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
