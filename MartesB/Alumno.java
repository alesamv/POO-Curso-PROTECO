public class Alumno
{
	private String nombre;
	private int edad;
	private static int contador = 0;

	public Alumno(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public int getEdad()
	{
		return edad;
	}

	public static int getContador()
	{
		return contador;
	}
}