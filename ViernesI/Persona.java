import java.net.Socket;
import java.io.*;

public class Persona extends Thread
{
	private int id;
	Socket sk;
	DataOutputStream dos;
	DataInputStream dis;

	public Persona(int id)
	{
		this.id = id;
	}

	public void run()
	{
		try
		{
			sk = new Socket("127.0.0.1", 10578);
			dos = new DataOutputStream(sk.getOutputStream());
			dis = new DataInputStream(sk.getInputStream());

			dos.writeUTF("Hola");
			System.out.println("mando saludo -> "+ id);

			String respuesta = "";
			respuesta = dis.readUTF();
			System.out.println(id + " servidor devuelve mensaje: " + respuesta);

			dis.close();
			dos.close();
			sk.close();
		} 
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
}