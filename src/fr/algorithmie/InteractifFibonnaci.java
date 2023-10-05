package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		boolean valid;
		
		do
		{// User chooses a number
			valid = true;
			System.out.println("Please enter a number (>=2):");
			try
			{
				n = scanner.nextInt();
			}catch(Exception e)
			{
				scanner.nextLine();
				valid = false;
				System.out.println("That wasn't a number, please try again.");
			}
		}while(!valid || n < 2);
		
		int[] sequence = new int[n];
		sequence[0] = 1;
		sequence[1] = 2;
		
		if (n >= 3)
			for(int i=2; i<n; i++)
				sequence[i] = sequence[i-2] + sequence[i-1];
		
		System.out.print("Here are the " + n + " First numbers in the Fibonnaci Sequence:\n\n{");
		for(int i=0; i<sequence.length; i++)// The last slot is always empty
		{
			System.out.print(sequence[i]);
			
			if (i < sequence.length-1)
				System.out.print(", ");
		}
		System.out.print("}.\n\n");
	}
}
