package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        int digits = 3;
        for (int i = 0; i<digits; i++){
            sum += number % 10;
            number = number/10;
        }
        return sum;
    }
}