package com.online.restaurant.service;

import com.online.restaurant.MenuItem;
import com.online.restaurant.Vendor;
import com.online.restaurant.dao.MenuItemDAO;
import com.online.restaurant.utils.MenuItemGenerator;
import com.online.restaurant.utils.MenuPriceGenerator;

public class VendorMenuItemService {
    private MenuItemDAO menuItemDAO;

    public VendorMenuItemService(){
        menuItemDAO = new MenuItemDAO();
    }

    public void createMenuItems(Vendor vendor){
        for(int i = 0; i < 10; i++){
            MenuItem menuItem = new MenuItem();
            menuItem.setMenuItemId(vendor.getVendorId() * 100 + (i+1));
            menuItem.setVendorId(vendor.getVendorId());
            menuItem.setCategory(vendor.getCategory());
            menuItem.setMenuItem(MenuItemGenerator.getMenuItemByVendorCategory(vendor.getCategory()));
            menuItem.setVeg(false); // TODO For you
            menuItem.setPrice(MenuPriceGenerator.getPrice());
            menuItemDAO.insertMenuItem(menuItem);
        }
    }

    public void createTable() {
        menuItemDAO.createTable();
    }
}
