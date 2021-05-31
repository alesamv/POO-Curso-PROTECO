public class Chopper extends Motocicleta
{
	protected String horquilla;
	protected String farosAuxiliares;

	public Chopper(){}

	public Chopper(String cilindraje, int nLlantas, String transmision, String marca, String horquilla, String farosAuxiliares)
	{
		super(cilindraje, nLlantas, transmision, marca); //Super toma lo que tenemos en el constructor al otro constructor
		this.horquilla = horquilla;
		this.farosAuxiliares = farosAuxiliares;
	}

	@Override
	public String toString()
	{
		return super.toString()+" \nLa horquilla es de: "+this.horquilla+" \nY los faros auxiliares son: "+this.farosAuxiliares;
	}
}