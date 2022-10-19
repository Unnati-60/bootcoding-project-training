package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {
    public static final String TABLE_NAME = "app_order";
    private DAOService daoService;
    public OrderDAO(){
        // Inside constructor
        daoService = new DAOService();
    }

    public void createTable() {
        try {
            Connection con = daoService.getConnection();
            //3. create statement object
            Statement stmt = con.createStatement();

            // 4. Execute query (statement)
            //TODO - Create table query
            //TODO - Change query - for demonstration we have SELECT query
            String sql = "Select * from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "( id bigint NOT NULL, "
                    + " name text ,"
                    + " address text, "
                    + " phone_number bigint, "
                    + " city text, "
                    + " state text, "
                    + " email_id text, "
                    + " CONSTRAINT app_order_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);
            ResultSet rs = stmt.executeQuery(sql);


            //5. traverse resultset( data)
            while (rs.next()) {
                System.out.println(" = " + rs.getString("name"));
                System.out.println(" = " + rs.getString("address"));
                System.out.println(" + " + rs.getString("phone_Number"));
                System.out.println(" + " + rs.getString("city"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
