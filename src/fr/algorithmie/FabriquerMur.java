package fr.algorithmie;

public class FabriquerMur
{
	public static void main(String[] args)
	{
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}
	
	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur)
	{
		int max = 5 * nbBig + nbSmall; // max possible length
		
		if (max < longueur)
			return false; // Not enough Bricks
		
		int length = 0; // calculated length to try to attain longueur
		while(nbBig > 0 && length+5 <= longueur) // We use as many large bricks as possible
		{
			length += 5;
			nbBig--;
		}
		
		return length+nbSmall >= longueur; // We check if the rest is doable with smaller bricks
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
	{
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b)
			System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		else
			System.out.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") passant.");
	}
}
