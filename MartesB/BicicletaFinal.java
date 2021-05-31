public class BicicletaFinal
{
	final int limiteDeVelocidad = 60;

	public void run()
	{
		limiteDeVelocidad = 400;
	}

	public static void main(String[] args) 
	{
		BicicletaFinal bf = new BicicletaFinal();
		bf.run();		
	}
}