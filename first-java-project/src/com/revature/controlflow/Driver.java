package com.revature.controlflow;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		/*
		 * //Instantiate a scanner whose sole purpose is to read from the console
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * // prompt the user to enter their name
		 * System.out.println("Please type your name");
		 * 
		 * // capture their input as a String type String name = scan.next();
		 * 
		 * //prompt the user to enter the weather in degress outside in farenheit
		 * System.out.println("How's the weather (in degrees)");
		 * 
		 * // capture that calue as an int int temp = scan.nextInt();
		 * 
		 * scan.close();
		 * 
		 * // print it all out to the console System.out.println("Your name is " + name
		 * + "  and the weather is " + temp);
		 */

		/**
		 * 3 Main types of Control Flow statements
		 * 
		 * if / else
		 * if / else if
		 * ternary operator
		 */
		
		// if the weather is < 32, say "Its freezing!!"
		
		// if the weather is > 32 and less than 60, say "its kinda chilly"
		
		// otherwise the weather is great
		/*
		 * if (temp < 32) { System.out.println("Its freezing!");
		 * 
		 * } else if (temp == 32 || temp <= 60 ) {
		 * System.out.println("its kind of chilly");
		 * 
		 * } else System.out.println("The weather's fine");
		 */
	
	int monthNum = 7;
	
	switch(monthNum) {
	
	case 6: 
		System.out.println("The month is June");
		break;
	case 7:
		System.out.println("The month is July");
		break;
	default:
		System.out.println("Lazy dev, sorry didn't plan for so many months");
		
	}
	
	/**
	 * Tomorrow: Ternary Operators (total flex for if/else statements)
	 * While loops
	 * do-while loops
	 * for loops
	 * 
	 */
		boolean isHungry = true;
		
		// print out either LETS EAT or PASS not hungry
		
		System.out.println((isHungry) ? "LETS EAT!!!" : "Pass.. Not Hungry");
	
		//while condition is true do whatever is inside the brackets
		/*
		 * while (true) {
		 * 
		 * System.out.println("looping!");
		 * 
		 * }
		 */
		int counter =10;
		
		while (counter > 0) {
			
			System.out.println("The value of counter is ...." + counter);
			counter --; //decrease by one
		
		}
		
		boolean keepGoing = false;
		
		do {
			System.out.println("in the do while");
		} while (keepGoing);
		
		/**Statement 1 is where to begin
		 * Statement 2 is a condition that determines whether to keep going
		 * Statement 3 is executed everytime after the code block executes
		 */
		
		
		for (int i=0; i<=10; i++) {
			
			System.out.println("The value of i is " + i);
			
		}
		
	}

}
