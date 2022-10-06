package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            if (params.get(s) != null) {
                stringBuilder.append(s + " = '"+ params.get(s)+"' and ");
            }
        }
        if (stringBuilder.length()>0)  return stringBuilder.substring(0, stringBuilder.length() -5);
        return "";
    }
}
