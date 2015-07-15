package com.thoughtworks.tw101.exercises.exercise1;

/**
 * Created by avalonmcrae on 7/15/15.
 */
public class oddNumbers {
    void oddNumbersAndSum() {
        int x = 1;
        int sum = 0;

        while (x < 101) {
            System.out.println(x);
            sum = sum + x;
            x = x + 2;
        }

        System.out.println("The sum is: " + sum);
    }
}
