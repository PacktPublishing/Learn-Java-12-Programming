package com.packt.learnjava.ch03_fundamentals;

public class ThisAndSuper {
    public static void main(String... args){
        A a = new A();
        a.setCount(2);
        System.out.println(a.getCount()); //prints: 0
    }

    private static class A {
        private int count;
        public void setCount(int count) {
            count = count;
        }
        public int getCount(){
            return this.count;
        }
    }
}
