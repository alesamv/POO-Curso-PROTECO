package Agenda;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda 
{
    public static void main(String[] args) 
    {
        ArrayList<Contacto> agenda = new ArrayList<>();
        File archivo = new File("Agenda.bin");
        if(archivo.exists())
        {
            try
            {
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
            }catch(Exception e)
            {
                System.out.println("Error de lectura"+e.getMessage());
            }
        }
        //Serializar nuestra clase y crear archivo
        Scanner teclado = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("\n1. Agregar contacto \n2. Eliminar contacto \n3. Ver Usuarios \n4. Salir \n");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch(opc)
            {
                case 1: //Agregar
                {
                    System.out.println("Ingresa el nombre del contacto: ");
                    String nombre=teclado.nextLine();
                    System.out.println("Ingresa el telefono: ");
                    Long telefono = teclado.nextLong();
                    teclado.nextLine();
                    System.out.println("Ingrese el correo: ");
                    String correo = teclado.nextLine();
                    System.out.println("Ingrese el telCasa: ");
                    Long telCasa = teclado.nextLong();
                    
                    Contacto c = new Contacto(nombre,telefono,correo,telCasa);
                    agenda.add(c);
                    break;
                }
                
                case 2: //Eliminar
                {
                    System.out.println("Ingresar el usuario a Eliminar: ");
                    String contactoEliminar = teclado.nextLine();
                    Contacto auxContacto = new Contacto("",(long)0,"",(long)0);
                    for(Contacto value: agenda)
                    {
                        if(value.getNombre().equalsIgnoreCase(contactoEliminar))
                        {
                            auxContacto = value;
                        }
                    }
                    
                    if(agenda.contains(auxContacto))
                    {
                        agenda.remove(auxContacto);
                        System.out.println("Se elimino el usuario: "+contactoEliminar);
                    }else
                    {
                        System.out.println("Usuario: "+contactoEliminar+" no e valido");
                    }
                    break;
                }
                
                case 3: //Mostrar
                {
                    for(Contacto value: agenda)
                        {   
                         System.out.println(value);
                        }
                    break;   
                }
                
                case 4: //Salir y serializar objeto
                {
                    System.out.println("Adios");
                    try
                    {
                        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Agenda.bin"));
                        salida.writeObject(agenda);
                        salida.flush();
                        salida.close();
                    }catch(IOException e)
                    {
                        System.out.println("Error de escritura");
                    }
                    break;
                }
                
                default:
                {
                    System.out.println("Opcion no valida");
                    break;
                }
            }
        }while(opc!=4);
    
    }
}
