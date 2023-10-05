package fr.algorithmie;

public class ComparaisonTableau
{
	private static int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
	private static int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

	public static void main(String[] args)
	{		
		// Loop for arrays' common content
		System.out.print("Common Content:");
		for(int i=0; i<array1.length; i++)
			for(int j=0; j<array2.length; j++)
				if (array1[i] == array2[j])
				{
					System.out.print(" " + array1[i]);
					continue; // we don't need to check the rest of array2
				}
		System.out.print(".\n\n");
	}
}
