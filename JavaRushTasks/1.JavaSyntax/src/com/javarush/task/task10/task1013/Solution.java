package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String secondName;
        private int age;
        private int height;
        private int weight;
        private boolean sex;

        public Human(String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(String firstName, String secondName, int age){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String firstName, String secondName, int age, int height){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.height = height;
        }

        public Human(String firstName, String secondName, int age, int height, int weight){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String secondName, int age, int height, int weight, boolean sex){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String firstName, String secondName, int age, boolean sex){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String secondName, int age, int height, boolean sex){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(String firstName, int age, int height, int weight, boolean sex){
            this.firstName = firstName;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String firstName, String secondName, boolean sex){
            this.firstName = firstName;
            this.secondName = secondName;
            this.sex = sex;
        }

        public Human(String firstName, boolean sex){
            this.firstName = firstName;
            this.sex = sex;
        }
    }
}
