package com.project75.core;

import java.io.Serializable;

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
    private Data studentData;
    private Semester semester;

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Data getStudentData() {
        return studentData;
    }

    public void setStudentData(Data studentData) {
        this.studentData = studentData;
    }

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

    public String getSalt() {
        return salt;
    }

    private void hash(char[] password) {
        this.salt = Utility.createSalt();
        this.passwordHash = Utility.getHashedPassword(password, salt);
    }

    public boolean verifyPassword(char[] passwordAttempt) {
        String attemptHash = Utility.getHashedPassword(passwordAttempt, salt);
        return attemptHash.equals(this.passwordHash);
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
