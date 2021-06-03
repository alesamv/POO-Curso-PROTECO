import java.util.Scanner;

public class Cadena
{
	public static void main(String[] args) 
	{
		String cadena;
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingresa una cadena:\n Presiona x para salir");
			cadena = entrada.nextLine();

			if(cadena.equals("x"))
				break; 

			try{
				revisaCadena(cadena);
			} catch (CadenaMuyLarga cml) {
				System.out.println(cml.getMessage());	
			}
		} while(!cadena.equals("x"));
		System.out.println("Regresa pronto :B");
	}

	public static void revisaCadena(String cadena) throws CadenaMuyLarga
	{
		if(cadena.length() > 20 )
			throw new CadenaMuyLarga();
		else
			System.out.println("Cadena Aceptada :B\n");
	}
}