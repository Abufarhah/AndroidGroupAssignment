package com.example.assignment2.model;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment2.R;

import java.util.ArrayList;

public class StudentData   {
    ArrayList<Student> students ;



    public StudentData() {
        students = new ArrayList<Student>();

        students.add(new Student("1160695","Amjad","Moqade","amjadmoqade98@gmail.com","male",   R.drawable.id1160695));
        students.add(new Student("1162323","Layth","Abofarha","lathabofarha@gmail.com","male",R.drawable.id1162323));
        students.add(new Student("1161042","Mohammad","abdALhamid","mohammad1998@gmail.com","male",R.drawable.id1161042));
        }

        public ArrayList<Student> getStudent (){
        return students ;
        }
}