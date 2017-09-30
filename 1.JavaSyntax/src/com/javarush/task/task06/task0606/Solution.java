package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: «Even: а Odd: b», где а — количество четных цифр, b — количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1


*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int num;

        while(true){
            try{
                String number = reader.readLine();
                num = new Integer(number);
            }catch (NumberFormatException e){
                System.out.println("invalid number");
                continue;
            }
            break;
        }
        while(num!=0){
            int temp = num%10;
            if (temp%2==0)
                even++;
            else
                odd++;
            num = num/10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
