package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class ChanceDAO {

	ArrayList<ChanceDTO> arraybChanceDTOs;
	RegistroChance ra = new RegistroChance();
	
	public ChanceDAO() {
		arraybChanceDTOs = new ArrayList<>();
	}
	
	public void create(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreLoteria,int numero) {
		ChanceDTO asde = new ChanceDTO(nombreSede,cedula,diaApuesta,valorApuesto,nombreLoteria,numero);
		
		
		arraybChanceDTOs.add(asde);
		ra.escribirRegistro(arraybChanceDTOs);
		read();
	}
	
	public void update(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreLoteria,int numero) {
		read();
		int indice = buscarxid(cedula);
		ChanceDTO asde = new ChanceDTO(nombreSede,cedula,diaApuesta,valorApuesto,nombreLoteria,numero);
		arraybChanceDTOs.set(indice, asde);
		ra.escribirRegistro(arraybChanceDTOs);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		arraybChanceDTOs = ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		ChanceDTO jugaboraar = buscar(cedula);
		arraybChanceDTOs.remove(jugaboraar);
		ra.escribirRegistro(arraybChanceDTOs);
		read();		
	}
	
	public ChanceDTO buscar(long cedula) {
		read();
		for(int i = 0;i< arraybChanceDTOs.size();i++) {
			if(arraybChanceDTOs.get(i).getCedula() == cedula) {
				return arraybChanceDTOs.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<arraybChanceDTOs.size();i++) {
			if(arraybChanceDTOs.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<ChanceDTO> getArraybChanceDTOs() {
		return arraybChanceDTOs;
	}

	public void setArraybChanceDTOs(ArrayList<ChanceDTO> arraybChanceDTOs) {
		this.arraybChanceDTOs = arraybChanceDTOs;
	}
	
}


