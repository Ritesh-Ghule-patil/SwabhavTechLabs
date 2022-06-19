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
		
		System.out.print("Enter 1 to Start Game and 0 for Exit : ");
		Scanner sc = new Scanner(System.in);
		play = sc.nextInt();
		
		System.out.print("Enter Player1 Name : ");
		String player1 = sc.next();
		System.out.print("Enter Player2 Name : ");
		String player2 = sc.next();
		do {
			
			if(play == 1) 
			{
				
				
				int p1Score = 0;
				int p1Round = 12;
				int point = 0;
				System.out.println("Player : "+player1);
				Random rand = new Random();

				do 
				{
					System.out.print("Enter 1 TO Open Book : ");
					int openBook = sc.nextInt();
					if(openBook ==1) {
						int pageNumber = rand.nextInt(301);
						System.out.print("Page Number "+ pageNumber);
						point = pageNumber % 7;
						p1Round--;
						System.out.print("\t \t  Point : "+point);
						p1Score += point;
						System.out.print("\t \t Score : "+p1Score );
						System.out.println("\t \t Rounds Left : "+ p1Round);
					}
					else 
					{
						System.out.println("oops Wrong Input!!!");
						System.out.println("Game Exited...!!!  Please Start Again");
						System.exit(0);
					}
					
				}while(point != 0 && p1Round>=1);

				System.out.println("\n"+player1 +" Total Score : "+p1Score);
				System.out.println(player1 +" Takes "+ ( 12-p1Round ) + " Round \n");
				System.out.println("-----------------------------------------------------------------------------------------\n");

				System.out.println(player2+" Needs "+ (p1Score+1) + " Score to WIN MATCH");
				
				int	p2Score = 0;
				int p2Round=12;
				System.out.println("Player : "+player2);
				
				do 
				{
					if(p2Score > p1Score) 
					{
						break;
					}
					System.out.print("Enter 1 TO Open Book : ");
					p2Round--;
					int openBook = sc.nextInt();
					if(openBook ==1) 
					{
						int pageNumber = rand.nextInt(301);
						System.out.print("Page Number "+ pageNumber);
						point = pageNumber % 7;
						System.out.print("\t \t  Point : "+point);
						p2Score += point;
						System.out.print("\t \t Score : "+p2Score);
						System.out.println("\t \t Rounds Left : "+ p2Round);
					}
					else 
					{
						System.out.println("oops Wrong Input!!!");
						continue;
//						System.out.println("Game Exited...!!!  Please Start Again");
//						System.exit(0);
					}
					
				}while(point != 0 && p2Round>=1);
				
				System.out.println("\n"+player2 +" Total Score : "+p2Score);
				System.out.println(player2 +" Takes "+ ( 12-p2Round ) + " Round \n");
				System.out.println("-----------------------------------------------------------------------------------------");

				if(p1Score > p2Score) 
				{
					System.out.println("\nCongratulation "+player1 +" You Won Match \n");
					System.out.println("*****************************************************************************************\n");
				}
					
				else if(p1Score == p2Score) 
				{
					if(p1Round>p2Round) 
					{
						System.out.println("\nCongratulation "+player1 +" You Won Match \n");
					}
					else if(p1Round < p2Round) 
					{
						System.out.println("\nCongratulation "+player2 +" You Won Match \n");
					}
					else 
					{
						System.out.println(player1 +" and "+player2+ " both take same round ans Score same point");
						System.out.println("Match is Draw \n");
					}
					
					System.out.println("*****************************************************************************************\n");
				}
				else {
					System.out.println("\nCongratulation "+player2 +" You Won Match \n");
					System.out.println("*****************************************************************************************\n");
				}
				
				System.out.print("Do You want to play Again (y/n) :");
				char choice = sc.next().charAt(0);
				while(choice != 'n')
				{
					if(choice=='y')
					{
						System.out.println();
						break;
					}
					if(choice=='n')
					{
						System.out.println("\nExitig.....!!!");
						System.out.println("You can Start The Game Again");
						System.out.println();

						break;
					}
					else {
						System.out.println("enter valid inpute");
						System.out.print("Do You want to play Again (y/n) :");
						choice = sc.next().charAt(0);
						if(choice=='n') {
							System.out.println("Exitig.....!!!");
							System.out.println("You can Start The Game Again");
							System.exit(0);
						}
						continue;
					}
				}
			}
			else if(play == 0)
			{
				System.out.println("Exitig.....!!!");
				System.out.println("You can Start The Game Again");
			}
			else 
			{
				System.out.println("oops Wrong Input!!!\n3");
				continue;
//				System.out.println("Game Exited...!!!  Please Start Again");
//				System.exit(0);
			}
		}while(play != 0);
	}
}
