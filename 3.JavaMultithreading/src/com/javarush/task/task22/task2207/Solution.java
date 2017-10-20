package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот


Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder
3. Список result должен быть заполнен корректными парами согласно условию задачи.
4. В классе Solution должен содержаться вложенный класс Pair.
5. В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine(); /*"/home/rusiashka/Desktop/Untitled Document 2";*/
        ArrayList<StringBuilder> content = fillContent(filename);

      out:  for (int i =0; i<content.size()-1; i++){
            for (int j = i+1; j<content.size(); j++){
                if (content.get(i).toString().equals(content.get(j).reverse().toString())){
                    result.add(new Pair(content.get(i).toString(), content.get(j).reverse().toString()));
                    content.remove(j);
                    continue out;
                }

            }
        }

      System.out.println(result);
    }

    static ArrayList<StringBuilder> fillContent(String filename){
        StringBuilder content = new StringBuilder();
        ArrayList<StringBuilder> list = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(filename));
                 BufferedReader fileBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));) {
                String line;
                while ((line = fileBufferedReader.readLine()) != null) {
                    content.append(line+" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] words = content.toString().split("\\s+");
        for (String s: words)
            list.add(new StringBuilder(s));
        return list;
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
