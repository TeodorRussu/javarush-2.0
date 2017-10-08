package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{

    public int N;
    public BelarusianHen(){
        this.N = 20;
    }

    public int getCountOfEggsPerMonth()
    {
        return this.N;
    }

    public String getDescription(){
        return super.getDescription()+ " Моя страна - "+Country.BELARUS+". Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}