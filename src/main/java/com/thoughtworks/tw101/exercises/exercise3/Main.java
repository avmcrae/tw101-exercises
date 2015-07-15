package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum = oddSum.of(1, 100);

        if (sum < 0) {
            System.out.println("You must enter a start number that is less than the end number");
        } else {
            System.out.println(sum);
        }
    }
}
