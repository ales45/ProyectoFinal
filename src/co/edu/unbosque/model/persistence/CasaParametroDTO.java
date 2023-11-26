package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class CasaParametroDTO implements Serializable{
	private String nombreCasaApuestas;
	private int numsedes;
	private long presupuestoTotal;
	
	public CasaParametroDTO(String nombreCasaApuestas,int numsedes,long presupuestoTotal) {
		this.nombreCasaApuestas = nombreCasaApuestas;
		this.numsedes = numsedes;
		this.presupuestoTotal = presupuestoTotal;	
	}

	public String getNombreCasaApuestas() {
		return nombreCasaApuestas;
	}

	public void setNombreCasaApuestas(String nombreCasaApuestas) {
		this.nombreCasaApuestas = nombreCasaApuestas;
	}

	public int getNumsedes() {
		return numsedes;
	}

	public void setNumsedes(int numsedes) {
		this.numsedes = numsedes;
	}

	public long getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(long presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	
	
}
