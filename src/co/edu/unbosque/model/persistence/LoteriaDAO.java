package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class LoteriaDAO {

	ArrayList<LoteriaDTO> ArrayApuestasLoteria;
	RegistroLoteria ra = new RegistroLoteria();
	
	public LoteriaDAO() {
		ArrayApuestasLoteria = new ArrayList<>();
	}
	
	public void create(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreloteria,int numero,int serie) {
		LoteriaDTO esda = new LoteriaDTO(nombreSede, cedula, diaApuesta, valorApuesto, nombreloteria,numero,serie);
		
		
		
		ArrayApuestasLoteria.add(esda);
		ra.escribirRegistro(ArrayApuestasLoteria);
		read();
	}
	
	public void update(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreloteria,int numero,int serie) {
		read();
		int indice = buscarxid(cedula);
		LoteriaDTO apuestamodificar = new LoteriaDTO(nombreSede, cedula, diaApuesta, valorApuesto, nombreloteria,numero,serie);
		ArrayApuestasLoteria.set(indice, apuestamodificar);
		ra.escribirRegistro(ArrayApuestasLoteria);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		ArrayApuestasLoteria = ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		LoteriaDTO jugaboraar = buscar(cedula);
		ArrayApuestasLoteria.remove(jugaboraar);
		ra.escribirRegistro(ArrayApuestasLoteria);
		read();		
	}
	
	public LoteriaDTO buscar(long cedula) {
		read();
		for(int i = 0;i<ArrayApuestasLoteria.size();i++) {
			if(ArrayApuestasLoteria.get(i).getCedula() == cedula) {
				return ArrayApuestasLoteria.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<ArrayApuestasLoteria.size();i++) {
			if(ArrayApuestasLoteria.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<LoteriaDTO> getArrayApuestasLoteria() {
		return ArrayApuestasLoteria;
	}

	public void setArrayApuestasLoteria(ArrayList<LoteriaDTO> arrayApuestasLoteria) {
		ArrayApuestasLoteria = arrayApuestasLoteria;
	}
	
}


