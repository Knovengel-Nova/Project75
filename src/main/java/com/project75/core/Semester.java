package com.project75.core;

import java.io.Serializable;


/**
 *
 * @author Aryan
 */
public class Semester implements Serializable{
    private int sem;
    private int noOfSubjects;
    private Subject[] subs;

    public int getSem() {
        return sem;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }
    
    public Subject getSubject(String subId){
        for(Subject s : subs){
            if()
        }
    }

    public Semester(int sem, int noOfSubjects) {
        this.sem = sem;
        this.noOfSubjects = noOfSubjects;
        subs = new Subject[noOfSubjects];
    }
    
    
}
