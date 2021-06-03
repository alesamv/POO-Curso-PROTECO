import java.io.*;

public class CrearDirectorio
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("./directorio"); //hacemos la representacion de un directorio o archivo
		if(!file.exists())
		{
			if(file.mkdir())
				System.out.println("Directorio "+file.getName()+" creado.");
			else
				System.out.println("No se puede crear el directorio" +file.getName());
		} //cierre del if

		//Se hace la representacion de varios subdirectorios
		File file2 = new File("./directorio2/subdir/subdir/subdir-subdir");
		if(file2.mkdirs()) //mkdirs crea distintos directorios
			System.out.println("Directorios creados");
		else
			System.out.println("No se pudieron crear");

		File archivo = new File("./directorio/archivoNuevo.txt"); //representacion de nuevo
		if(archivo.createNewFile()) //metodo que crea el archivo, devuelve TRUE si fue creado
			System.out.println("Se ha creado el archivo " + archivo.getName());
		else
			System.out.println("No se ha creado el archivo "+archivo.getName());
		System.out.println("Tamano del archivo: "+archivo.length()+" bytes.");
	}
}