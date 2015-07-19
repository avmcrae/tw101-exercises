package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by avalonmcrae on 7/19/15.
 */
public class GuessGame {
    int correctNumber;

    public GuessGame() {
        correctNumber = (int) (Math.random() * 100);
    }

    public void playGame() {
        boolean haveAWinner = false;
        Player p1 = new Player();
        while (!haveAWinner) {
            p1.getGuess();
            haveAWinner = checkGuess(p1.currentGuess);
        }
    }

    //Returns true if guess is correct; false otherwise
    public boolean checkGuess(int guess) {
        if (guess == correctNumber) {
            System.out.println("Your guess, " + guess + " was correct!");
            return true;
        } else if (guess < correctNumber) {
            System.out.println("Your guess, " + guess + " was too low. Try again!");
        } else {
            System.out.println("Your guess, " + guess + " was too high. Try again!");
        }
        return false;
    }
}
