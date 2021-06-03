package Cuenta;
public class Cuenta 
{
    private int balance = 1000; 
    
    public int getBalance() 
    {
        return balance;
    }
    
    public void retirar(int cantidad)
    {
        balance -= cantidad;
    }
    
}
