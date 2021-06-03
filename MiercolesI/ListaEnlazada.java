import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class ListaEnlazada
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);

		int opc, x;

		LinkedList listaEnlazada1 = new LinkedList();

		do
		{
			System.out.println("\tSeleccione una opcion \n");
			System.out.println("Opciones de la lista enlazada");
			System.out.println("1. Insertar al inicio de la lista");
			System.out.println("2. Insertar al final de la lista");
			System.out.println("3. Borrar al inicio");
			System.out.println("4. Borrar al final");
			System.out.println("5. Mostrar la lista");
			System.out.println("6. Borrar toda la lista");
			System.out.println("7. Salir");

			opc = teclado.nextInt();

			switch(opc)
			{
				case 1:
					System.out.println("Ingrese un numero: ");
					x = teclado.nextInt();
					listaEnlazada1.addFirst(x);
				break;

				case 2:
					System.out.println("Ingrese un numero: ");
					x = teclado.nextInt();
					listaEnlazada1.addLast(x);
				break;

				case 3:
					System.out.println("Se ha borrado el primer elemento");
					listaEnlazada1.removeFirst();
				break;

				case 4:
					System.out.println("Se ha borrado el ultimo elemento");
					listaEnlazada1.removeLast();
				break;

				case 5:
					System.out.println("La lista es: ");
					ArrayList lista = new ArrayList(listaEnlazada1);
					Iterator it = lista.iterator();

					while(it.hasNext())
					{
						System.out.println(it.next());
					}
				break;

				case 6:
					System.out.println("Se borro toda la lista");
					listaEnlazada1.clear();
				break;

				case 7:
					System.out.println("Adiios :B");
				break;

				default:
				System.out.println("Opcion incorrecta :(");
			}
		}while(opc != 7);
	}
}