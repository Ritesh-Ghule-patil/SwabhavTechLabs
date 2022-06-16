package com.aurionpro.assignments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number For Which You Want TO Find Factorial : ");
	
		int number = sc.nextInt();
		int find = number;
		int factorial=1;
		
		while(number>0) {
			factorial *= number;
			number--;
		}
		
		System.out.println("Factorial of "+ find + " is : "+ factorial);
		
	}
}
