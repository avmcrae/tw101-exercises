package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float avgArea = 0;

        if (rectangles.length == 0) {
            System.out.println("No rectangles found.");
            return avgArea;
        }

        for (Rectangle rect : rectangles) {
            if (rect.area() > 0) {
                avgArea += rect.area();
            }
        }
        avgArea /= rectangles.length;

        return avgArea;
    }
}
