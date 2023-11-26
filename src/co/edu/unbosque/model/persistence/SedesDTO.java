package co.edu.unbosque.model.persistence;

import java.io.Serializable;

// Clase que representa la información de una sede
public class SedesDTO implements Serializable {

    // Atributos de la clase
	private String NombreSede;
    private String ubicacion;
    private int numEmpleados;

    // Constructor predeterminado sin parámetros
    public SedesDTO() {
        // TODO Auto-generated constructor stub
    }

    // Constructor con parámetros para inicializar la sede con ubicación y número de empleados
    public SedesDTO(String nombre,String ubicacion, int numEmpleados) {
        super(); // Llamada al constructor de la clase padre (Object)
        this.ubicacion = ubicacion;
        this.numEmpleados = numEmpleados;
        this.NombreSede = nombre;
    }

    // Getter para obtener la ubicación de la sede
    public String getUbicacion() {
        return ubicacion;
    }

    // Setter para establecer la ubicación de la sede
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Getter para obtener el número de empleados de la sede
    public int getNumEmpleados() {
        return numEmpleados;
    }

    // Setter para establecer el número de empleados de la sede
    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getNombreSede() {
		return NombreSede;
	}

	public void setNombreSede(String nombreSede) {
		NombreSede = nombreSede;
	}

	// Método toString para obtener una representación de cadena de la instancia actual
    @Override
    public String toString() {
        return "SedesDTO [ubicacion=" + ubicacion + ", numEmpleados=" + numEmpleados + "]";
    }
}
