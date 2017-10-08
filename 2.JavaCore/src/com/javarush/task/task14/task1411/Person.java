package com.javarush.task.task14.task1411;

public interface Person
{
    public static class User implements Person
    {
        void live()
        {
            System.out.println("Usually I just live");
        }
    }

    public static class Loser implements Person
    {
        void doNothing()
        {
            System.out.println("Usually I do nothing");
        }
    }

    public static class Coder implements Person
    {
        void coding()
        {
            System.out.println("Usually I create code");
        }
    }

    public static class Proger implements Person
    {
        void enjoy()
        {
            System.out.println("Wonderful life!");
        }
    }

}