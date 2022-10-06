package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(horses);
        Horse horse1 = new Horse("Horse1", 3.0, 0.0);
        Horse horse2 = new Horse("Horse2", 3.0, 0.0);
        Horse horse3 = new Horse("Horse3", 3.0, 0.0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(400);
        }
    }

    public void move(){
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print(){
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).get();
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
