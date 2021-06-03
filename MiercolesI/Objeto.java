public class Objeto
{
	private int elemento;
	public Objeto(int elemento)
	{
		this.elemento = elemento;
		System.out.println("Se añade elemento: "+elemento);
	}

	public void getObjeto()
	{
		System.out.println("Se saca el elemento: "+elemento);
	}
}