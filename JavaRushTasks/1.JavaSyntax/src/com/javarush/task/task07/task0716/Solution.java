package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).contains("л") && !(strings.get(i).contains("р"))) {
                strings.add(i, strings.get(i));
                i++;
            }
            if (strings.get(i).contains("р") && !(strings.get(i).contains("л"))) {
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }
}