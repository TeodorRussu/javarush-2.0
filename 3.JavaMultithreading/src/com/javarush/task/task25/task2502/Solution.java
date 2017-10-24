package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
Выкинь исключение в случае некорректных данных.

Подсказка: если что-то не то с колесами, то это не машина!
Сигнатуры не менять.


Требования:
1. Enum Wheel в классе Solution менять нельзя.
2. Сигнатуры в классе Car менять нельзя.
3. Во время создания машины нужно вызвать метод loadWheelNamesFromDB.
4. В случае возврата неправильных данных о колесах, нужно кинуть исключение.
5. Инициализируй поле wheels полученными данными.*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
            if (loadWheelNamesFromDB().length != 4)
                throw new Exception();
            wheels = new ArrayList<>();
            for (String w : loadWheelNamesFromDB()) {
                if (w.equals(Wheel.FRONT_LEFT.toString()) || w.equals(Wheel.FRONT_RIGHT.toString())
                        || w.equals(Wheel.BACK_LEFT.toString()) || w.equals(Wheel.BACK_RIGHT.toString()))
                    wheels.add(Wheel.valueOf(w));
                else throw new Exception();

            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
//        try {
//            Car car = new Car();
//            System.out.println(car.wheels);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
