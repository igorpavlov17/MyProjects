package com.javarush.task.task22.task2211;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");

        byte[] bytes = Files.readAllBytes(Paths.get(args[0]));
        String str = new String(bytes, windows1251);
        bytes = str.getBytes(utf8);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
