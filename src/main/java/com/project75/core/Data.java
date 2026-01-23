package com.project75.core;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aryan
 */
public class Data implements Serializable{
    private Semester semester;
    private Object[][] timetableData;
    private String[] timetableColumns;
    private Subject[] listData;
    private ArrayList<SubjectReportCell> attendanceReport = new ArrayList<>();

    
    public void addSubjectToReport(Subject subject, int status){
        SubjectReportCell temp = new SubjectReportCell(subject, status);
        this.attendanceReport.add(temp);
    }
    
    public SubjectReportCell getLastAddedCellToReport(){
        return attendanceReport.getLast();
    }
    
    public SubjectReportCell[] getAttendenceReport(){
        return attendanceReport.toArray(new SubjectReportCell[0]);
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

    public Data(Semester semester, Subject[][] timetableData, String[] timetableColumns, Subject[] listData) {
        this.semester = semester;
        this.timetableData = timetableData;
        this.timetableColumns = timetableColumns;
        this.listData = listData;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
