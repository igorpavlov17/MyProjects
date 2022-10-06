package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        weight = 5;
        age = 5;
        color = "black";
        address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
        address = null;
    }

    public void initialize(String name, int age){
        this.name = name;
        weight = 5;
        this.age = age;
        color = "gray";
        address = null;
    }

    public void initialize(int weight, String color){
        name = null;
        this.weight = weight;
        age = 5;
        this.color = color;
        address = null;
    }

    public void initialize(int weight, String color, String address){
        name = null;
        this.weight = weight;
        age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
