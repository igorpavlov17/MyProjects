package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        int max = Math.max(Math.max(a, b),c);
        int min = Math.min(Math.min(a, b),c);
        int middle = (a+b+c-max-min);
        if (a==b && a==c)
            System.out.print(s);
        else
            System.out.print(middle);
    }
}
