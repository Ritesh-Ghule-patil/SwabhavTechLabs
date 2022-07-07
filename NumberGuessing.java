package com.assignment.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	private int turn = 1;
	static Scanner sc = new Scanner(System.in);

	public void play(String name) {
		int number = getRandomNumber(1, 100);
//		System.out.println(number);
		System.out.println("Hello : " + name + " You have 6 chance to guess the Number");
		System.out.println("number is Between 1 - 100");

		while (turn <= 6) {
			guessing(number);
		}

		System.out.println("\nYour Turns are ends, thank you for Playing : " + name);

	}

	private void guessing(int number) {

		System.out.print("\nEnter the the number you Guess : ");
		int guessedNumber = sc.nextInt();

		if (guessedNumber < number) {
			System.out.println("You Guessed to Small !!!.");
			turn++;
		} else if (guessedNumber > number) {
			System.out.println("You Guessed to High !!!.");
			turn++;
		} else {
			System.out.println("\nCongrats, You Guess Correct Number in :" + turn + " Turns");
			System.exit(0);
		}
	}

	private int getRandomNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

}
