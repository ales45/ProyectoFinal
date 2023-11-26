package co.edu.unbosque.model.persistence;

public class ChanceDTO extends modulo4H{

	private String nombreLOTERIA;
	private int numero;


	
	
	public ChanceDTO(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,String numeroLoteria,int numero) {
		super(nombreSede,cedula,diaApuesta,valorApuesta);
		this.nombreLOTERIA = numeroLoteria;
		this.numero = numero;

	}




	public String getNombreLOTERIA() {
		return nombreLOTERIA;
	}




	public void setNombreLOTERIA(String nombreLOTERIA) {
		this.nombreLOTERIA = nombreLOTERIA;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}













	
	
}
