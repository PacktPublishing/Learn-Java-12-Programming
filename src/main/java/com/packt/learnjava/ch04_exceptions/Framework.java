package com.packt.learnjava.ch04_exceptions;

public class Framework {

    public static void main(String... args){
        catchException1();
        catchException2();
        catchException3();
    }

    private static void method(String s){
        if(s.equals("abc")){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    private static void catchException1(){
        System.out.println();
        try {
            method(null);
        } catch (Exception ex){
            System.out.println(ex.getClass().getCanonicalName());  //prints: java.lang.NullPointerException
            ex.printStackTrace();
            if(ex instanceof NullPointerException){
                //do something
            } else {
                //do something else
            }
        }
    }

    private static void catchException2(){
        try {
            method(null);
        } catch (NullPointerException ex){
            ex.printStackTrace();
            //do something
        } catch (Exception ex){
            ex.printStackTrace();
            //do something else
        }
    }

    private static void catchException3(){
        Exception exception = null;
        try {
            method(null);
        } catch (NullPointerException ex){
            exception = ex;
            //do something
        } catch (Exception ex){
            exception = ex;
            //do something else
        } finally {
            if(exception != null){
                exception.printStackTrace();
            }
        }
    }
}
