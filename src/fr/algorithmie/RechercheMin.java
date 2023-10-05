package fr.algorithmie;

public class RechercheMin
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public static void main(String[] args)
	{
		// The default minimum is the first value or array, so we don't arbitrarily assign a value.
		int min = array[0];
		
		// Simple loop to check everything in array and compare it with the maximum found so far
		for(int i=0; i<array.length; i++) // we could skip i=0, but if the array was of length 1 it'd be an issue.
			if (array[i] < min)
				min = array[i];
		
		// Simple Display of the Answer
		System.out.println("Lowest value is " + min + ".");
	}
}
