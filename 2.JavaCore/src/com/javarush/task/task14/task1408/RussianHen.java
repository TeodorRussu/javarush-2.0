package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    public int N;
    public RussianHen(){
        this.N = 15;
    }

    public int getCountOfEggsPerMonth()
    {
        return this.N;
    }
    public String getDescription(){
        return super.getDescription()+ " Моя страна - "+Country.RUSSIA+". Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}