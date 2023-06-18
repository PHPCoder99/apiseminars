package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Seminar4 {
    public static void main(String[] args) {
        // System.out.println(task1());
        System.out.println(lispCodeValidatorAkaTask2("([)]"));
    }

    public static String task1(){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (Objects.equals(n, "")){
            return "";
        }
        return task1() + n;
    }

    public static boolean lispCodeValidatorAkaTask2(String brackets){
        int i = 0;
        while (i < brackets.length()-1 && !brackets.isBlank()){
            System.out.println(i);
            if (brackets.charAt(i) == '(' && brackets.charAt(i+1) == ')' || brackets.charAt(i) == '[' && brackets.charAt(i+1) == ']' || brackets.charAt(i) == '{' && brackets.charAt(i+1) == '}'){
                brackets = brackets.substring(0, i) + brackets.substring(i+2);
                if (i-2 < 0){
                    i = -1; // so that i totals 0 after line 34
                } else {
                    i -= 2;
                }
                System.out.println(brackets);
            }
            i++;
        }
        return brackets.isBlank();
    }
}