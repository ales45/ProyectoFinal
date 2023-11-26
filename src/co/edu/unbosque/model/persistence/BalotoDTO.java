package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class BalotoDTO extends modulo4H implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private int numero1;
	private int numero2;
	private int numero3;
	private int numero4;
	private int numero5;
	private int numero6;


	
	public BalotoDTO(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,int numero1,int numero2,int numero3,int numero4,int numero5,int numero6) {
		super(nombreSede,cedula,diaApuesta,valorApuesta);
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		this.numero5 = numero5;
		this.numero6 = numero6;
	}



	public int getNumero1() {
		return numero1;
	}



	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}



	public int getNumero3() {
		return numero3;
	}



	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}



	public int getNumero4() {
		return numero4;
	}



	public void setNumero4(int numero4) {
		this.numero4 = numero4;
	}



	public int getNumero5() {
		return numero5;
	}



	public void setNumero5(int numero5) {
		this.numero5 = numero5;
	}



	public int getNumero6() {
		return numero6;
	}



	public void setNumero6(int numero6) {
		this.numero6 = numero6;
	}









	
	
}
