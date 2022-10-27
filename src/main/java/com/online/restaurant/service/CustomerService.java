package com.online.restaurant.service;

import com.online.restaurant.Customer;
import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.utils.*;

public class CustomerService {
    private CustomerDAO customerDAO;

    public CustomerService(){
        customerDAO = new CustomerDAO();
    }
    public void CreateDummyCustomer(){
        for (int i = 0;i< 100; i++){
            Customer customer = new Customer();
            customer.setCustomerId(i+1);
            customer.setName(NameGenerator.getName());
            customer.setAddress(AddressGenerator.getAddress());
            customer.setEmailId(EmailIdGenerator.getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setState("Maharashtra");
            customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());

            customerDAO.insertCustomer(customer);

            System.out.println("Customer Details :");
            System.out.println("Name : " + customer.getName());
            System.out.println("City : " + customer.getCity());
            System.out.println("Address : " + customer.getAddress());
            System.out.println("State : " + customer.getState());
            System.out.println("Email Id : " + customer.getEmailId());
            System.out.println("Phone : " + customer.getPhoneNumber());
        }
    }
    public void createTable() {
        customerDAO.createTable();
    }
}
