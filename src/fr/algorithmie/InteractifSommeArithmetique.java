package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		int nb = 0;
		boolean valid;
		
		do
		{// This part is exactly the same as the prior Exercise
			valid = true;
			System.out.println("Please enter a number between 1 and 10:");
			try
			{
				nb = scanner.nextInt();
			}catch(Exception e)
			{
				scanner.nextLine();
				valid = false;
				System.out.println("That wasn't a number, please try again.");
			}
		}while(!valid || nb < 1 || nb > 10);
		System.out.println("You entered " + nb + ".\n");
		
		int sum = 0;
		
		for(int i=1; i<=nb; i++)
			sum += i;
			
		System.out.println("Result: " + sum + ".");
	}
}
