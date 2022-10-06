package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {
        static Hen getHen(String country) {
            switch (country){
                case Country.RUSSIA : return new RussianHen();
                case Country.UKRAINE : return new UkrainianHen();
                case Country.MOLDOVA : return new MoldovanHen();
                case Country.BELARUS : return new BelarusianHen();
                default : return new BelarusianHen();
            }
        }
    }
}
