package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public boolean exists(Connection con, String tableName, long id){
        try {
            Statement stmt = con.createStatement();
            String sql = "Select * from "+ tableName + "where id = " + id;
//            System.out.println();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

}
