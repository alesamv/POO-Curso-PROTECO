public class Vehiculo
{
	protected String cilindraje;
	protected int nLlantas;

	public Vehiculo(){}

	public Vehiculo(String cilindraje, int nLlantas)
	{
		this.cilindraje = cilindraje;
		this.nLlantas = nLlantas;
	}

	@Override //Sobreescribir metodo
	public String toString()
	{
		return "Cilindraje: "+this.cilindraje+ " \n Num Llantas: "+this.nLlantas;
	}
}