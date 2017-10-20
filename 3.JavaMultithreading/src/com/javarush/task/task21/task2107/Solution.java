package com.javarush.task.task21.task2107;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
Данные в карте users также должны быть клонированы.
Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.


Требования:
1. Класс Solution должен поддерживать интерфейс Cloneable.
2. Класс User должен поддерживать интерфейс Cloneable.
3. В классе User должен быть корректно реализован метод clone.
4. В классе Solution должен быть корректно реализован метод clone.

*/
public class Solution implements Cloneable{

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution clone = new Solution();
        clone.users = new HashMap<>(0);
        for(Map.Entry<String, User> me: users.entrySet()){
            clone.users.put(me.getKey(), me.getValue());
        }
        return clone;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);
            System.out.println(clone.users.equals(solution.users));

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;

        @Override
        protected User clone() throws CloneNotSupportedException {
            return new User(this.age, this.name);
        }

        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
