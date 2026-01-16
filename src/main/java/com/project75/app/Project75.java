package com.project75.app;

import com.formdev.flatlaf.FlatDarkLaf;
import com.project75.jforms.MainFrame;

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

}
