import java.util.ArrayList;
import java.util.Scanner;

 public class ColeccionColores
 {
 	public static void main(String[] args) 
 	{
 		ArrayList<String> colores = new ArrayList<String>();
 		colores.add("Rojo"); 
		colores.add("Verde");
		colores.add("Azul");

		System.out.println(colores.isEmpty());

		System.out.println("Los colores existentes son:");
		for(String aux : colores)
			System.out.println(aux);	

		int op = 0;
		int borrar;
		String elemento;
		do
		{
			Scanner tec = new Scanner(System.in);
			System.out.println("\n1.Agregar elemento");
			System.out.println("2.Eliminar elemento");
			System.out.println("3.Ver coleccion");
			System.out.println("4.Salir");
			System.out.println("Ingresa opcion: ");
			op = tec.nextInt();
			switch(op)
			{
				case 1: 
					Scanner tecla = new Scanner(System.in);
					System.out.print("Ingresa el elemento: ");
					elemento = tecla.nextLine();
					if(colores.contains(elemento))
					{
						System.out.println("Ya existe el elemento dentro del arreglo");
					}
					else
					{
						colores.add(elemento);
						System.out.println("El elemento se ha agregado");	
					}
				break;

				case 2:
					Scanner teclado = new Scanner(System.in);
					System.out.print("Ingresa el indice del elemento que quieres borrar: ");
					borrar = teclado.nextInt();
					colores.remove(borrar);
					System.out.println("El elemento se ha borrado");
				break;

				case 3:
					System.out.println("Colores:");
					for(String aux : colores)
						System.out.println(aux);
				break;

				default:
					System.out.println("");
				break;

			}
		}while(op != 4);
 	}
 }
