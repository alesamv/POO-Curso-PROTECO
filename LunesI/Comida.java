import java.util.Scanner;

public class Comida
{
	public static void main(String[] args) 
	{
		String comida;
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Escribe el nombre de alguna comida, presione s para salir");
			//leemos la cadena
			comida= entrada.nextLine();
			if(comida.equals("s"))
				break;
			try{
				revisaComida(comida);
			} catch (BuenaComidaExcepcion bce){
				System.out.println(bce.getMessage());
			}
		} while(!comida.equals("s"));
		System.out.println("Adios...");
	}

	//Este metodo revisara si la comida es buena o mala
	public static void revisaComida(String comida) throws BuenaComidaExcepcion
	{
		if(comida.equalsIgnoreCase("brocolito") || comida.equalsIgnoreCase("espinacas"))
			throw new BuenaComidaExcepcion();
		else
			System.out.println("Yumi yumi :B\n");
	}
}