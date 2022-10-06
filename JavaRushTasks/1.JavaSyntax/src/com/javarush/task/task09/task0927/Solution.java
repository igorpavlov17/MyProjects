package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Кот1", new Cat("Кот1"));
        map.put("Кот2", new Cat("Кот2"));
        map.put("Кот3", new Cat("Кот3"));
        map.put("Кот4", new Cat("Кот4"));
        map.put("Кот5", new Cat("Кот5"));
        map.put("Кот6", new Cat("Кот6"));
        map.put("Кот7", new Cat("Кот7"));
        map.put("Кот8", new Cat("Кот8"));
        map.put("Кот9", new Cat("Кот9"));
        map.put("Кот10", new Cat("Кот10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for(Map.Entry<String, Cat> map1 : map.entrySet()){
            set.add(map1.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
