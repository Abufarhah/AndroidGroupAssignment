package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment2.model.Student;

import org.w3c.dom.Text;

public class StudentDetails extends AppCompatActivity {

    TextView id ;
    TextView fName;
    TextView lName ;
    TextView gender ;
    TextView email ;
    TextView gpa ;
    ImageView profileImage;
    Student student ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        id = (TextView)findViewById(R.id.sid);
        fName = (TextView)findViewById(R.id.sfname);
        lName = (TextView)findViewById(R.id.slname);
        gender = (TextView)findViewById(R.id.sgender);
        email = (TextView)findViewById(R.id.semail);
        gpa = (TextView)findViewById(R.id.sgpa);
        profileImage = (ImageView) findViewById(R.id.simage);

        Intent intent =getIntent() ;
        Student student = (Student)intent.getSerializableExtra("Student");
        Log.d("test",student.getPrfileImage()+"");
        id.setText(id.getText() + student.getIdNumber());
        fName.setText(fName.getText() + student.getFirstName());
        lName.setText(lName.getText() + student.getLastName());
        gender.setText(gender.getText() + student.getGender());
        email.setText(email.getText() + student.getEmail());
        gpa.setText(gpa.getText() + String.valueOf(student.getGPA()));
        profileImage.setImageResource(student.getPrfileImage());

    }



}
