package com.example.assignment2.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    String idNumber ;
    String firstName;
    String lastName ;
    String email ;
    String Education;
    String gender ;
    int prfileImage;

    public Teacher(String idNumber, String firstName, String lastName, String email, String gender,int imageProfile, String Education) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.Education=Education;
        this.prfileImage = imageProfile;
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

    public String getEducation() {
        return Education;

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

    public void setEducation(Double GPA) {
        this.Education = Education;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrfileImage() {
        return prfileImage;
    }

    public void setPrfileImage(int prfileImage) {
        this.prfileImage = prfileImage;

    }


    @Override
    public String toString() {
        return "Teacher{" +
                "idNumber='" + idNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + Education +
                ", gender='" + gender + '\'' +
                ", prfileImage=" + prfileImage +
                '}';
    }
}
