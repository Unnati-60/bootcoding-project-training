package com.online.restaurant.exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        // array declare + initialization
        int[] numbers = {10, 20,30, 40, 50};
        // array declare
        int[] ages = new int[5];
        //array initialize
//        ages[0] = 10;
//        ages[1] = 20;
//        ages[2] = 30;
//        ages[3] = 40;
//        ages[4] = 50;
        for(int i=0;i< ages.length;i++){
            ages[i]= (i+1)*10;
        }

        // traversing array
        for(int i=0;i< ages.length;i++){
            System.out.println(i + "=" + ages[i]);
        }

        String[] months = {"January","February",
                "March","April","May",
                "June","July","August","September",
                "October","November","December"};

        for(int i=0;i< months.length;i++){
            System.out.println(i+1 + "=" + months[i]);
        }
    }
}
