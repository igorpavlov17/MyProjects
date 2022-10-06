package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man igor = new Man("Игорь", 19, "Рыбинск");
        Man egor = new Man("Егор", 22, "Углич");
        Woman nastya = new Woman("Настя", 20, "Москва");
        Woman katya = new Woman("Катя", 18, "Тула");
        System.out.println(igor.name + " " + igor.age + " " + igor.address);
        System.out.println(egor.name + " " + egor.age + " " + egor.address);
        System.out.println(nastya.name + " " + nastya.age + " " + nastya.address);
        System.out.println(katya.name + " " + katya.age + " " + katya.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
