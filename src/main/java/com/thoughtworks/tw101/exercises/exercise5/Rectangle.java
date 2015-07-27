package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area(){
        if (length < 0 || width < 0) {
            return -1;
        } else {
            return length * width;
        }
    }
}
