import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemHashMap
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<Integer, String>();

		map.put(1, "Casillas");
		map.put(15, "Ramos");
		map.put(3, "Pique");
		map.put(5, "Puyol");
		map.put(11, "xabi alonso");

		Iterator it = map.keySet().iterator();
		Integer key;

		while(it.hasNext())
		{
			key = (Integer) it.next();
			System.out.println("clave: "+key+" ->valor: "+map.get(key));
		}

		System.out.println("Trabajando con los metodos de Map");
		System.out.println("Mostrando el numero de elementos que tiene el HashMap: " +map.size());
		System.out.println("Vemos si el HashMap esta vacio: "+map.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 5" +map.get(5));
		System.out.println("Borramos un elemento del Map(el 15)"+map.remove(15));
		System.out.println("Vemos que pasa si queremos obtener la clave 15 que ya no existe"+map.get(15));
		System.out.println("Vemos si existe un elemento con la clave 15"+map.containsKey(15));
		System.out.println("Vemos si existe un elemento con la clave 1"+map.containsKey(1));
		System.out.println("Vemos si existe el valor 'Casillas' en el Map"+map.containsValue("Casillas"));
		System.out.println("Vemos si existe el valor 'Ronaldo' en el Map" + map.containsValue("Ronaldo"));
		System.out.println("Borramos todos los elementos del Map");
		map.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño"+ map.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio" +map.isEmpty());
	}
}