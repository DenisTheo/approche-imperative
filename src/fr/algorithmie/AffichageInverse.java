package fr.algorithmie;

public class AffichageInverse
{
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

	public static void main(String[] args)
	{
		System.out.println("args = {");
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i] + ' ');
		}
		System.out.println("};\n\n");

		System.out.println("ordre inverse:\n");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i] + ' ');
		}
		System.out.println(".\n\n");
	}
}
