package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    int localInt = 1;

    class Inner {
        void localMethod() {
            class Local {
                int localInt = 2;
            }

            Local local =  new Local();
            int r = localInt;
            int rr = local.localInt;
            System.out.println(local.localInt);
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        Inner inner = sol.new Inner();
        inner.localMethod();
    }
}
