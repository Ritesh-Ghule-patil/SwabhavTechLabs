package com.aurionpro.assignments;

import java.util.Random;
import java.util.Scanner;

public class PigDieMultiPlayer {

	int turn = 1;
	char decision;
	int die = 0;
	int score = 0;
	int turnScore = 0;
	static Scanner sc = new Scanner(System.in);
	private static final Random rand = new Random();

	public static void main(String[] args) {

		System.out.println("Wellcome To Roll Die game : \n");

		System.out.print("Enter Player1 Name : ");
		String player1 = sc.next();
		System.out.print("Enter Player2 Name : ");
		String player2 = sc.next();

		PigDieMultiPlayer p1 = new PigDieMultiPlayer();
		p1.play(player1);
		PigDieMultiPlayer p2 = new PigDieMultiPlayer();
		p2.play(player2);
		
		p1.score=20;
		p2.score=20;

		if (p1.turn < p2.turn) {
			System.out.println("\nCongratulations " + player1 + " You Won!!!👍👍👍👍 ");
			System.out.println("You have taken Only : " + p1.turn + " Turns to win");
			System.out.println(player2 + " have taken " + p2.turn + " Turns \n");
		} else if (p1.turn > p2.turn) {
			System.out.println("\nCongratulations " + player2 + " You Won!!!👍👍👍👍 ");
			System.out.println("You have taken Only : " + p2.turn + " Turns to win ");
			System.out.println(player1 + " have taken " + p1.turn + " Turns \n");

		} else {
			System.out.println("\nBoth Player taken " + p1.turn +" Turns");
			if (p1.score > p2.score) {
				System.out.println("\nCongratulations " + player1 + " You Won!!!👍👍👍👍 ");
				System.out.println("Because Your Score is  " + p1.score);
				System.out.println(player2 + " Score is " + p2.score + "\n");
			}
			else if(p1.score < p2.score) {
				System.out.println("\nCongratulations " + player2 + " You Won!!!👍👍👍👍 ");
				System.out.println("Because Your Score is  " + p2.score);
				System.out.println(player1 + " Score is " + p1.score + "\n");
			} else{
				System.out.println("both player taken same Turn and score same point ");
				System.out.println("Match is Absolutely Draw \n");
			}
		}
			
		System.out.println("*************** GAME-END **********************");

	}

	public void play(String player) {

		System.out.println("\n" + player);
		System.out.println("TURN : " + turn);
		do {
			System.out.print("Roll or Hold? (r/h) : ");
			decision = sc.next().charAt(0);
			if (decision == 'r') {
				die = getRandomInRange(1, 6);
				System.out.println("Die: " + die);
				if (die == 1) {
					System.out.println("\nTurn over. No score.");
					turnScore = 0;
					System.out.println("You have Loose your Current Turn Score.");
					System.out.println("Your Total Score is : " + score);
					System.out.println("------------------------------------------" + "\n");

					turn++;
					System.out.println("TURN : " + turn + "\n");
					continue;
				} else {
					turnScore += die;
					if (turnScore >= 20) {
						System.out.println("You Score : " + turnScore);
						System.out.println("You have taken : " + turn + " Turns \n");
						System.out.println("************ Well-Played : " + player + " *********************");
						break;
					} else if (turnScore + score >= 20) {
						System.out.println("Score of Current Turn : " + turnScore);
						score += turnScore;
						System.out.println("Your Total Score is : " + score);
						System.out.println("You have taken : " + turn + " Turns \n");
						System.out.println("************ Well-Played : " + player + " *********************");
						break;
					}
				}
			} else if (decision == 'h') {
				score += turnScore;
				System.out.println("\nScore of Current Turn  : " + turnScore);
				System.out.println("Your Total Score is : " + score);
				System.out.println("------------------------------------------" + "\n");
				turnScore = 0;
				turn++;
				System.out.println("TURN : " + turn + "\n");
				continue;
			} else {
				System.out.println("\noops Wrong Input!!!");
				System.out.println("please press (r/h) : \n");
				continue;
			}

		} while (score < 20 && turnScore < 20);
	}

	public static int getRandomInRange(int start, int end) {
		return start + rand.nextInt(end - start + 1);
	}
}
