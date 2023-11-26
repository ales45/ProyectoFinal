package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelModulo1Juego extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnCrear;
	private JButton btnBuscar;
	private JButton btnActualizar;
	private JButton btnGuardar;

	private JTextField txtNombreJuego;
	private JTextField txtTipoJuego;
	private JTextField txtPresupuestoPorJuego;
	

	private JLabel labNombreJuego;
	private JLabel labTipoJuego;
	private JLabel labPresupuestoPorJuego;
	
	
	public static final String CREARCJ1 = "Crearcj1";
	public static final String ACTUALIZARCJ1 = "Actualizarcj1";
	public static final String BUSCARCJ1 = "Buscarcj1";
	public static final String GUARDARCJ1 = "Guardarcj1";

	
	public PanelModulo1Juego() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(5,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
			
		btnCrear = new JButton("CREAR PARAMETROS");
		btnCrear.setActionCommand(CREARCJ1);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);

		btnBuscar = new JButton("BUSCAR PARAMETROS");
		btnBuscar.setActionCommand(BUSCARCJ1);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);

		btnActualizar = new JButton("ACTUALIZAR PARAMETROS");
		btnActualizar.setActionCommand(ACTUALIZARCJ1);
		btnActualizar.setForeground(Color.BLACK);
		btnActualizar.setBackground(Color.WHITE);
		
		btnGuardar = new JButton("GUARDAR PARAMETROS");
		btnGuardar.setActionCommand(GUARDARCJ1);
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setBackground(Color.WHITE);

		//labels
		
		labNombreJuego = new JLabel("Nombre de la casa de apuestas");
		labNombreJuego.setBorder(border);
		
		labTipoJuego = new JLabel("Numero de sedes");
		labTipoJuego.setBorder(border);

		labPresupuestoPorJuego = new JLabel("Presupuesto total disponible para repartir premios");
		labPresupuestoPorJuego.setBorder(border);

		//txt
		
		txtNombreJuego = new JTextField("");
		txtNombreJuego.setForeground(Color.BLACK);
		txtNombreJuego.setBackground(Color.WHITE);
		txtNombreJuego.setBorder(border);
		
		txtTipoJuego = new JTextField("");
		txtTipoJuego.setForeground(Color.BLACK);
		txtTipoJuego.setBackground(Color.WHITE);
		txtTipoJuego.setBorder(border);

		txtPresupuestoPorJuego = new JTextField("");
		txtPresupuestoPorJuego.setForeground(Color.BLACK);
		txtPresupuestoPorJuego.setBackground(Color.WHITE);
		txtPresupuestoPorJuego.setBorder(border);
	
		
		//labels y txt
		add(labNombreJuego);
		add(txtNombreJuego);
		add(labTipoJuego);
		add(txtTipoJuego);
		add(labPresupuestoPorJuego);
		add(txtPresupuestoPorJuego);
	
		//Btn
		add(btnCrear);
		add(btnBuscar);
		add(btnActualizar);
		add(btnBuscar);

	}


	public JButton getBtnCrear() {
		return btnCrear;
	}


	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}


	public JButton getBtnBuscar() {
		return btnBuscar;
	}


	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}


	public JButton getBtnActualizar() {
		return btnActualizar;
	}


	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}


	public JButton getBtnGuardar() {
		return btnGuardar;
	}


	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}


	public JTextField getTxtNombreJuego() {
		return txtNombreJuego;
	}


	public void setTxtNombreJuego(JTextField txtNombreJuego) {
		this.txtNombreJuego = txtNombreJuego;
	}


	public JTextField getTxtTipoJuego() {
		return txtTipoJuego;
	}


	public void setTxtTipoJuego(JTextField txtTipoJuego) {
		this.txtTipoJuego = txtTipoJuego;
	}


	public JTextField getTxtPresupuestoPorJuego() {
		return txtPresupuestoPorJuego;
	}


	public void setTxtPresupuestoPorJuego(JTextField txtPresupuestoPorJuego) {
		this.txtPresupuestoPorJuego = txtPresupuestoPorJuego;
	}


	public JLabel getLabNombreJuego() {
		return labNombreJuego;
	}


	public void setLabNombreJuego(JLabel labNombreJuego) {
		this.labNombreJuego = labNombreJuego;
	}


	public JLabel getLabTipoJuego() {
		return labTipoJuego;
	}


	public void setLabTipoJuego(JLabel labTipoJuego) {
		this.labTipoJuego = labTipoJuego;
	}


	public JLabel getLabPresupuestoPorJuego() {
		return labPresupuestoPorJuego;
	}


	public void setLabPresupuestoPorJuego(JLabel labPresupuestoPorJuego) {
		this.labPresupuestoPorJuego = labPresupuestoPorJuego;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getCrearcj1() {
		return CREARCJ1;
	}


	public static String getActualizarcj1() {
		return ACTUALIZARCJ1;
	}


	public static String getBuscarcj1() {
		return BUSCARCJ1;
	}


	public static String getGuardarcj1() {
		return GUARDARCJ1;
	}


	
	}
