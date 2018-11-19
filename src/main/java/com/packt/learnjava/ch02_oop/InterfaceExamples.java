package com.packt.learnjava.ch02_oop;

import java.util.HashSet;
import java.util.Set;

public class InterfaceExamples {
    public static void main(String... args){

        staticProperty();

        SomeInterface si = new SomeClass();

    }

    private static class SomeClass implements SomeInterface{
        public void method1(){
            //method body
        }
        public String method2(int i) {
            //method body
            return "abc";
        }

    }

    interface SomeInterface {
        void method1();
        String method2(int i);
    }

    private static void staticProperty(){
        A.set.add("a");
        A.set.add("b");
        System.out.println(A.set); //prints: [a, b]
    }

    interface A {
        Set<String> set = new HashSet<>();
    }

}
