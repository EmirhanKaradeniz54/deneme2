package com.mobileapp.database;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;
@Repository
public class DBConnect {
    private static final String url = "jdbc:postgresql://localhost/postgres";
    private static final String user = "postgres";
    private static final String password = "root";


    public static Connection getConnection(){
        Connection connection;
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection close: " + connection.isClosed());
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
