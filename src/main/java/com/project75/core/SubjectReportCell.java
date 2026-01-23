package com.project75.core;

import java.time.LocalDate;

/**
 *
 * @author Aryan
 */
public class SubjectReportCell {
    private String subjectName;
    private String subjectCode;
    private String lectureDate;
    private String status;
    
    public SubjectReportCell(Subject subject, int status){
        this.subjectName = subject.getSubName();
        this.subjectCode = subject.getSubCode();
        this.lectureDate = LocalDate.now().toString();
        
        switch(status){
            case 0:
                this.status = "Attended";
                break;
               
            case 1:
                this.status = "Missed";
                break;
                
            case 2:
                this.status = "Canceled";
                break;
                
            case 3:
                this.status = "Changed";
                break;
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getLectureDate() {
        return lectureDate;
    }

    public void setLectureDate(String lectureDate) {
        this.lectureDate = lectureDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
