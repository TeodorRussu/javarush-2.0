package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
Реализовать логику метода isAllModifiersContainSpecificModifier,
который проверяет, содержит ли переданный параметр allModifiers значение конкретного модификатора specificModifier.

P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.


Требования:
1. Метод isAllModifiersContainSpecificModifier должен быть статическим.
2. Метод isAllModifiersContainSpecificModifier должен возвращать значение типа boolean.
3. Метод isAllModifiersContainSpecificModifier должен принимать два параметра типа int.
4. Метод isAllModifiersContainSpecificModifier должен возвращать корректное значение в
соответствии с условием задачи(true, если заданный модификатор присутствует в allModifiers, иначе false).*/
public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true

        //System.out.println(Modifier.isStatic(Modifier.STATIC));


    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
        if (Modifier.isStatic(specificModifier) && Modifier.isStatic(allModifiers))
            return true;
        else if (Modifier.isAbstract(specificModifier) && Modifier.isAbstract(allModifiers))
            return true;
        else if (Modifier.isFinal(specificModifier) && Modifier.isFinal(allModifiers))
            return true;
        else if (Modifier.isInterface(specificModifier) && Modifier.isInterface(allModifiers))
            return true;
        else if (Modifier.isStatic(specificModifier) && Modifier.isStatic(allModifiers))
            return true;
        else if (Modifier.isPrivate(specificModifier) && Modifier.isPrivate(allModifiers))
            return true;
        else if (Modifier.isProtected(specificModifier) && Modifier.isProtected(allModifiers))
            return true;
        else if (Modifier.isPublic(specificModifier) && Modifier.isPublic(allModifiers))
            return true;
        else if (Modifier.isSynchronized(specificModifier) && Modifier.isSynchronized(allModifiers))
            return true;

        return false;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
