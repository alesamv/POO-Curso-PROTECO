public class AgendaPersonas
{
	private String nombre = "Sin nombre";
	private String telefono = "Sin telefono";
	private String direccion = "Sin direccion";
	private String correo = "Sin correo";

	public void mostrarContacto()
	{
		System.out.println("\nNombre: "+nombre);
		System.out.println("Telefono: "+telefono);
		System.out.println("Direccion "+direccion);
		System.out.println("Correo: "+correo);
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public void setCorreo(String correo)
	{
		this.correo = correo;
	}
}
