import java.util.Scanner;
public class PruebaIF 
{
	public static void main(String[] args)
	{
		System.out.println("Toma de desicion con if");
		int a=0, b=0, c=0;

		Scanner scaner = new Scanner(System.in);

		System.out.print("Ingresa la variable a: ");
		a = scaner.nextInt();

		System.out.print("Ingresa la variable b: ");
		b = scaner.nextInt();

		System.out.print("Ingresa la variable c: ");
		c = scaner.nextInt();

		if (a > b && a > c)
		{
			System.out.println( a + "es mayor que" + b +"y"+c);
		}
		else
		{
			System.out.println( a + "es meor que los demas");
		}

	}
}