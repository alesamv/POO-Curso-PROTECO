public class ArrayException
{
	public static void main(String[] args)
	{
		try //codigo que puede tener salidas excepcionales
		{
			int[] numeros = {1, 2, 3, 4, 5};
			System.out.println(""+numeros[3]);
			System.out.println("Todo bien C:");
		}catch(ArrayIndexOutOfBoundsException excep){
			System.out.println("Te excediste en el limite del arreglo");
		}
	}
}