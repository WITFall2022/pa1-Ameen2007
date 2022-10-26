package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this 
public class PA1a {
//new code
	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		int Yards;
		 System.out.printf("Enter Yards: "); 
		 Yards = input.nextInt();
		 
		 
		 int Feet;
		 System.out.printf("Enter Feet: ");
		 Feet= input.nextInt();
		 int Inches;
		 System.out.printf("Enter Inches: ");
		 Inches= input.nextInt();
		 int Sum;
		 
		
		 Sum = (Yards*36 + Feet* 12 + Inches*1);
		 System.out.printf( "The Sum is %d%n", Sum);
	}

}
