package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class ApostadoresDAO {

	ArrayList<ApostadoresDTO> ArrayApostadores;
	RegistroApostadores ra = new RegistroApostadores();
	
	public ApostadoresDAO() {
		ArrayApostadores = new ArrayList<>();
	}
	
	public void create(String nombre, long cedula, String sede, String direccion, long celular) {
		
		ApostadoresDTO esda = new ApostadoresDTO(nombre, cedula, sede, direccion, celular);
		
		
		
		ArrayApostadores.add(esda);
		ra.escribirRegistro(ArrayApostadores);
		read();
	}
	
	public void update(String nombre,long cedula, String sede, String direccion,long celular) {
		read();
		int indice = buscarxid(cedula);
		ApostadoresDTO apostadoresModificado = new ApostadoresDTO(nombre, cedula, sede, direccion, celular);
		ArrayApostadores.set(indice, apostadoresModificado);
		ra.escribirRegistro(ArrayApostadores);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		ArrayApostadores = ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		ApostadoresDTO jugaboraar = buscar(cedula);
		ArrayApostadores.remove(jugaboraar);
		ra.escribirRegistro(ArrayApostadores);
		read();		
	}
	
	public ApostadoresDTO buscar(long cedula) {
		read();
		for(int i = 0;i<ArrayApostadores.size();i++) {
			if(ArrayApostadores.get(i).getCedula() == cedula) {
				return ArrayApostadores.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<ArrayApostadores.size();i++) {
			if(ArrayApostadores.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<ApostadoresDTO> getArrayApostadores() {
		return ArrayApostadores;
	}

	public void setArrayApostadores(ArrayList<ApostadoresDTO> arrayApostadores) {
		ArrayApostadores = arrayApostadores;
	}
	
}


