package com.project75.app;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.project75.jforms.MainFrame;
import javax.swing.UIManager;

/**
 *
 * @author Aryan
 */
public class Project75 {

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(3).setVisible(true);
        });
    }

    public static void updateTheme(boolean dark) {
        try {
            if (dark) {
                UIManager.setLookAndFeel(new FlatDarkLaf());
            } else {
                UIManager.setLookAndFeel(new FlatLightLaf());
            }

            FlatLaf.updateUI();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
