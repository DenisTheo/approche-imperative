package fr.algorithmie;

public class AffichagePartiel
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public static void main(String[] args)
	{
		// Loop for array's content that's superior to 3.
		System.out.print("superior to 3:");
		for(int i=0; i<array.length; i++)
			if (array[i] > 3)
				System.out.print(" " + array[i]);
		System.out.print("\n\n");

		// Loop for array's content that's even.
		System.out.print("Even Numbers:");
		for(int i=0; i<array.length; i++)
			if (array[i]%2 == 0)
				System.out.print(" " + array[i]);
		System.out.print("\n\n");

		// Loop for array's content with an even index.
		System.out.print("Even Index Numbers:");
		for(int i=0; i<array.length; i++) // Exercise asks to check and not do i+=2.
			if (i%2 == 0)
				System.out.print(" " + array[i]);
		System.out.print("\n\n");

		// Loop for array's content that's odd.
		System.out.print("Odd Numbers:");
		for(int i=0; i<array.length; i++)
			if (array[i]%2 == 1)
				System.out.print(" " + array[i]);
		System.out.print("\n\n");
	}
}
