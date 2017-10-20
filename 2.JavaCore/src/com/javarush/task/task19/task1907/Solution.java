package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        conReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        int count = 0;
        String word = "world";
        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.toString().split("\\W");
            for (String s : words)
                if (s.equals(word))
                    count++;
        }
        reader.close();

        System.out.println(count);
    }
}