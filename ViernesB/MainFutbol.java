/**
*Clase principal que instancia y llama métodos propios de futbolista
*@author Ale
*@version 1.0
*/

public class MainFutbol
{
	/**
	*Método principal que realiza instancias
	*@param args Arreglo de Strings
	*/
	public static void main(String[] args) 
	{
		Futbolista futbolista1 = new Futbolista("Cristiano", "Ronaldo", 33, 1, "Extremo por derecha", 7);
		futbolista1.bailar();
		futbolista1.cocinar("Arrachera");
		futbolista1.jugar();
	}
	
}