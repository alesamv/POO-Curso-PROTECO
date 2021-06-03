public class TablasDeMultiplicar extends Thread
{
    public TablasDeMultiplicar()
    {
        
    }
    
    @Override
    public void run()
    {   
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(this.getName() + ": " + i + " x " + j + " = " + i*j);
            } 
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        TablasDeMultiplicar tablaDeMultiplicar = new TablasDeMultiplicar();
        tablaDeMultiplicar.start();
    }
}
