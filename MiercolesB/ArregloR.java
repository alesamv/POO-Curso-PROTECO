import java.util.Random;
public class ArregloR
{
	public static void main(String[] args) 
	{
		Random numerosAleatorios = new Random();

		//Declaracion y creacion de un arreglo
		int[] arreglo = new int[10];

		for(int contador=0; contador < arreglo.length; contador++)
		{
			arreglo[contador] = numerosAleatorios.nextInt(6);
		}

		System.out.println("Indice      Valor");

		for(int contador=0; contador < arreglo.length; contador++)
		{
			System.out.printf("%5d%8d\n", contador, arreglo[contador]);
		}
	}
}