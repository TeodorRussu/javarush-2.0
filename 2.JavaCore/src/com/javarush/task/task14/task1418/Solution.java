package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/*

7. Исправь 2 ошибки в методе processCastedObjects связанные с приведением типов
— для объекта типа Float нужно вывести «Is float value defined? » + !([Float_object].isNaN()).
— для объекта типа Double нужно вывести «Is double value infinite? » + [Double_object].isInfinite().


Требования:
1. В классе Solution должны быть реализованы статические методы initList(List list), printListValues(List list), processCastedObjects(List list).
2. Метод initList должен заполнять полученный список произвольными значениями.
3. Метод printListValues должен выводить содержимое полученного списка на экран.
4. Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.*/

public class Solution {

    static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) { //1, 2
            System.out.println(list.get(i));
        }
    }

    static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }


    public static void main(String[] args) {
//        List<Number> list = new LinkedList<Number>();
//        initList(list);
//        processCastedObjects(list);
//        printListValues(list);
    }
}
