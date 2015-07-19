package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;
/**
 * Created by avalonmcrae on 7/19/15.
 */
public class Player {
    int currentGuess;

    public void getGuess() {
        int numGuess;

        //Scan for user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        String guess = reader.next();

        numGuess = Integer.parseInt(guess);
        currentGuess = numGuess;
    }
}
