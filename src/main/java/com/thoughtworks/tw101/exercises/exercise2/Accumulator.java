package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
	int incrementCount = 0;

	void increment() {
		incrementCount += 1;
	}

	void total() {
		System.out.println("The increment function has been called " + incrementCount + " times.");
	}
}
