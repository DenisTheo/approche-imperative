package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		boolean valid;
		
		do
		{// This part is exactly the same as the prior Exercise
			valid = true;
			System.out.println("Please enter a number:");
			try
			{
				nb = scanner.nextInt();
			}catch(Exception e)
			{
				scanner.nextLine();
				valid = false;
				System.out.println("That wasn't a number, please try again.");
			}
		}while(!valid);
		System.out.println("You entered " + nb + ".\n");
		
		System.out.print("The Following 10 Numbers are:");
		for(int i=1; i<=10; i++)
			System.out.print(" " + (nb+i));
		System.out.print(".\n");
	}
}
