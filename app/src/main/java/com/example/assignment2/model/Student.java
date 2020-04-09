package com.example.assignment2.model;

public class Student {
    String idNumber ;
    String firstName;
    String lastName ;
    String email ;
    Double GPA = 0.0 ;
    String gender ;

    public Student(String idNumber, String firstName, String lastName, String email, String gender) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Double getGPA() {
        return GPA;
    }

    public String getGender() {
        return gender;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
