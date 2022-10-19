package com.online.restaurant.utils;

import java.util.Random;

public class PhoneNumberGenerator {

        final static int MAX = 999999999;
        final static int MIN = 10000000;
        static Random random = new Random();
        public static int getPhoneNumber() {

            int number = random.nextInt(MAX - MIN);// 899999
            int PhNum = MIN + number;

            System.out.println(" Phone Number = " + PhNum);
            return PhNum;
        }

        public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                PhoneNumberGenerator.getPhoneNumber();
            }
        }

}
