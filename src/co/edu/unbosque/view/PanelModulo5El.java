package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelModulo5El extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnListadoClientesSede;
	private JButton btnValorTotalApuesta;
	private JButton btnDetalleApuestasXclientesYSede;
	private JButton btnTotalApuestasXSedeyTipoJuego;
	
	public static final String LISTACLIENTES = "ListaClientes";
	public static final String APUESTASXCLIENTES = "ApuestasxClientes";
	public static final String DETALLESAPUESTAS = "ClientesYSede";
	public static final String TOTALAPUESTASXSEDE = "Sedes y TipJuego";



	public PanelModulo5El() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(2,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//creacion de botones
		
		btnListadoClientesSede = new JButton("CLIENTES POR SEDE");
		btnListadoClientesSede.setActionCommand(LISTACLIENTES);
		btnListadoClientesSede.setForeground(Color.BLACK);
		btnListadoClientesSede.setBackground(Color.WHITE);
		
		btnValorTotalApuesta = new JButton("VALOR TOTAL APUESTAS(CLIENTES)");
		btnValorTotalApuesta.setActionCommand(APUESTASXCLIENTES);
		btnValorTotalApuesta.setForeground(Color.BLACK);
		btnValorTotalApuesta.setBackground(Color.WHITE);
		
		btnDetalleApuestasXclientesYSede = new JButton("DETALLES DE APUESTAS");
		btnDetalleApuestasXclientesYSede.setActionCommand(DETALLESAPUESTAS);
		btnDetalleApuestasXclientesYSede.setForeground(Color.BLACK);
		btnDetalleApuestasXclientesYSede.setBackground(Color.WHITE);
		
		btnTotalApuestasXSedeyTipoJuego = new JButton("TOTAL APUESTAS");
		btnTotalApuestasXSedeyTipoJuego.setActionCommand(TOTALAPUESTASXSEDE);
		btnTotalApuestasXSedeyTipoJuego.setForeground(Color.BLACK);
		btnTotalApuestasXSedeyTipoJuego.setBackground(Color.WHITE);
		
		add(btnListadoClientesSede);
		add(btnValorTotalApuesta);
		add(btnDetalleApuestasXclientesYSede);
		add(btnTotalApuestasXSedeyTipoJuego);
		
	}



	public JButton getBtnListadoClientesSede() {
		return btnListadoClientesSede;
	}



	public void setBtnListadoClientesSede(JButton btnListadoClientesSede) {
		this.btnListadoClientesSede = btnListadoClientesSede;
	}



	public JButton getBtnValorTotalApuesta() {
		return btnValorTotalApuesta;
	}



	public void setBtnValorTotalApuesta(JButton btnValorTotalApuesta) {
		this.btnValorTotalApuesta = btnValorTotalApuesta;
	}



	public JButton getBtnDetalleApuestasXclientesYSede() {
		return btnDetalleApuestasXclientesYSede;
	}



	public void setBtnDetalleApuestasXclientesYSede(JButton btnDetalleApuestasXclientesYSede) {
		this.btnDetalleApuestasXclientesYSede = btnDetalleApuestasXclientesYSede;
	}



	public JButton getBtnTotalApuestasXSedeyTipoJuego() {
		return btnTotalApuestasXSedeyTipoJuego;
	}



	public void setBtnTotalApuestasXSedeyTipoJuego(JButton btnTotalApuestasXSedeyTipoJuego) {
		this.btnTotalApuestasXSedeyTipoJuego = btnTotalApuestasXSedeyTipoJuego;
	}
	
}
