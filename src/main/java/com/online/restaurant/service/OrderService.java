package com.online.restaurant.service;

import com.online.restaurant.Order;
import com.online.restaurant.dao.OrderDAO;
import com.online.restaurant.utils.CustomerBuilder;
import com.online.restaurant.utils.OrderStatusGenerator;
import com.online.restaurant.utils.VendorBuilder;

import java.util.Date;

public class OrderService {
    private OrderDAO orderDAO;

    public OrderService(){
        orderDAO = new OrderDAO();
    }

    public void placeOrders(){
        for(int i = 0; i < 100; i++){
            Order order = new Order();
            order.setOrderId(i + 1);
            order.setVendor(VendorBuilder.build());
            order.setCustomer(CustomerBuilder.build());
            order.setOrderDate(new Date());
            order.setOrderStatus(OrderStatusGenerator.getStatus());
            order.setDeliveryAddress(order.getCustomer().getAddress());
//            order.setTotalAmount();
            orderDAO.insertOrder(order);
        }
    }


    public void createTable() {
        orderDAO.createTable();
    }
}
