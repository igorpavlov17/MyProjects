package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg igor = new Zerg();
        igor.name = "Igor";
        Zerg igor2 = new Zerg();
        igor2.name = "Igor2";
        Zerg igor3 = new Zerg();
        igor3.name = "Igor3";
        Zerg igor4 = new Zerg();
        igor4.name = "Igor4";
        Zerg igor5 = new Zerg();
        igor5.name = "Igor5";
        Protoss kek = new Protoss();
        kek.name = "Kek";
        Protoss kek2 = new Protoss();
        kek2.name = "Kek2";
        Protoss kek3 = new Protoss();
        kek3.name = "Kek3";
        Terran lol = new Terran();
        lol.name = "Lol";
        Terran lol2 = new Terran();
        lol2.name = "Lol2";
        Terran lol3 = new Terran();
        lol3.name = "Lol3";
        Terran lol4 = new Terran();
        lol4.name = "Lol4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
