public class LineaComandos
{
	public static void main(String... numeros) 
	{
		if(numeros.length == 2)
		{
			System.out.println("Concatenacion: "+(numeros[0]+numeros[1]));

			int numero1 = Integer.parseInt(numeros[0]);
			int numero2 = Integer.parseInt(numeros[1]);

			System.out.println("Suma: "+(numero1+numero2));
		}
		else
		{
			System.out.println("Tienen que ser dos argumentos :'(");
				System.exit(0);
		}
		
	}
}