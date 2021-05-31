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

	public void setSaldo(double saldo)
	{
		this.saldo= saldo;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNoCta(int noCta)
	{
		this.noCta = noCta;
	}

	public int getNoCta()
	{
		return noCta;
	}

	public void abonarSaldo(double abono)
	{
		this.saldo+=abono;
	}

	public void retirarSaldo(double retiro)
	{
		if(retiro<saldo)
		{
			System.out.println("Lo sentimos, no hay fondos suficientes para su retiro\n");
		}
		else
		{
			this.saldo-=retiro;
		}
		
	}

	public void consultarSaldo()
	{
		System.out.println("Saldo: "+saldo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Numero de Cuenta: "+noCta);
	}
}