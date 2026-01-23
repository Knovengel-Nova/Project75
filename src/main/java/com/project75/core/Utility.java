package com.project75.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.SecureRandom;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Aryan
 */
public class Utility {

    private static LocalDate lD = LocalDate.now();

    //  Hashing related Functions
    private static final int ITERATIONS = 120_000;
    private static final int KEY_LENGTH = 256;
    private static final int SALT_LENGTH = 32;

    public static String createSalt() {
        byte[] saltBytes = new byte[SALT_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(saltBytes);

        return Base64.getEncoder().encodeToString(saltBytes);
    }

    public static String getHashedPassword(char[] password, String salt) {
        try {
            byte[] saltBytes = Base64.getDecoder().decode(salt);

            PBEKeySpec spec
                    = new PBEKeySpec(password, saltBytes, ITERATIONS, KEY_LENGTH);

            SecretKeyFactory factory
                    = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

            byte[] hashBytes = factory.generateSecret(spec).getEncoded();

            // Clear sensitive data
            java.util.Arrays.fill(password, '\0');
            spec.clearPassword();

            return Base64.getEncoder().encodeToString(hashBytes);

        } catch (Exception e) {
            throw new RuntimeException("Password hashing failed", e);
        }
    }
        //  Saving and Retrieving data files
    public static void saveStudentDataFile(Student student) {
        String folderPath = "saves/"+student.getStuUID();
        new java.io.File(folderPath).mkdirs();

        String fileName = "_" + student.getStuUID() + "_DATA.ser";

        try {
            FileOutputStream fos = new FileOutputStream(folderPath + "/" + fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);
            System.out.println(fileName + " Succesfully saved in " + folderPath);

            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Student retrieveStudentDataFile(String UID) {
        String folderPath = "saves/"+UID;
        String fileName = "_" + UID + "_DATA.ser";

        Student stdData = null;

        try {
            FileInputStream fis = new FileInputStream(folderPath + "/" + fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student temp = (Student) ois.readObject();
            System.out.println(fileName + " Retrieved Successfully!");

            stdData = temp;

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stdData;
    }

    //  Date Time Related Functions
    public static String getDayOfTheWeek() {

        return lD.getDayOfWeek().toString();
    }

    public static String getMonthOfTheYear() {
        return lD.getMonth().toString();
    }

    public static String getDateOfTheMonth() {
        return (String) Integer.toString(lD.getDayOfMonth());
    }

    public static String getYear() {
        return Integer.toString(lD.getYear());
    }

    public static int getDayOfTheWeekInt() {
        int i = 5;

        if (getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.MONDAY.toString())) {
            i = 0;
        } else if (getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.TUESDAY.toString())) {
            i = 1;
        } else if (getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.WEDNESDAY.toString())) {
            i = 2;
        } else if (getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.THURSDAY.toString())) {
            i = 3;
        } else if (getDayOfTheWeek().equalsIgnoreCase(DayOfWeek.FRIDAY.toString())) {
            i = 4;
        }

        return i;
    }

}
