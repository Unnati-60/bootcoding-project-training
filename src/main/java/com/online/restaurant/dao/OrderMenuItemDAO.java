package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME = "app_order_menu_item";

    private DAOService daoService;
    public OrderMenuItemDAO(){
        // Inside constructor
        daoService = new DAOService();
    }

    public void createTable() {
        try {
            Connection con = daoService.getConnection();
            //3. create statement object
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "( id bigint NOT NULL, "
                    + " order_id int8, "
                    + " quantity int4, "
                    + " menu_item_name text ,"
                    + " total_price numeric, "
                    + " is_veg bool, "
                    + " CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
