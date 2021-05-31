public class PokeFuego extends Pokemon
{
	double tamanio = 60.0;
	public PokeFuego(){}

	public PokeFuego(String nombre, double vida, double ataque, double tamanio)
	{
		super(nombre,vida,ataque);
		this.tamanio = tamanio;
	}

	public void ataqueEspecial(PokeFuego enemigo)
	{
		System.out.println(this.nombre + " esta atacandop a " + enemigo.nombre + " con lanzallamas");
		enemigo.vida -= this.ataque*1.4;
		if (this.tamanio > enemigo.tamanio)
		{
			enemigo.vida -= this.ataque*2;
		}
		else
		{
			System.out.println("El enemigo es mas grande, asi que regreso l glpe!!!");
			this.vida -= 10;
		}
	}
}