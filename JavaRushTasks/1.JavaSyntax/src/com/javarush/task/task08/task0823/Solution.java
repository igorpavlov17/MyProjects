package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String z = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) != ' ')
                sb.append(z.charAt(i));
            else
                if (i == 0 && s.charAt(i) == ' ')
                    sb.append(s.charAt(i));
                else
                    sb.append((s.charAt(i-1) == ' ') ? z.charAt(i) : s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
