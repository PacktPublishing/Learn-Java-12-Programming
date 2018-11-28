package com.packt.learnjava.ch04_exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryCatchFinally {
    public static void main(String... args){
    }

    private static void method(String s){
        if(s.equals("abc")){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    private static void noCatchBlock(){
        try {
            method(null);
        } finally {
            //do something
        }
    }

    private static void tryWithRecources7() {
        try (Connection conn = DriverManager.getConnection("dburl", "username", "password");
             ResultSet rs = conn.createStatement().executeQuery("select * from some_table")) {
            while (rs.next()) {
                //process the retrieved data
            }
        } catch (SQLException ex) {
            //Do something
            //The exception was most probably caused by incorrect SQL statement
        }
    }

    private static void tryWithRecources9(Connection conn, ResultSet rs) {
        try (conn; rs) {
            while (rs.next()) {
                //process the retrieved data
            }
        } catch (SQLException ex) {
            //Do something
            //The exception was most probably caused by incorrect SQL statement
        }
    }

}
