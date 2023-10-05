package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre
{
	private int[] collection;
	
	public InteractifStockageNombre()
	{
		collection = new int[1];
	}
	
	public static void main(String[] args)
	{
		InteractifStockageNombre test = new InteractifStockageNombre();
		test.Menu();
	}
	
	public void Menu()
	{
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		boolean valid;
		
		do
		{// User chooses an option
			System.out.println("MENU");
			System.out.println("1. Add a Number");
			System.out.println("2. See my Numbers");
			System.out.println("0. Quit");
			valid = true;
			
			try
			{
				input = scanner.nextInt();
			}catch(Exception e)
			{
				scanner.nextLine();
				valid = false;
			}
		}while(!valid || input != 1 && input != 2 && input != 0);
		
		switch(input)
		{
			case 1:
				AddNumber();
				Menu();
			case 2:
				Display();
				Menu();
			case 0:
				return;
			default:
				System.out.println("Not sure evrything went fine over here...");
				Menu();
		}
	}
	
	public void AddNumber()
	{
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Please enter a Number to add to your Collection:\nYou can type anything other than an integer to go back to the menu.\n");
		
		try
		{
			input = scanner.nextInt();
		}catch(Exception e)
		{
			scanner.nextLine();
			return;
		}
		
		collection[collection.length-1] = input;
		// Adds space in the current array for one more number
		collection = Arrays.copyOf(collection, collection.length+1);
	}
	
	public void Display()
	{
		System.out.print("Your Collection of Numbers:\n{");
		for(int i=0; i<collection.length-1; i++)// The last slot is always empty
		{
			System.out.print(collection[i]);
			
			if (i < collection.length-2)
				System.out.print(", ");
		}
		System.out.print("}\n\n");
	}
}
