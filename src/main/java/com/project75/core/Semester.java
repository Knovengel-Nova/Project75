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

    public Semester(int sem, int noOfSubjects) {
        this.sem = sem;
        this.noOfSubjects = noOfSubjects;
        subs = new Subject[noOfSubjects];
    }
    
    
}
