/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Dat Huy
 */
public class DBConnection {
    public static Connection connection () {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/libary";
            String user = "root";
            String password = "0394818020";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
