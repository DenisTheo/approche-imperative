package fr.algorithmie;

public class SommeDeTableauxDiff
{
	private static int[] arrayA = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	private static int[] arrayB = {-1, 12, 17, 14, 5, -9, 0, 18 };
	
	public static void main(String[] args)
	{
		int total = 0;
		
		// Checking arrayA's content
		for(int i=0; i<arrayA.length; i++)
			total += arrayA[i];
		
		// Adding arrayB's content
		for(int i=0; i<arrayB.length; i++)
			total += arrayB[i];
		
		System.out.println("The sum of both arrays' content is " + total + ".\n");
	}
}
