package com.thoughtworks.tw101.exercises.exercise8;

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
            haveAWinner = checkGuess(p1.currentGuess, p1);
        }
    }

    //Returns true if guess is correct; false otherwise
    public boolean checkGuess(int guess, Player p) {
        if (guess == correctNumber) {
            System.out.println("Your guess, " + guess + " was correct!");
            System.out.println("Your previous guesses were:");
            for (int g : p.pastGuesses) {
                System.out.println(g);
            }
            return true;
        } else if (guess < correctNumber) {
            System.out.println("Your guess, " + guess + " was too low. Try again!");
        } else {
            System.out.println("Your guess, " + guess + " was too high. Try again!");
        }
        return false;
    }
}
