package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int a;
        int sum = 0;
        while (true) {
            s = reader.readLine();
            a = Integer.parseInt(s);
            sum += a;
            if (a == -1) break;
        }
        System.out.print(sum);
    }
}
