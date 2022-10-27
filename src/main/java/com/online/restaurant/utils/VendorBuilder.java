package com.online.restaurant.utils;

import com.online.restaurant.Vendor;

import java.util.Random;

public class VendorBuilder {
    private static Random random = new Random();
    public static Vendor build(){
        Vendor vendor = new Vendor();
        vendor.setVendorId( random.nextInt(100));
        return vendor;
    }
}
