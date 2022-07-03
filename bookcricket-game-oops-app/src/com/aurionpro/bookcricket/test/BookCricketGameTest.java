package com.aurionpro.bookcricket.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.bookcricket.model.BookCricketGame;
import com.aurionpro.bookcricket.model.Player;

public class BookCricketGameTest {
	public static void main(String[] args) {

		System.out.println("Welcome To BookCricketGame !!!");

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter 1 to start the Game : ");
		int choice = sc.nextInt();

		if (choice == 1) {

			Player players[] = new Player[2];

			System.out.print("Player 1 , What is your name : ");
			String player1 = sc.next();
			players[0] = new Player(player1);

			System.out.print("Player 2 , What is your name : ");
			String player2 = sc.next();
			players[1] = new Player(player2);

			BookCricketGame bk = new BookCricketGame();
			System.out.println("*****************************************");

			bk.play(players);
			bk.whoIsWinner(players);

		} else if (choice == 0) {

			System.out.println("You Exited the Game!! ");
			System.exit(0);
		} else {
			System.out.println("Invalid inpute!!!. Please Try again");
			System.out.print("Enter 1 to start the game : ");

		}

	}
}
