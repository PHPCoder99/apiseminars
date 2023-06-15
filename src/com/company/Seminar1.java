package com.company;

import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1(" hello hi hello hey  hi a un    "));
        System.out.println(task2("-1 1 2 -4 5 -1 5 4 0"));
    }

    public static String task1(String s) {
        String[] sarray = s.trim().split("\\s+");
        String word = "";
        for (int i = sarray.length-1; i >= 0; i--) {
            word += sarray[i] + " ";
        }
        return word;
    }

    public static int task2(String s) {
        int res = 0;
        String[] sarray = s.trim().split("\\s+");
        for (int i = 0; i < sarray.length-1; i++) {
            if (Integer.parseInt(sarray[i]) > 0 && Integer.parseInt(sarray[i+1]) < 0){
                res += Integer.parseInt(sarray[i]);
            }
        }
        return res;
    }
}
