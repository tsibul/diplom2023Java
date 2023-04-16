package org.example;

import java.sql.*;

import static init.DbInit.dbInit;

public class Main {

    public static void main(String[] args) throws SQLException {

        dbInit();
        System.out.println("Hello world!");
    }


}