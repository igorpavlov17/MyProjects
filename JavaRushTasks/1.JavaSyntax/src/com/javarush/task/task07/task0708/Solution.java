package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int max = 1;
        for(int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
    }
}
