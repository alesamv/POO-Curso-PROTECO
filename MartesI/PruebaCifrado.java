import java.io.*;
import java.util.Scanner;

public class PruebaCifrado
{
	public static void main(String[] args) throws IOException
	{
		//Escribir cifrado
		/*File archivo = new File("./archivocifrado.txt");
		FileWriter fw = new FileWriter(archivo); //abriendo el flujo
		BufferedWriter bw = new BufferedWriter(fw); //transportando en el bufer

		Scanner sc = new Scanner(System.in);
		String cadena;
		int i=0;
		
		do
		{
			cadena = sc.nextLine();
			bw.write(Cifrado.cifrar(cadena)); //primero ciframos lo que hay en "cadena" y luego lo escribimos en el archivo
			bw.newLine(); //metodo para saltar de linea dentro del archivo
			i++;

		}while(i<3);

		bw.close(); */

		File lectura = new File("./archivocifrado.txt");
		FileReader fr = new FileReader(lectura); //abriendo el flujo de lectura
		BufferedReader br = new BufferedReader(fr);
		String s;

		System.out.println("\nTexto original: ");
		while ((s = br.readLine()) != null)
		{
			System.out.println(Cifrado.descifrar(s));
		}
		br.close();
	}
}