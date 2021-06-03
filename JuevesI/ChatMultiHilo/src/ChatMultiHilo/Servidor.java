package ChatMultiHilo;

import java.io.*;
import java.net.*;

public class Servidor extends Thread
{
    private String nombreCliente;
    private BufferedReader entrada;
    
    public Servidor(Socket s) throws IOException
    {
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        nombreCliente = s.getInetAddress().getCanonicalHostName();
        System.out.println("Conexion aceptada desde: "+s.getRemoteSocketAddress());
    }
    
    public String recibir() throws IOException
    {
        String str = entrada.readLine();
        return str;
    }
    
    public void cerrar() throws IOException
    {
        entrada.close();
    }
    
    @Override
    public void run()
    {
        try
        {
            String str = "";
            do
            {
                str = recibir();
                System.out.println(nombreCliente+"dice: "+str);
            }while(!str.equals("salir"));
        }catch(IOException e)
        {
            System.out.println("Se cerro la conexion con: "+nombreCliente);
        }finally
        {
            try
            {
                cerrar();
            }catch(Exception e)
            {}
        }
       
    }
    public static void main(String[] args) throws IOException 
    {
        ServerSocket ss;
        ss = new ServerSocket(0);
        System.out.println("Servidor aceptando conexiones en los puerto: "+ss.getLocalPort());
        while(true)
        {
            Socket cliente = ss.accept();
            Servidor hilo = new Servidor(cliente);
            hilo.start();
        }
    }
}