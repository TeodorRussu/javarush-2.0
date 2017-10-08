package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    public int N;
    public MoldovanHen(){
        this.N = 30;
    }

    public int getCountOfEggsPerMonth()
    {
        return this.N;
    }
    public String getDescription(){
        return super.getDescription()+ " Моя страна - "+Country.MOLDOVA+". Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}