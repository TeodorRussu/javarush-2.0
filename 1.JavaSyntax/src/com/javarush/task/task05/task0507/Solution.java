package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int sum = 0;
        int i = 0;

        while(true){
            String read = reader.readLine();
            try{
                number = Integer.parseInt(read);
                if (number==-1)
                    break;
                sum += number;
                i++;
            }catch (NumberFormatException e){
                System.out.println("wrong input");
                continue;
            }
        }

        System.out.println((double)sum/i);
    }
}

