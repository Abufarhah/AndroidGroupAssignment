package com.example.assignment2.model;


import java.io.Serializable;

public class Course implements Serializable {
    //layth
    private String courseCode;
    private String courseName;
    private String prerequisite;
    private int numOfEnrolledStudents;
    private int maxNum;


    public Course() {
    }

    public Course(String courseCode, String courseName, String prerequisite, int numOfEnrolledStudents, int maxNum) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.prerequisite = prerequisite;
        this.numOfEnrolledStudents = numOfEnrolledStudents;
        this.maxNum = maxNum;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public int getNumOfEnrolledStudents() {
        return numOfEnrolledStudents;
    }

    public void setNumOfEnrolledStudents(int numOfEnrolledStudents) {
        this.numOfEnrolledStudents = numOfEnrolledStudents;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", prerequisite='" + prerequisite + '\'' +
                ", numOfEnrolledStudents=" + numOfEnrolledStudents +
                ", maxNum=" + maxNum +
                '}';
    }
}
