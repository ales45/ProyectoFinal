package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

import co.edu.unbosque.model.Crupier;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View gui;
	private Crupier m;
	
	public Controller() {
		gui = new View(this);
		gui.mostrarVentana();
		m = new Crupier();
	}
	
	
	@Override
public void actionPerformed(ActionEvent evento) {
	//evento botones regresar
	if(evento.getActionCommand().equals(gui.getPanelBotonRegresar().REGRESAR)) {
		gui.regresar();
	}
	if(evento.getActionCommand().equals(gui.getPanelbotonRegresarM4().REGRESARM4)) {
		gui.regresarM4();
	}
	if(evento.getActionCommand().equals(gui.getBotonRegresarM5().REGRESARM5)) {
		gui.regresarM5();
	}
	if(evento.getActionCommand().equals(gui.getVm1().getPanelBotonRegresarM1().REGRESARM1)) {
		gui.regresarM1();
	}
		
	
	//gestion para mostrar modulo1
	if(evento.getActionCommand().equals(gui.getPanelBotones().CAMBIARMODULO1)) {
		gui.mostrasVentanamodulo1();	
	}
	//casa
		if(evento.getActionCommand().equals(gui.getVm1().getPanelModulo1().PARAMETRIZACIONCASA)) {
			gui.mostrarVentanamodulo1Casa();
		}
			if(evento.getActionCommand().equals(gui.getVm1c().getPanelParametrizacionCasa().CREARCA1)) {
				m.crearM1casa(gui.getVm1c().getPanelParametrizacionCasa().getTxtNombreCasaApuestas().getText(),
						Integer.parseInt(gui.getVm1c().getPanelParametrizacionCasa().getTxtNumSedes().getText()) ,
						Long.parseLong(gui.getVm1c().getPanelParametrizacionCasa().getTxtPresupuesto().getText()));
			}
			if(evento.getActionCommand().equals(gui.getVm1c().getPanelParametrizacionCasa().ACTUALIZARCA1)) {
				m.updateM1casa(gui.getVm1c().getPanelParametrizacionCasa().getTxtNombreCasaApuestas().getText(), 
						Integer.parseInt(gui.getVm1c().getPanelParametrizacionCasa().getTxtNumSedes().getText()), 
						Long.parseLong(gui.getVm1c().getPanelParametrizacionCasa().getTxtPresupuesto().getText()));

			}
			if(evento.getActionCommand().equals(gui.getVm1c().getPanelParametrizacionCasa().BUSCARCA1)) {
				String nombre = gui.nombreBuscar();
				gui.getVm1c().getPanelParametrizacionCasa().getTxtNombreCasaApuestas().setText(String.valueOf(m.buscarM1casa(nombre).get(1)));
				gui.getVm1c().getPanelParametrizacionCasa().getTxtNumSedes().setText(String.valueOf(m.buscarM1casa(nombre).get(0)));
				gui.getVm1c().getPanelParametrizacionCasa().getTxtPresupuesto().setText(String.valueOf(m.buscarM1casa(nombre).get(2)));

			}
	//juego
		if(evento.getActionCommand().equals(gui.getVm1().getPanelModulo1().PARAMETRIZACIONJUEGO)) {
			gui.mostrarVentanaMODULO1Juego();
		}
			if(evento.getActionCommand().equals(gui.getVm1J().getPanelModulo1Juego().CREARCJ1)) {
				m.crearM1Juego(gui.getVm1J().getPanelModulo1Juego().getTxtNombreJuego().getText(),
						gui.getVm1J().getPanelModulo1Juego().getTxtTipoJuego().getText(), 
						Double.parseDouble(gui.getVm1J().getPanelModulo1Juego().getTxtPresupuestoPorJuego().getText()));
			}
			if(evento.getActionCommand().equals(gui.getVm1J().getPanelModulo1Juego().ACTUALIZARCJ1)) {
				m.updateM1Juego(gui.getVm1J().getPanelModulo1Juego().getTxtNombreJuego().getText(),
						gui.getVm1J().getPanelModulo1Juego().getTxtTipoJuego().getText(), 
						Long.parseLong(gui.getVm1J().getPanelModulo1Juego().getTxtPresupuestoPorJuego().getText()));
			}
			if(evento.getActionCommand().equals(gui.getVm1J().getPanelModulo1Juego().BUSCARCJ1)) {
				String nombre = gui.nombreBuscar();
				gui.getVm1J().getPanelModulo1Juego().getTxtNombreJuego().setText(String.valueOf(m.buscarM1Juego(nombre).get(0)));
				gui.getVm1J().getPanelModulo1Juego().getTxtPresupuestoPorJuego().setText(String.valueOf(m.buscarM1Juego(nombre).get(2)));
				gui.getVm1J().getPanelModulo1Juego().getTxtTipoJuego().setText(String.valueOf(m.buscarM1Juego(nombre).get(1)));
			}
			
		
	
	
	//gestion para mostrar Modulo2
	if (evento.getActionCommand().equals(gui.getPanelBotones().CAMBIARMODULO2)) {
		gui.mostrarVentanaModulo2();;
		}
		//condicionales CRUD
		if(evento.getActionCommand().equals(gui.getVm2().getPanelModulo2().CREARM2)) {
			m.crearSede(gui.getVm2().getPanelModulo2().getTxtNombreSede().getText(),
						gui.getVm2().getPanelModulo2().getTxtUbicacion().getText(),
						Integer.parseInt(gui.getVm2().getPanelModulo2().getTxtNumeroEmpleados().getText()));
			
			
			System.out.println("--------\n"+gui.getPanelModulo2().getTxtNombreSede().getText());
			System.out.println(gui.getPanelModulo2().getTxtNumeroEmpleados().getText());
			System.out.println(gui.getPanelModulo2().getTxtUbicacion().getText());
		}
		
		gui.ocultarinformacionM2();
		if(evento.getActionCommand().equals(gui.getVm2().getPanelModulo2().ACTUALIZARM2)) {
			m.updateSede(gui.getVm2().getPanelModulo2().getTxtNombreSede().getText(),
			gui.getVm2().getPanelModulo2().getTxtNumeroEmpleados().getText(),                     
			Integer.parseInt(gui.getVm2().getPanelModulo2().getTxtNumeroEmpleados().getText()));
		}
		if(evento.getActionCommand().equals(gui.getVm2().getPanelModulo2().BUSCARM2)) {
			String nombre = gui.nombreBuscar();
			gui.getVm2().getPanelModulo2().getTxtNombreSede().setText((String) m.buscarsedes(nombre).get(0));
			gui.getVm2().getPanelModulo2().getTxtUbicacion().setText((String) m.buscarsedes(nombre).get(1));
			gui.getVm2().getPanelModulo2().getTxtNumeroEmpleados().setText(String.valueOf(m.buscarsedes(nombre).get(2)));


			System.out.println(gui.getPanelModulo2().getTxtNombreSede().getText());
			System.out.println(gui.getPanelModulo2().getTxtNumeroEmpleados().getText());
			System.out.println(gui.getPanelModulo2().getTxtUbicacion().getText());


		}
	
	//gestion para los botonnes relacionados con el modulo3 y el CRUD	
	if(evento.getActionCommand().equals(gui.getPanelBotones().CAMBIARMODULO3)) {	
		gui.mostrarVentanaModulo3();
		gui.ocultarVentanaPrincipal();
	}
		//control de metodos, para crear,actualizar,buscar y borrar
		if (evento.getActionCommand().equals(gui.getPanelModulo3().CREARM3)) {
		
			String nombre = gui.getPanelModulo3().getTxtNombre().getText();
			long cedula = Long.parseLong(gui.getPanelModulo3().getTxtCedula().getText());
			String sede = gui.getPanelModulo3().getTxtSede().getText();
			String dirrecion = gui.getPanelModulo3().getTxtDirrecion().getText();
			long celular = Long.parseLong(gui.getPanelModulo3().getTxtCelular().getText());

			m.crearApostador(nombre, cedula, sede, dirrecion, celular);
			
			gui.ocultarinformacionM3();
		}	
		if (evento.getActionCommand().equals(gui.getPanelModulo3().BUSCARM3)) {
			try {
			long cedulabuscar = Long.parseLong(gui.nombreBuscar()) ;
			
			ArrayList objeto = m.buscarApostador(cedulabuscar);
			
			gui.getPanelModulo3().getTxtNombre().setText((String)objeto.get(0)); 
			String cedula = String.valueOf(objeto.get(1));	
			gui.getPanelModulo3().getTxtCedula().setText((cedula)); 
			gui.getPanelModulo3().getTxtSede().setText((String)objeto.get(2)); 
			gui.getPanelModulo3().getTxtDirrecion().setText((String)objeto.get(3));
			String celular = String.valueOf(objeto.get(4));
			gui.getPanelModulo3().getTxtCelular().setText((celular));
			}catch (Exception e) {
				gui.mostrarMensaje("no persona");
			}
			
		}
		if(evento.getActionCommand().equals(gui.getPanelModulo3().ACTUALIZARM3)) {

			
			m.modificarApostador(gui.getPanelModulo3().getTxtNombre().getText(), 
			m.transformarLong(gui.getPanelModulo3().getTxtCedula().getText()),gui.getPanelModulo3().getTxtSede().getText()
			,gui.getPanelModulo3().getTxtDirrecion().getText(),
			m.transformarLong(gui.getPanelModulo3().getTxtCelular().getText()));
			
			gui.ocultarinformacionM3();
		}
		
		//boton borrar
		if(evento.getActionCommand().equals(gui.getPanelModulo3().BORRARM3)) {
			long cedulabuscar = Long.parseLong(gui.nombreBuscar());
			
			m.eliminarApostador(cedulabuscar);
			
			gui.ocultarinformacionM3();
		}
		
		
	//condicionales de botones modulo4{
	if(evento.getActionCommand().equals(gui.getPanelBotones().CAMBIARMODULO4)) {
		gui.mostrarVentanaM4();	
		
	}
		//condiciones Juegos
		//baloto
		if(evento.getActionCommand().equals(gui.getVm4().getPanelModulo4TJ().BALOTO)) {
			gui.mostrarVentanaBaloto();
		}
			//Condicionales CRUD BALOTO
			if(evento.getActionCommand().equals(gui.getvBaloto().getPanelBaloto().CREARBALOTO)) {
				String nombreSede = gui.Buscar("Nombre de la sede");
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				String Dia = gui.Buscar("Dia que realiza la apuesta");
				
				m.crearBaloto(nombreSede,
						cedula, 
						Dia, 
						Long.parseLong(gui.getvBaloto().getPanelBaloto().getTxtValorApuesta().getText()), 
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum1().getText()), 
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum2().getText()), 
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum3().getText()), 
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum4().getText()), 
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum5().getText()),
						Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum6().getText())
						);
				gui.ocultarinformacionBalotoM4();
						
			}
			if(evento.getActionCommand().equals(gui.getvBaloto().getPanelBaloto().ACTUALIZARBALOTO)) {
				Long cedula = Long.parseLong(gui.Buscar("digite la cedula con que realizo la apuesta"));
				
				ArrayList<Object> datosNoModificar = m.ValoresBalotoNoM(cedula);
				m.modificarBaloto((String)datosNoModificar.get(0),
								  cedula,
								  (String)datosNoModificar.get(1), 
								  Long.parseLong( gui.getvBaloto().getPanelBaloto().getTxtValorApuesta().getText()),
							Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum1().getText()), 
							Integer.parseInt( gui.getvBaloto().getPanelBaloto().getTxtNum2().getText()), 
							Integer.parseInt( gui.getvBaloto().getPanelBaloto().getTxtNum3().getText()), 
							Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum4().getText()), 
							Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum5().getText()), 
							Integer.parseInt(gui.getvBaloto().getPanelBaloto().getTxtNum6().getText()) 
);
				gui.ocultarinformacionBalotoM4();
			}
			if(evento.getActionCommand().equals(gui.getvBaloto().getPanelBaloto().BUSCARBALOTO)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				ArrayList<Object> cosa = m.buscarBaloto(cedula);
				
				gui.getvBaloto().getPanelBaloto().getTxtNum1().setText(String.valueOf(cosa.get(0)));
				gui.getvBaloto().getPanelBaloto().getTxtNum2().setText(String.valueOf(cosa.get(1)));
				gui.getvBaloto().getPanelBaloto().getTxtNum3().setText(String.valueOf(cosa.get(2)));
				gui.getvBaloto().getPanelBaloto().getTxtNum4().setText(String.valueOf(cosa.get(3)));
				gui.getvBaloto().getPanelBaloto().getTxtNum5().setText(String.valueOf(cosa.get(4)));
				gui.getvBaloto().getPanelBaloto().getTxtNum6().setText(String.valueOf(cosa.get(5)));
				gui.getvBaloto().getPanelBaloto().getTxtValorApuesta().setText(String.valueOf(cosa.get(6)));
				
			}
			if(evento.getActionCommand().equals(gui.getvBaloto().getPanelBaloto().BORRARBALOTO)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));

				m.eliminarBaloto(cedula);
				
				gui.ocultarinformacionBalotoM4();
			}
		//BETPLAY
		if(evento.getActionCommand().equals(gui.getVm4().getPanelModulo4TJ().BETPLAY)) {
			gui.mostrarVentanaBetplay();;
			m.reiniciarArray();
		}
			//Condicionales CRUD BETPLAY
			
			if(evento.getActionCommand().equals(gui.getVBetplay().getPanelBetplay().GUARDARBETPLAY)) {
				int seleccion = 0;;
				String a = (String) gui.getVBetplay().getPanelBetplay().getcBOXlistaPartido().getSelectedItem();
				switch (a) {
				case "Nacional vs Millonarios":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					
				 	m.getPartidos()[0] = seleccion;
					break;
				case "Tolima vs RealMadrid":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[1] = seleccion;
					break;

				case "ChaparralFC vs Boca":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[2] = seleccion;
					break;

				case "Tolima vs Millonarios":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[3] = seleccion;
					break;

				case "Beitar Jerusalén vs Jabal al Mukaber":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[4] = seleccion;
					break;

				case "FKShajtarDonetsk vs 	PFC CSKA Moscú":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[5] = seleccion;
					break;

				case "Amnokgang vs Daegu":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[6] = seleccion;
					break;

				case "F.C.Asdod vs Hapoel Tel Aviv":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[7] = seleccion;
					break;

				case "TainanCityFC vs Shandong Taishan":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[8] = seleccion;
					break;

				case "AlianzaPetrolera vs Barcelona":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[9] = seleccion;
					break;

				case "RealSoachaCundinamarca vs PSG	":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[10] = seleccion;
					break;

				case "FortalezaCEIF vs Corinthians":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[11] = seleccion;
					break;

				case "Colombia vs Comoras":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[12] = seleccion;
					break;

				case "tonga vs seychelles":
					if(gui.getVBetplay().getPanelBetplay().getRadio1().isSelected()) {
						seleccion = 0;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio2().isSelected()) {
						seleccion = 1;
					}
					if(gui.getVBetplay().getPanelBetplay().getRadio3().isSelected()) {
						seleccion = 2;
					}
					m.getPartidos()[13] = seleccion;
					break;

				default:
					break;
				}
				gui.getVBetplay().getPanelBetplay().getRadio1().setSelected(false);
				gui.getVBetplay().getPanelBetplay().getRadio2().setSelected(false);
				gui.getVBetplay().getPanelBetplay().getRadio3().setSelected(false);
			}
			if(evento.getActionCommand().equals(gui.getVBetplay().getPanelBetplay().CREARBETPLAY)){
				String nombreSede = gui.Buscar("Nombre de la sede");
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				String Dia = gui.Buscar("Dia que realiza la apuesta");
				m.crearBetplay(nombreSede, cedula, Dia, Long.parseLong(gui.getVBetplay().getPanelBetplay().getTxtvalorApuesta().getText()));
			}
				
		//SUPERASTRO
		if(evento.getActionCommand().equals(gui.getVm4().getPanelModulo4TJ().SUPERASTRO)) {
			gui.mostrarVentanaSuperAstro();
		}
			//Condicionales CRUD SUPERASTRO
			if(evento.getActionCommand().equals(gui.getvSuperAstro().getPanelSuperAstro().CREARMSUPERASTRO)) {
				String nombreSede = gui.Buscar("Nombre de la sede");
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				String Dia = gui.Buscar("Dia que realiza la apuesta");
		
				m.crearSuperAstro(nombreSede,
								  cedula, 
								  Dia, 
								  Long.parseLong(gui.getvSuperAstro().getPanelSuperAstro().getTxtValorApuesta().getText()), 
								  gui.getvSuperAstro().getPanelSuperAstro().getTxtNombreZodiaco().getText(), 
								  Integer.parseInt(gui.getvSuperAstro().getPanelSuperAstro().getTxtNumero().getText()));
				gui.ocultarinformacionSuperAstro();

			}
			if(evento.getActionCommand().equals(gui.getvSuperAstro().getPanelSuperAstro().ACTUALIZARSUPERASTRO)) {
				Long cedula = Long.parseLong(gui.Buscar("digite la cedula con que realizo la apuesta"));
				
				ArrayList<Object> datosNoModificarSA = m.ValoresSuperAtro(cedula);
				
				m.modificarSuperAstro(String.valueOf(datosNoModificarSA.get(0)),  
									  cedula,
									  String.valueOf(datosNoModificarSA.get(1)),
									  Long.parseLong(gui.getvSuperAstro().getPanelSuperAstro().getTxtValorApuesta().getText()),
									  String.valueOf(gui.getvSuperAstro().getPanelSuperAstro().getTxtNombreZodiaco().getText()),
									  Integer.parseInt(gui.getvSuperAstro().getPanelSuperAstro().getTxtNumero().getText()));
				gui.ocultarinformacionSuperAstro();

				
			}
			if(evento.getActionCommand().equals(gui.getvSuperAstro().getPanelSuperAstro().BUSCARSUPERASTRO)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				ArrayList<Object> cosa = m.buscarSuperAstro(cedula);
				
				gui.getvSuperAstro().getPanelSuperAstro().getTxtNombreZodiaco().setText((String) cosa.get(0));
				gui.getvSuperAstro().getPanelSuperAstro().getTxtNumero().setText(String.valueOf(cosa.get(1)));
				gui.getvSuperAstro().getPanelSuperAstro().getTxtValorApuesta().setText(String.valueOf(cosa.get(2)));
			}
			if(evento.getActionCommand().equals(gui.getvSuperAstro().getPanelSuperAstro().BORRARSUPERASTRO)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				m.eliminarSuperAstro(cedula);
				
				gui.ocultarinformacionSuperAstro();
			}
		
		//CHANCE
		if(evento.getActionCommand().equals(gui.getVm4().getPanelModulo4TJ().CHANCE)) {
			gui.mostrarVentanaChance();
		}
			//Condicionales CRUD CHANCE
			if(evento.getActionCommand().equals(gui.getvChance().getPanelChance().CREARMCHANCE)) {
				String nombreSede = gui.Buscar("Nombre de la sede");
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				String Dia = gui.Buscar("Dia que realiza la apuesta");
				
				m.crearChance(nombreSede, cedula, Dia,
						Long.parseLong(gui.getvChance().getPanelChance().getTxtValorApuesta().getText()), 
						String.valueOf(gui.getvChance().getPanelChance().getTxtSignoDelZodiaco().getText()), 
						Integer.parseInt(gui.getvChance().getPanelChance().getTxtNumeroChance().getText()));
				gui.ocultarinformacionChance();
			}
			if(evento.getActionCommand().equals(gui.getvChance().getPanelChance().ACTUALIZARCHANCE)) {
				Long cedula = Long.parseLong(gui.Buscar("digite la cedula con que realizo la apuesta"));
				
				ArrayList<Object> datosNoModificarChance = m.ValoresChance(cedula);
				
				m.modificarChance(String.valueOf(datosNoModificarChance.get(0)), cedula, String.valueOf(datosNoModificarChance.get(1)), 
						Long.parseLong(gui.getvChance().getPanelChance().getTxtValorApuesta().getText()), 
						gui.getvChance().getPanelChance().getTxtSignoDelZodiaco().getText(), 
						Integer.parseInt(gui.getvChance().getPanelChance().getTxtNumeroChance().getText()));
				gui.ocultarinformacionChance();
			}
			if(evento.getActionCommand().equals(gui.getvChance().getPanelChance().BUSCARCHANCE)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				ArrayList<Object> cosa = m.buscarChance(cedula);
				
				gui.getvChance().getPanelChance().getTxtValorApuesta().setText(String.valueOf(cosa.get(2)));
				gui.getvChance().getPanelChance().getTxtSignoDelZodiaco().setText(String.valueOf(cosa.get(0)));
				gui.getvChance().getPanelChance().getTxtNumeroChance().setText(String.valueOf(cosa.get(1)));
			}
			if(evento.getActionCommand().equals(gui.getvChance().getPanelChance().BORRARCHANCE)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				m.eliminarCahnce(cedula);
				gui.ocultarinformacionChance();
			}
		
		//LOTERIA
		if(evento.getActionCommand().equals(gui.getVm4().getPanelModulo4TJ().LOTERIA)) {
			gui.mostrarVentanaLoteria();
		}
			//Condicionales CRUD LOTERIA
			if(evento.getActionCommand().equals(gui.getvLoteria().getPanelLoteria().CREARMLOTERIA)) {
				String nombreSede = gui.Buscar("Nombre de la sede");
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				String Dia = gui.Buscar("Dia que realiza la apuesta");
				
				m.crearLoteria(nombreSede, cedula, Dia,
						Long.parseLong(gui.getvLoteria().getPanelLoteria().getTxtValorApuesta().getText()), 
						gui.getvLoteria().getPanelLoteria().getTxtNombreLoteria().getText(), 
						Integer.parseInt(gui.getvLoteria().getPanelLoteria().getTxtNumero().getText()), 
						Integer.parseInt(gui.getvLoteria().getPanelLoteria().getTxtSerie().getText()));
				gui.ocultarinformacionLoteria();
			}
			if(evento.getActionCommand().equals(gui.getvLoteria().getPanelLoteria().ACTUALIZARLOTERIA)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				ArrayList<Object> valoresLoteria = m.ValoresLoteria(cedula);
				
				m.modificarLoteria(String.valueOf(valoresLoteria.get(0)), cedula, String.valueOf(valoresLoteria.get(1)),
						Long.parseLong(gui.getvLoteria().getPanelLoteria().getTxtValorApuesta().getText()), 
						gui.getvLoteria().getPanelLoteria().getTxtNombreLoteria().getText(), 
						Integer.parseInt(gui.getvLoteria().getPanelLoteria().getTxtNumero().getText()), 
						Integer.parseInt(gui.getvLoteria().getPanelLoteria().getTxtSerie().getText()));
				
				gui.ocultarinformacionLoteria();
			}
			if(evento.getActionCommand().equals(gui.getvLoteria().getPanelLoteria().BUSCARLOTERIA)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				ArrayList<Object> cosa = m.buscarLoteria(cedula);
				
				gui.getvLoteria().getPanelLoteria().getTxtValorApuesta().setText(String.valueOf(cosa.get(3)));
				gui.getvLoteria().getPanelLoteria().getTxtNombreLoteria().setText(String.valueOf(cosa.get(0)));
				gui.getvLoteria().getPanelLoteria().getTxtNumero().setText(String.valueOf(cosa.get(1)));
				gui.getvLoteria().getPanelLoteria().getTxtSerie().setText(String.valueOf(cosa.get(2)));
			}
			if(evento.getActionCommand().equals(gui.getvLoteria().getPanelLoteria().BORRARLOTERIA)) {
				Long cedula = Long.parseLong(gui.Buscar("Dame tu Cedula"));
				
				m.eliminarLoteria(cedula);
				gui.ocultarinformacionLoteria();
			}

		
		
	//condicionales modulo 5
	if(evento.getActionCommand().equals(gui.getVp().getPanelPrincipalBotones().CAMBIARMODULO5)){
		gui.mostrarVentanaModulo5E();
	}
		//Control Consultas Modulo5
		if(evento.getActionCommand().equals(gui.getVm5().getPanelModulo5El().LISTACLIENTES)) {
			gui.ocultarListadodeclientes();
			gui.mostrarListadoClientes();
			gui.agregarListadoClientes(m.mostrarclientes());

		}
		if(evento.getActionCommand().equals(gui.getVm5().getPanelModulo5El().APUESTASXCLIENTES)) {
			gui.ocultarValorApuesta();
			gui.mostrarValorApuestas();
			gui.agregaValorApuestas(m.mostrarvalorApues());
		}
		if(evento.getActionCommand().equals(gui.getVm5().getPanelModulo5El().DETALLESAPUESTAS)) {
			gui.ocultarDetalleApuesta();
			gui.mostrardetalleapuestas();
			gui.agregarDetalleApuestas(m.mostrardetalleApuestas());
			gui.agregarDetalleApuestas2(m.mostrarApuesta2());
		}
		if(evento.getActionCommand().equals(gui.getVm5().getPanelModulo5El().TOTALAPUESTASXSEDE)) {
			gui.ocultarTotalApuesta();
			gui.mostrarTotalApuestas();
			gui.agregarTotalApuestas(m.mostrartotalApuestas2());
			gui.agregarTotalApuestas2(m.mostrartotalApuestas());
	
		}

	}
}
