package com.aurionpro.assignments;

import java.util.Random;
import java.util.Scanner;

public class RollDieGame {

	private static final Random rand = new Random();
	public static void main(String[] args) {
		
		System.out.println("Wellcome To Roll Die game : \n");
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int turn = 1;
		char decision;
		int die = 0;
		int turnScore = 0;
		while(score<20 && turnScore<20) {
			System.out.println("TURN : "+  turn);
			do{
				System.out.print("Roll or Hold? (r/h) : ");
				decision = sc.next().charAt(0);
				if(decision == 'r') 
				{
					die = getRandomInRange(1,6);
					System.out.println("Die: "+ die);
					if(die == 1) {
						System.out.println("\nTurn over. No score.");
						score = 0;
						turnScore = 0;
						turn++;
						System.out.println("You have Loose all your Score.");
						System.out.println("------------------------------------------" + "\n");
					}
					else {
						turnScore += die;
						if(turnScore >= 20) {
							System.out.println("\nYou Won!!!👍👍👍👍 ");
							System.out.println("You Score : "+ turnScore);
							System.out.println("Total Turns : "+ turn +"\n");
							break;
						}
						else if(turnScore+score >= 20)
						{
							System.out.println("\nYou Won!!!👍👍👍👍");
							System.out.println("Score of Current Turn : "+ turnScore);
							score += turnScore;
							System.out.println("Your Total Score is : "+ score );
							System.out.println("Total Turns : "+ turn+"\n");
							break;
						}
					}
				}
				else if(decision == 'h')
				{
					score += turnScore;
					System.out.println("\nScore of Current Turn  : "+ turnScore);
					System.out.println("Your Total Score is : "+ score );
					System.out.println("------------------------------------------" + "\n");
					turnScore = 0;
					turn++;
					break;
				}
				else {
					System.out.println("oops Wrong Input!!!");
					System.out.println("Game Exited...!!!  Please Start Again");
					System.exit(0);
				}
					
			}while(die != 1);
			
			
		} //while close
			
	} // main method
	
	public static int getRandomInRange(int start, int end) {
	    return start + rand.nextInt(end - start + 1);

	  }

}
