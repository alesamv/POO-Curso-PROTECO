import java.util.Stack;

//package EjemploSyncronized;

public class HiloPila extends Thread
{
    Stack<String> miPila;
    
    public HiloPila(Stack<String> miPila)
    {
        this.miPila = miPila;
    }
    
    public void run()
    {
        while(!miPila.isEmpty())
        {
            System.out.println("El hilo "+this.getName() + " sacó el elemento " + eliminarElemento());
        }
    }
    
    public synchronized String eliminarElemento()
    {
        try
        {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {}
        
        if (miPila.size() > 0)
        {
            return miPila.pop();
        }
        return "No se puede realizar";
    }
}
