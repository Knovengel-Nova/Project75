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
    
    public void removeSub(Subject sub){
        int i = -1;
        for(i=0; i<subs.size(); i++){
            if(subs.get(i).getSubCode().equalsIgnoreCase(sub.getSubCode())){
                break;
            }
        }
        subs.remove(i);
        printArr();
        
    }
    
    public void printArr(){
        System.out.println("");
        for(Subject s: subs){
            System.out.println(s);
        }
    }
    
    public void addSub(Subject sub){
        subs.add(sub);
        printArr();
    }

    public int getNoOfSubjects() {
        return subs.size();
    }
    
    public Subject[] getSubs(){
        return subs.toArray(new Subject[0]);
        
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
    
    public void saveData(){
        
    }
}
