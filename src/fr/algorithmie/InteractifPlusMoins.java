package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins
{
	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		int turn = 0;
		boolean valid;
		
		int target = random.nextInt(1, 100) + 1; // random number between 1 and 100
		
		do
		{
			turn += 1; // counting new turn
			
			do
			{// User chooses a number
				valid = true;
				System.out.println("Please enter a number between 1 and 100:");
				try
				{
					nb = scanner.nextInt();
				}catch(Exception e)
				{
					scanner.nextLine();
					valid = false;
					System.out.println("That wasn't a number, please try again.");
				}
			}while(!valid || nb < 1 || nb > 100);
			System.out.print("You entered " + nb + ".\n");

			if(nb > target)
				System.out.print("It's greater than my number...");
			else if(nb < target)
				System.out.print("It's smaller than my number...");
		}while(nb != target);// Win condition
		
		System.out.println("\n\nCongratulations! you found the number " + target + " after " + turn + " tries.\n");
	}
}
