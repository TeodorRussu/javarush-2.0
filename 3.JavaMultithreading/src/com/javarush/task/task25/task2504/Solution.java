package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
import static  java.lang.Thread.State.*;
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод

        for (Thread t : threads){
           Thread.State state =  t.getState();

           switch (state){
               case NEW:
                   t.start();
                   break;
               case WAITING:
                   t.interrupt();
                   break;
               case BLOCKED:
                   t.interrupt();
                   break;
               case TIMED_WAITING:
                   t.interrupt();
                   break;
               case RUNNABLE:
                   t.isInterrupted();
                   break;
               case TERMINATED:
                   System.out.println(t.getPriority());
                   break;

           }
        }
    }

    public static void main(String[] args) {
    }
}
