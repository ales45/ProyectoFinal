package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class ApostadoresDTO implements Serializable{

	private String nombre;
	private long cedula;
	private String sede;
	private String direccion;
	private long celular;
	
	public ApostadoresDTO(String nombre, long cedula, String sede, String direccion, long celular) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.sede = sede;
		this.direccion = direccion;
		this.celular = celular;
	}
	
	
	

	public long getCedula() {
		return cedula;
	}




	public void setCedula(long cedula) {
		this.cedula = cedula;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public long getCelular() {
		return celular;
	}


	public void setCelular(long celular) {
		this.celular = celular;
	}

	

}

