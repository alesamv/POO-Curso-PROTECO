import java.io.*;
import java.util.Scanner;

public class Operacion
{
	public static void main(String[] args) throws IOException
	{
		//Escribir cifrado
		File archivo = new File("./archivoop.txt");
		FileWriter fw = new FileWriter(archivo); //abriendo el flujo
		BufferedWriter bw = new BufferedWriter(fw); //transportando en el bufer

		Scanner sc = new Scanner(System.in);
		int numero;
		int i=0;
		
		do
		{
			numero = sc.nextInt();
			bw.newLine(); 
			bw.write(Operacion.multiplicar(numero));
			i++;

		}while(i<2);

		bw.close();
	}
}