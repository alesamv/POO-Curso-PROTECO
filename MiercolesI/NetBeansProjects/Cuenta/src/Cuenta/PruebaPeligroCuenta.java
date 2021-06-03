package Cuenta;
public class PruebaPeligroCuenta 
{
    public static void main(String[] args) 
    {
        PeligroCuenta realizarRetiro = new PeligroCuenta();
        Thread uno = new Thread(realizarRetiro);
        Thread dos = new Thread(realizarRetiro);
        
        uno.setName("Carlos");
        dos.setName("Maria");
        
        uno.start();
        dos.start();
    }
}
