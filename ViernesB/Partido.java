import java.util.ArrayList;

public class Partido
{
	public static ArrayList<SeleccionFutbol> integrantesRealMadrid = new ArrayList<SeleccionFutbol>(); 

	public static void main(String[] args) 
	{	
		//ArrayList<SeleccionFutbol> integrantesRealMadrid = new ArrayList<SeleccionFutbol>(); Si funciona

		SeleccionFutbol elTuca = new Entrenador("Ricardo", "Ferretti", 63, 3, 30, 10);
		SeleccionFutbol ronaldo = new Futbolista("Cristiano", "Ronaldo", 33, 1, "Extremo por derecha", 7);
		SeleccionFutbol elMasajista7u7r = new Masajista("Raul", "Martinez", 45, 2, 10,"masajea piernas");

		integrantesRealMadrid.add(elTuca);
		integrantesRealMadrid.add(ronaldo);
		integrantesRealMadrid.add(elMasajista7u7r);

		System.out.println("---TODOS LLEGAN AL ESTADIO---");

		for (SeleccionFutbol integrante : integrantesRealMadrid) 
		{
			System.out.println(integrante.getNombre()+" "+integrante.getApellidos());
			integrante.asistirPartido();
		}
		
		System.out.println("---TODOS VIAJAN---");
		for(SeleccionFutbol integrante : integrantesRealMadrid)
		{
			System.out.println(integrante.getNombre()+" "+integrante.getApellidos());
			integrante.viajar();
		}

		System.out.println("---TODOS ENTRENAN---");
		for (SeleccionFutbol integrante : integrantesRealMadrid) 
		{
			System.out.println(integrante.getNombre()+" "+integrante.getApellidos());
			integrante.entrenar();
		}

		System.out.println("\nSIENTE EL PODEEEEEEEEEEEEEEEEEEEEEEEER!!!!!!!!");
	}
}