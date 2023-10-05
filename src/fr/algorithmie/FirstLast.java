package fr.algorithmie;

public class FirstLast
{
	public static void main(String[] args)
	{
		int[] array0 = {};
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 1};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6};
		int[] array3 = {6};

		Check(array0, '0');
		Check(array1, '1');
		Check(array2, '2');
		Check(array3, '3');
	}
	
	// Simple class to simplify the condition check reading in main
	private static void Check(int[] array, char id)
	{
		System.out.print("array" + id + " = {");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		
			if (i < array.length-1)
				System.out.print(", ");
		}// Displaying result of Check along with the usual end of display
		System.out.print("}.\nFirstLast Check: " + (array.length>1 && array[0]==array[array.length-1]) + ".\n\n");
	}
}
