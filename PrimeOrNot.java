package com.aurionpro.assignments;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number To Check Whether it Is Prime or Not : ");
		
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Please Enter the Positive integer");
		}
		else if(number==0 || number ==1) {
			System.out.println(number + " is not a prime nor a composite number");
		}
		else {
			int i=2;
			boolean flag = false;
			while(i*i <=number) {
				if(number%i==0) {
					flag = true;
				}
				i++;
			}
			if(flag==true) {
				System.out.println(number +" : is not Prime number");
			}
			else {
			System.out.println(number +" : is Prime number");
			}
		}
	}
}
