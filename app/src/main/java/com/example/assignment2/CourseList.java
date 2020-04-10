package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;

import com.example.assignment2.model.Course;
import com.example.assignment2.model.CourseData;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseList extends AppCompatActivity implements Serializable {

    SharedPreferences sharedPreferences ;
    ListView listCourse;
    ArrayList<Course> courses;
    CourseData courseData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
    }
}
