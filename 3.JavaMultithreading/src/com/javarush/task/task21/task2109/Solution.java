package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
Разреши клонировать класс А
Запрети клонировать класс B
Разреши клонировать класс C
Не забудь о методах equals и hashCode!


Требования:
1. Класс A должен поддерживать интерфейс Cloneable.
2. Класс B должен быть потомком класса A.
3. При объявлении класса B не должно быть явно указано implements Cloneable.
4. Метод clone в классе B должен быть переопределен таким образом, чтобы при попытке клонирования объекта класса B
возникало исключение CloneNotSupportedException.
5. Класс C должен быть потомком класса B.
6. Клонирование объектов класса C должно завершаться успешно.*/
public class Solution {
    public static class A implements Cloneable {
        private int i;

        @Override
        protected A clone() throws CloneNotSupportedException {
            return (A)super.clone();
        }

        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        @Override
        protected B clone() throws CloneNotSupportedException {
            if (true)
            throw  new CloneNotSupportedException();
            return (B) super.clone();
        }

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B  implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected C clone() throws CloneNotSupportedException {

            return new C(this.getI(), this.getJ(), this.getName());
        }

    }



    public static void main(String[] args) throws CloneNotSupportedException {
//A a = new A(1,2);
////B b = new B(1,2,"B name");
//C c = new C(3, 3, "C name");
//
//
//A aa = a.clone();
////B bb = b.clone();
//C cc = c.clone();
    }
}
