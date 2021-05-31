public class PruebaAgendaPersonas
{
	public static void main(String[] args) 
	{
		AgendaPersonas p1 = new AgendaPersonas();
		AgendaPersonas p2 = new AgendaPersonas();

		p1.setNombre("Carlos");
		p1.setTelefono("556657899");
		p1.setDireccion("Lo que sea");
		p1.setCorreo("algo@gmail.com");

		p1.mostrarContacto();

		p2.setNombre("Juan");
		p2.setTelefono("55000099");
		p2.setDireccion("Lo que sea");
		p2.setCorreo("algo2@gmail.com");

		p2.mostrarContacto();
	}
}