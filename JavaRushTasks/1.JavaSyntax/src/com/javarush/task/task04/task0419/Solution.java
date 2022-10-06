package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        s = reader.readLine();
        int d = Integer.parseInt(s);
        if ((a >= b) && (a >= c) && (a >= d))
            System.out.print(a);
        else
            if ((b >= a) && (b >= c) && (b >= d))
                System.out.print(b);
            else
                if ((c >= a) && (c >= d) && (c >= d))
                    System.out.print(c);
                else
                    System.out.print(d);
    }
}
