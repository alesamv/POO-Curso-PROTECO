public class PruebaFor
{
	public static void main(String[] args) 
	{
		int z=0;
		for(z=0; z<5;z++)
		{
			System.out.println("Z es: " +z);
		}

		System.out.println("\nCon while: ");
		z=0;
		while (z<5)
		{
			System.out.println("Z es: " + z);
			z++;
		}

		System.out.println("\nCon do while: ");
		z=0;
		do
		{
			System.out.println("Z es: " + z);
			z++;
		}
		while (z<5);
	}
}