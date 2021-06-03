import java.util.*;

public class EjemploHashSet
{
	public static void main(String[] args) 
	{
		HashSet<String> s1 = new HashSet <String>();

		s1.add("Hola");
		s1.add("hola amigo");
		s1.add("Encantado de conocerte");
		s1.add("Adios");

		s1.add("Adios"); //Intentamos añadir un duplicado

		System.out.println("Numero de Elementos: " +s1.size() + "\n");

		Iterator i = s1.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}