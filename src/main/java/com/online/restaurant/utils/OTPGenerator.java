package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenerator {
    final static int MAX = 999999;
    final static int MIN = 100000;
    static Random random = new Random();
    public static int getOPT() {

        int number = random.nextInt(MAX - MIN);// 899999
        int opt = MIN + number;

        System.out.println(" OTP Number = " + opt);
        return opt;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            OTPGenerator.getOPT();
        }
    }
}
