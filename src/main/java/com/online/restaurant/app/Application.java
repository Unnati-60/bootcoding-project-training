package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import com.online.restaurant.dao.*;
import com.online.restaurant.service.CustomerService;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer Jack = new Customer();
        Jack.setName("Jack");
        Jack.setCity("Nagpur");
        Jack.setAddress("New Nandanwan, Nagpur");
        Jack.setState("Maharashtra");
        Jack.setEmailId("jack@gmail.com");
        Jack.setPhoneNumber(9863637831L);

        System.out.println("Customer Details :");
        System.out.println("Name : " + Jack.getName());
        System.out.println("City : " + Jack.getCity());
        System.out.println("Address : " + Jack.getAddress());
        System.out.println("State : " + Jack.getState());
        System.out.println("Email Id : " + Jack.getEmailId());
        System.out.println("Phone : " + Jack.getPhoneNumber());

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square, Nagpur");
        haldiram.setCity("Nagpur");
        haldiram.setState("Maharashtra");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(98989879L);
        haldiram.setRating(5.0);

        System.out.println();
        System.out.println("Vendor Details : ");
        System.out.println("Name : " + haldiram.getName());
        System.out.println("Rating : " + haldiram.getRating());
        System.out.println("State : " + haldiram.getState());
        System.out.println("City : " + haldiram.getCity());
        System.out.println("Address : " + haldiram.getAddress());
        System.out.println("Phone : " + haldiram.getPhoneNumber());


        Order order = new Order();
        order.setCustomer(Jack);
        order.setVendor(haldiram);
        order.setOrderDate(new Date());
        order.setTotalAmount(999.00);
        order.setDeliveryAddress("204, Civil lines, Nagpur");

        System.out.println();
        System.out.println("Order Details : ");
        System.out.println("Total Amount : " + order.getTotalAmount());
        System.out.println("Order Date : " + order.getOrderDate());
        System.out.println("Order Delivery Address : " + order.getDeliveryAddress());


//        CustomerDAO customerDAO = new CustomerDAO();
//        customerDAO.createTable();
//
//        VendorDAO vendorDAO = new VendorDAO();
//        vendorDAO.createTable();
//
//        OrderDAO orderDAO = new OrderDAO();
//        orderDAO.createTable();
//
//        MenuItemDAO menuItemDAO = new MenuItemDAO();
//        menuItemDAO.createTable();
//
//        OrderMenuItemDAO orderMenuItemDAO = new OrderMenuItemDAO();
//        orderMenuItemDAO.createTable();
//
//        CustomerService customerService = new CustomerService();
//        customerService.CreateDummyCustomer();
    }
}
