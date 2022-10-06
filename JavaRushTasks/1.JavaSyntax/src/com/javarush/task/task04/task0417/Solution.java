package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if ((a == b) && (a == c))
            System.out.print(a + " " + b + " " + c);
        else
            if (a == b)
                System.out.print(a + " " + b);
            else
                if (a == c)
                    System.out.print(a + " " + c);
                else
                    if (b == c)
                        System.out.print(b + " " + c);
    }
}