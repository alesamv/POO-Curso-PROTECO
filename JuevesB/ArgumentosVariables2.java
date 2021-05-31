public class ArgumentosVariables2
{
	public static void main(String[] args) 
	{
		tabla('c',6,1,4,99,4,100,5,5,5,3,90,0);	
	}

	public static void tabla(int multiplicador, int... numeros)
	{
		System.out.println("La tabla es: \n");
		for(int aux : numeros)
			System.out.println(multiplicador+ "x"+aux+"= "+multiplicador * aux);
	}

	public static void tabla(char c, int...numeros)
	{
		System.out.println("Entro en el otro metodo");
	}
}