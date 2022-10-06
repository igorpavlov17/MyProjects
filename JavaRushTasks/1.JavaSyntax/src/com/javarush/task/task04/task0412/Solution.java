package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int a = Integer.parseInt(string);
        if (a > 0)
            System.out.print(a*2);
        else
            if (a < 0)
                System.out.print(a+1);
            else
                System.out.print(a);
    }

}