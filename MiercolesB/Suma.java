public class Suma
{
	public static void main(String[] args) 
	{
		int[] arreglo = {87, 95, 72, 11 ,100, 12, 482, 55, 76, 234, 544, 23};
		int total = 0;

		for (int contador = 0; contador < arreglo.length; contador++) 
		{
			total = total + arreglo[contador];
		}	

		System.out.printf("Suma de los elementos del arreglo: %d\n", total);

	}
}
