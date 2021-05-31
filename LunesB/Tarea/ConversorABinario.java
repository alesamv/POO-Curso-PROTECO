import java.util.Scanner;
public class ConversorABinario
{
	public static void main(String[] args) 
	{
		System.out.println("\"Conversor de decimal a binario\"");
		int num=0, cont=0; 
		String numBin = "";

		Scanner numDec = new Scanner(System.in);
		
		do
		{
			System.out.print("Ingresa el numero: ");
		 	num = numDec.nextInt();
		}while(num<0);

		if(num==0)
		{
			System.out.println("El numero decimal ingresado, en binario es: 0");
		}

		else
		{
			while(num!=0)
			{
				cont=num%2;
				numBin=cont+numBin;
				num/=2;
			}
			System.out.println("El numero ingresado en binario es: "+numBin);
		}
	}			
}