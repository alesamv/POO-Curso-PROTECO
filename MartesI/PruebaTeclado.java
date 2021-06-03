import java.io.*;

public class PruebaTeclado
{
	public static void main(String[] args) 
	{
	 	LectorTeclado obj = new LectorTeclado();
	 	System.out.println("Ingrese una cadena: ");
	 	System.out.println("Ingrese un entero: ");
	 	System.out.println("Ingrese un doble: ");
	 	System.out.println("Ingrese un flotante: ");

	 	try{
	 		System.out.println("Su cadena fue: "+obj.leerCadena());
	 		System.out.println("Su entero fue: "+obj.leerEntero());
	 		System.out.println("Su doble fue: "+obj.leerDouble());
	 		System.out.println("Su flotante fue: "+obj.leerFloat());
	 	}catch (IOException ioe){
	 		System.out.println(ioe.getMessage());
	 	}catch (NumberFormatException nfe){
	 		System.out.println("Murio :'c");
	 	}
	}
}