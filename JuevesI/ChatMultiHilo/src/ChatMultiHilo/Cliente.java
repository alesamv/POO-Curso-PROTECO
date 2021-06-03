package ChatMultiHilo;
import java.io.*;
import java.net.*;

public class Cliente 
{
    private PrintStream ps;
    private String host;
    private int port;
    
    public void setHost(String host)
    {
        this.host = host;
    }
    
    public void setPort(int port)
    {
        this.port = port;
    }
    
    public void conectar() throws IOException
    {
        Socket s= new Socket(host, port);
        ps = new PrintStream(s.getOutputStream());
    }
    
    public void enviar(String mensaje) throws IOException
    {
        ps.println(mensaje);
    }
    public void cerrar() throws IOException 
    {
        ps.close();
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        Cliente c = new Cliente();
        System.out.println("Host: ");
        c.setHost(tec.readLine());
        System.out.println("Puerto: ");
        c.setPort(Integer.parseInt(tec.readLine()));
        c.conectar();
        String str="";
        while(!str.equals("salir"));
        {
            System.out.println("Mensaje: ");
            str = tec.readLine();
            c.enviar(str);
        }
        c.cerrar();
    }
}
