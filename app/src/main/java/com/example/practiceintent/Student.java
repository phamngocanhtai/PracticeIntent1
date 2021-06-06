package com.example.practiceintent;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    int year;
    double gpa;
    boolean gender;

    public Student(String name, int year, double gpa, boolean gender) {
        this.name = name;
        this.year = year;
        this.gpa = gpa;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                ", gender=" + gender +
                '}';
    }
}
