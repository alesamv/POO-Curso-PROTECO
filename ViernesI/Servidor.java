import java.net.*;
import java.io.*;

public class Servidor
{
	public static void main(String[] args) 
	{
		ServerSocket ss;
		System.out.println("Iniciando servidor...");
		try
		{
			ss = new ServerSocket(10578);
			System.out.println("Servidor OK");
			int idSesion = 0;

			while(true)
			{
				Socket socket;
				socket = ss.accept();
				System.out.println("Nueva conexion: " + socket);
				DatosServidor ds;
				ds = new DatosServidor(socket, idSesion);
				ds.start();
				idSesion ++;
			}
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
}