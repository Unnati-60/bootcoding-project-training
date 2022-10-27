package com.online.restaurant.service;

import com.online.restaurant.Vendor;
import com.online.restaurant.dao.VendorDAO;
import com.online.restaurant.utils.AddressGenerator;
import com.online.restaurant.utils.EmailIdGenerator;
import com.online.restaurant.utils.PhoneNumberGenerator;
import com.online.restaurant.utils.RestaurantCategoryGenerator;

public class VendorService {
    private VendorDAO vendorDAO;
    private VendorMenuItemService menuItemService;

    public VendorService(){
        vendorDAO = new VendorDAO();
        menuItemService = new VendorMenuItemService();
        menuItemService.createTable();
    }

    public void createVendors(){
        for(int i = 0; i < 100; i++){
            Vendor vendor = new Vendor();
            vendor.setVendorId(i + 1);
            vendor.setName(RestaurantCategoryGenerator.getName());
            vendor.setAddress(AddressGenerator.getAddress());
            vendor.setEmailId(EmailIdGenerator.
                    getEmailId(vendor.getName()));
            vendor.setCity("Nagpur");
            vendor.setState("Maharashtra");
            vendor.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
            vendor.setCategory(RestaurantCategoryGenerator.getCategory(vendor.getName()));

            vendorDAO.insertVendor(vendor);

            addMenuItemsOfVendor(vendor);
        }
    }

    public void addMenuItemsOfVendor(Vendor vendor){
        menuItemService.createMenuItems(vendor);
    }

    public void createTable() {
        vendorDAO.createTable();
    }
}
