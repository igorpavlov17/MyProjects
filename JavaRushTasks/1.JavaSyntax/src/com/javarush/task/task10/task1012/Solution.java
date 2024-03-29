package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        List<Integer> countChar = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.get(j).length(); k++) {
                    if (list.get(j).charAt(k) == alphabet.get(i))
                        count++;
                }
            }
            countChar.add(count);
            count = 0;
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + countChar.get(i));
        }
    }
}
