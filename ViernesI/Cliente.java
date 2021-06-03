import java.util.ArrayList;

public class Cliente
{
	public static void main(String[] args) 
	{
		ArrayList<Thread> clientes = new ArrayList<Thread>();

		for (int i = 0; i < 5 ; i++ ) 
		{
			clientes.add(new Persona(i));
		}
		for (Thread cliente : clientes) 
		{
			cliente.start();
		}
	}
}