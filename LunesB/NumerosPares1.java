import java.util.Scanner;

public class NumerosPares1
{
	static Scanner serie = new Scanner(System.in);
	static void SerieNum(int i,int n)
	{
		if(n>0)
		{
			System.out.println(i*2 + "");
			SerieNum(i+1, n-1);
		}
	}

	public static void main(String[] args) 
	{
		int n;
		System.out.print("Ingresa la cantidad: ");
		n= serie.nextInt();
		SerieNum(1,n);	
	}
}