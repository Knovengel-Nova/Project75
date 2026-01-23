package com.project75.app;

import com.formdev.flatlaf.FlatDarkLaf;

/**
 *
 * @author Aryan
 */
public class Project75 {
    
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
