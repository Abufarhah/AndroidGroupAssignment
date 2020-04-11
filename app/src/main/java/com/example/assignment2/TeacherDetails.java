package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment2.model.Student;
import com.example.assignment2.model.Teacher;

public class TeacherDetails extends AppCompatActivity {

    TextView id ;
    TextView fName;
    TextView lName ;
    TextView gender ;
    TextView email ;
    TextView tEducation ;
    ImageView profileImage;
    Teacher teacher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_details);

        id = (TextView)findViewById(R.id.tId);
        fName = (TextView)findViewById(R.id.tFName);
        lName = (TextView)findViewById(R.id.tLName);
        gender = (TextView)findViewById(R.id.tGender);
        email = (TextView)findViewById(R.id.tEmail);
        tEducation = (TextView)findViewById(R.id.tEducation);
        profileImage = (ImageView) findViewById(R.id.tImage);

        Intent intent =getIntent() ;
        Teacher teacher = (Teacher)intent.getSerializableExtra("teahcer");

        id.setText(id.getText() + teacher.getIdNumber());
        fName.setText(fName.getText() + teacher.getFirstName());
        lName.setText(lName.getText() + teacher.getLastName());
        gender.setText(gender.getText() + teacher.getGender());

        email.setText(email.getText() + teacher.getEmail());
        tEducation.setText(tEducation.getText() + String.valueOf(teacher.getEducation()));
        profileImage.setImageResource(teacher.getPrfileImage());//mohammad


    }
}
