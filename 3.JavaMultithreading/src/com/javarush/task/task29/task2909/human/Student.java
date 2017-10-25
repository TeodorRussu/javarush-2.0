package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {

    private double averageGrade;

    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    @Override
    public String getPosition() {
        return "Студент";
    }

    public Student(String name, int age, double averageGrade) {

        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    public void incAverageGrade(double delta) {

        double tempGrade = getAverageGrade();
        setAverageGrade(tempGrade+= delta);
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setBeginningOfSession(Date date) {

        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) { 
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }


}

/*Необходимо изменить метод incAverageGrade() класса Student с использованием сеттера и геттера для доступа к averageGrade.*/