package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.assignment2.model.Course;
import com.example.assignment2.model.CourseData;
import com.example.assignment2.model.Student;
import com.example.assignment2.model.StudentData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class CourseList extends AppCompatActivity implements Serializable {

    private SharedPreferences sharedPreferences;
    private ListView listCourse;
    private CourseData courseData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);

        if(sharedPreferences.contains("courses")) {
            courseData=new CourseData(loadData());
        } else {
            courseData=new CourseData();
        }

        configureListView();
    }

    @Override
    protected void onStop(){
        super.onStop();
        saveData();
    }

    private void configureListView() {

        listCourse=findViewById(R.id.listCourse);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, courseData.getCoursesNames());
        listCourse.setAdapter(arrayAdapter);

        listCourse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CourseList.this,CourseDetails.class);
                intent.putExtra("Course",courseData.getCourses().get(position));
                startActivity(intent);
            }
        });
    }
    private void saveData(){
        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(courseData.getCourses()) ;
        editor.putString("courses" ,data);
        editor.apply();
    }

    private ArrayList<Course> loadData(){
        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);
        Gson gson = new Gson();
        String data = sharedPreferences.getString("courses",null);
        Type type = new TypeToken<ArrayList<Course>>(){}.getType();
        return gson.fromJson(data,type);
    }



}
