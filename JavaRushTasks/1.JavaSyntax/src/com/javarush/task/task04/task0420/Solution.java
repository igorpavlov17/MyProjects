package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import static java.lang.Math.*;
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
        int max =  max(Math.max(a,b),c);
        int min =  min(Math.min(a,b),c);
        int sum = (a+b+c)-min-max;
        System.out.println(max+" "+sum+" "+min);
    }
}