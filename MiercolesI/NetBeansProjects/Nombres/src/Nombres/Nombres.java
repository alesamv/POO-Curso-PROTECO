package Nombres;
public class Nombres 
{
    public static void main(String[] args) 
    {
        NombresHilo objetoHilo = new NombresHilo();
        Thread uno = new Thread(objetoHilo);
        Thread dos = new Thread(objetoHilo);
        Thread tres = new Thread(objetoHilo);
        
        uno.setName("Juan");
        dos.setName("Pedro");
        tres.setName("Marta");
        
        uno.start();
        dos.start();
        tres.start();
    }
}
