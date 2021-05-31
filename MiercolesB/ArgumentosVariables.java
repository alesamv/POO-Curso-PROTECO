public class ArgumentosVariables
{
	public static void main(String[] args) 
	{
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;

		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		System.out.println("d4 = "+d4);

		System.out.println("El promedio de d1 y d2 es: "+promedio(d1,d2));
		System.out.println("El promedio de d1, d2 y d3 es: "+promedio(d1,d2,d3));
		System.out.println("El promedio de d1, d2, d3 y d4 es: "+promedio(d1,d2,d3,d4));
	}

	public static double promedio(double... numeros)
	{
		double total = 0.0;

		for (double elemento : numeros) 
			total += elemento;

		return total/numeros.length;
	}
}