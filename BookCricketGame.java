package com.aurionpro.assignments;

import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {
	public static void main(String[] args) {
		System.out.println("Welcome To BookCricketGame !!!");
		System.out.println("Rules For The Game :");
		System.out.println("** Assume a book of 300 pages");
		System.out.println("1. Player1 Opens the book to read a page number (example 87)(randomly generated)");
		System.out.println("2. if the page number is 87 -> 87%7 (%7 results in score between 0-6)= 3  should be added to the score");
		System.out.println("3. player1 continue and keep adding to the score untill page number results in 0 score eg.(page49%7)=0");
		System.out.println("4. player2 start the game and tries to to beat the score of player1");
		System.out.println("5. in case of a tie, check the number of turns (palyer with lesser turn is winner)");
		System.out.println("6. show the winner of the game");
		
		int play = 0;
		
		do {
			System.out.print("Enter 1 to Start Game and 0 for Exit : ");
			Scanner sc = new Scanner(System.in);
			play = sc.nextInt();
			if(play == 1) 
			{
				
				System.out.print("Enter Player1 Name : ");
				String player1 = sc.next();
				System.out.print("Enter Player2 Name : ");
				String player2 = sc.next();
				
				int p1Score = 0;
				int round = 0;
				int point = 0;
				System.out.println("Player : "+player1);
				Random rand = new Random();

				do {
					System.out.print("Enter 1 TO Open Book : ");
					round++;
					int openBook = sc.nextInt();
					if(openBook ==1) {
						int pageNumber = rand.nextInt(301);
						System.out.print("Page Number "+ pageNumber);
						point = pageNumber % 7;
						System.out.print("\t \t  Point : "+point);
						p1Score += point;
						System.out.println("\t \t Score : "+p1Score);
					}
					else {
						System.out.println("oops Wrong Input!!!");
						System.out.println("Game Exited...!!!  Please Start Again");
						System.exit(0);
					}
					
				}while(point != 0);
				
				System.out.println(player1 +" Total Score : "+p1Score);
				System.out.println(player1 +" Takes "+round + " Round \n");
				
				System.out.println(player2+" Needs "+ ++p1Score + " Score in " +round +" to WIN MATCH");
				
				int	p2Score = 0;
				System.out.println("Player : "+player2);
				
				do {
					System.out.print("Enter 1 TO Open Book : ");
					round--;
					int openBook = sc.nextInt();
					if(openBook ==1) {
						int pageNumber = rand.nextInt(301);
						System.out.print("Page Number "+ pageNumber);
						point = pageNumber % 7;
						System.out.print("\t \t  Point : "+point);
						p2Score += point;
						System.out.print("\t \t Score : "+p2Score);
						System.out.println("\t \t Rounds Left : "+ round);
					}
					
					else {
						System.out.println("oops Wrong Input!!!");
						System.out.println("Game Exited...!!!  Please Start Again");
						System.exit(0);
					}
					
				}while(point != 0 && round>0);
				
				if(p1Score > p2Score)
					System.out.println("\n"+player1 +" Win Match \n");
				else
					System.out.println("\n"+player2 +" Win Match \n");
				
			}
			else if(play == 0) {
				System.out.println("Exitig.....!!!");
				System.out.println("You can Start The Game Again");
			}
			else {
				System.out.println("oops Wrong Input!!!");
				System.out.println("Game Exited...!!!  Please Start Again");
				System.exit(0);
			}
		}while(play != 0);
		
		
	}
}
