public class Mensaje 
{
	private String remitente;
	private String para;
	private String texto;

	public Mensaje(String remitente, String para, String texto)
	{
		this.remitente = remitente;
		this.para = para;
		this.texto = texto;
	}

	public void setRemitente(String remitente)
	{
		this.remitente = remitente;
	}

	public void extraerFraccionTexto()
	{
		texto = texto.substring(0,3);
		System.out.println(texto);

	}

	public static void main(String[] args) 
	{
		Mensaje m1 = new Mensaje("Jorge","Ricardo","Hola amigo");
		System.out.println(m1.remitente);
		System.out.println(m1.para);
		System.out.println(m1.texto);

		m1.extraerFraccionTexto();
	}

}