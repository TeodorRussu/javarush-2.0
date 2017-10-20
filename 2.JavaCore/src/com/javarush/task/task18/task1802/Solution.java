package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        int min = Integer.MAX_VALUE;
        while (in.available() > 0) {
            int readed = in.read();
            if (readed < min)
                min = readed;
        }
        in.close();
        System.out.println(min);
    }
}