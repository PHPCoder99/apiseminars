package com.company;

import java.util.Arrays;

public class Seminar5 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "apple"};

        String key = "apple";

        int count = Arrays.stream(words)
                .filter(word -> word.equals(targetWord))
                .count();

        System.out.println("Count of '" + targetWord + "': " + count);
    }
}
