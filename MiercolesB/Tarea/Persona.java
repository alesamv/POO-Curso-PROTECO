public class Persona
{
	public String nombre;
	public int edad;
	private int peso;

	public Persona(String nombre, int edad, int peso)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
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

	public void setPeso(int peso)
	{
		this.peso = peso;
	}
	public int getPeso()
	{
		return peso;
	}

	public void hablar()
	{
		System.out.println("\n¡Hola!");
	}

	public void comer (String comida)
	{
		System.out.println("La comida ingresada es: "+comida);
	}

	public void dormir(int horas)
	{
		System.out.println("Las horas de suenio ingresadas son: "+horas);
	}

	public void info()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Peso: "+peso);
	}
}