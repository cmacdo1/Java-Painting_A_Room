//***************************************************************
//File: Paint_WindowsDoors.java
// Name: Chris MacDonald
// Class: IFT 210
// Lab 2 Part 3
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height and to account
//for windows and doors
//***************************************************************

import java.util.Scanner;

public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal

		//declare integers length, width, height, doors and windows
		int length, width, height, doors, windows;

		//declare double totalSqFt;
		double totalSqFt;
		
		//declare double paintNeeded;
		double paintNeeded;

		//declare and initialize Scanner object
		Scanner scan = new Scanner(System.in);

		//Prompt for and read in the length of the room
		System.out.print("Enter length of the room: ");
		length = scan.nextInt();

		//Prompt for and read in the width of the room
		System.out.print("Enter the width of the room: ");
		width = scan.nextInt();

		//Prompt for and read in the height of the room
		System.out.print("Enter the height of the room: ");
		height = scan.nextInt();
		
		
		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		totalSqFt = 2*(width*height) + 2*(length*height);
		
		//get doors and windows
		System.out.print("Enter the number of doors: ");
		doors = scan.nextInt();
		System.out.print("Enter the number of windows: ");
		windows = scan.nextInt();
		
		totalSqFt = totalSqFt - (doors * 20) - (windows * 15);

		//Compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE;
		
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		
		System.out.println("\nLength= " + length + "\nWidth= " + width + 
				"\nHeight= " + height + "\n\nGallons of paint needed= " + paintNeeded);
		
	}
}