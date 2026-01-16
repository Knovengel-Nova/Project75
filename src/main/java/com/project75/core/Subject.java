package com.project75.core;

import java.io.Serializable;

/**
 *
 * @author Aryan
 */
public class Subject implements Serializable {

    private String subName;
    private String subProfessor;
    private String subCode;
    private int attendedLectures;
    private int totalLectures;

    public String getSubName() {
        return subName;
    }

    public void setSubProfessor(String subProfessor) {
        this.subProfessor = subProfessor;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public void setAttendedLectures(int attendedLectures) {
        this.attendedLectures = attendedLectures;
    }

    public void setTotalLectures(int totalLectures) {
        this.totalLectures = totalLectures;
    }

    public String getSubProfessor() {
        return subProfessor;
    }

    public String getSubCode() {
        return subCode;
    }
    
    public int getAttendedLectures() {
        return attendedLectures;
    }
    
    public int getTotalLectures() {
        return totalLectures;
    }
    
    public int getPercent(){
        if(attendedLectures == 0)
            return 0;
        
        return ((int)(attendedLectures * 100.00))/totalLectures;
    }

    public Subject(String subName, String subProfessor, String subId) {
        this.subName = subName;
        this.subProfessor = subProfessor;
        this.subCode = subId;
        this.totalLectures = 0;
        this.attendedLectures = 0;
    }

    public Subject(String subName, String subProfessor, String subId, int attendedLectures, int totalLectures) {
        this.subName = subName;
        this.subProfessor = subProfessor;
        this.subCode = subId;
        this.attendedLectures = attendedLectures;
        this.totalLectures = totalLectures;
    }

    @Override
    public String toString() {
        return
                "[SubCode: "+this.subCode+
                ", Sub: "+this.subName+"]";
    }

    public Subject() {
        this.attendedLectures = 0;
        this.totalLectures = 0;
        this.subProfessor = "NO_PROFESSOR";
        this.subCode = "NO_ID";
        this.subName = "NO_NAME";
    }
}
