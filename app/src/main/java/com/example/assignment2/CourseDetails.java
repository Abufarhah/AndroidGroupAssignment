package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.assignment2.model.Course;
import com.example.assignment2.model.Student;

public class CourseDetails extends AppCompatActivity {
    private TextView courseCode;
    private TextView courseName;
    private TextView prerequisite;
    private TextView studentsCapacity;
    private TextView enrolledStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        courseCode=findViewById(R.id.courseCode);
        courseName=findViewById(R.id.courseName);
        prerequisite=findViewById(R.id.prerequisite);
        studentsCapacity=findViewById(R.id.studentsCapacity);
        enrolledStudents=findViewById(R.id.enrolledStudents);

        Intent intent =getIntent() ;
        Course course = (Course)intent.getSerializableExtra("Course");
        courseCode.setText(course.getCourseCode());
        courseName.setText(course.getCourseName());
        prerequisite.setText(course.getPrerequisite());
        studentsCapacity.setText(course.getMaxNum()+"");
        enrolledStudents.setText(course.getNumOfEnrolledStudents()+"");
    }
}
