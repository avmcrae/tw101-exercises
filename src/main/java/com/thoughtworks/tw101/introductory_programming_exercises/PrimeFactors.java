package com.thoughtworks.tw101.introductory_programming_exercises;
import java.util.ArrayList;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        int x = 2;
        while (x < n) {
            if (n % x == 0) {
                if (generate(x).isEmpty()) {
                    factors.add(x);
                }
            }
            x++;
        }
        return factors;
    }
}
