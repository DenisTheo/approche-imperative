package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		int[] nb = new int[10]; // we fill an array instead
		
		for(int i=0; i<10; i++)// Asking 10 times
		{
			boolean valid; // checks if the value entered could be parsed as an integer
			
			do
			{
				valid= true;
				System.out.println("Please enter a number between 1 and 10:\n(" + i + " already entered)");
				try
				{
					nb[i] = scanner.nextInt() ;
				}catch(Exception e)
				{
					scanner.nextLine();
					valid = false;
					System.out.println("That wasn't a number, please try again.");
				}
			}
			while(!valid);
			System.out.println("You entered " + nb[i] + ".\n");
		}
		
		// Same as a previous exercise
		int max = nb[0];
		for(int i=0; i<10; i++)
			if (nb[i] > max)
				max = nb[i];
				
		// Simple Display of the Answer
		System.out.println("Highest value you entered is " + max + ".");
	}
}
