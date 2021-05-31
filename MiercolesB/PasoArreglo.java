public class PasoArreglo
{
	public static void main(String[] args) 
	{
		int[] arreglo = {1, 2, 3, 4, 5};
		
		System.out.println("Efectos de pasar una referencia a un arreglo completo: \nLos valores del arreglo original son: ");

		//elementos originales
		for(int valor : arreglo)
			System.out.printf("    %d", valor);

		modificarArreglo(arreglo);
		System.out.println("\n\nLos valores del arreglo modificado son: ");

		//imprime elementos modificados
		for(int valor : arreglo)
			System.out.printf("    %d", valor);

		System.out.println("\n\n Efectos de pasar el valor de un elemento del arreglo");
		System.out.println("arreglo[3] antes de modificarElemento: " + arreglo[3]+"\n");

		modificarElemento(arreglo[3]); //intento por modificar arreglo[3]

		System.out.printf("arreglo[3] despues de modificar el elemento: %d\n", arreglo[3]);
	}

	public static void modificarArreglo(int[] arreglo2)
	{
		for (int contador = 0; contador < arreglo2.length; contador++) 
			arreglo2[contador] = arreglo2[contador] * 2;
	}

	public static void modificarElemento(int elemento)
	{
		elemento *= 2;
		System.out.println("Valor del elemento en modificarElemento: " + elemento);
	}
}