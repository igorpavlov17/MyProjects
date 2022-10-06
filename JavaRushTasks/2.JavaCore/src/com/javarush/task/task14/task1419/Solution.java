package com.javarush.task.task14.task1419;

import sun.net.ftp.FtpProtocolException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        exceptions.add(new ArithmeticException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new RuntimeException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new InterruptedException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ArrayStoreException());
    }
}
