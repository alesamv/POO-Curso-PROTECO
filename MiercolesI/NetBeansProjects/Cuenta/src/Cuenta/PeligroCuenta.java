package Cuenta;

import java.util.Random;

public class PeligroCuenta implements Runnable
{
    private Cuenta cuenta1 = new Cuenta();
    Random random = new Random(10);
    

    public void run()
    {
        try
        {
            for (int x = 0; x < 50; x++) 
            {
                realizarRetiro( (int) (random.nextDouble()*20));
                if(cuenta1.getBalance() < 0)
                {
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException ex)
        {
            System.out.println("La cuenta esta sobregirada!!!!!!!!!!!!!!!!!!");
        }
    }
    
    public void realizarRetiro (int cantidad)
    {
        if(cuenta1.getBalance() >= cantidad)
        {
            System.out.println(Thread.currentThread().getName() + " va a realizar el retiro de "+cantidad);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException ex){}
            
            cuenta1.retirar(cantidad);
            System.out.println(Thread.currentThread().getName() + " completo el retiro");
        }
        
        else
        {
            System.out.println("No hay suficiente dinero para retirar en " + Thread.currentThread().getName());
        }
    }
}
