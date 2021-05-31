public class PruebaSwitch
{
	public static void main(String[] args) 
	{
		System.out.println("Prueba Switch");
		int a=10;
		switch(a)
		{
			case 1:
				System.out.println("Fue 1");
			break;

			case 5:
				System.out.println("Fue 5");
			break;

			case 10:
				System.out.println("Fue 10");
			break;

			default:
				System.out.println("Ingrese un numero dentro del rango");
		}
	}
}