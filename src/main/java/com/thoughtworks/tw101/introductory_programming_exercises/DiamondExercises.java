package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        n += 2;
        int x = 1;
        while (x <= n) {
            for (float y = 1; y <= (n-x)/2; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("*");
            }
            x = x + 2;
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);

        n += 2;
        int x = 1;
        while (x <= n) {
            for (float y = 1; y <= (x+1)/2; y++) {
                System.out.print(" ");
            }
            for (int z = n-3; z >= x; z--) {
                System.out.print("*");
            }
            x = x + 2;
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int a = n+2;
        int x = 1;
        while (x <= n) {
            for (float y = 1; y <= (a+2-x)/2; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("*");
            }
            x = x + 2;
            System.out.println();
        }

        System.out.println("Avalon");

        n += 2;
        x = 1;
        while (x <= n) {
            for (float y = 1; y <= (x+3)/2; y++) {
                System.out.print(" ");
            }
            for (int z = n-2; z >= x; z--) {
                System.out.print("*");
            }
            x = x + 2;
            System.out.println();
        }
    }
}
