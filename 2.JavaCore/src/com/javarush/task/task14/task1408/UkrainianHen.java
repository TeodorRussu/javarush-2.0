package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    public int N;
    public UkrainianHen(){
        this.N = 25;
    }

    public int getCountOfEggsPerMonth()
    {
        return this.N;
    }

    public String getDescription(){
        return super.getDescription()+ " Моя страна - "+Country.UKRAINE+". Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}