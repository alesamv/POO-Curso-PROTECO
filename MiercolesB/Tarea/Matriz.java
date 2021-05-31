import java.util.Random;
import java.util.Scanner;

public class Matriz
{
	public static void main(String[] args) 
	{
		int [][] matrizA = new int [2][2];
		int [][] matrizB = new int [2][2];
		int [][] matrizC = new int [2][2];

		System.out.println("\"Suma de Matrices\"");

		llenarDatos(matrizA);
		imprimirArreglo(matrizA);

		pedirDatos(matrizB);
		imprimirArreglo(matrizB);

		sumaDeMatrices(matrizC,matrizB,matrizA);
		imprimirArreglo(matrizC);
	}

	public static void llenarDatos(int[][] mA)
	{
		Random numerosAleatorios = new Random();
		System.out.println("\n-Se genero automaticamente la siguiente matriz: ");
		for (int fila = 0; fila < mA.length; fila++) 
		{
			for (int columna = 0; columna < mA[fila].length; columna++) 
			{
				mA[fila][columna] = numerosAleatorios.nextInt(12); 
			}
		}
	}
	
	public static void pedirDatos(int[][] mB)
	{
		System.out.println("\n-Datos de la segunda matriz");
		Scanner teclado = new Scanner(System.in);
		for (int fila = 0; fila < mB.length; fila++) 
		{
			for (int columna = 0; columna < mB[fila].length; columna++) 
			{
				System.out.print("Introduzca el elemento [" + fila + "," + columna + "]: ");
				mB[fila][columna] = teclado.nextInt();	
			}
		}
	}

	public static void sumaDeMatrices(int[][] mC, int[][] mB, int [][] mA)
	{	
		System.out.println("\nLa suma de las dos matrices es:");
		for (int fila = 0; fila < mC.length; fila++) 
		{
			for (int columna = 0; columna < mC.length; columna++) 
			{
				mC[fila][columna] = mB[fila][columna] + mA[fila][columna];							
			}			
		}
	}

	public static void imprimirArreglo(int [][] matriz)
	{
		for (int fila = 0; fila < matriz.length; fila++) 
		{
			for (int columna = 0; columna < matriz[fila].length; columna++) 
			{
				System.out.printf("%d ", matriz[fila][columna]);	
			}
			System.out.println();
		}
	}
}
