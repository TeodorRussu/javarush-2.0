package com.javarush.task.task29.task2909.human;

public class Worker extends Human {

    private double salary;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void live() {
//        human.live();
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}