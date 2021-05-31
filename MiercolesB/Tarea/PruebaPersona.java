public class PruebaPersona
{
	public static void main(String[] args) 
	{
		int horas; 
		String comida; 

		Persona p1 = new Persona("Daniel",15,50);
		Persona p2 = new Persona("Mariana",18,60);

		p1.hablar();
		System.out.println("Esta es tu informacion: ");
		p1.info();
		comida = "Pollo";
		horas = 10;
		p1.comer(comida);
		p1.dormir(horas);

		p2.hablar();
		System.out.println("Esta es tu informacion: ");
		p2.info();
		comida = "Verduras";
		horas = 8;
		p2.comer(comida);
		p2.dormir(horas);

	}
}