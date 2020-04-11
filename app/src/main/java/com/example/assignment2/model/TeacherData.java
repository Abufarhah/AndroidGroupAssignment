package com.example.assignment2.model;

import com.example.assignment2.R;

import java.util.ArrayList;

public class TeacherData {
    ArrayList<Teacher> teahcer ;



    public TeacherData() {
        teahcer = new ArrayList<Teacher>();

        teahcer.add(new Teacher("123124","Samer","Zein","samerzain@gmail.com","male",   R.drawable.samer,"Doctara"));
        teahcer.add(new Teacher("124412","Mustafa","jara","mustafa@gmail.com","male", R.drawable.mustafa,"Doctara"));
    }

    public ArrayList<Teacher> getTeahcer (){
        return teahcer;
    }
}
