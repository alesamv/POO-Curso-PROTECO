package Agenda;

public class Contacto implements java.io.Serializable
{
    private String nombre;
    private Long telefono;
    private String correo;
    private transient Long telCasa; //transient nos dice que ese atributo no sera serializable

    public Contacto(){}
    
    public Contacto(String nombre, Long telefono, String correo, Long telCasa)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.telCasa = telCasa;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Long getTelefono()
    {
        return telefono;
    }
    
    public String getCorreo()
    {
        return correo;
    }
    
    public Long getTelCasa()
    {
        return telCasa;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setTelefono(Long telefono)
    {
        this.telefono = telefono;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }
    
    public void setTelCasa(Long telCasa)
    {
        this.telCasa = telCasa;
    }
    
    @Override
    public String toString()
    {
        return telCasa+ "Contactos: \nNombre: "+ nombre +"\nCorreo: "+ correo +"\nTelefono: "+ telefono +"\nTelefono Casa: "+telCasa;
    }
}
