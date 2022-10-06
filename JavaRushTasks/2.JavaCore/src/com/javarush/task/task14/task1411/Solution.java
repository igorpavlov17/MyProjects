package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        boolean exit = false;
        String key = null;

        while(true){
            key = reader.readLine();
            switch (key){
                case "user" : Person.User user = new Person.User(); doWork(user); continue;
                case "loser" : Person.Loser loser = new Person.Loser(); doWork(loser); continue;
                case "coder" : Person.Coder coder = new Person.Coder(); doWork(coder); continue;
                case "proger" : Person.Proger proger = new Person.Proger(); doWork(proger); continue;
                default : exit = true;
            }
            if (exit) break;
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
