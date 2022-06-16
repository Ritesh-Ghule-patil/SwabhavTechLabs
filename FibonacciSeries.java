package com.aurionpro.assignments;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number For Which You want Fibonacci Series : ");
		
		int number = sc.nextInt();
		System.out.print("Fibonacci Series for "+number +" is : [ ");
		int first = 0;
		int second = 1;
		
		if(number == 0)
		{ 
			System.out.println(first + " ]");
		}
		if(number == 1) {
			System.out.println(first + " , "+ second + " ]");
		}
		else {
			System.out.print(first + " , " + second );
			while(number > 1) {
				int next = first + second;
				System.out.print(" , " + next );
				first= second;
				second = next;
				number--;
			}
			System.out.print(" ]");
		}		
	}
}
