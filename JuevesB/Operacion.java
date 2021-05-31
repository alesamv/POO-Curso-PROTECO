import java.util.Scanner; 

public class Operacion
{
	protected int valor1, valor2, resultado;

	Scanner teclado = new Scanner(System.in);

	public void pedirDato1()
	{
		System.out.println("Ingresa el primer valor:");
		valor1 = teclado.nextInt();
	}

	public void pedirDato2()
	{
		System.out.println("Ingresa el segundo valor:");
		valor2 = teclado.nextInt();
	} 

	public void mostrarResultado()
	{
		System.out.println("Resultado = "+resultado);
	}
}

