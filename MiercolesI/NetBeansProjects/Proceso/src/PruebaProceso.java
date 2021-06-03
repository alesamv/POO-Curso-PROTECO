package Proceso;
public class PruebaProceso 
{
    public static void main(String[] args) 
    {
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        
        hilo1.setMensaje("Mensaje por hilo 1 :v");
        hilo2.setMensaje("Mensaje por hilo 2 :(");
        
        hilo1.start();
        
        try
        {
            hilo1.join();
        }catch(Exception ex){}
        
        hilo2.start();
        System.out.println("Estado del hilo 1 es: " +hilo1.isAlive());
    }
}
