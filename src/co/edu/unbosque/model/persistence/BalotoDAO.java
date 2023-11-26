package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class BalotoDAO {

	ArrayList<BalotoDTO> arraybBaloto;
	RegistroBaloto ra = new RegistroBaloto();
	
	public BalotoDAO() {
		arraybBaloto = new ArrayList<>();
	}
	
	public void create(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,int numero1,int numero2,int numero3,int numero4,int numero5,int numero6) {
		BalotoDTO asde = new BalotoDTO(nombreSede,cedula,diaApuesta,valorApuesto,numero1,numero2,numero3,numero4,numero5,numero6);
		
		
		arraybBaloto.add(asde);
		ra.escribirRegistro(arraybBaloto);
		read();
	}
	
	public void update(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,int numero1,int numero2,int numero3,int numero4,int numero5,int numero6) {
		read();
		int indice = buscarxid(cedula);
		BalotoDTO asde = new BalotoDTO(nombreSede,cedula,diaApuesta,valorApuesto,numero1,numero2,numero3,numero4,numero5,numero6);
		arraybBaloto.set(indice, asde);
		ra.escribirRegistro(arraybBaloto);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		arraybBaloto = ra.leerRegistro();
				}
	
	
	public void delete(long cedula) {
		read();
		BalotoDTO jugaboraar = buscar(cedula);
		System.out.println("1"+jugaboraar.getCedula());
		arraybBaloto.remove(jugaboraar);
		ra.escribirRegistro(arraybBaloto);
		read();		
	}
	
	public BalotoDTO buscar(long cedula) {
		read();
		for(int i = 0;i<arraybBaloto.size();i++) {
			if(arraybBaloto.get(i).getCedula() == cedula) {
				return arraybBaloto.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(long cedula) {
		read();
		for(int i = 0;i<arraybBaloto.size();i++) {
			if(arraybBaloto.get(i).getCedula() == cedula) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<BalotoDTO> getArraybBaloto() {
		return arraybBaloto;
	}

	public void setArraybBaloto(ArrayList<BalotoDTO> arraybBaloto) {
		this.arraybBaloto = arraybBaloto;
	}
	
}


