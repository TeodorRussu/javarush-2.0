package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }


    public void run() {
        int i = 0;
        while (i < 100) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public void move() {
        for (Horse h : getHorses())
            h.move();
    }

    public void print() {
        for (Horse h : getHorses()) {
            h.print();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

    }

    public Horse getWinner()
    {
        Horse winner = horses.get(0);
        double dis = horses.get(0).getDistance();
        for (Horse horse : horses)
            if (horse.getDistance() > dis)
            {
                dis = horse.getDistance();
                winner = horse;
            }
        return winner;
    }

    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("h1", 3, 0));
        game.getHorses().add(new Horse("h2", 3, 0));
        game.getHorses().add(new Horse("h3", 3, 0));
        game.run();
        game.printWinner();
    }
}
