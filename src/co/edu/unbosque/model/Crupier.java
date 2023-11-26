package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.*;


public class Crupier {

	private ApostadoresDAO apostadordao;
	private SedesDAO sDao;
	private LoteriaDAO loteriaDAO;
	private ChanceDAO chanceDAO;
	private SuperAstroDAO superAstroDAO;
	private BalotoDAO balotoDao;
	private BetplayDAO betplayDAO;
	private	int[] partidos;
	private juegosApuestasDAO jjuegoApuestaDAO;
	private CasaParametroDAO casaDAO;
	
	public Crupier() {
		apostadordao = new ApostadoresDAO();
		sDao = new SedesDAO();
		loteriaDAO = new LoteriaDAO();
		chanceDAO = new ChanceDAO();
		superAstroDAO = new SuperAstroDAO();
		balotoDao = new BalotoDAO();
		partidos = new int[14];
		betplayDAO = new BetplayDAO();
		jjuegoApuestaDAO = new juegosApuestasDAO();
		casaDAO = new CasaParametroDAO();
	}
	
	//conversiones
	public long transformarLong(String numero) {
		return Long.parseLong(numero);
	}
	//metodos Partidos
	public void reiniciarArray() {
		for(int i = 0;i<partidos.length;i++) {
			partidos[i] = 4;
		}
	}
	//OPERADORES CRUD MODULO1
		//MODULO1 JUEGO
		public void crearM1Juego(String nombre,String tipodeJuego,double presupuestoJuego) {
			
			jjuegoApuestaDAO.create(nombre,tipodeJuego,presupuestoJuego);
		}
		public ArrayList<Object> buscarM1Juego(String nombre) {
			ArrayList<Object> datos = new ArrayList<>();
			datos.add(jjuegoApuestaDAO.buscar(nombre).getNombre());
			datos.add(jjuegoApuestaDAO.buscar(nombre).getTipoJuego());
			datos.add(jjuegoApuestaDAO.buscar(nombre).getPresupuestoJuego());
			
			return datos;
			
		}
		public void updateM1Juego(String nombre,String tipodeJuego,double presupuestoJuego) {
			jjuegoApuestaDAO.update(nombre,tipodeJuego,presupuestoJuego);
		}
		//Modulo1 casa
		public void crearM1casa(String nombreCasaApuestas,int numsedes,long presupuestoTotal) {
			
			casaDAO.create(nombreCasaApuestas,numsedes,presupuestoTotal);
		}
		public ArrayList<Object> buscarM1casa(String nombre) {
			ArrayList<Object> datos = new ArrayList<>();
			datos.add(casaDAO.buscar(nombre).getNumsedes());
			datos.add(casaDAO.buscar(nombre).getNombreCasaApuestas());
			datos.add(casaDAO.buscar(nombre).getPresupuestoTotal());
			
			return datos;
			
		}
		public void updateM1casa(String nombreCasaApuestas,int numsedes,long presupuestoTotal) {
			casaDAO.update(nombreCasaApuestas,numsedes,presupuestoTotal);
		}
	
	//OPERACIONES CRUD MODULO2
	public void crearSede(String nombre,String ubicacion, int numEmpleados) {
		
		sDao.create(nombre,ubicacion, numEmpleados);
	}
	public ArrayList<Object> buscarsedes(String nombre) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(sDao.buscarSede(nombre).getNombreSede());
		datos.add(sDao.buscarSede(nombre).getUbicacion());
		datos.add(sDao.buscarSede(nombre).getNumEmpleados());
		
		return datos;
		
	}
	public void updateSede(String nombre,String ubicacion, int numEmpleados) {
		sDao.updateByUbication(nombre,ubicacion, numEmpleados);
	}
	public void deleteSede(String ubicacion) {
		sDao.delete(ubicacion);
	}
	
	
	//OPERACIONES CRUD MODULO3
	public void crearApostador(String nombre,long cedula, String sede, String direccion,long celular) {
		
		apostadordao.create(nombre, cedula, sede, direccion, celular);
			
	}
	public ArrayList<Object> buscarApostador(long cedula) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(apostadordao.buscar(cedula).getNombre());
		datos.add(apostadordao.buscar(cedula).getCedula());
		datos.add(apostadordao.buscar(cedula).getSede());
		datos.add(apostadordao.buscar(cedula).getDireccion());
		datos.add(apostadordao.buscar(cedula).getCelular());

		
		return datos;
		
	}
	public void modificarApostador(String nombre,long cedula, String sede, String direccion,long celular) {
		
	apostadordao.update(nombre,cedula,sede,direccion,celular);
	
	}
	public void eliminarApostador(long cedula) {
		apostadordao.delete(cedula);
	
	}

	//Metodos para el CRUD MODULO4
	public String obtenerNombreSede(String Nombresede) {
		String nombresedeEncontrado = sDao.buscarSede(Nombresede).getNombreSede();

		return nombresedeEncontrado;
	}
	public Long obtenerCedula(Long cedulabuscar) {
		Long cedulaEncontrada = apostadordao.buscar(cedulabuscar).getCedula();
		
		return cedulaEncontrada;
	}
	public ArrayList<Object> ValoresBalotoNoM(long cedula) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(balotoDao.buscar(cedula).getNombreSede());
		datos.add(balotoDao.buscar(cedula).getDiaApuesta());
		
		return datos;	
	}
	public ArrayList<Object> ValoresSuperAtro(long cedula) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(superAstroDAO.buscar(cedula).getNombreSede());
		datos.add(superAstroDAO.buscar(cedula).getDiaApuesta());
		
		return datos;	
	}
	public ArrayList<Object> ValoresChance(long cedula) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(chanceDAO.buscar(cedula).getNombreSede());
		datos.add(chanceDAO.buscar(cedula).getDiaApuesta());
		
		return datos;	
	}
	public ArrayList<Object> ValoresLoteria(long cedula) {
		ArrayList<Object> datos = new ArrayList<>();
		datos.add(loteriaDAO.buscar(cedula).getNombreSede());
		datos.add(loteriaDAO.buscar(cedula).getDiaApuesta());
		
		return datos;	
	}
	


	
	//OPERACIONES CRUD MODULO4
		//LOTERIA
			public void crearLoteria(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreloteria,int numero,int serie) {
				nombreSede = obtenerNombreSede(nombreSede);
				cedula = obtenerCedula(cedula);
				loteriaDAO.create(nombreSede,cedula,diaApuesta,valorApuesto,nombreloteria,numero,serie);
			}
			public ArrayList<Object> buscarLoteria(long cedula) {
				ArrayList<Object> datos = new ArrayList<>();
				datos.add(loteriaDAO.buscar(cedula).getNombreLoteria());
				datos.add(loteriaDAO.buscar(cedula).getNumero());
				datos.add(loteriaDAO.buscar(cedula).getSerie());
				datos.add(loteriaDAO.buscar(cedula).getValorApuesta());
				
				
				return datos;
				
			}
			public void modificarLoteria(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreloteria,int numero,int serie) {

			loteriaDAO.update(nombreSede,cedula,diaApuesta,valorApuesto,nombreloteria,numero,serie);
			
			}
			public void eliminarLoteria(long cedula) {
				loteriaDAO.delete(cedula);
			
			}
		//baloto
			public void crearBaloto(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,int numero1,int numero2,int numero3,int numero4,int numero5,int numero6) {
				nombreSede = obtenerNombreSede(nombreSede);
				cedula = obtenerCedula(cedula);
				balotoDao.create(nombreSede,cedula,diaApuesta,valorApuesto,numero1,numero2,numero3,numero4,numero5,numero6);
			}
			public ArrayList<Object> buscarBaloto(long cedula) {
				ArrayList<Object> datos = new ArrayList<>();
				datos.add(balotoDao.buscar(cedula).getNumero1());
				datos.add(balotoDao.buscar(cedula).getNumero2());
				datos.add(balotoDao.buscar(cedula).getNumero3());
				datos.add(balotoDao.buscar(cedula).getNumero4());
				datos.add(balotoDao.buscar(cedula).getNumero5());
				datos.add(balotoDao.buscar(cedula).getNumero6());
				datos.add(balotoDao.buscar(cedula).getValorApuesta());


	
				
				return datos;
				
			}
			public void modificarBaloto(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,int numero1,int numero2,int numero3,int numero4,int numero5,int numero6) {
			
			balotoDao.update(nombreSede,cedula,diaApuesta,valorApuesto,numero1,numero2,numero3,numero4,numero5,numero6);
			
			}
			public void eliminarBaloto(long cedula) {
				balotoDao.delete(cedula);
			
			}
		//CHANCE
			public void crearChance(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreLoteria,int numero) {
				nombreSede = obtenerNombreSede(nombreSede);
				cedula = obtenerCedula(cedula);
				chanceDAO.create(nombreSede,cedula,diaApuesta,valorApuesto,nombreLoteria,numero);
			}
			public ArrayList<Object> buscarChance(long cedula) {
				ArrayList<Object> datos = new ArrayList<>();
				datos.add(chanceDAO.buscar(cedula).getNombreLOTERIA());
				datos.add(chanceDAO.buscar(cedula).getNumero());
				datos.add(chanceDAO.buscar(cedula).getValorApuesta());

				
				return datos;
				
			}
			public void modificarChance(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String nombreLoteria,int numero) {
			
			chanceDAO.update(nombreSede,cedula,diaApuesta,valorApuesto,nombreLoteria,numero);
			
			}
			public void eliminarCahnce(long cedula) {
				chanceDAO.delete(cedula);
			
			}
		//SuperAstro
			public void crearSuperAstro(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String signoZodiaco,int numero) {
				nombreSede = obtenerNombreSede(nombreSede);
				cedula = obtenerCedula(cedula);
				superAstroDAO.create(nombreSede,cedula,diaApuesta,valorApuesto,signoZodiaco,numero);
			}
			public ArrayList<Object> buscarSuperAstro(long cedula) {
				ArrayList<Object> datos = new ArrayList<>();
				datos.add(superAstroDAO.buscar(cedula).getSignoZodiaco());
				datos.add(superAstroDAO.buscar(cedula).getNumero());
				datos.add(superAstroDAO.buscar(cedula).getValorApuesta());

				
				return datos;
				
			}
			public void modificarSuperAstro(String nombreSede, long cedula, String diaApuesta,Long valorApuesto,String signoZodiaco,int numero) {
			
			superAstroDAO.update(nombreSede,cedula,diaApuesta,valorApuesto,signoZodiaco,numero);
			
			}
			public void eliminarSuperAstro(long cedula) {
				chanceDAO.delete(cedula);
			
			}
		//Betplay
			public void crearBetplay(String nombreSede,Long cedula,String diaApuesta,Long valorApuesta) {
				betplayDAO.create(nombreSede, cedula, diaApuesta, valorApuesta, partidos);
			}



			
 //Modulo5
		public String mostrarclientes() {
			String a = "";
			sDao.read();
			apostadordao.read();
			for(int i = 0;i<sDao.getListaSedes().size();i++){
				a += "-------------\nsede:"+sDao.getListaSedes().get(i).getNombreSede()+"\n";
				a += "Clientes:\n";
				for(int t = 0;t<apostadordao.getArrayApostadores().size();t++) {
					if(sDao.getListaSedes().get(i).getNombreSede().equals(apostadordao.getArrayApostadores().get(t).getSede())) {
					a+=apostadordao.getArrayApostadores().get(t).getNombre()+"\n";
					}
				}
			}	
			
			
			return a;
	}
		public String mostrarvalorApues() {
			apostadordao.read();
			balotoDao.read();
			betplayDAO.read();
			chanceDAO.read();
			loteriaDAO.read();
			superAstroDAO.read();
			String a = "";
			int valor = 0;

			for(int i = 0;i<apostadordao.getArrayApostadores().size();i++) {
				valor=0;
				a += "\n-------\ncliente:"+apostadordao.getArrayApostadores().get(i).getNombre()+"\n";
				//baloto
					for(int t = 0;t<balotoDao.getArraybBaloto().size();t++) {
					try {
					if(balotoDao.getArraybBaloto().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						valor += balotoDao.getArraybBaloto().get(t).getValorApuesta();
					}
					}catch (Exception ex) {
						valor+=0;
					}
					}
					//betplay
					for(int t = 0;t<betplayDAO.getArrayBetplayDTOs().size();t++) {
					try {
					if(betplayDAO.getArrayBetplayDTOs().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						valor += betplayDAO.getArrayBetplayDTOs().get(t).getValorApuesta();
					}
					}catch (Exception ex) {
						valor+=0;
					}
					}
					
					//chance
					for(int t = 0;t<chanceDAO.getArraybChanceDTOs().size();t++) {
					try {
					if(chanceDAO.getArraybChanceDTOs().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						valor += chanceDAO.getArraybChanceDTOs().get(t).getValorApuesta();
					}
					}catch (Exception ex) {
						valor+=0;
					}
					}
					//loteria
					for(int t = 0;t<loteriaDAO.getArrayApuestasLoteria().size();t++) {
					try {
					if(loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						valor += loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta();
					}
					}catch (Exception ex) {
						valor+=0;
					}
					}
					//superastro
					for(int t = 0;t<superAstroDAO.getArraySuperAstro().size();t++) {
					try {
					if(superAstroDAO.getArraySuperAstro().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						valor += superAstroDAO.getArraySuperAstro().get(t).getValorApuesta();
					}
					}catch (Exception ex) {
						valor+=0;
					}
					}
					a+="ValorApuesta: "+ valor;

				}
		
			return a;
		}
		public String mostrardetalleApuestas() {
			sDao.read();
			apostadordao.read();
			balotoDao.read();
			betplayDAO.read();
			chanceDAO.read();
			loteriaDAO.read();
			superAstroDAO.read();
			String a="";
			
			

			
			
			//for anidados para las apuestas de cliente
			for(int i = 0;i<apostadordao.getArrayApostadores().size();i++){
				a += "-------------\ncliente:"+sDao.getListaSedes().get(i).getNombreSede()+"\napuestas:\n";
				//baloto
				a+="\nbaloto:\n";
				for(int t = 0;t<balotoDao.getArraybBaloto().size();t++) {
					try {
					if(balotoDao.getArraybBaloto().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						a+="sede: " + balotoDao.getArraybBaloto().get(t).getNombreSede()+"\n"+
						   "Cedula:" + balotoDao.getArraybBaloto().get(t).getCedula()+"\n"+
						   "Dia:" + balotoDao.getArraybBaloto().get(t).getDiaApuesta()+"\n"+
						   "valor:" + balotoDao.getArraybBaloto().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//betplay
				a+="\nbetplay:\n";
				for(int t = 0;t<betplayDAO.getArrayBetplayDTOs().size();t++) {
					try {
					if(betplayDAO.getArrayBetplayDTOs().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						a+="sede: " + betplayDAO.getArrayBetplayDTOs().get(t).getNombreSede()+"\n"+
								   "Cedula:" + betplayDAO.getArrayBetplayDTOs().get(t).getCedula()+"\n"+
								   "Dia:" + betplayDAO.getArrayBetplayDTOs().get(t).getDiaApuesta()+"\n"+
								   "valor:" + betplayDAO.getArrayBetplayDTOs().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
					
				//chance
				a+="\nchance:\n";
				for(int t = 0;t<chanceDAO.getArraybChanceDTOs().size();t++) {
					try {
					if(chanceDAO.getArraybChanceDTOs().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						a+="sede: " + chanceDAO.getArraybChanceDTOs().get(t).getNombreSede()+"\n"+
								   "Cedula:" + chanceDAO.getArraybChanceDTOs().get(t).getCedula()+"\n"+
								   "Dia:" + chanceDAO.getArraybChanceDTOs().get(t).getDiaApuesta()+"\n"+
								   "valor:" + chanceDAO.getArraybChanceDTOs().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//loteria
				a+="\nloteria:\n";
				for(int t = 0;t<loteriaDAO.getArrayApuestasLoteria().size();t++) {
					try {
					if(loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						a+="sede: " + loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede()+"\n"+
								   "Cedula:" + loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()+"\n"+
								   "Dia:" + loteriaDAO.getArrayApuestasLoteria().get(t).getDiaApuesta()+"\n"+
								   "valor:" + loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//superastro
				a+="\nsuperAstro:\n";
				for(int t = 0;t<superAstroDAO.getArraySuperAstro().size();t++) {
					try {
					if(superAstroDAO.getArraySuperAstro().get(t).getCedula()==apostadordao.getArrayApostadores().get(i).getCedula()) {
						a+="sede: " + loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede()+"\n"+
								   "Cedula:" + loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()+"\n"+
								   "Dia:" + loteriaDAO.getArrayApuestasLoteria().get(t).getDiaApuesta()+"\n"+
								   "valor:" + loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				
			}//fin array clientes
			return a;
		}
		public String mostrarApuesta2() {
			sDao.read();
			apostadordao.read();
			balotoDao.read();
			betplayDAO.read();
			chanceDAO.read();
			loteriaDAO.read();
			superAstroDAO.read();
			String b = "";
			//for anidados para sede
			for(int i = 0;i<sDao.getListaSedes().size();i++){
				b += "-------------\nsedes:"+sDao.getListaSedes().get(i).getNombreSede()+"\napuestas:\n";
				//baloto
				b+="\nbaloto:\n";
				for(int t = 0;t<balotoDao.getArraybBaloto().size();t++) {
					try {
					if(balotoDao.getArraybBaloto().get(t).getNombreSede().equals(sDao.getListaSedes().get(i).getNombreSede())) {
						b+="sede: " + balotoDao.getArraybBaloto().get(t).getNombreSede()+"\n"+
						   "Cedula:" + balotoDao.getArraybBaloto().get(t).getCedula()+"\n"+
						   "Dia:" + balotoDao.getArraybBaloto().get(t).getDiaApuesta()+"\n"+
						   "valor:" + balotoDao.getArraybBaloto().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//betplay
				b+="\nbetplay:\n";
				for(int t = 0;t<betplayDAO.getArrayBetplayDTOs().size();t++) {
					try {
					if(betplayDAO.getArrayBetplayDTOs().get(t).getNombreSede().equals(sDao.getListaSedes().get(i).getNombreSede())) {
						b+="sede: " + betplayDAO.getArrayBetplayDTOs().get(t).getNombreSede()+"\n"+
								   "Cedula:" + betplayDAO.getArrayBetplayDTOs().get(t).getCedula()+"\n"+
								   "Dia:" + betplayDAO.getArrayBetplayDTOs().get(t).getDiaApuesta()+"\n"+
								   "valor:" + betplayDAO.getArrayBetplayDTOs().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
					
				//chance
				b+="\nchance:\n";
				for(int t = 0;t<chanceDAO.getArraybChanceDTOs().size();t++) {
					try {
					if(chanceDAO.getArraybChanceDTOs().get(t).getNombreSede().equals(sDao.getListaSedes().get(i).getNombreSede())) {
						b+="sede: " + chanceDAO.getArraybChanceDTOs().get(t).getNombreSede()+"\n"+
								   "Cedula:" + chanceDAO.getArraybChanceDTOs().get(t).getCedula()+"\n"+
								   "Dia:" + chanceDAO.getArraybChanceDTOs().get(t).getDiaApuesta()+"\n"+
								   "valor:" + chanceDAO.getArraybChanceDTOs().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//loteria
				b+="\nloteria:\n";
				for(int t = 0;t<loteriaDAO.getArrayApuestasLoteria().size();t++) {
					try {
					if(loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede().equals(sDao.getListaSedes().get(i).getNombreSede())) {
						b+="sede: " + loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede()+"\n"+
								   "Cedula:" + loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()+"\n"+
								   "Dia:" + loteriaDAO.getArrayApuestasLoteria().get(t).getDiaApuesta()+"\n"+
								   "valor:" + loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				//superastro
				b+="\nsuperAstro:\n";
				for(int t = 0;t<superAstroDAO.getArraySuperAstro().size();t++) {
					try {
					if(superAstroDAO.getArraySuperAstro().get(t).getNombreSede().equals(sDao.getListaSedes().get(i).getNombreSede())) {
						b+="sede: " + loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede()+"\n"+
								   "Cedula:" + loteriaDAO.getArrayApuestasLoteria().get(t).getCedula()+"\n"+
								   "Dia:" + loteriaDAO.getArrayApuestasLoteria().get(t).getDiaApuesta()+"\n"+
								   "valor:" + loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta()+"\n";
					}
					}catch (Exception ex) {
					}
				}
				
			}//fin sede
			return b;
		}
		public String mostrartotalApuestas() {
			apostadordao.read();
			balotoDao.read();
			betplayDAO.read();
			chanceDAO.read();
			loteriaDAO.read();
			superAstroDAO.read();
			String a = "";
			int numApuesta = 0;
			long valor = 0;


				a += "\n-------\nNumeroApuestas:"+"\n";
				//baloto
					for(int t = 0;t<balotoDao.getArraybBaloto().size();t++) {
					try {
					valor = balotoDao.getArraybBaloto().get(t).getValorApuesta();
					if(valor != 0) {
						numApuesta += 1;
					}
					}catch (Exception ex) {
						numApuesta+=0;
					}
					}
					a+="Baloto: "+numApuesta+"\n";
		      //betplay
					numApuesta = 0;
					for(int t = 0;t<betplayDAO.getArrayBetplayDTOs().size();t++) {
					try {
					valor = betplayDAO.getArrayBetplayDTOs().get(t).getValorApuesta();
					if(valor != 0) {
						numApuesta += 1;
					}
					}catch (Exception ex) {
						numApuesta+=0;
					}
					}
					a+="Betplay "+numApuesta+"\n";
				//chance
					numApuesta = 0;
					for(int t = 0;t<chanceDAO.getArraybChanceDTOs().size();t++) {
					try {
					valor = chanceDAO.getArraybChanceDTOs().get(t).getValorApuesta();
					if(valor != 0) {
						numApuesta += 1;
					}
					}catch (Exception ex) {
						numApuesta+=0;
					}
					}
					a += "Chance: "+numApuesta+"\n";
				//loteria
					numApuesta = 0;	
					for(int t = 0;t<loteriaDAO.getArrayApuestasLoteria().size();t++) {
					try {
					valor = loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta();
					if(valor != 0) {
						numApuesta += 1;
					}
					}catch (Exception ex) {
						numApuesta+=0;
					}
					}
					a+="loteria"+numApuesta+"\n";
				//superastro
					numApuesta = 0;
					for(int t = 0;t<superAstroDAO.getArraySuperAstro().size();t++) {
					try {
					valor = superAstroDAO.getArraySuperAstro().get(t).getValorApuesta();
					if(valor != 0) {
						numApuesta += 1;
					}
					}catch (Exception ex) {
						numApuesta+=0;
					}
					}
					a+="superastro"+numApuesta+"\n";
				
		
			return a;
			
		}
		public String mostrartotalApuestas2() {
			apostadordao.read();
			balotoDao.read();
			betplayDAO.read();
			chanceDAO.read();
			loteriaDAO.read();
			superAstroDAO.read();
			String a = "";
			int numApuesta = 0;
			long valor = 0;

			sDao.read();
			apostadordao.read();
			for(int i = 0;i<sDao.getListaSedes().size();i++){
				numApuesta=0;
				a += "-------------\nsede:"+sDao.getListaSedes().get(i).getNombreSede()+"\n";
				//baloto
					for(int t = 0;t<balotoDao.getArraybBaloto().size();t++) {
						try {
							if(sDao.getListaSedes().get(i).getNombreSede().equals(balotoDao.getArraybBaloto().get(t).getNombreSede()))	{
								valor = balotoDao.getArraybBaloto().get(t).getValorApuesta();
									if(valor != 0) {
										numApuesta += 1;
									}
						}}catch (Exception ex) {
							numApuesta+=0;
						}
					}
					
			
		      //betplay
					for(int t = 0;t<betplayDAO.getArrayBetplayDTOs().size();t++) {
						try {
							if(sDao.getListaSedes().get(i).getNombreSede().equals(betplayDAO.getArrayBetplayDTOs().get(t).getNombreSede())) {
								valor = betplayDAO.getArrayBetplayDTOs().get(t).getValorApuesta();
									if(valor != 0) {
										numApuesta += 1;
									}
						}}catch (Exception ex) {
							numApuesta+=0;
						}
					}
				//chance
					numApuesta = 0;
					for(int t = 0;t<chanceDAO.getArraybChanceDTOs().size();t++) {
						try {
							if(sDao.getListaSedes().get(i).getNombreSede().equals(chanceDAO.getArraybChanceDTOs().get(t).getNombreSede())) {
								valor = chanceDAO.getArraybChanceDTOs().get(t).getValorApuesta();
								if(valor != 0) {
									numApuesta += 1;
								}
						}}catch (Exception ex) {
							numApuesta+=0;
						}
						}
					
				//loteria
					for(int t = 0;t<loteriaDAO.getArrayApuestasLoteria().size();t++) {
						try {
							if(sDao.getListaSedes().get(i).getNombreSede().equals(loteriaDAO.getArrayApuestasLoteria().get(t).getNombreSede())) {
								valor = loteriaDAO.getArrayApuestasLoteria().get(t).getValorApuesta();
								if(valor != 0) {
									numApuesta += 1;
								}
						}}catch (Exception ex) {
							numApuesta+=0;
						}
					}
				//superastro
					for(int t = 0;t<superAstroDAO.getArraySuperAstro().size();t++) {
						try {
							if(sDao.getListaSedes().get(i).getNombreSede().equals(superAstroDAO.getArraySuperAstro().get(t).getNombreSede())) {
								valor = superAstroDAO.getArraySuperAstro().get(t).getValorApuesta();
								if(valor != 0) {
									numApuesta += 1;
							}
						}}catch (Exception ex) {
							numApuesta+=0;
						}
					}
					a += "\nNumeroApuestas:"+numApuesta+"\n";
			}	
			
			
			return a;
		}
				

//comprobaciones
		//comprobacion numeros de baloto
	    public static boolean verificarRango(int numero) {
	        return numero >= 1 && numero <= 45;
	    }
			
			
//setters y getters
			public int[] getPartidos() {
				return partidos;
			}

			public void setPartidos(int[] partidos) {
				this.partidos = partidos;
			}
}
