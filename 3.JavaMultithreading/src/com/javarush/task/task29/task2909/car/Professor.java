package com.javarush.task.task29.task2909.car;

import com.javarush.task.task29.task2909.human.Teacher;

public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }

}