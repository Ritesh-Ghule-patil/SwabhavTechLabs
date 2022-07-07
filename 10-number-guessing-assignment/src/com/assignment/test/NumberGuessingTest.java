package com.assignment.test;

import com.assignment.model.NumberGuessing;

public class NumberGuessingTest {
	public static void main(String[] args) {

		System.out.println("Welcome , Let's Start the Game\n ");

		NumberGuessing guess = new NumberGuessing();

		System.out.print("Enter your Name : ");
		String name = "Ritesh";
		System.out.println("Welcome : " + name);
		
		guess.play(name);
	}
}
