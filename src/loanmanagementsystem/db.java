/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/////////////////////////Database Connection Code is here/////////////////////////

package loanmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class db {

    private static Connection c;

    private static void setUpConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3307/loan", "root", "1234");
    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static Connection getDBCon() throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c;
    }
}





















//package gui;
//import java.sql.connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//
//
//import java.sql.*;
///**
// *
// * @author new
// */
//public class DbConnection {
//      
//    public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabservice","root","1234");
//
//        return c;
//    }
//
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//}
//    
//

//package gui;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
///**
// *
// * @author SMirsath
// */
//public class db {
//
//    static String host = "localhost";
//    static String un = "root";
//    static String pwd = "1234";
//    static String db = "cabservice";
//    static String port = "3306";
//
//    static java.sql.Connection con;
//
//    public static void getConnection() throws Exception {
//        String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
//        Class.forName("com.mysql.jdbc.Driver");
//        con = DriverManager.getConnection(url, un, pwd);
//    }
//
//    public static void sendQuery(String query) throws Exception {
//        if (con == null) {
//            getConnection();
//
//        }
//        java.sql.Statement s = con.createStatement();
//        s.executeUpdate(query);
//
//    }
//
//    public static ResultSet getData(String query) throws Exception {
//        if (con == null) {
//            getConnection();
//        }
//        java.sql.Statement s = con.createStatement();
//        java.sql.ResultSet rs = s.executeQuery(query);
//        return rs;
//
//    }
//
//}
