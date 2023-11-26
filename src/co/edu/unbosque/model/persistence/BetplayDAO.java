package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class BetplayDAO {

	ArrayList<BetplayDTO> arrayBetplayDTOs;
	RegistroBetplay ra = new RegistroBetplay();
	
	public BetplayDAO() {
		arrayBetplayDTOs = new ArrayList<>();
	}
	
	public void create(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,int[] partidos) {
		BetplayDTO asde = new BetplayDTO(nombreSede,cedula,diaApuesta,valorApuesta,partidos);
		
		
		arrayBetplayDTOs.add(asde);
		ra.escribirRegistro(arrayBetplayDTOs);
		read();
	}
	
	public void update(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta,int[] partidos) {
		read();
		int indice = buscarxid(cedula);
		BetplayDTO asde = new BetplayDTO(nombreSede,cedula,diaApuesta,valorApuesta,partidos);
		arrayBetplayDTOs.set(indice, asde);
		ra.escribirRegistro(arrayBetplayDTOs);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		arrayBetplayDTOs= ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		BetplayDTO jugaboraar = buscar(cedula);
		System.out.println("1"+jugaboraar.getCedula());
		arrayBetplayDTOs.remove(jugaboraar);
		ra.escribirRegistro(arrayBetplayDTOs);
		read();		
	}
	
	public BetplayDTO buscar(long cedula) {
		read();
		for(int i = 0;i<arrayBetplayDTOs.size();i++) {
			if(arrayBetplayDTOs.get(i).getCedula() == cedula) {
				return arrayBetplayDTOs.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<arrayBetplayDTOs.size();i++) {
			if(arrayBetplayDTOs.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<BetplayDTO> getArrayBetplayDTOs() {
		return arrayBetplayDTOs;
	}

	public void setArrayBetplayDTOs(ArrayList<BetplayDTO> arrayBetplayDTOs) {
		this.arrayBetplayDTOs = arrayBetplayDTOs;
	}

}


