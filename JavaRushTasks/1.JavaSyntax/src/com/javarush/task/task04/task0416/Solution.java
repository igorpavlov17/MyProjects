package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);
            if ((((a % 10) >= 3.0) && ((a % 10) < 4.0)) || (((a % 10) >= 8.0) && ((a % 10) < 9.0)))
                System.out.print("жёлтый");
            else
                if ((((a % 10) >= 4.0) && ((a % 10) < 5.0)) || (((a % 10) >= 9.0) && ((a % 10) < 10.0)))
                    System.out.print("красный");
                else
                    System.out.print("зелёный");
    }
}