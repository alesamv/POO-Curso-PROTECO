public class SumaDeEnteros
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=3, c=0;

		//Preincremento
		System.out.println("Variable a = " + ++a);
		System.out.println("Variable a = " + a);
		//Postincremento
		System.out.println("Variable a = " + a++);
		System.out.println("Variable a = " + a);


		c = a+b;
		System.out.println("El valor de c es: " + c);
		System.out.println("El valor de c es: " + (a+b));
	}
}