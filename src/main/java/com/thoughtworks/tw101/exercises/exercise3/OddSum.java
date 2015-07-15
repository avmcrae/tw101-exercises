package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        if (start >= end) { // return -1 if start is not less than end
            return -1;
        } else if (start % 2 == 0) { // if start is an even number
            start = start + 1; // add 1 so start equals the first odd number within the domain
        }

        int sum = 0;
        for (int x = start; x < end; x += 2) {
            sum += x;
        }

        return sum;
    }
}
