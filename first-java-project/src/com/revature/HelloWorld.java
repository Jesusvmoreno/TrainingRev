package com.revature;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World from the IDE");
		
		boolean isCool = true; //boolean 1 bit representing true or false values (0 or 1)
		byte reallySmallNumber = 127; //8 bits (1 byte) or reserved memory -> max value is 127, min value is - 128
		short shortNumber = 32_767;
		char letter = 'h'; // 16 bits of memory that represent a character or an ASCII character's numeric value
		
		int standardNum = 10_000_000; // 32 bits of reserved mem (4 bytes)
		float lessPreciseDouble = 93.2f; // 32 bits of mem, allows to make decumal, but its less precise
		
		double decimal = 10_000_000.02; //64 bits of memory (8 bytes)
		long bigNumber = 12345678L; // 64 bits
		
		
		/**
		 * Casting
		 * 
		 * Type Casting is used to convert objects or variables of one type into another
		 * 
		 * Widen Casting (implicit) - happens automatically - Automatic Type Conversion you can assign
		 * a smaller primitive type to a larger type reference
		 * variable
		 * 
		 * Narrowing Casting (Explicit) - you need explicit conversion. Larger type convert to a smaller reference type
		 */
		
		byte a = 40;
		short b = a;
		
		int c = b;
		double d = c;
		
		double myDub = 900.9;
		int myInt = (int) myDub;
		// transforming a large data type into a smaller one
		
		// sysout + ctrl + space
		System.out.println(myInt);
		
		// What is the maximum value of int?
		
		// Wrapper Class
		Integer intObj1 = new Integer(20);
		Integer intObj2 = new Integer("20");
		
		
		System.out.println("The maximum value of an int is " + Integer.MAX_VALUE);
		
		//object equality
		System.out.println("Are intObj1 and intObj2 equal in value? " + intObj1.equals(intObj2));
		
		// how do we test that they share the same address in memory?
		System.out.println("Do intOb1 and int Obj2 share the same address in memory? AKA are they the same obj? " + (intObj1 == intObj2));
		
		
		
	}
	
}
