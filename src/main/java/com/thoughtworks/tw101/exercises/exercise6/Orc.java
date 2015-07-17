package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by avalonmcrae on 7/16/15.
 */
public class Orc implements Monster {
    private int hitpoints = 20;
    private String name = "Orc";

    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    public void reportStatus() {
        System.out.println(name + "'s status is: " + hitpoints + " points.");
    }
}
