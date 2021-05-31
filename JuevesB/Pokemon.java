public class Pokemon
{
	double vida = 100.0;
	String nombre = "";
	double ataque = 20.0;

	public Pokemon(){}

	public Pokemon(String nombre, double vida, double ataque)
	{
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}

	public void atacar(Pokemon enemigo)
	{
		enemigo.vida -= this.ataque;
	}
}