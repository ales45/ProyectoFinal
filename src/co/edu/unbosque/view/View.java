package co.edu.unbosque.view;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

/**
 * 
 */
public class View  {
	
	private VentanaPrincipal vp;
	
	private VentanaModulo1 vm1;
	private VentanaModulo1Casa vm1c;
	private VentanaModulo1Juego vm1J;
	
	private VentanaModulo2 vm2;
	
	private VentanaModulo3 vm3;
	
	private VentanaModulo4TJ vm4;
	private VentanaBaloto vBaloto;
	private VentanaBetplay VBetplay;
	private VentanaChance vChance;
	private VentanaLoteria vLoteria;
	private VentanaSuperAstro vSuperAstro;
	
	private VentanaModulo5E vm5;
	private VentanaListaClientes vlistaClientes;
	private VentanaValorTotalApuestas vValorApuestas;
	private VentanaDetalleApuestas vDetalleApuestas;
	private VentanaTotalApuestas vTotalApuestas;
	
	
	public View(Controller Controller) {

		vp = new VentanaPrincipal(Controller);
		
		vm1 = new VentanaModulo1(Controller);
		vm1c = new VentanaModulo1Casa(Controller);
		vm1J = new VentanaModulo1Juego(Controller);
		
		vm2 = new VentanaModulo2(Controller);
		
		vm3 = new VentanaModulo3(Controller);
		
		vm4 = new VentanaModulo4TJ(Controller);
		vBaloto = new VentanaBaloto(Controller);
		VBetplay = new VentanaBetplay(Controller);
		vChance = new VentanaChance(Controller);
		vLoteria = new VentanaLoteria(Controller);
		vSuperAstro = new VentanaSuperAstro(Controller);
		
		vm5 = new VentanaModulo5E(Controller);
		vlistaClientes = new VentanaListaClientes(Controller);
		vValorApuestas = new VentanaValorTotalApuestas(Controller);
		vDetalleApuestas = new VentanaDetalleApuestas(Controller);
		vTotalApuestas = new VentanaTotalApuestas(Controller);
	}
	//metodos para ocultar informacion modulos
	
	//modulo1
	public void ocultarinformacionM1Casa() {
		
	}
	public void ocultarinformacionM1Juegos() {
		
	}
	
	//modulo2
	public void ocultarinformacionM2() {
		vm2.getPanelModulo2().getTxtNombreSede().setText(null);
		vm2.getPanelModulo2().getTxtNumeroEmpleados().setText(null);
		vm2.getPanelModulo2().getTxtUbicacion().setText(null);
	}
	//modulo3
	public void ocultarinformacionM3() {
		vm3.getPanelModulo3().getTxtNombre().setText(null);
		vm3.getPanelModulo3().getTxtCedula().setText(null);
		vm3.getPanelModulo3().getTxtSede().setText(null);
		vm3.getPanelModulo3().getTxtDirrecion().setText(null);
		vm3.getPanelModulo3().getTxtCelular().setText(null);
	}
	//modulo4
		//baloto
		public void ocultarinformacionBalotoM4() {
			vBaloto.getPanelBaloto().getTxtNum1().setText(null);
			vBaloto.getPanelBaloto().getTxtNum2().setText(null);
			vBaloto.getPanelBaloto().getTxtNum3().setText(null);
			vBaloto.getPanelBaloto().getTxtNum4().setText(null);
			vBaloto.getPanelBaloto().getTxtNum5().setText(null);
			vBaloto.getPanelBaloto().getTxtNum6().setText(null);
			vBaloto.getPanelBaloto().getTxtValorApuesta().setText(null);
		}
		//superastro
		public void ocultarinformacionSuperAstro() {
			vSuperAstro.getPanelSuperAstro().getTxtNombreZodiaco().setText(null);
			vSuperAstro.getPanelSuperAstro().getTxtNumero().setText(null);
			vSuperAstro.getPanelSuperAstro().getTxtValorApuesta().setText(null);
		}
		//chance
		public void ocultarinformacionChance() {
			vChance.getPanelChance().getTxtNumeroChance().setText(null);
			vChance.getPanelChance().getTxtSignoDelZodiaco().setText(null);
			vChance.getPanelChance().getTxtValorApuesta().setText(null);
		}
		//loteria
		public void ocultarinformacionLoteria() {
			vLoteria.getPanelLoteria().getTxtNombreLoteria().setText(null);
			vLoteria.getPanelLoteria().getTxtNumero().setText(null);
			vLoteria.getPanelLoteria().getTxtSerie().setText(null);
			vLoteria.getPanelLoteria().getTxtValorApuesta().setText(null);
		}
		public void ocultarListadodeclientes() {
			vlistaClientes.getPanelListaClientes().getTxtAclientessede().setText(null);
		}
		public void ocultarDetalleApuesta() {
			vDetalleApuestas.getPanelDetallesApuestas().getTxtDetalleApuestas().setText(null);
		}
		public void ocultarValorApuesta() {
			vValorApuestas.getPanelValorApuestas().getTxtValorApuestas().setText(null);
		}
		public void ocultarTotalApuesta() {
			vTotalApuestas.getPanelTotalApuestas().getTxtTotalApuestas().setText(null);
		}
		public void ocultarM1c() {
			vm1c.getPanelParametrizacionCasa().getTxtNombreCasaApuestas().setText(null);
			vm1c.getPanelParametrizacionCasa().getTxtNumSedes().setText(null);
			vm1c.getPanelParametrizacionCasa().getTxtPresupuesto().setText(null);
		}
		public void ocultarM1J() {
			vm1J.getPanelModulo1Juego().getTxtNombreJuego().setText(null);
			vm1J.getPanelModulo1Juego().getTxtNombreJuego().setText(null);
			vm1J.getPanelModulo1Juego().getTxtNombreJuego().setText(null);

		}
	
	//Control vistas Botones Regresar
	public void regresar() {
		vm2.setVisible(false);
		vm4.setVisible(false);
		vm3.setVisible(false);
		vm5.setVisible(false);
		vp.setVisible(true);
	}
	public void regresarM1() {
		vm1c.setVisible(false);
		vm1J.setVisible(false);
		vm1.setVisible(true);
	}
	
	public void regresarM4() {
		vBaloto.setVisible(false);
		vChance.setVisible(false);
		vLoteria.setVisible(false);
		VBetplay.setVisible(false);
		vSuperAstro.setVisible(false);
		vm4.setVisible(true);
	}
	public void regresarM5() {
		vlistaClientes.setVisible(false);
		vValorApuestas.setVisible(false);
		vDetalleApuestas.setVisible(false);
		vTotalApuestas.setVisible(false);
		vm5.setVisible(true);
	}
	
	
	
	//Cambio entre Ventanas
		//control ventana principal
	
	public void ocultarVentanaPrincipal() {	
		vp.setVisible(false); 
	}
	public void mostrarVentana() {
		vp.setVisible(true); 
	}
	//control vista modulo1
	public void mostrasVentanamodulo1() {
		vp.setVisible(false);
		vm1.setVisible(true);
	}
	public void mostrarVentanamodulo1Casa() {
		vm1.setVisible(false);
		vm1c.setVisible(true);
	}
	public void mostrarVentanaMODULO1Juego() {
		vm1.setVisible(false);
		vm1J.setVisible(true);
	}
	
	//control vista modulo2
	public void mostrarVentanaModulo2() {
		vp.setVisible(false);
		vm2.setVisible(true);
	}
	//control vista modulo3
	public void mostrarVentanaModulo3() {		
		vm3.setVisible(true); 
	}
	//control vistas modulo 4
	public void mostrarVentanaM4() {
		vp.setVisible(false);
		vm4.setVisible(true);
	}
	public void mostrarVentanaBaloto() {
		vm4.setVisible(false);
		vBaloto.setVisible(true);
	}
	public void mostrarVentanaBetplay() {
		vm4.setVisible(false);
		VBetplay.setVisible(true);
	}
	public void mostrarVentanaChance() {
		vm4.setVisible(false);
		vChance.setVisible(true);
	}
	public void mostrarVentanaLoteria() {
		vm4.setVisible(false);
		vLoteria.setVisible(true);
	}
	public void mostrarVentanaSuperAstro() {
		vm4.setVisible(false);
		vSuperAstro.setVisible(true);
	}
	//control vistas modulo5 
	public void mostrarVentanaModulo5E() {
		vp.setVisible(false);
		vm5.setVisible(true);
	}
	public void mostrarListadoClientes() {
		vm5.setVisible(false);
		vlistaClientes.setVisible(true);
	}
	public void mostrarValorApuestas() {
		vm5.setVisible(false);
		vValorApuestas.setVisible(true);
	}
	public void mostrardetalleapuestas() {
		vm5.setVisible(false);
		vDetalleApuestas.setVisible(true);
	}
	public void mostrarTotalApuestas() {
		vm5.setVisible(false);
		vTotalApuestas.setVisible(true);
	}
	
	
	
	//metodo para pedir un string por medio de un joptionpane
	public String nombreBuscar() {
		String nombre = JOptionPane.showInputDialog("Introduce la cedula del apostador");
		return nombre;
	}
	public String Buscar(String dato) {
		String nombre = JOptionPane.showInputDialog(dato);
		return nombre;
	}
	//metodo para mostrar mensajes, por medio de un joptionpane
	public void mostrarMensaje(String cadena) {
		JOptionPane.showMessageDialog(null,cadena);
	}
	
	
	//metodos para agregar informacion a los textarea
	public void agregarListadoClientes(String datos) {
		vlistaClientes.getPanelListaClientes().getTxtAclientessede().append(datos);
	}
	public void agregaValorApuestas(String datos) {
		vValorApuestas.getPanelValorApuestas().getTxtValorApuestas().append(datos);
	}
	public void agregarDetalleApuestas(String datos) {
		vDetalleApuestas.getPanelDetallesApuestas().getTxtDetalleApuestas().append(datos);
	}
	public void agregarDetalleApuestas2(String datos) {
		vDetalleApuestas.getPanelDetallesApuestas().getTxtDetalleApuestas2().append(datos);
	}
	public void agregarTotalApuestas(String datos) {
		vTotalApuestas.getPanelTotalApuestas().getTxtTotalApuestas().append(datos);
	}
	public void agregarTotalApuestas2(String datos) {
		vTotalApuestas.getPanelTotalApuestas().getTxtTotalApuestas2().append(datos);
	}
	
	//setters y getters
	public PanelPrincipalBotones getPanelBotones() {

	return vp.getPanelPrincipalBotones();
	}
	public PanelModulo3 getPanelModulo3() {

		return vm3.getPanelModulo3();
		}
	public PanelBotonRegresar getPanelBotonRegresar() {
		return vm3.getPanelBotonRegresar();
	}
	public PanelModulo2 getPanelModulo2() {

		return vm2.getPanelModulo2();
		}

	public PanelBotonRegresarM4 getPanelbotonRegresarM4() {
		return vBaloto.getPanelBotonRegresarM4();
	}
	public PanelBotonRegresarM5 getBotonRegresarM5() {
		return vlistaClientes.getPanelBotonRegresarM5();
	}
	public VentanaModulo4TJ getVm4() {
		return vm4;
	}
	public void setVm4(VentanaModulo4TJ vm4) {
		this.vm4 = vm4;
	}
	public VentanaPrincipal getVp() {
		return vp;
	}
	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}
	public VentanaModulo3 getVm3() {
		return vm3;
	}
	public void setVm3(VentanaModulo3 vm3) {
		this.vm3 = vm3;
	}
	public VentanaBaloto getvBaloto() {
		return vBaloto;
	}
	public void setvBaloto(VentanaBaloto vBaloto) {
		this.vBaloto = vBaloto;
	}
	public VentanaBetplay getVBetplay() {
		return VBetplay;
	}
	public void setVBetplay(VentanaBetplay vBetplay) {
		VBetplay = vBetplay;
	}
	public VentanaChance getvChance() {
		return vChance;
	}
	public void setvChance(VentanaChance vChance) {
		this.vChance = vChance;
	}
	public VentanaLoteria getvLoteria() {
		return vLoteria;
	}
	public void setvLoteria(VentanaLoteria vLoteria) {
		this.vLoteria = vLoteria;
	}
	public VentanaSuperAstro getvSuperAstro() {
		return vSuperAstro;
	}
	public void setvSuperAstro(VentanaSuperAstro vSuperAstro) {
		this.vSuperAstro = vSuperAstro;
	}
	public VentanaModulo5E getVm5() {
		return vm5;
	}
	public void setVm5(VentanaModulo5E vm5) {
		this.vm5 = vm5;
	}
	public VentanaListaClientes getVlistaClientes() {
		return vlistaClientes;
	}
	public void setVlistaClientes(VentanaListaClientes vlistaClientes) {
		this.vlistaClientes = vlistaClientes;
	}
	public VentanaValorTotalApuestas getvValorApuestas() {
		return vValorApuestas;
	}
	public void setvValorApuestas(VentanaValorTotalApuestas vValorApuestas) {
		this.vValorApuestas = vValorApuestas;
	}
	public VentanaDetalleApuestas getvDetalleApuestas() {
		return vDetalleApuestas;
	}
	public void setvDetalleApuestas(VentanaDetalleApuestas vDetalleApuestas) {
		this.vDetalleApuestas = vDetalleApuestas;
	}
	public VentanaTotalApuestas getvTotalApuestas() {
		return vTotalApuestas;
	}
	public void setvTotalApuestas(VentanaTotalApuestas vTotalApuestas) {
		this.vTotalApuestas = vTotalApuestas;
	}
	public VentanaModulo2 getVm2() {
		return vm2;
	}
	public void setVm2(VentanaModulo2 vm2) {
		this.vm2 = vm2;
	}

	public VentanaModulo1 getVm1() {
		return vm1;
	}

	public void setVm1(VentanaModulo1 vm1) {
		this.vm1 = vm1;
	}

	public VentanaModulo1Casa getVm1c() {
		return vm1c;
	}

	public void setVm1c(VentanaModulo1Casa vm1c) {
		this.vm1c = vm1c;
	}

	public VentanaModulo1Juego getVm1J() {
		return vm1J;
	}

	public void setVm1J(VentanaModulo1Juego vm1j) {
		vm1J = vm1j;
	}
	
	
	
}
