public class PruebaAlumno
{
	public static void main(String[] args) 
	{
		Alumno a1 = new Alumno("Roberto",14);
		System.out.println("Se han inscrito: " +Alumno.getContador()+" personas.");
		Alumno a2 = new Alumno("Sofia", 21);
		System.out.println("Se han inscrito: " +Alumno.getContador()+" personas.");
		System.out.println("La persona 1 se llama : "+a1.getNombre()+" y tiene "+a1.getEdad());
	}
}