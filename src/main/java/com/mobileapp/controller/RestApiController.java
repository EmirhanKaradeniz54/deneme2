package com.mobileapp.controller;

import com.mobileapp.database.DBConnect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping("/getConnection")
    public String getConnection(){
        try{
            Connection connection = DBConnect.getConnection();
            if (connection != null && !connection.isClosed()) return "Connection successful";
            else return "Connection failed";
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return "Connection failed";
    }
}
