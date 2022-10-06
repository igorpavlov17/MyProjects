package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        s = reader.readLine();
        int b = Integer.parseInt(s);
        s = reader.readLine();
        int c = Integer.parseInt(s);
        int poz = 0;
        int neg = 0;
        if (a>0) poz++;
        else if (a!=0) neg++;
        if (b>0) poz++;
        else if (b!=0) neg++;
        if (c>0) poz++;
        else if (c!=0) neg++;
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.print("количество положительных чисел: " + poz);
    }
}
