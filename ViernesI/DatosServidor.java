import java.io.*;
import java.net.*;

public class DatosServidor extends Thread
{
	private Socket socket;
	private int id;
	DataOutputStream dos;
	DataInputStream dis;

	public DatosServidor(Socket socket, int id)
	{
		this.socket = socket;
		this.id = id;

		try
		{
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());

		} catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}

	}
	public void run()
	{
		try
		{
			String respuesta = dis.readUTF();
			if (respuesta.equals("Hola"))
			{
				System.out.println("El cliente con id: " + this.id + " saluda");
				dos.writeUTF("HOLAAAAAAAA");
			}
		} catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
		desconectar();
	}

	public void desconectar()
	{
		try
		{
			socket.close();
		} catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
}