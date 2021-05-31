public class Materias
{
	private String nombreMateria = "Sin Nombre";
	private int calificacion = 0;

	//Constructor vacio
	public Materias(){}

	public Materias(String nombreMateria, int calificacion)
	{
		this.nombreMateria = nombreMateria;
		this.calificacion = calificacion;
	}

	public void mostrarDatos()
	{
		System.out.println("Nombre: " + nombreMateria);
		System.out.println("Calificacion: " + calificacion);
	}

	public void setNombreMateria(String nombreMateria)
	{
		this.nombreMateria = nombreMateria;
	}

	public void setCalificacion(int calificacion)
	{
		this.calificacion = calificacion;
	}

	public String getNombreMateria()
	{
		return nombreMateria;
	}

	public int getCalificacion()
	{
		return calificacion;
	}
}