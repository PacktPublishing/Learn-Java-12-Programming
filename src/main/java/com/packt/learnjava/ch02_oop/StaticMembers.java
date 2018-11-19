package com.packt.learnjava.ch02_oop;

public class StaticMembers {
    public static void main(String... args){

        SomeClass.someMethod(42);
        System.out.println(SomeClass.somePrpperty);  //prints: abc

    }

    private static class SomeClass{
        public static final String INPUT_FILE_NAME = "myFile.csv";
        public static String somePrpperty = "abc";
        public static void someMethod(int i){
            //do something
        }
    }

}
