package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        String date = new SimpleDateFormat("Дата: dd.MM.yyyy\nВремя: hh:mm:ss").format(new Date());
        System.out.print(date);
    }
}