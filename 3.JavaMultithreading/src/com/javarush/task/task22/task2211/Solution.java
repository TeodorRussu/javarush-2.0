package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.


Требования:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).*/
public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(args[0]); //"/home/rusiashka/Desktop/1" "/home/rusiashka/Desktop/2"
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        String read = new String(bytes, "Windows-1251");
        bytes = read.getBytes("UTF-8");
        OutputStream os = new FileOutputStream(args[1]);
        os.write(bytes);
        is.close();
        os.close();
    }
}
