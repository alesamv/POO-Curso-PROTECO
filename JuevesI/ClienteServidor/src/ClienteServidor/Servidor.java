package ClienteServidor;
import java.net.*;
import java.io.*;
        
public class Servidor 
{
   //objeto server
    
    ServerSocket server;
    Socket socket;
    
    int puerto = 9000;
    BufferedReader entrada;
    
    public void iniciar()
    {
        try
        {
            server = new ServerSocket(puerto);
            socket = new Socket();
            //espera a que se mande la peticion para poder establecer la conexion
            socket = server.accept();
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String mensaje = entrada.readLine();
            System.out.println(mensaje);
            
            PrintStream salida = new PrintStream(socket.getOutputStream());
            salida.println("adios");
            socket.close();
            
        }catch(Exception e){}
    }

    public static void main(String[] args) 
    {
        Servidor server = new Servidor();
        server.iniciar();
    }
}
