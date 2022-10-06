package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> list = new ArrayList<>();
        while(stringTokenizer.hasMoreElements()){
            list.add(stringTokenizer.nextToken());
        }
        return list.toArray(new String[stringTokenizer.countTokens()]);
    }
}
