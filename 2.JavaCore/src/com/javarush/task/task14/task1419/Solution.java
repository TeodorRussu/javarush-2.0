package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add(new IOException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ClassCastException());
        exceptions.add(new CloneNotSupportedException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new SQLException());
        exceptions.add(new ArrayIndexOutOfBoundsException());


    }
}
