package fr.algorithmie;

public class SommeDeTableauxDiff
{
	private static int[] arrayA = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	private static int[] arrayB = {-1, 12, 17, 14, 5, -9, 0, 18 };
	
	public static void main(String[] args)
	{
		int[] array = new int[arrayA.length];
		
		for(int i=0; i<arrayA.length; i++) // Exercise tells us arrayA is longer than arrayB
			if (i < arrayB.length)
				array[i] = arrayA[i] + arrayB[i];
			else
				array[i] = arrayA[i];
		
		// Display of the final array's content
		System.out.print("The sum of both arrays:\narray = {");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
			
			if (i < array.length-1)
				System.out.print(", ");
		}
		System.out.print("}.\n\n");
	}
}
