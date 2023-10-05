package fr.algorithmie;

public class AffichageInverse
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

	public static void main(String[] args)
	{
		int[] arrayCopy = new int[array.length]; // Initialises arrayCopy to have the same length as array
		
		// Loop to display array's content. Should look like this:
		// "array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}."
		System.out.print("array = {");
		for(int i=0; i<array.length; i++)
		{
			arrayCopy[i] = array[i]; // Also uses that loop to copy array's content into arrayCopy
			System.out.print(array[i]);
			
			if (i < array.length-1)
				System.out.print(", ");
		}
		System.out.print("}.\n\n");

		// Loop to display array's content. Should look like this:
		// "ordre inverse:
		// -4, 14, 0, 3, 2, 17, -1, 7, 28, -2, 4, 7, 8, 0, -3, 15, 1."
		System.out.print("ordre inverse:\n");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]);
			
			if (i > 0)
				System.out.print(", ");
		}
		System.out.print(".\n\n");
	}
}
