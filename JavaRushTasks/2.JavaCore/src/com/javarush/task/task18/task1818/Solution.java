package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine(), true);
        FileInputStream fileInputStream1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream fileInputStream2 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        while (fileInputStream1.available() > 0){
            fileOutputStream.write(fileInputStream1.read());
        }
        while (fileInputStream2.available() > 0){
            fileOutputStream.write(fileInputStream2.read());
        }
        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
