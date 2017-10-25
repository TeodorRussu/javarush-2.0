package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University{
    private int age;
    private String name;
    private List<Student> students = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double grade) {
        for (Student s: students){
            if (s.getAverageGrade()==grade)
                return s;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double maxGrade = -1;
        Student maxGradedStudent = null;
        for (Student s: students){
            if (s.getAverageGrade()>maxGrade)
            {
                maxGradedStudent = s;
                maxGrade = s.getAverageGrade();
            }
        }
        return maxGradedStudent;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        double minGrade = Double.MAX_VALUE;
        Student minGradedStudent = null;
        for (Student s: students){
            if (s.getAverageGrade()<minGrade)
            {
                minGradedStudent = s;
                minGrade = s.getAverageGrade();
            }
        }
        return minGradedStudent;

        //TODO:
    }

    public void expel(Student student) {
        students.remove(student);
        //TODO:
    }
}