package com.project75.core;

import java.io.Serializable;

/**
 *
 * @author Aryan
 */
public class Subject implements Serializable{
    private String subName;
    private String subProfessor;
    private int totalLectures;
    private int attendedLectures;
    private String subId;

    public String getSubName() {
        return subName;
    }

    public String getSubProfessor() {
        return subProfessor;
    }

    public int getTotalLectures() {
        return totalLectures;
    }

    public int getAttendedLectures() {
        return attendedLectures;
    }

    public String getSubId() {
        return subId;
    }

    public Subject(String subName, String subProfessor, String subId) {
        this.subName = subName;
        this.subProfessor = subProfessor;
        this.subId = subId;
        this.totalLectures = 0;
        this.attendedLectures = 0;
    }
    
    public Subject(){
        this.attendedLectures = -1;
        this.totalLectures = -1;
        this.subProfessor = "NO_PROFESSOR";
        this.subId = "NO_ID";
        this.subName = "NO_NAME";
    }
}
