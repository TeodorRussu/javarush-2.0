package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution [] massiv = new Solution[2];
        massiv[0] = new Solution();
        massiv[0].innerClasses[0] = massiv[0].new InnerClass();
        massiv[0].innerClasses[1] = massiv[0].new InnerClass();
        massiv[1] = new Solution();
        massiv[1].innerClasses[0] = massiv[1].new InnerClass();
        massiv[1].innerClasses[1] = massiv[1].new InnerClass();
        return massiv;
    }

    public static void main(String[] args) {

    }
}
