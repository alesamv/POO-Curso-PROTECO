import java.util.Scanner;

public class MayorYMenor
{
	public static void main(String[] args) 
	{
		System.out.println("\"Mayor, numero medio, y menor, de tres numeros\"");
		float a=0, b=0, c = 0;
		
		Scanner scaner = new Scanner(System.in);

		System.out.print("Ingresa el primer numero: ");
		a = scaner.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		b = scaner.nextInt();
		System.out.print("Ingresa el tercer numero: ");
		c = scaner.nextInt();


		if (a>=b&&a>c) 
		{
			if (b>=c)
			{
				System.out.println("Numero mayor: " + a);
				System.out.println("Numero de en medio: " + b);
				System.out.println("Numero menor: " + c);				
			}
			else
			{
				System.out.println("Numero mayor: " + a);
				System.out.println("Numero de en medio: " + c);
				System.out.println("Numero menor: " + b);
			}
		}
		else if (b>= a&&b>=c)
		{
			if (a>=c) 
			{
				System.out.println("Numero mayor: " + b);
				System.out.println("Numero de en medio: " + a);
				System.out.println("Menor: " + c);
			}
			else
			{
				System.out.println("Numero mayor: " + b);
				System.out.println("Numero de en medio: " + c);
				System.out.println("Numero menor: " + a);
			}
		}
		else if(a>=b)
		{
			System.out.println("Numero mayor: " +c);
			System.out.println("Numero de en medio: " +a);
			System.out.println("Numero menor: " +b);
		}
		else
		{
			System.out.println("Numero mayor: " +c);
			System.out.println("Numero de en medio: " +b);
			System.out.println("Numero menor:" +a);
		}
	}
}