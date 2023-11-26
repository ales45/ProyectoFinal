package co.edu.unbosque.model.persistence;

public class LoteriaDTO extends modulo4H{

	String nombreLoteria;
	int numero;
	int serie;
	
	
	public LoteriaDTO(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,String nombreLoteria,int numero,int serie) {
		super(nombreSede,cedula,diaApuesta,valorApuesta);
		this.nombreLoteria = nombreLoteria;
		this.numero = numero;
		this.serie = serie;
	}


	public String getNombreLoteria() {
		return nombreLoteria;
	}


	public void setNombreLoteria(String nombreLoteria) {
		this.nombreLoteria = nombreLoteria;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getSerie() {
		return serie;
	}


	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	
}
