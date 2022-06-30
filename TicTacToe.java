package com.aurionpro.assignments;

import java.util.Scanner;

public class TicTacToe {
	static String board[];
	static String turn;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Wellcome To tic-Tac-Toe Game : \n");

		board = new String[9];
		turn = "X";

		for (int position = 0; position < 9; position++) {
			board[position] = "" + (position + 1);
		}

		System.out.print("Player1, Enter Your Name : ");
		String player1 = sc.next();
		System.out.print("Player2, Enter Your Name : ");
		String player2 = sc.next();

		play(player1, player2);

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

			board[choice - 1] = symbol;

			if (checkWinner(board).equals("X")) {
				System.out.println(player1 + " has won the game!");
				gameEnd  = true;
			} 
			else if (checkWinner(board).equals("O")) {
				System.out.println(player2 + " has won the game!");
				gameEnd  = true;
			} else {
				if (boardIsFull()) {
					System.out.println("Game is tie!");
					gameEnd  = true;
				} else {
					p1 = !p1;
				}
			}

		}
		
		printBoard();

	}

	private static boolean boardIsFull() {
		for(int i=0; i<9; i++) {
			if(!board[i].equals("X") && !board[i].equals("O"))
				return false;
		}
		return true;
	}

	private static String checkWinner(String[] board) {
		for (int position = 0; position < 8; position++) {
			String line = null;

			switch (position) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			
			if (line.equals("XXX")) {
				return "X";
			}

			else if (line.equals("OOO")) {
				return "O";
			}
		}
		return " ";
	}

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
