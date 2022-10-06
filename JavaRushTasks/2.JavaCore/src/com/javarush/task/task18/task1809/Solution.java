package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }
        Collections.reverse(list);
        for (int i : list){
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
