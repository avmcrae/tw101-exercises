package com.thoughtworks.tw101.exercises.exercise8;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by avalonmcrae on 7/19/15.
 */
public class Player {
    protected int currentGuess;
    protected static ArrayList<Integer> pastGuesses = new ArrayList<Integer>();;

    public void getGuess() throws NumberFormatException {
        int numGuess;

        //Scan for user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        String guess = reader.next();

        try {
            numGuess = Integer.parseInt(guess);

            currentGuess = numGuess;
            pastGuesses.add(currentGuess);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer as your guess.");
            getGuess();
        }
    }
}
