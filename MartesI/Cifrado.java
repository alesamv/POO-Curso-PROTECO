import java.io.*;
import java.util.Scanner;

public class Cifrado
{
	public static String cifrar(String original) 
	{
		StringBuilder cadenaCifrada = new StringBuilder(original.length()); //guardará la cadena cifrada, nos provee dl metodo append

		int valor = 0; //variable que guardara el valor entero de cada caracter que leamos

		for (int i = 0; i < original.length(); i++) 
		{
			valor = (int)(original.charAt(i)); //obtenemos el entero asociaado a cada una de las letras
			valor = valor +3; //aplicamops la formula que establecimos
			cadenaCifrada.append((char)(valor)); // añadimos el caracter cifrado a la nueva cadena. El metodo append va añadiendo al final de la misma 
		}

		return cadenaCifrada.toString(); //devolvemos el StringBuilder ya cifrado como una simple cadena
	}

	public static String descifrar(String original) 
	{
		//Proceso inverso
		StringBuilder cadenaDescifrada = new StringBuilder(original.length()); //guardará la cadena cifrada, nos provee dl metodo append

		int valorCifrado = 0; //variable que guardara el valor entero de cada caracter que leamos

		for (int i = 0; i < original.length(); i++) 
		{
			valorCifrado = (int)(original.charAt(i)); //obtenemos el entero asociaado a cada una de las letras
			valorCifrado = valorCifrado -3; //aplicamops la formula que establecimos
			cadenaDescifrada.append((char)(valorCifrado)); // añadimos el caracter cifrado a la nueva cadena. El metodo append va añadiendo al final de la misma 
		}

		return cadenaDescifrada.toString(); //devolvemos el StringBuilder ya cifrado como una simple cadena
	}

}