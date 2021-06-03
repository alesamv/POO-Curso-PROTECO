import java.io.*;
public class LectorTeclado
{
	public String leerCadena() throws IOException
	{
		String s = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		s = br.readLine();
		return s;
	}

	public int leerEntero() throws IOException, NumberFormatException
	{
		int v = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //instanciacion al vuelo
		v = Integer.parseInt(br.readLine());
		return v;
	}

	public double leerDouble() throws IOException, NumberFormatException
	{
		double d = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //instanciacion al vuelo
		d = Double.parseDouble(br.readLine());
		return d;
	}

	public float leerFloat() throws IOException, NumberFormatException
	{
		float f = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //instanciacion al vuelo
		f = Float.parseFloat(br.readLine());
		return f;
	}
}
