package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        for (String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine(); !fileName.equals("end"); fileName = new BufferedReader(new InputStreamReader(System.in)).readLine()){
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0){
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        for (int i : list){
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
    }
}
