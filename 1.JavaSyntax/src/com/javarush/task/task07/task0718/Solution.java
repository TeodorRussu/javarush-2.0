package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int prevLen = 0;
        boolean ordered = true;
        int position = 0;

        for (int i = 0; i < 10; i++) {
            String word = reader.readLine();
            words.add(word);

            if(ordered){
                int currentLen = word.length();
                if(currentLen<prevLen){
                    ordered = false;
                    position = i;

                }
                else
                    prevLen = currentLen;
            }

        }
        if (!ordered)
            System.out.println(position);

    }
}

