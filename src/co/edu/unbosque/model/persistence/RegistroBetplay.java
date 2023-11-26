	package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RegistroBetplay {
	private String ruta = "./data/Apuesta-Betplay.dat";
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	
	public String escribirRegistro(ArrayList<BetplayDTO> apost) {
		String mensaje = "Registro de jugadores Ingresado!";
		f=new File(ruta);
    

		try {
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos); 
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(apost);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
		
	public ArrayList<BetplayDTO> leerRegistro() {
        ObjectInputStream in;
        ArrayList<BetplayDTO> datos = new ArrayList<>();
        f=new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			in = new ObjectInputStream(new FileInputStream(ruta));
	        datos = (ArrayList<BetplayDTO>)in.readObject();
	        in.close();
	 

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datos;
	}

}
