package com.javarush.task.task15.task1529;

public class Plane implements Flyable {

    private int passenger;
    @Override
    public void fly() {

    }

    public Plane(int passenger) {
        this.passenger = passenger;
    }
}