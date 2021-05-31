public class Deportivo extends Automovil
{
	protected String tuneado;
	protected String carreras;

	public Deportivo(){}

	public Deportivo(String cilindraje, int nLlantas, String transmision, String marca, String tuneado, String carreras)
	{
		super(cilindraje, nLlantas, transmision, marca);
		this.tuneado = tuneado;
		this.carreras = carreras;
	}

	@Override
	public String toString()
	{
		return super.toString()+"\nEl deportivo esta tuneado con: "+this.tuneado+" \n y es para: "+this.carreras;
	}
}