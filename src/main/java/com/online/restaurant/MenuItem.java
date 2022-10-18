package com.online.restaurant;

public class MenuItem {
    private long menuItemId;
    private String menuItem;
    private double price;
    private String category;
    private boolean isVeg;

    //getter

    public long getMenuItemId() {
        return menuItemId;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isVeg() {
        return isVeg;
    }

    //setter

    public void setMenuItemId(long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }
}
