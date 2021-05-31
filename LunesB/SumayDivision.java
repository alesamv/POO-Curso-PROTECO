import java.util.Scanner;
public class SumayDivision
{
	public static void main(String[] args) 
	{
		System.out.println("Suma y Division de dos numeros");
		float a=0, b=0;
		float c=0;

		Scanner num = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		a=num.nextInt();
		System.out.println("Introduce el segundo numero");
		b=num.nextInt();

		c=a+b;
		System.out.println("L suma de los dos numeros es: " +c);

		if (b==0)
		{
			System.out.println("La division no se puede realizar");
		}
		else
		{
			c=a/b;
			System.out.println("La division es: " +c);

		}
	}
}