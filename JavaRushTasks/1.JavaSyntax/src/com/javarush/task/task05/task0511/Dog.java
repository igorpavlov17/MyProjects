package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name;
    int height;
    String color;

    public void initialize(String name)
    {
        this.name = name;
        height = 50;
        color = "brown";
    }

    public void initialize(String name, int height)
    {
        this.name = name;
        this.height = height;
        color = "black";
    }

    public void initialize(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
