package com.company;

import java.lang.String;

public class Seminar3 {
    public static void main(String[] args) {
    }

    public static int task1(String[][] products){
        int maxPrice = Integer.parseInt(products[0][1]);
        for (int i = 0; i < products.length; i++) {
            if (products[i][0].contains("Высший") && (Integer.parseInt(products[i][2]) == 1 || Integer.parseInt(products[i][2]) == 2) && Integer.parseInt(products[i][1]) > maxPrice){
                maxPrice = Integer.parseInt(products[i][1]);
            }
        }
        return maxPrice;
    }

    public static String task2(String[][] products, int cort){
        int minPrice = Integer.parseInt(products[0][1]);
        String productName = "";
        for (int i = 0; i < products.length; i++) {
            if (Integer.parseInt(products[i][2]) == cort && Integer.parseInt(products[i][1]) <= minPrice){
                minPrice = Integer.parseInt(products[i][1]);
                productName = products[i][0];
            }
        }
        int thing = 0;
        System.out.println(Integer.hashCode(thing));
        int x_speed = 0;
        int xSpeed = 1;
        return productName;
    }
}
