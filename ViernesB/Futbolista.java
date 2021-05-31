/**
*Clase futbolista 
*/
public class Futbolista extends SeleccionFutbol implements Cantante,Cocinero
{
	String posicion;
	int numDorsal;

	/**
	*Constructor de clase
	* @param nombre dvfdrvrf
	* @param apellidos erferf
	* @param edad ervgferftr4
	* @param id e4ferf
	* @param posicion efreffr
	* @param numDorsal 3dew2s43dr
	*/
	public Futbolista(String nombre, String apellidos, int edad, int id, String posicion, int numDorsal)
	{
		super(nombre, apellidos, edad, id);
		this.posicion = posicion;
		this.numDorsal = numDorsal;
	}

	@Override
	public void entrenar()
	{
		System.out.println("Estoy entrenando!!! Siente el podeeeeeer!!!!!! (Clase Futbolista)");
	}

	public void jugar()
	{
		System.out.println("Estoy jugando!!! Yuupiii!!! (Clase Futbolista)");
	}

	//Sobreescribimos métodos de interfaz Cantante
	public void cantar(String cancion)
	{
		System.out.println("Estoy cantando: "+cancion);
	}

	public void bailar()
	{
		System.out.println("Estoy bailando");
	}

	//Sobreescribimos métodos de interfaz cocinero
	public void cocinar(String comida)
	{
		System.out.println("Estoy cocinando: "+comida);
	}

	public void lavarTrastes()
	{
		System.out.println("Me toco lavar trastes :'(");
	}
}