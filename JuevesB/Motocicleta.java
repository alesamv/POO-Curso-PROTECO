public class Motocicleta extends Vehiculo
{
	protected String transmision;
	protected String marca;

	public Motocicleta(){}

	public Motocicleta (String cilindraje, int nLlantas, String transmision, String marca)
	{
		super(cilindraje, nLlantas); //Super toma lo que tenemos en el constructor al otro constructor
		this.transmision = transmision;
		this.marca = marca;
	}

	@Override
	public String toString()
	{
		return super.toString()+" \nLa transmision es: "+this.transmision+" \nLa marca es: "+this.marca;
	}
}