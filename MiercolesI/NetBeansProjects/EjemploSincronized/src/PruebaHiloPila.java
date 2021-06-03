import java.util.Stack;

public class PruebaHiloPila 
{
    public static void main(String[] args) 
    {
        Stack<String> miPila = new Stack<String>();
        HiloPila h1 = new HiloPila(miPila);
        HiloPila h2 = new HiloPila(miPila);
        HiloPila h3 = new HiloPila(miPila);
        
        miPila.add("Hola");
        miPila.add("Adios");
        miPila.add("ola ke ace?");
        miPila.add("¿Como");
        miPila.add("Estas");
        miPila.add("?");
        miPila.add(":)");
        miPila.add(":|");
        
        h1.start();
        h2.start();
        h3.start();
        
        
    }
}
