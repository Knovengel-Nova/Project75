package com.project75.core;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Aryan
 */
public class Semester implements Serializable{
    private int sem;
    ArrayList<Subject> subs = new ArrayList<>();

    public int getSem() {
        return sem;
    }
    
    public boolean hasSubject(String subCode){
        for(Subject sub : subs){
            if(sub.getSubCode().equals(subCode)){
                return true;
            }
        }
        
        return false;
    }
    
    public void addSub(Subject sub){
        subs.add(sub);
    }

    public int getNoOfSubjects() {
        return subs.size();
    }
    
    public Subject[] getSubs(){
        return (Subject[])subs.toArray();
    }
    
    public Subject getSubject(String subId){
        for(Subject s : subs){
            if(s.getSubCode().equalsIgnoreCase(subId)){
                return s;
            }
        }
        System.out.println("Error:\tSubject Not Found!");
        return new Subject();
    }
    
    public Subject getSubject(int index){
        return subs.get(index);
    }

    public Semester(int sem) {
        this.sem = sem;
    }
    
    
}
