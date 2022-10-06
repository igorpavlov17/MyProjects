package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max = Integer.MIN_VALUE;
        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if (data > max) max = data;
        }
        fileInputStream.close();
        System.out.println(max);
    }
}
