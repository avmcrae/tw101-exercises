package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by avalonmcrae on 7/16/15.
 */
public class Troll implements Monster {
    private int hitpoints = 40;
    private String name = "Troll";

    public void takeDamage(int amount) {
        hitpoints -= amount/2;
    }

    public void reportStatus() {
        System.out.println();
    }
}
