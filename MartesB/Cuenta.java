import java.util.Random;
import java.util.Scanner;

public class Cuenta
{
	private double saldo;
	private String nombre;
	private int noCta;

	public Cuenta(double saldo, String nombre, int noCta)
	{
		this.saldo = saldo;
		this.nombre = nombre;
		this.noCta = noCta;
	}

	public CrearCuenta(double saldo, String nombre, int noCta)
	{
		System.out.println("Creacion de cuenta");
		//Scanner saldo = new Scanner(System.in);
		System.out.println("Introduce el saldo: ");
		//saldo = saldo.nextDouble();

		if(saldo>2000)
		{
			Cuenta c1 = new Cuenta();
			Random r = new Random();
			noCta = r.nextInt(100);

			//Scanner nombre = new Scanner(System.in);
			//System.out.println("Introduce tu nombre: ");
			//nombre = nombre.nextString();
			//c1.setNombre()
		}
		else
		{
			System.out.println("Lo sentimos. No se puede crear la cuenta");
		}	
	}

	public AbonarSaldo()
	{

	}

	public RetirarSaldo()
	{

	}

	public MostrarSaldo()
	{
		
	}

}

