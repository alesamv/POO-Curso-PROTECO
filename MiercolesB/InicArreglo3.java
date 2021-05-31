public class InicArreglo3
{
	public static void main(String[] args) 
	{
		final int LONGITUD_ARREGLO = 10; //declara la constante
		int[] arreglo = new int[LONGITUD_ARREGLO];

		//Recorre el arreglo e imprime el valor de cada elemento en el arreglo
		for(int contador =0; contador < arreglo.length; contador++)
			arreglo[contador] = 2 + 2 * contador;
		
		System.out.printf("%8s%8s\n", "Indice", "Valor");

		for(int contador =0; contador < arreglo.length; contador++)
			System.out.printf("%8d%8d\n",contador, arreglo[contador]);
	}
}