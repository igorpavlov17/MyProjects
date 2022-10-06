package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (true){
            key = reader.readLine();
            try {
                if (key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller")){
                    Movie movie = null;
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                }
                else {
                    Movie movie = null;
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                    break;
                }
            }
            catch (NullPointerException e){
                break;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key))
                movie = new SoapOpera();
            if ("cartoon".equals(key))
                movie = new Cartoon();
            if ("thriller".equals(key))
                movie = new Thriller();

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }
}
