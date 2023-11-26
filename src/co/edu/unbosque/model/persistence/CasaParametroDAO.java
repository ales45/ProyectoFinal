package co.edu.unbosque.model.persistence;

import java.io.Serializable;
import java.util.ArrayList;

public class CasaParametroDAO {

	ArrayList<CasaParametroDTO> casaParametroDTOs;
	RegistroCasaParametro ra = new RegistroCasaParametro();
	
	public CasaParametroDAO() {
		casaParametroDTOs = new ArrayList<>();
	}
	
	public void create(String nombreCasaApuestas,int numsedes,long presupuestoTotal) {
		CasaParametroDTO asde = new CasaParametroDTO(nombreCasaApuestas,numsedes,presupuestoTotal);
		
		
		casaParametroDTOs.add(asde);
		ra.escribirRegistro(casaParametroDTOs);
		read();
	}
	
	public void update(String nombreCasaApuestas,int numsedes,long presupuestoTotal) {
		read();
		int indice = buscarxid(nombreCasaApuestas);
		CasaParametroDTO asde = new CasaParametroDTO(nombreCasaApuestas,numsedes,presupuestoTotal);
		casaParametroDTOs.set(indice, asde);
		ra.escribirRegistro(casaParametroDTOs);
		read();			
	}
		
	//este metodo se usa para actualizar el arraylist
	public void read() {
		casaParametroDTOs= ra.leerRegistro();
				}
	
	
	public CasaParametroDTO buscar(String cedula) {
		read();
		for(int i = 0;i< casaParametroDTOs.size();i++) {
			if(casaParametroDTOs.get(i).getNombreCasaApuestas() == cedula) {
				return casaParametroDTOs.get(i);
			}
		}	
		return null;
	}
	public int buscarxid(String cedula) {
		read();
		for(int i = 0;i<casaParametroDTOs.size();i++) {
			if(casaParametroDTOs.get(i).getNombreCasaApuestas().equals(cedula)) {
				return i;
			}
		}	
		
		return 0;
	}

	public ArrayList<CasaParametroDTO> getCasaParametroDTOs() {
		return casaParametroDTOs;
	}

	public void setCasaParametroDTOs(ArrayList<CasaParametroDTO> casaParametroDTOs) {
		this.casaParametroDTOs = casaParametroDTOs;
	}



}


