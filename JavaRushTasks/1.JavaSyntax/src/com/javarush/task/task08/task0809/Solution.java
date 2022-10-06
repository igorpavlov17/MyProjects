package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()) + " ms");
        System.out.println(getInsertTimeInMs(new LinkedList()) + " ms");
    }

    public static long getInsertTimeInMs(List list) {
        Date date = new Date();

        insert10000(list);

        Date date2 = new Date();
        long a = date2.getTime() - date.getTime();
        return a;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
