public class PruebaMaterias
{
	public static void main(String[] args) 
	{
		int c1,c2;
		Materias m1 = new Materias();
		Materias m2 = new Materias("Cinematica",5);

		/*Solo funciona si los atributos son publicos

		m1.nombreMateria = "Fisica";
		m1.calificacion = 7;
		*/

		m1.setNombreMateria("Fisica");
		m1.setCalificacion(7);



		m1.mostrarDatos();
		m2.mostrarDatos();

		c1=m1.getCalificacion();
		c2=m2.getCalificacion();

		c1++;
		c2++;

		System.out.println("Calificacion asignada 1: "+c1);
		System.out.println("Calificacion asignada 2: "+c2);

	}
}