package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class SuperAstroDAO {

	ArrayList<SuperAstroDTO> arraySuperAstro;
	RegistroSuperAstro ra = new RegistroSuperAstro();
	
	public SuperAstroDAO() {
		arraySuperAstro = new ArrayList<>();
	}
	
	public void create(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String signoZodiaco,int numero) {
		SuperAstroDTO asde = new SuperAstroDTO(nombreSede,cedula,diaApuesta,valorApuesto,signoZodiaco,numero);
		
		
		arraySuperAstro.add(asde);
		ra.escribirRegistro(arraySuperAstro);
		read();
	}
	
	public void update(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String signoZodiaco,int numero) {
		read();
		int indice = buscarxid(cedula);
		SuperAstroDTO asde = new SuperAstroDTO(nombreSede,cedula,diaApuesta,valorApuesto,signoZodiaco,numero);
		arraySuperAstro.set(indice, asde);
		ra.escribirRegistro(arraySuperAstro);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		arraySuperAstro = ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		SuperAstroDTO jugaboraar = buscar(cedula);
		arraySuperAstro.remove(jugaboraar);
		ra.escribirRegistro(arraySuperAstro);
		read();		
	}
	
	public SuperAstroDTO buscar(long cedula) {
		read();
		for(int i = 0;i<arraySuperAstro.size();i++) {
			if(arraySuperAstro.get(i).getCedula() == cedula) {
				return arraySuperAstro.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<arraySuperAstro.size();i++) {
			if(arraySuperAstro.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<SuperAstroDTO> getArraySuperAstro() {
		return arraySuperAstro;
	}

	public void setArraySuperAstro(ArrayList<SuperAstroDTO> arraySuperAstro) {
		this.arraySuperAstro = arraySuperAstro;
	}
	
}


