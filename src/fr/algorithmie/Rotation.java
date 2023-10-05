package fr.algorithmie;

public class Rotation
{
	private static int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
	
	public static void main(String[] args)
	{
		Display(array); // Display the un-rotated array

		// We could consider a way to check the Array is of at least length 2, but it's static here.
		int last = array[0];
		
		for(int i=1; i<array.length; i++)
		{// We set a temporary variable to remember the current value of array[i]
			int current = array[i]; // we could add/subtract the two other to avoid using that, but it'd cause issues if the sum was out of int's bounds...
			array[i] = last;
			last = current;
		}
		array[0] = last; // to edit the first one, that we skipped
		
		System.out.print("Rotated ");
		Display(array); // Display the rotated array
	}
	
	// Simple class to display an array's content
	private static void Display(int[] array)
	{
		System.out.print("array = {");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		
			if (i < array.length-1)
				System.out.print(", ");
		}
		System.out.print("}.\n\n");
	}
}
