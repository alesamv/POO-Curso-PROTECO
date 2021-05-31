import java.util.ArrayList;

public class ExArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> nombres = new ArrayList<String>();
		System.out.println(nombres.isEmpty()); //para revisar si el array esta vacio8Verdadero o falso)
		nombres.add("Juanito"); //Agregar dato ".add"
		nombres.add("Roberto");
		//nombres.add(10,"Blanca");
		nombres.add(1,"Carlos");
		System.out.println("El elemento 0 es"+nombres.get(0));

		for(String aux : nombres)
			System.out.println(aux);
		

		if(nombres.contains("Juanito")) //Para revisar si existe en el array
			System.out.println("Si existe");
		else
			System.out.println("No existe");

		System.out.println(nombres.indexOf("Roberto")); //El indice del que queremos obtener el valor, devuelve la primer ocurrencia
		System.out.println(nombres.indexOf("Blanca")); //La ultima ocurrencia

		//nombres.lastIndexOf - devuelve la ultima ocurrencia

		nombres.remove(0); //El indice para el cual queramos borrar

		nombres.clear(); //Borra todo el array

		System.out.println(nombres.size());//Tamaño del array 
	}
}


