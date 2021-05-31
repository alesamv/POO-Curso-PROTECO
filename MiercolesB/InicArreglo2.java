public class InicArreglo2
{
	//La lista inicializadora especifica el valor para cada elemento
	public static void main(String[] args) 
	{
		int [] arreglo = {32, 5, 12, 43, 67, 12334, 12, 42, 43, 11};

		System.out.printf("%8s%8s\n", "Indice", "Valor");

		//Recorre el arreglo e imprime el valor de cada elemento en el arreglo
		for(int contador =0; contador < arreglo.length; contador++)
			System.out.printf("%8d%8d\n",contador, arreglo[contador]);
	}
}