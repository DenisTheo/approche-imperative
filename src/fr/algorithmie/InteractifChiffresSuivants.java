package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		int nb = 0;
		
		do
		{// This part is exactly the same as the prior Exercise
			System.out.println("Please enter a number between 1 and 10:");
			nb = scanner.nextInt() ;
		}while(nb < 1 || nb > 10);
		System.out.println("You entered " + nb + ".\n");
		
		System.out.print("The Following 10 Numbers are:");
		for(int i=1; i<=10; i++)
			System.out.print(" " + (nb+i));
		System.out.print(".\n");
	}
}
