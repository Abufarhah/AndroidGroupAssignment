package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void navStudent(View view) {
        Intent student = new Intent(MainActivity.this,StudentList.class);
        startActivity(student);
    }

    public void navTeacher(View view) {
        Intent teacher = new Intent(MainActivity.this,TeacherList.class);
        startActivity(teacher);
    }

    public void navCourse(View view) {
        Intent course = new Intent(MainActivity.this,CourseList.class);
        startActivity(course);
    }


}
