package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if (fileName == null || fileName.isEmpty()) {
            return;
        }
        ArrayList<String> wordsList = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = br.readLine()) != null) {
                for (String word : str.split("\\s+")) {
                    if (!word.isEmpty())
                        wordsList.add(word);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int wordCount = wordsList.size();
        for (int i = 0; i < wordCount; i++) {
            String rev = new StringBuilder(wordsList.get(i)).reverse().toString();
            for (int f = 0; f < wordCount; f++) {
                if (i != f && rev.equals(wordsList.get(f))) {
                    Pair pair1 = new Pair(wordsList.get(i), wordsList.get(f));
                    Pair pair2 = new Pair(wordsList.get(f), wordsList.get(i));
                    if (!result.contains(pair1) && !result.contains(pair2)) {
                        result.add(pair1);
                    }
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        public Pair(String str1, String str2) {
            first = str1;
            second = str2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
