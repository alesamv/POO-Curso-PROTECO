public class Arreglo4
{
	public static void main(String[] args) 
	{
		int[][] arreglo1 = {{1, 2, 3},{4, 5, 6}};
		int[][] arreglo2 = {{1,2}, {3}, {4,5,6}};
		int[][] arreglo3 = new int[5][4];

		System.out.println("Los valores en el arreglo por filas son: ");
		imprimirArreglo(arreglo1); //muestra el arreglo1 por filas

		System.out.println("Los valores en el arreglo2 por filas son: ");
		imprimirArreglo(arreglo2);
	}

	public static void imprimirArreglo(int [][] arreglo)
	{
		//itera a traves de las filas del arreglo
		for (int fila = 0; fila < arreglo.length; fila++) 
		{
			//iterar a traves de las columnas de la fila actual
			for (int columna = 0; columna < arreglo[fila].length; columna++) 
			{
				System.out.printf("%d ", arreglo[fila][columna]);	
			}
			System.out.println();//Salto de linea
		}
	}
}