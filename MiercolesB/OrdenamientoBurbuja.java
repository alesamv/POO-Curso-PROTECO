public class OrdenamientoBurbuja
{
	public static void main(String[] args) 
	{
		int[] arreglo = new int[] {2, 5, 1, 8, 45, 3, 6, 5, 4}; //arreglo a ordenar

		System.out.println("\nDatos desordenados");
		for (int i = 0; i < arreglo.length; i++ ) 
			System.out.println("\nNumero "+ (i+1)+ ": "+ arreglo [i]);

		//Manda a llamr al metodo burbuja
		burbuja(arreglo, arreglo.length);

		System.out.println("\n\nDatos ordenados: ");
		for (int i = 0; i < arreglo.length; i++ ) 
			System.out.println("\nNumero "+ (i+1)+ ": "+ arreglo [i]);

	}

	public static void burbuja(int []v, int indice)
	{
		int auxiliar; //variable auxiliar guardará un número temporalmente mientras se intercambian
		for(int i = 0; i < indice; i++) //Recorremos todo el arreglo
		{
			for(int j = 0; j < indice -1; j++) 
			{
				//Recorremos todo el arreglo una posicion antes que el ciclo anterior
				if(v[j] > v[j+1])//compara un elemento con su elemento adyacente
				{
					auxiliar = v[j];
					v[j]=v[j+1]; //Se hace intercambio de numeros
					v[j+1]=auxiliar; //regresamos el valor j que habiamos guardado en auxiliar, pero ahora en la posicion de la derecha
				}
			}

		}

	}
}