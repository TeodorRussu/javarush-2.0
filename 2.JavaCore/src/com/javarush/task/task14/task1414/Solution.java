package com.javarush.task.task14.task1414;

/* 
MovieFactory

Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа «cartoon«.
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа «thriller«.
7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: «cartoon«, «thriller«, «soapOpera«.
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().


Требования:
1. Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2. Метод MovieFactory.getMovie должен возвращать объект типа Cartoon в случае передачи ему строки "cartoon" в качестве параметра.
3. Метод MovieFactory.getMovie должен возвращать объект типа Thriller в случае передачи ему строки "thriller" в качестве параметра.
4. Метод main должен считывать строки с клавиатуры.
5. Метод main должен прекращать считывать строки с клавиатуры в случае, если была введена некорректная строка(не "cartoon", не "thriller" или не "soapOpera").
6. Для каждой введенной строки необходимо вызвать метод MovieFactory.getMovie.
7. Для всех введенных корректных строк необходимо вывести на экран простые имена(movie.getClass().getSimpleName()) типов объектов возвращаемых методом MovieFactory.getMovie.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    public static class Cartoon extends Movie {
    }

    public static class Thriller extends Movie {
    }

    //Напишите тут ваши классы, пункт 3


    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        boolean x = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("cartoon")) {
                System.out.println((MovieFactory.getMovie(s)).getClass().getSimpleName());
            } else if (s.equals("thriller")) {
                System.out.println((MovieFactory.getMovie(s)).getClass().getSimpleName());
            } else if (s.equals("soapOpera")) {
                System.out.println((MovieFactory.getMovie(s)).getClass().getSimpleName());
            } else{
                MovieFactory.getMovie(s);
                break;
            }
        }
    }


    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //Напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

}