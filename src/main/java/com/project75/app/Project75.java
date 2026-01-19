package com.project75.app;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.project75.core.Semester;
import com.project75.core.TimeTableData;
import com.project75.jforms.MainFrame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aryan
 */
public class Project75 {
    private static LocalDate lD = LocalDate.now();

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        
        

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame(3).setVisible(true);
        });
    }

    public static String getDayOfTheWeek(){
        
        return lD.getDayOfWeek().toString();
    }
    
    public static String getMonthOfTheYear(){
        return lD.getMonth().toString();
    }
    
    public static String getDateOfTheMonth(){
        return (String)Integer.toString(lD.getDayOfMonth());
    }
    
    public static String getYear(){
        return Integer.toString(lD.getYear());
    }
    
    public static int getDayOfTheWeekInt(){
        int i=5;
        
        if(getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.MONDAY.toString()))
            i=0;
        else if(getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.TUESDAY.toString()))
            i=1;
        else if(getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.WEDNESDAY.toString()))
            i=2;
        else if(getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.THURSDAY.toString()))
            i=3;
        else if(getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.FRIDAY.toString()))
            i=4;
        
        return i;
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

    public static void saveData(Semester sem, JTable table) {
        String folderPath = "saves";
        new java.io.File(folderPath).mkdirs();

        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/sem" + sem.getSem() + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(sem);
            System.out.println("Semester " + sem.getSem() + " Data Saved Successfully!");

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/table" + sem.getSem() + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            DefaultTableModel model = (DefaultTableModel) table.getModel();

            int rows = model.getRowCount();
            int cols = model.getColumnCount();

            Object[][] data = new Object[rows][cols];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    data[r][c] = model.getValueAt(r, c);
                }
            }

            String[] columns = new String[cols];
            for (int c = 0; c < cols; c++) {
                columns[c] = model.getColumnName(c);
            }

            TimeTableData tt = new TimeTableData(data, columns);
            oos.writeObject(tt);
            System.out.println("Table " + sem.getSem() + " Data Saved Successfully!");

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void retriveData(MainFrame parent) {
        String folderPath = "saves";

        try {
            FileInputStream fis = new FileInputStream(folderPath + "/sem" + parent.getSemester().getSem() + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Semester sem = (Semester) ois.readObject();
            System.out.println("Semester " + parent.getSemester().getSem() + " Data Loaded Successfully!");
            parent.setSemester(sem);

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(folderPath + "/table" + parent.getSemester().getSem() + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            TimeTableData tt = (TimeTableData) ois.readObject();

            DefaultTableModel model = new DefaultTableModel(
                    tt.getData(),
                    tt.getColumns()
            );

            parent.setTableModel(model);
            System.out.println("Table " + parent.getSemester().getSem() + " Data Loaded Successfully!");

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
