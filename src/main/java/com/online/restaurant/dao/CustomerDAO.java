package com.online.restaurant.dao;

import com.online.restaurant.Customer;

import java.sql.*;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";

    private DAOService daoService;
    public CustomerDAO(){
        // Inside constructor
        daoService = new DAOService();
    }
    public void insertCustomer(Customer customer){
        try {

            Connection con = daoService.getConnection();
            String sql = "INSERT INTO " +TABLE_NAME
                    + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, customer.getCustomerId());
            ps.setString(2, customer.getName());
            ps.setString(3, customer.getAddress());
            ps.setLong(4, customer.getPhoneNumber());
            ps.setString(5, customer.getCity());
            ps.setString(6, customer.getState());
            ps.setString(7, customer.getEmailId());
            ps.executeUpdate();
            con.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public void createTable() {
        try {

            Connection con = daoService.getConnection();

            //3. create statement object
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "( id bigint NOT NULL, "
                    +" name text ,"
                    +" address text, "
                    +" phone_number bigint, "
                    +" city text, "
                    +" state text, "
                    +" email_id text, "
                    +" CONSTRAINT app_customer_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : "+ query);
            stmt.executeUpdate(query);
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
