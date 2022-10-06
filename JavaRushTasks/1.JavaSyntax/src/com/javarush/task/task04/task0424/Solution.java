package com.javarush.task.task04.task0424;

/* 
Три числа
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
        if (((a == b) || (a == c) || (b == c)) && ((a != b) || (b != a) || (c != a)))
            if ((a != b) && (b == c))
                System.out.print(1);
            else
                if ((b != a) && (a == c))
                    System.out.print(2);
                else
                    System.out.print(3);
    }
}
