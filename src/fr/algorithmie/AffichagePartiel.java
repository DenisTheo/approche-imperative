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
	}
}
