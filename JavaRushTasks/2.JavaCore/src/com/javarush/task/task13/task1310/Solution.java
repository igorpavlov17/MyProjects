package com.javarush.task.task13.task1310;

/* 
Это кто там такой умный?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person{
    }

    interface Boss extends Person, Workable{
    }

    class CleverMan implements Boss{
        @Override
        public void use(Person person) {
            person.startToWork();
        }

        @Override
        public void startToWork() {
        }

        @Override
        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary{
        @Override
        public void use(Person person) {
        }

        @Override
        public void startToWork() {
        }
    }
}
