package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human son = new Human("Сын", true, 10);
        Human daughter = new Human("Дочь", false, 8);
        Human alien = new Human("Инопланетянин", true, 150);
        Human father = new Human("Батя", true, 38, son, daughter, alien);
        Human mother = new Human("Маман", false, 37, son, daughter, alien);
        Human grandma1 = new Human("Бабушка 1", false, 60, father);
        Human grandma2 = new Human("Бабушка 2", false, 67, mother);
        Human grandpa1 = new Human("Дедушка 1", true, 63, father);
        Human grandpa2 = new Human("Дедушка 2", true, 70, mother);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(alien);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
        }

        public Human(String name, boolean sex, int age, Human children, Human children2, Human children3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
            this.children.add(children2);
            this.children.add(children3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
