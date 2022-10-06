package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] array = new long[256];
        long minRepeat = Long.MAX_VALUE;
        while (fileInputStream.available() > 0){
            array[fileInputStream.read()]++;
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < minRepeat)&&(array[i]>0)) minRepeat = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minRepeat) System.out.print(i + " ");
        }
        fileInputStream.close();
    }
}
