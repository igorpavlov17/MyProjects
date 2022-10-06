package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        return ((i / 100.0) * 110.0);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
