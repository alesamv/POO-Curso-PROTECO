//Programa para imprimir una barra
/*Rango de calificaciones
	00-09 indice 0
	10-19 indice 1
	20-29 indice 2
	...
	100 indice 10
*/

public class GraficoBarras
{
	public static void main(String[] args) 
	{
		int[] arreglo = {20, 0, 18, 27, 14, 9, 1, 2, 4, 3, 5};
		System.out.println("Distribucion de calificaciones: \n");

		//imprime rango de la barra("00-09: ",..)
		for (int contador = 0; contador < arreglo.length; contador++) 
		{
			if(contador == 10)
				System.out.printf("%5d: ",100);
			else
				System.out.printf("%02d-%02d: ", contador * 10, contador *  10 + 9);

		//imprimir asteriscos
			for (int asterisco = 0; asterisco < arreglo[contador]; asterisco++) 
				System.out.print("*");
			
			System.out.println(); //para una nueva linea			
		}
	}
	
}