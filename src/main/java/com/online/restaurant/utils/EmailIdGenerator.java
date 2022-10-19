package com.online.restaurant.utils;

import java.util.Random;

public class EmailIdGenerator {
    private  static final String EMAIL_SUFFIX = "@gmail.com";
    private  static final Random random = new Random();
    private  static final int MAX = 2022;
    private  static final int MIN = 2000;
    public static String getEmailId(String name){
        //ramesh2022@gmail.com
        //suresh2000@gmail.com
        int randomNumber = random.nextInt(MAX-MIN);
        int year = MIN +randomNumber;
        String emailId = name + year + EMAIL_SUFFIX;
        System.out.println("EmailId : " + emailId);
        return emailId;
    }

    public static void main(String[] args) {
        EmailIdGenerator.getEmailId("janhvi");
    }

}
