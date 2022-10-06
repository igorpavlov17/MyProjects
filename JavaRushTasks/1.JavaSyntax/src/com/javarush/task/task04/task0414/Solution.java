package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if ((a % 400) == 0)
            System.out.print("количество дней в году: 366");
        else
            if (((a % 4) == 0) && ((a % 100) != 0))
                System.out.print("количество дней в году: 366");
            else
                System.out.print("количество дней в году: 365");
    }
}