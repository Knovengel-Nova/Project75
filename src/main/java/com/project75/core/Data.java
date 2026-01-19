package com.project75.core;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Aryan
 */
public class Data implements Serializable{
    private Student student;
    private Semester semester;
    private Object[][] timetableData;
    private String[] timetableColumns;
    private Subject[] listData;
    private Date lastDateUpdated;
    private int[] todaysSubjectsStat;

    public Date getLastDateUpdated() {
        return lastDateUpdated;
    }

    public void setLastDateUpdated(Date lastDateUpdated) {
        this.lastDateUpdated = lastDateUpdated;
    }

    public Subject[] getListData() {
        return listData;
    }

    public void setListData(Subject[] listData) {
        this.listData = listData;
    }

    public Object[][] getTimetableData() {
        return timetableData;
    }

    public void setTimetableData(Subject[][] timetableData) {
        this.timetableData = timetableData;
    }

    public String[] getTimetableColumns() {
        return timetableColumns;
    }

    public void setTimetableColumns(String[] timetableColumns) {
        this.timetableColumns = timetableColumns;
    }

    public Data(Student student, Semester semester, Subject[][] timetableData, String[] timetableColumns, Subject[] listData) {
        this.student = student;
        this.semester = semester;
        this.timetableData = timetableData;
        this.timetableColumns = timetableColumns;
        this.listData = listData;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
