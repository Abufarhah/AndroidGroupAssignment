package com.example.assignment2.model;

import java.util.ArrayList;

public class CourseData {
    private ArrayList<Course> courses;

    public CourseData() {
        courses=new ArrayList<Course>();
        courses.add(new Course("COMP438","Mobile App Development","Comp333",46,45));
        courses.add(new Course("COMP338","Artificial Intelligence","COMP233",40,45));
        courses.add(new Course("COMP432","Computer Security","COMP311",43,45));
    }

    public CourseData(ArrayList<Course> courses) {
        this.courses=courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<String> getCoursesNames(){
        ArrayList<String> coursesNames=new ArrayList<String>();
        for(int i=0;i<courses.size();++i){
            coursesNames.add(courses.get(i).getCourseName());
        }
        return coursesNames;
    }
}
