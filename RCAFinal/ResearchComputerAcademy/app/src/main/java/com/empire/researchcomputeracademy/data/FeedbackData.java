package com.empire.researchcomputeracademy.data;

public class FeedbackData {

    String title, studentName, course;

    public FeedbackData() {
    }

    public FeedbackData(String title, String studentName, String course) {
        this.title = title;
        this.studentName = studentName;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
