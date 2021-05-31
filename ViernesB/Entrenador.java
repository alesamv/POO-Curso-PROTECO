public class Entrenador extends SeleccionFutbol
{
	int aniosExperiencia;
	int asistentes; 
	public Entrenador(String nombre, String apellidos, int edad, int id, int aniosExperiencia, int asistentes)
	{
		super(nombre,apellidos,edad,id);
		this.aniosExperiencia = aniosExperiencia;
		this.asistentes = asistentes;
	}

	@Override
	public void entrenar()
	{
		System.out.println("Estoy entrenando!!! Me siento poderoso!!! (Entrenador)");
	}

	public void dirigir()
	{
		System.out.println("Estoy dirigiendo :'v");
	}
}