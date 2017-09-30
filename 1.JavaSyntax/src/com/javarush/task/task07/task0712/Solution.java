package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        int min;
        int minpos=0;
        int max;
        int maxpos=0;

        int i = 1;
        words.add(reader.readLine());
        min = max = words.get(0).length();
        while (i<10){
            words.add(reader.readLine());
            int len = words.get(i).length();

            if(len<min){
                min = len;
                minpos = i;
            }else if(len>max){
                max = len;
                maxpos = i;
            }
            i++;
        }

        if(maxpos<minpos)
            System.out.println(words.get(maxpos));
        else
            System.out.println(words.get(minpos));
    }
}
