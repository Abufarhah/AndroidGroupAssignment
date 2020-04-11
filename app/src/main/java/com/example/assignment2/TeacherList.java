package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.assignment2.model.Student;
import com.example.assignment2.model.StudentData;
import com.example.assignment2.model.Teacher;
import com.example.assignment2.model.TeacherData;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class TeacherList extends AppCompatActivity {


    StudentData studentsData;
    ArrayList<Student> students ;

    ArrayList<Teacher> teacher;
    ArrayList<String> teacherName;
    ListView teacherList;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_list);

        sharedPreferences = getSharedPreferences("assignment2", MODE_PRIVATE);//m


        if (sharedPreferences.contains("teahcer")) {
            loadData();
        } else {
            getInitialData();
        }

        configureListView();
    }

    @Override
    protected void onStop() {
        super.onStop();
        saveData();
    }


    private void configureListView() {

        teacherName = new ArrayList<String>();
        for (int i = 0; i < teacher.size(); i++)
            teacherName.add(teacher.get(i).getFirstName() + " " + teacher.get(i).getLastName());

        teacherList = (ListView) findViewById(R.id.listTeahcer);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, teacherName);
        teacherList.setAdapter(arrayAdapter);

        teacherList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TeacherList.this,TeacherDetails.class);

                intent.putExtra("teahcer",teacher.get(position));
                startActivity(intent);
            }
        });
    }


    private void saveData() {
        TeacherData t = new TeacherData();
        teacher = t.getTeahcer();

        sharedPreferences = getSharedPreferences("assignment2", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(teacher);
        editor.putString("teacher", data);
        editor.apply();

    }

    private void getInitialData() {
        TeacherData t = new TeacherData();
        teacher = t.getTeahcer();
        sharedPreferences = getSharedPreferences("assignment2", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String data = gson.toJson(teacher);
        editor.putString("teacher", data);
        editor.apply();
    }

    private void loadData() {
        sharedPreferences = getSharedPreferences("assignment2", MODE_PRIVATE);
        Gson gson = new Gson();
        String data = sharedPreferences.getString("teacher", null);
        Type type = new TypeToken<ArrayList<Teacher>>() {
        }.getType();
        teacher = gson.fromJson(data, type);
    }


    public void navTest(View view) {
        Intent teacher = new Intent(TeacherList.this, Test.class);
        startActivity(teacher);
    }
}
