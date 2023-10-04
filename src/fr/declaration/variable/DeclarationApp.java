package fr.declaration.variable;

public class DeclarationApp
{
	public static void main(String[] args)
	{
		byte value_byte = 1;
		short value_short = 4;
		int value_integer = 64;
		long value_long = 42_666_000;
		float value_float = 3.14F;
		double value_double = 3.14159;
		boolean value_boolean = true;
		char value_character = 'N';
		String value_string = "Lorem Ipsum [...]";
		
		String randomString = "Voici le résultat d'un calcul:\n1+5=6";
		System.out.println(randomString);
	}
}
