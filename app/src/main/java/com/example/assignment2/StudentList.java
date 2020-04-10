package com.example.assignment2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment2.model.Student;
import com.example.assignment2.model.StudentData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class StudentList extends AppCompatActivity implements Serializable {


    StudentData studentsData ;
    ArrayList<Student> students ;
    ArrayList<String> studentsNames;
    ListView StudentList ;
    SharedPreferences sharedPreferences ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);

        if(sharedPreferences.contains("students")) {
            loadData();
        } else {
            getInitialData();
        }

        configureListView();
    }

    @Override
    protected void onStop(){
        super.onStop();
        saveData();
    }


    private void configureListView() {

        studentsNames = new ArrayList<String>();
        for(int i =0 ; i<students.size();i++)
            studentsNames.add(students.get(i).getFirstName() + " " + students.get(i).getLastName());

        StudentList = (ListView)findViewById(R.id.listStudent);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, studentsNames);
        StudentList.setAdapter(arrayAdapter);

        StudentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(StudentList.this,StudentDetails.class);

                intent.putExtra("Student",students.get(position));
                startActivity(intent);
            }
        });
    }



    private void saveData(){
        StudentData  s = new StudentData() ;
        students = s.getStudent();

        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(students) ;
        editor.putString("students" ,data);
        editor.apply();

    }

    private void getInitialData () {
        StudentData  s = new StudentData() ;
        students = s.getStudent();
        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(students) ;
        editor.putString("students" ,data);
        editor.apply();
    }

    private void loadData(){
        sharedPreferences = getSharedPreferences("assignment2",MODE_PRIVATE);
        Gson gson = new Gson();
        String data = sharedPreferences.getString("students",null);
        Type type = new TypeToken<ArrayList<Student>>(){}.getType();
        students = gson.fromJson(data,type);
    }


    public void navTest(View view) {
        Intent student = new Intent(StudentList.this,Test.class);
        startActivity(student);
    }



}
