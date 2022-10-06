package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        if (a.equals(b))
            System.out.print("Имена идентичны");
        else
            if (a.length() == b.length())
                System.out.print("Длины имен равны");
    }
}
