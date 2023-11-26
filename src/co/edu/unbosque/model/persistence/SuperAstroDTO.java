package co.edu.unbosque.model.persistence;

public class SuperAstroDTO extends modulo4H{

	private String SignoZodiaco;
	private int numero;

	
	
	public SuperAstroDTO(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,String signoZodiaco,int numero) {
		super(nombreSede,cedula,diaApuesta,valorApuesta);
		this.SignoZodiaco = signoZodiaco;
		this.numero = numero;
	}





	public String getSignoZodiaco() {
		return SignoZodiaco;
	}
	public void setSignoZodiaco(String signoZodiaco) {
		SignoZodiaco = signoZodiaco;
	}
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}



	
	
}
