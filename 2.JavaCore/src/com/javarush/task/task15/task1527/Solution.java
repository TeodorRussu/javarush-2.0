package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String link = reader.readLine();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        String paramsTogether = returnParamsString(link);

        if (paramsTogether != "") {
           // System.out.println(paramsTogether);
            String[] params = paramsTogether.split("&");

            int i = 0;
            for (i = 0; i < params.length - 1; i++) {
                String s = params[i];
                if (s.contains("=")) {
                    String arg = s.substring(0, s.indexOf("="));
                    System.out.print(arg + " ");
                    String value = s.substring(s.indexOf("=") + 1);
                    if (arg.equals("obj")) {
                        try {
                            doubles.add(new Double(value));
                        } catch (NumberFormatException e) {
                            strings.add(value);
                        }
                    }
                }else{
                    System.out.print(s + " ");
                    if (s.equals("obj"))
                        strings.add("");
                }
            }
            String s = params[i];
            if (s.contains("=")) {
                String arg = s.substring(0, s.indexOf("="));
                System.out.println(arg);
                String value = s.substring(s.indexOf("=") + 1);
                if (arg.equals("obj")) {
                    try {
                        doubles.add(new Double(value));
                    } catch (NumberFormatException e) {
                        strings.add(value);
                    }
                }
            }else{
                System.out.print(s);
                if (s.equals("obj"))
                    strings.add("");
            }

        }
        if (!doubles.isEmpty())
            for (double d : doubles) {
                alert(d);
            }
        if (!strings.isEmpty())
            for (String s : strings)
                alert(s);
    }


    static String returnParamsString(String url) {
        String ret = "";
        if (url.contains("?"))
            return url.substring(url.indexOf('?') + 1);
        return "";
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
