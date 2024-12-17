package com.example.mvc.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    String urlConnection = "jdbc:mysql://localhost:3306/quanlyshopbandoan";
    String username = "root";
    String password = "1234";
    public Connection connect () throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(urlConnection, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
