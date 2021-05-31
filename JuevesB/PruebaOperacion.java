public class PruebaOperacion
{
	public static void main(String[] args) 
	{
		Suma suma1 = new Suma();
		suma1.pedirDato1();
		suma1.pedirDato2();
		suma1.operar();
		suma1.mostrarResultado();

		Resta resta1 = new Resta();
		resta1.pedirDato1();
		resta1.pedirDato2();
		resta1.operar();
		resta1.mostrarResultado();

	}
}