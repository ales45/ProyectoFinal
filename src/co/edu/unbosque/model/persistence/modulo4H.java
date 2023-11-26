package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public abstract class modulo4H implements Serializable {
		String nombreSede;
		Long cedula;
		String diaApuesta;
		Long valorApuesta;
	public modulo4H(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta) {
		this.nombreSede = nombreSede;
		this.cedula = cedula;
		this.diaApuesta = diaApuesta;
		this.valorApuesta = valorApuesta;
	}
	public String getNombreSede() {
		return nombreSede;
	}
	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getDiaApuesta() {
		return diaApuesta;
	}
	public void setDiaApuesta(String diaApuesta) {
		this.diaApuesta = diaApuesta;
	}
	public Long getValorApuesta() {
		return valorApuesta;
	}
	public void setValorApuesta(Long valorApuesta) {
		this.valorApuesta = valorApuesta;
	}
	
	
}
