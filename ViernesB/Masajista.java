public class Masajista extends SeleccionFutbol
{
	int aniosExperiencia;
	String especialidad;
	
	public Masajista(String nombre, String apellidos, int edad, int id, int aniosExperiencia, String especialidad)
	{
		super(nombre,apellidos,edad,id);
		this.aniosExperiencia = aniosExperiencia;
		this.especialidad = especialidad;
	}

	@Override
	public void entrenar()
	{
		System.out.println("Estoy entrenando!!! Me siento poderoso!!! (Masajista)");
	}

	public void darMasajes()
	{
		System.out.println("Estoy masajeandooo!!! Poder al maximoooooo!!! (Masajista");
	}
}