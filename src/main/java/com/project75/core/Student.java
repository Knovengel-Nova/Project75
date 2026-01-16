package com.project75.core;

import java.io.Serializable;

/**
 *
 * @author Aryan
 */
public class Student implements Serializable{
    private String stuName;
    private char stuDiv;
    private char stuBatch;
    private int stuUID;
    private String stuBranch;

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

    @Override
    public String toString() {
        return "Student{" + "stuName:" + stuName + ", stuUID:" + stuUID + '}';
    }

    public Student(String stuName, int stuUID, char stuDiv, char stuBatch, String stuBranch) {
        this.stuName = stuName;
        this.stuDiv = stuDiv;
        this.stuBatch = stuBatch;
        this.stuUID = stuUID;
        this.stuBranch = stuBranch;
    }
    
    
}
