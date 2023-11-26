package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class BetplayDTO extends modulo4H implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private int[] partidos=new int[14];



	
	public BetplayDTO(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,int[] partidos) {
		super(nombreSede,cedula,diaApuesta,valorApuesta);
		this.partidos = partidos;

	}




	public int[] getPartidos() {
		return partidos;
	}




	public void setPartidos(int[] partidos) {
		this.partidos = partidos;
	}













	
	
}
