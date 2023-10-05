package fr.algorithmie;

public class AffichageInverse
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

	public static void main(String[] args)
	{
		int[] arrayCopy = new int[array.length];
		
		System.out.print("args = {");
		for(int i=0; i<array.length; i++)
		{
			arrayCopy[i] = array[i];
			System.out.print(array[i]);
			
			if(i < array.length-1)
				System.out.print(' ');
		}
		System.out.print("};\n\n");

		System.out.print("ordre inverse:\n");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]);
			
			if(i > 0)
				System.out.print(' ');
		}		
	}
}
