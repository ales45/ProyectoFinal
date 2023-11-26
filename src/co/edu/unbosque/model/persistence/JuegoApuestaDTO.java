package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class JuegoApuestaDTO implements Serializable{
	private String nombre;
	private String tipoJuego;
	private double presupuestoJuego;
	
	
	public JuegoApuestaDTO(String nombre,String tipodeJuego,double presupuestoJuego) {
		this.nombre = nombre;
		this.tipoJuego = tipodeJuego;
		this.presupuestoJuego = presupuestoJuego;
		
	}

	public String informacionPersistencia() {
		return nombre + "\n" + tipoJuego + "\n" + presupuestoJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public double getPresupuestoJuego() {
		return presupuestoJuego;
	}

	public void setPresupuestoJuego(double presupuestoJuego) {
		this.presupuestoJuego = presupuestoJuego;
	}

}
