package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10

Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true){
            String s = in.readLine();
            if(s==null)
                break;
            int num = new Integer(s);
            if (num % 2 == 0)
                list.add(num);
        }
        Collections.sort(list);
        for (int a : list)
            System.out.println(a);
        reader.close();
        in.close();
    }
}

//  /home/rusiashka/Desktop/Untitled Document
