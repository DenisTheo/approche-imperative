package fr.algorithmie;

public class CalculMoyenne
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public static void main(String[] args)
	{
		int avg = 0;
		
		// Simple loop to add everything in array together
		for(int i=0; i<array.length; i++)
			avg += array[i];
		
		avg /= array.length; // We divide the sum by the number of elements to get an average
		
		// Simple Display of the Answer
		System.out.println("Average value is " + avg + ".");
	}
}
