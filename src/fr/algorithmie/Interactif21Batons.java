package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int matches = 21;
        int turn = 1;
        int choice = 0;

        while (matches > 0)
        {
        	try
            {// Pause between Turns for more Fluidity
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        	
            // Clears the Console
            clearConsole();

            // Display a Separator Between Turns
            displaySeparator();

            // Display turn number and Current Player
            System.out.println("Turn " + turn + " - Player's Turn!");

            // Display matchsticks at the beginning of the player's turn
            displayMatchsticks(matches);
        	
            if (choice != 0)// Tell what the CPU played last turn
            	System.out.println("Computer took " + choice + " matchstick(s).");

            // Player's turn
            choice = getPlayerChoice(scanner, matches);
            matches -= choice;
            
            if (matches <= 0)
                System.out.println("Sorry, you lost. Better luck next time!");
            else// Computer's Turn
            {
                // Display turn and player
                System.out.println("Turn " + turn + " - Computer's Turn...");

            	
	            clearConsole();
                // Update and display matchsticks after the player's choice
                displayMatchsticks(matches);
	            // Pause to simulate the Computer taking time to choose its move, and let the player see the remaining matchsticks

                System.out.println("You took " + choice + " matchstick(s).\n");

	            try
	            {
	                Thread.sleep(3000);
	            } catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	
	            // CPU move
	            choice = Math.min(matches, random.nextInt(3) + 1);
	            matches -= choice;
	
	            if (matches <= 0)
	                System.out.println("Congratulations! You won!");
	            else
	            	turn++;
            }
        }
        
        System.out.println("Game ended after " + turn + " Turns.");
    }

    private static void displayMatchsticks(int matches)
    {
        System.out.println("Remaining Matchsticks: " + matches);
        int bundles = (matches + 4) / 5; // Calculate the number of bundles needed
        for (int i = 0; i < bundles; i++)
        {
            int remainingMatches = Math.min(5, matches - i * 5);
            printInRed(" " + ".".repeat(remainingMatches));
            System.out.print("   ");
        }
        System.out.println();
        for (int i = 0; i < bundles; i++)
        {
            int remainingMatches = Math.min(5, matches - i * 5);
            printInYellow(" " + "|".repeat(remainingMatches));
            System.out.print("   ");
        }
        System.out.println();
        for (int i = 0; i < bundles; i++)
        {
            int remainingMatches = Math.min(5, matches - i * 5);
            printInYellow(" " + "|".repeat(remainingMatches));
            System.out.print("   ");
        }
        System.out.println();
    }

    private static void displaySeparator()
    {
        System.out.println("===================================================\n");
    }

    private static void printInRed(String text)
    {
        System.out.print("\u001B[31m" + text + "\u001B[0m");
    }

    private static void printInYellow(String text)
    {
        System.out.print("\u001B[33m" + text + "\u001B[0m");
    }

    private static void clearConsole()
    {// Sadly not Working on STS
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int getPlayerChoice(Scanner scanner, int matches)
    {
        int playerChoice;
        do
        {
            System.out.print("How many matchsticks do you want to take? (1-3): ");
            while (!scanner.hasNextInt())
            {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
            playerChoice = scanner.nextInt();
        } while (playerChoice < 1 || playerChoice > 3 || playerChoice > matches);

        return playerChoice;
    }

    private static String getPlayerTurn(int turn)
    {
        if (turn % 2 == 1)
        	return "Player's Turn";
        else
        	return"Computer's Turn";
    }
}
