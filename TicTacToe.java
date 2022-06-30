package com.aurionpro.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	static String board[];
	static String turn;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Wellcome To tic-Tac-Toe Game : \n");

		board = new String[9];
		turn = "X";
		String winner = null;

		for (int position = 0; position < 9; position++) {
			board[position] = "" + (position + 1);
		}

		System.out.print("Player1, Enter Your Name : ");
		String player1 = sc.next();
		System.out.print("Player2, Enter Your Name : ");
		String player2 = sc.next();

//		TicTacToe p1 = new TicTacToe();
		play(player1, player2);

//		TicTacToe p2 = new TicTacToe();

	}

	private static void play(String player1, String player2) {

		boolean p1 = true;
		boolean gameEnd = false;
		int choice;

		while (!gameEnd) {
			printBoard();
			System.out.println();

			if (p1)
				System.out.println(player1 + "'s Turn (X) : ");
			else
				System.out.println(player2 + "'s Turn (O) : ");

			String symbol = "";
			if (p1)
				symbol = "X";
			else
				symbol = "O";

			while (true) {
				System.out.print("Enter the slot number to place " + symbol + " : ");
				choice = sc.nextInt();

				if (choice < 1 || choice > 9)
					System.out.println("this position is not present in the board ! Try agian.");
				else if (board[choice - 1].equals("X") || board[choice - 1].equals("O"))
					System.out.println("Someone has already made a move at this position! Try again.");
				else
					break;
			}
			
			board[choice-1] = symbol;
			
			if(checkWinner(board)) {
				
			}
			

		}

	}

private static boolean checkWinner(String[] board) {
		System.out.println("dsfkjdskfj");
		System.out.println(Arrays.toString(board));
		return false;
	}

//	private void displayBoard() {
//		
//		String board[] = new String
//	}

	static void printBoard() {
		System.out.println();
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}
}
