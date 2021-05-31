public class Automovil extends Vehiculo
{
	protected String transmision;
	protected String marca;

	public Automovil(){}

	public Automovil (String cilindraje, int nLlantas, String transmision, String marca)
	{
		super(cilindraje, nLlantas); //Super toma lo que tenemos en el constructor al otro constructor
		this.transmision = transmision;
		this.marca = marca;
	}

	@Override
	public String toString()
	{
		return super.toString()+" \nLa transmision es: "+this.transmision+" \n la marca es: "+this.marca;
	}
}
