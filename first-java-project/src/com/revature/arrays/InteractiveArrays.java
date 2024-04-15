package com.revature.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InteractiveArrays {
	
	//static = global 
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] establishedArray = getIntegers(5);
		
		scan.close();
		
		System.out.println(Arrays.toString(establishedArray));
		
		
	}
	
	/**
	 * Create a method that does the following
	 * 
	 *- static method (available at the class level - I dont need to instantiate the class to use the method)
	 *- return type will be int[]
	 *- prompt the user to enter x numbers
	 *- store each number in the array
	 */
	
	static int[] getIntegers(int capacity) {
		
		System.out.println("Please enter " + capacity + "numbers:");
		
		//initialize the array
		int [] arr = new int [capacity];
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println("Enter the " + (i+1) + " number:");
			
			arr[i] = scan.nextInt(); 
			
		}
		
		
		
		return arr;
		
		
	}
	
	/*
	 *CHALLENGE:
	 *Create a static method that takes in an int array as a parameter. It must return the average of all the elemetns within the array (Make its return type a double) 
	 * 
	 * 
	 * 
	 *  
	 */
	
	
	
	static int sum (int x, int y) {
		
		return x + y;
		
	}
	
	
	
}
