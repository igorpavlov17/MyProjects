package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int a;
        double b = 0;
        int i = 0;
        while (true) {
            a = Integer.parseInt(s = reader.readLine());
            if (a != -1) {
                b += a;
                i++;
            }
            else break;
        }
        System.out.println(b / i);
    }
}

