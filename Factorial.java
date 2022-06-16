package com.aurionpro.assignments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number For Which You Want TO Find Factorial : ");
	
		int number = sc.nextInt();
		int find = number;
		if(number < 0) 
			number = number*-1;
		int factorial=1;
		
		while(number>0) {
			factorial *= number;
			number--;
		}
		if(find < 0) 
			System.out.println("Factorial of "+ find + " is : "+ factorial*(-1));
		
		else
			System.out.println("Factorial of "+ find + " is : "+ factorial);
	}
}
