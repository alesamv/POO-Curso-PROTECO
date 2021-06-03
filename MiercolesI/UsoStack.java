import java.util.Stack;

public class UsoStack
{
	public static void main(String[] args) 
	{
		Stack<Objeto> arrayStack = new Stack<Objeto>();

		System.out.println("Se procede a insertar en el stack: ");
		System.out.println("¿Esta vacia?: " +arrayStack.empty());

		for (int i = 0; i<10 ; i++) 
		{
			arrayStack.push(new Objeto(i));
		}

		System.out.println("\nSe sacan los datos del stack: ");
		System.out.println("¿Esta vacia?: "+ arrayStack.empty());

		while(!arrayStack.isEmpty())
		{
			arrayStack.pop().getObjeto();
		}
		System.out.println("¿Esta vacia?: "+arrayStack.empty());
	}
}

//empty de la clase
//ismpty es de la coleccion