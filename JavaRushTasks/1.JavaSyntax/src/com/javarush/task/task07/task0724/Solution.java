package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandma1 = new Human("Бабушка 1", false, 60);
        Human grandma2 = new Human("Бабушка 2", false, 67);
        Human grandpa1 = new Human("Дедушка 1", true, 63);
        Human grandpa2 = new Human("Дедушка 2", true, 70);
        Human father = new Human("Батя", true, 38, grandpa1, grandma1);
        Human mother = new Human("Маман", false, 37, grandpa2, grandma2);
        Human son = new Human("Сын", true, 10, father, mother);
        Human daughter = new Human("Дочь", false, 8, father, mother);
        Human alien = new Human("Инопланетянин", true, 150, father, mother);
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
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}