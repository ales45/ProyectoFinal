package co.edu.unbosque.model.persistence;

public interface CRUDOperations {
	

	public void delete(String ubicacion);
	public void read();
	void create(String nombre, String ubicacion, int numEmpleados);
	void updateByUbication(String nombre, String ubicacion, int numEmpleados);


}
