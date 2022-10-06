package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int spaceCount = 0;
        int size = 0;
        while (fileInputStream.available() > 0){
            size++;
            if (fileInputStream.read() == 32) spaceCount++;
        }
        System.out.format("%.2f", 1.0*spaceCount/size*100);
        fileInputStream.close();
    }
}
