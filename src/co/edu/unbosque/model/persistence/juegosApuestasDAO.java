package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

public class juegosApuestasDAO  {

	ArrayList<JuegoApuestaDTO> arrayApuestasDTOs;
	RegistroJuegosApuesta ra = new RegistroJuegosApuesta();
	
	public juegosApuestasDAO() {
		arrayApuestasDTOs = new ArrayList<>();
	}
	
	public void create(String nombre,String tipodeJuego,double presupuestoJuego) {
		JuegoApuestaDTO asde = new JuegoApuestaDTO(nombre,tipodeJuego,presupuestoJuego);
		
		
		arrayApuestasDTOs.add(asde);
		ra.escribirRegistro(arrayApuestasDTOs);
		read();
	}
	
	public void update(String nombre,String tipodeJuego,double presupuestoJuego) {
		read();
		int indice = buscarxid(nombre);
		JuegoApuestaDTO asde = new JuegoApuestaDTO(nombre,tipodeJuego,presupuestoJuego);
		arrayApuestasDTOs.set(indice, asde);
		ra.escribirRegistro(arrayApuestasDTOs);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		arrayApuestasDTOs = ra.leerRegistro();
				}
	
	
	public void delete(String cedula) {
		read();
		JuegoApuestaDTO jugaboraar = buscar(cedula);
		arrayApuestasDTOs.remove(jugaboraar);
		ra.escribirRegistro(arrayApuestasDTOs);
		read();		
	}
	
	public JuegoApuestaDTO buscar(String cedula) {
		read();
		for(int i = 0;i< arrayApuestasDTOs.size();i++) {
			if(arrayApuestasDTOs.get(i).getNombre() == cedula) {
				return arrayApuestasDTOs.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(String cedula) {
		read();
		for(int i = 0;i<arrayApuestasDTOs.size();i++) {
			if(arrayApuestasDTOs.get(i).getNombre().equals(cedula)) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<JuegoApuestaDTO> getArrayApuestasDTOs() {
		return arrayApuestasDTOs;
	}

	public void setArrayApuestasDTOs(ArrayList<JuegoApuestaDTO> arrayApuestasDTOs) {
		this.arrayApuestasDTOs = arrayApuestasDTOs;
	}


	
}


