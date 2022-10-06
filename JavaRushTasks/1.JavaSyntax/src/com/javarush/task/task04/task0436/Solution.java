package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import javax.jws.soap.SOAPMessageHandlers;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int m = Integer.parseInt(s);
        s = reader.readLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++)
                System.out.print("8");
            System.out.println("");
        }
    }
}
