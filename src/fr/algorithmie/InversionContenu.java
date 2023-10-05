package fr.algorithmie;

public class InversionContenu
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public static void main(String[] args)
	{
		int temp = array.length-1; // temporary variable mainly used for the copy to avoid calculating it multiple times
		
		// Loop to display array's content. Should look like this:
		// "array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}."
		System.out.print("array = {");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
			
			if (i < temp)
				System.out.print(", ");
		}
		System.out.print("}.\n\n");

		int[] arrayCopy = new int[array.length]; // Initialises arrayCopy to have the same length as array
		// Simple loop counting backwards to copy array's content into arrayCopy
		for(int i=0; i<temp; i++)
			arrayCopy[i] = array[temp-i]; // arrayCopy's slot ascending while array's descending

		// Loop to display arrayCopys's content. Should look like this:
		// "arrayCopy = {-4, 14, 0, 3, 2, 17, -1, 7, 28, -2, 4, 7, 8, 0, -3, 15, 1}."
		System.out.print("arrayCopy = {");
		for(int i=0; i<arrayCopy.length; i++)
		{
			System.out.print(arrayCopy[i]);
			
			if (i < temp) // Cheating a bit there, using array's length-1 instead of arrayCopy's -1, but they should be the same anyway
				System.out.print(", ");
		}
		System.out.print("}.\n\n");
	}
}
