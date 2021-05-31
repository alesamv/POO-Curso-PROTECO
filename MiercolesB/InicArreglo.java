import java.util.Scanner;

public class InicArreglo
{
	public static void main(String[] args) 
	{
		int[] arreglo; //declara un arreglo llamado "arreglo"
		arreglo = new int[10]; //Inicializa el arreglo

		Scanner teclado = new Scanner(System.in);

		for (int contador = 0; contador < arreglo.length; contador++) 
		{
			System.out.print("Elemento "+contador+" :");
			arreglo[contador] = teclado.nextInt();			
		}

		System.out.printf("%8s%8s\n","Indice","Valor");
		
		//Recorre el arreglo e imprime el valor de cada elemento en el arreglo
		for(int contador =0; contador < arreglo.length; contador++)
			System.out.printf("%8d%8d\n",contador, arreglo[contador]);
	}
}