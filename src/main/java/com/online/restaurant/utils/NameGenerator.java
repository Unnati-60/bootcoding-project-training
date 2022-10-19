package com.online.restaurant.utils;

import java.util.Random;

public class NameGenerator {
    private  static String[] names = {"Ramesh",
            "Suresh", "Jayesh","Ruhi",
            "Ganesh", "Mahesh", "Rajesh",
            "Usha","Janhvi","Shubhoditya",
            "Shruti","Hrishikesh","Saumya"
    };

    public static String getName(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Name : "+ name);
        return name;
    }

    public static void main(String[] args) {
        NameGenerator.getName();
    }
}
