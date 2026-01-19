package com.project75.core;

import java.io.Serializable;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Aryan
 */
public class Student implements Serializable {

    private String stuName;
    private char stuDiv;
    private char stuBatch;
    private int stuUID;
    private String stuBranch;
    private String salt;
    private String passwordHash;

    public String getStuName() {
        return stuName;
    }

    public char getStuDiv() {
        return stuDiv;
    }

    public char getStuBatch() {
        return stuBatch;
    }

    public int getStuUID() {
        return stuUID;
    }

    public String getStuBranch() {
        return stuBranch;
    }

    private void hash(char[] password) {
        try {
            // Generating salt
            byte[] saltBytes = new byte[16];
            SecureRandom random = new SecureRandom();
            random.nextBytes(saltBytes);
            this.salt = Base64.getEncoder().encodeToString(saltBytes);

            // PBKDF2 hash
            KeySpec spec = new PBEKeySpec(password, saltBytes, 65_536, 256);

            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

            byte[] hashBytes = factory.generateSecret(spec).getEncoded();
            this.passwordHash = Base64.getEncoder().encodeToString(hashBytes);

            java.util.Arrays.fill(password, '\0');

        } catch (Exception e) {
            throw new RuntimeException("Password hashing failed", e);
        }
    }

    public boolean verifyPassword(char[] passwordAttempt) {
        try {
            byte[] saltBytes = Base64.getDecoder().decode(this.salt);

            KeySpec spec = new PBEKeySpec(passwordAttempt, saltBytes, 65_536, 256);

            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

            byte[] hashAttempt = factory.generateSecret(spec).getEncoded();

            String attemptHash = Base64.getEncoder().encodeToString(hashAttempt);

            java.util.Arrays.fill(passwordAttempt, '\0');

            return attemptHash.equals(this.passwordHash);

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "stuName:" + stuName + ", stuUID:" + stuUID + '}';
    }

    public Student(String stuName, int stuUID, char stuDiv, char stuBatch, String stuBranch, char[] pass) {
        this.stuName = stuName;
        this.stuDiv = stuDiv;
        this.stuBatch = stuBatch;
        this.stuUID = stuUID;
        this.stuBranch = stuBranch;
        hash(pass);
    }

}
