/**
* Clase abstracta de Seleccion de Futbol
*/


public abstract class SeleccionFutbol
{
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected int id;

	public SeleccionFutbol(String nombre, String apellidos, int edad, int id)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.id = id;
	}

	/**
	*Getter de nombre
	*@return nombre
	*/

	public String getNombre()
	{
		return nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void viajar()
	{
		System.out.println("Estoy viajando!!! Yupi!! (Clase Padre)");
	}

	public void asistirPartido()
	{
		System.out.println("Estoy llegando al estadio!! (Clase Padre)");
	}

	public abstract void entrenar();
}