package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fileName2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        byte[] buffer = new byte[fileInputStream1.available() + fileInputStream2.available()];
        while (fileInputStream1.available() > 0) {
            fileInputStream1.read(buffer, fileInputStream2.available(), fileInputStream1.available());
        }
        while (fileInputStream2.available() > 0) {
            fileInputStream2.read(buffer, 0, fileInputStream2.available());
        }
        FileOutputStream fileForWriting = new FileOutputStream(fileName1);
        fileForWriting.write(buffer, 0, buffer.length);
        fileInputStream1.close();
        fileInputStream2.close();
        fileForWriting.close();
    }
}
