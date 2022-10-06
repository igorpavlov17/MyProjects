package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] buffer = new byte[(fileInputStream.available()+1)/2];
        int count = fileInputStream.read(buffer);
        fileOutputStream1.write(buffer, 0, count);
        buffer = new byte[fileInputStream.available()];
        count = fileInputStream.read(buffer);
        fileOutputStream2.write(buffer, 0, count);
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
