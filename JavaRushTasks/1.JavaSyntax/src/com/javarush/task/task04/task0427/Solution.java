package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if ((a<1000)&&(a>0)) {
            if (((a % 2) == 0)) {
                if (s.length() == 1)
                    System.out.print("четное однозначное число");
                else
                    if (s.length() == 2)
                        System.out.print("четное двузначное число");
                    else
                        System.out.print("четное трехзначное число");
            }
            else
                if (s.length() == 1)
                    System.out.print("нечетное однозначное число");
                else
                    if (s.length() == 2)
                        System.out.print("нечетное двузначное число");
                    else
                        System.out.print("нечетное трехзначное число");
        }
    }
}
