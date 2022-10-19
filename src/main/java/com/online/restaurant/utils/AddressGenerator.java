package com.online.restaurant.utils;

import java.util.Random;

public class AddressGenerator {
    private  static String[] addresses = {"KR Pandav College, New Nandanwan",
            "Trillium VR, Medical Square",
            "Besides Haldiram, Ajni Square",
            "Bhole Petrol Pump, Civil Lines",
            "Opposite Batukbhai Jewellers, Dharampeth",
            "Sangam Mithai, Manish Nagar"
    };

    public static String getAddress(){
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address : "+ address);
        return address;
    }

    public static void main(String[] args) {
        AddressGenerator.getAddress();
    }
}
