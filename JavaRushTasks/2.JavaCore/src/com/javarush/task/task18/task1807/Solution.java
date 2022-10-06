package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;
        while (fileInputStream.available() > 0){
            if (fileInputStream.read() == ',') count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
