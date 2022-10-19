package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOService {
    public Connection getConnection(){
        try {
            // 1. load JDBC driver
            Class.forName("org.postgresql.Driver");
            //2. Establish connection with your local database
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "Unnatidb123$");
            return con;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
