package com.aurionpro.assignments;

import java.util.Arrays;

public class ArrayStatistics {
	public static void main(String[] args) {
		
		int sum = 0;         // for Stroring sum of all array ele
		boolean visited[] = new boolean[args.length];
		int arr[] = new int[args.length];   // for converting String to int array
		for(int i=0; i<arr.length; i++) {   // conversion of Array from String to int 
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.print("Array elements Converted into integer are : ");
		System.out.println(Arrays.toString(arr));
		
		int min = arr[0];    //Stroring minimum Value
		int max = arr[0];    //Stroring Maximium value		
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Sum of Array Elements are : "+ sum);
		System.out.println("Avarage of Array Elements are : "+ (float) sum/arr.length);
		
		for(int i=0; i<arr.length-1; i++) {   //finding min and max value from an array
			if(min  > arr[i+1]) {
				min = arr[i+1];
			}
			if(max < arr[i+1]) {
				max = arr[i+1];
			}
		}
		System.out.println("Minimum Element in an Array is : "+  min);
		System.out.println("Maximum Element in an Array is : " + max);
		
		Arrays.sort(arr);
		System.out.println("Sorted Array elements are : "+ Arrays.toString(arr));
		
		if(arr.length % 2 == 0) {    //finding mediaun
			System.out.println("Median of an Array is : "+ arr[(arr.length-1)/2]);
		}
		else {
			System.out.println("Median of an Array is : "+ arr[(arr.length)/2]);
		}
		
		System.out.print("Value : Occurences = [ ");
		for(int i=0; i<arr.length; i++) { //logic for finding no of occurences of each element
			int occurences = 1;
			if(visited[i] != true) {
				visited[i] = true;
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						if(visited[j] != true) {
							occurences++;
							visited[j]=true;
						}
					}
				}
				System.out.print( + arr[i] +":"+ occurences +"  " );
			}
		}
		System.out.println(" ]");
	}
}
