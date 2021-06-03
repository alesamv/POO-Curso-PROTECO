import java.io.*;

public class LeerArchivo
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		try {
			// a nivel de bytes
			/*FileInputStream fis = new FileInputStream("./archivo.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr); */

			//a nivel de caracteres
			File fis = new File("./archivo.txt");
			FileReader isr = new FileReader(fis);
			BufferedReader br = new BufferedReader(isr);

			String s;

			//leemos desde el archivo MIENTRAS haya algo que leer
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encontro el archivo");
		} catch(IOException ioe) {
			System.out.println("Hubo algun problema");
		}
	}
}
