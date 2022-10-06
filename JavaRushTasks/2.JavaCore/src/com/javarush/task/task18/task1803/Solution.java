package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] array = new long[256];
        long maxRepeat = 0;
        while (fileInputStream.available() > 0){
            array[fileInputStream.read()]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxRepeat) maxRepeat = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxRepeat) System.out.print(i + " ");
        }
        fileInputStream.close();
    }
}
