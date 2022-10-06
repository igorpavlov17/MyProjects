package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String sAge = reader.readLine(); //читаем строку с клавиатуры
        String name = reader.readLine(); //читаем строку с клавиатуры
        //int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        //if (sAge == 1)
            System.out.print(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
