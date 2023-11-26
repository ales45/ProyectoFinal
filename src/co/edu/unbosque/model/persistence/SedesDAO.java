package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

// Clase que implementa la interfaz CRUDOperations para operaciones CRUD en sedes
public class SedesDAO implements CRUDOperations {

    // Lista que almacena instancias de SedesDTO
    private ArrayList<SedesDTO> listaSedes;

    // Objeto RegistroSedes para operaciones de lectura y escritura
    private RegistroSedes1 re = new RegistroSedes1();

    // Constructor que inicializa la lista de sedes
    public SedesDAO() {
        listaSedes = new ArrayList<>();
    }

    // Implementación del método create de la interfaz CRUDOperations
    @Override
    public void create(String nombre, String ubicacion, int numEmpleados) {
        SedesDTO sedes = new SedesDTO(nombre, ubicacion, numEmpleados);    
        
        // Agregar a la lista y escribir en el registro
        listaSedes.add(sedes);
        re.escribirRegistro(listaSedes);
        read(); // Actualizar la lista de sedes
    }

    // Implementación del método readAll de la interfaz CRUDOperations


    // Implementación del método updateByUbication de la interfaz CRUDOperations
    @Override
    public void updateByUbication(String nombre,String ubicacion, int numEmpleados) {
        read();
        int indice = buscarxid(nombre);
        SedesDTO sedesModificado = new SedesDTO(nombre,ubicacion, numEmpleados);
        listaSedes.set(indice, sedesModificado);
        re.escribirRegistro(listaSedes);
        read(); // Actualizar la lista de sedes
    }

    // Implementación del método delete de la interfaz CRUDOperations
    @Override
    public void delete(String ubicacion) {
        read();
        SedesDTO sedeborrar = buscarSede(ubicacion);
        listaSedes.remove(sedeborrar);
        re.escribirRegistro(listaSedes);
        read(); // Actualizar la lista de sedes
    }

    // Implementación del método read de la interfaz CRUDOperations
    @Override
    public void read() {
        listaSedes = re.leerRegistro();
    }

    // Método para buscar una sede por ubicación
    public SedesDTO buscarSede(String nombre) {
        read();
        for (int i = 0; i < listaSedes.size(); i++) {
            if (listaSedes.get(i).getNombreSede().equals(nombre)) {
                return listaSedes.get(i);
            }
        }
        return null;
    }

    // Método para buscar el índice de una sede por ubicación
    public int buscarxid(String nombre) {
        read();
        for (int i = 0; i < listaSedes.size(); i++) {
            if (listaSedes.get(i).getNombreSede().equals(nombre)) {
                return i;
            }
        }
        return 0;
    }

	public ArrayList<SedesDTO> getListaSedes() {
		return listaSedes;
	}

	public void setListaSedes(ArrayList<SedesDTO> listaSedes) {
		this.listaSedes = listaSedes;
	}


    
    
}

