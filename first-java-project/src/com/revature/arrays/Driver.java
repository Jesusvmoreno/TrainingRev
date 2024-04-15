package com.revature.arrays;

import java.util.Arrays;

/**
 * An array is a container object that contains elements of one type
 * 
 * An array is static(not dynamic) - it can't increase or decrease in size)
 * 
 */

public class Driver {

	public static void main(String[] args) {
		// declare the type the array can hold
		int [] numbers;
		
		// (2) initialize the capacity
		numbers = new int[10];
		
		System.out.println(Arrays.toString(numbers)); 	
	
		//accessing elements
		// the last index will always be one less than the length of the array
		
		
		// I want to access the element and set it to 42
		numbers[1] = 42;
		System.out.println(Arrays.toString(numbers));
		
		// use a for loop to loop through this array and assign each element to 100 * its index
		
		for (int i=0; i <numbers.length; i++) {
				
				numbers[i] = i * 100;
		}
		
	//	System.out.println(Arrays.toString(numbers));
		//enchanced for loop
		for (int n : numbers) {
			
			System.out.println(n);
			
		}
		
		// how do we print out the 4th element
		System.out.println(numbers[3]);
		
		// we are searching for the number 900...
		//DS&A
		
		/**
		 * Linear Time Complexity
		 * if were looking for the value that happens to be at the end of the array
		 */
		
		for (int i=0; i<numbers.length; i++) {
			
			if (numbers[i] == 900) {
				System.out.println("Found 900");
				break;
			} else {
				continue;
			}
		}
		
		String[] fruits = {"kiwi", "apple", "guava", "orange"};
		
		System.out.println(Arrays.toString(fruits));
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		
	}
		
	
}
