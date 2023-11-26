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

public class PanelParametrizacionCasa extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnCrear;
	private JButton btnBuscar;
	private JButton btnActualizar;
		
	private JTextField txtNombreCasaApuestas;
	private JTextField txtNumSedes;
	private JTextField txtPresupuesto;
	

	private JLabel labNombreCasaApuestas;
	private JLabel labNumSedes;
	private JLabel labPresupuesto;
	
	
	public static final String CREARCA1 = "Crearca1";
	public static final String ACTUALIZARCA1 = "Actualizarca1";
	public static final String BUSCARCA1 = "Buscarca1";

	
	public PanelParametrizacionCasa() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(5,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
			
		btnCrear = new JButton("CREAR PARAMETROS");
		btnCrear.setActionCommand(CREARCA1);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);

		btnBuscar = new JButton("BUSCAR PARAMETROS");
		btnBuscar.setActionCommand(BUSCARCA1);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);

		btnActualizar = new JButton("ACTUALIZAR PARAMETROS");
		btnActualizar.setActionCommand(ACTUALIZARCA1);
		btnActualizar.setForeground(Color.BLACK);
		btnActualizar.setBackground(Color.WHITE);

		//labels
		
		labNombreCasaApuestas = new JLabel("Nombre de la casa de apuestas");
		labNombreCasaApuestas.setBorder(border);
		
		labNumSedes = new JLabel("Numero de sedes");
		labNumSedes.setBorder(border);

		labPresupuesto = new JLabel("Presupuesto total disponible para repartir premios");
		labPresupuesto.setBorder(border);

		//txt
		
		txtNombreCasaApuestas = new JTextField("");
		txtNombreCasaApuestas.setForeground(Color.BLACK);
		txtNombreCasaApuestas.setBackground(Color.WHITE);
		txtNombreCasaApuestas.setBorder(border);
		
		txtNumSedes = new JTextField("");
		txtNumSedes.setForeground(Color.BLACK);
		txtNumSedes.setBackground(Color.WHITE);
		txtNumSedes.setBorder(border);

		txtPresupuesto = new JTextField("");
		txtPresupuesto.setForeground(Color.BLACK);
		txtPresupuesto.setBackground(Color.WHITE);
		txtPresupuesto.setBorder(border);
	
		
		//labels y txt
		add(labNombreCasaApuestas);
		add(txtNombreCasaApuestas);
		add(labNumSedes);
		add(txtNumSedes);
		add(labPresupuesto);
		add(txtPresupuesto);
	
		//Btn
		add(btnCrear);
		add(btnBuscar);
		add(btnActualizar);
		

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


	public JTextField getTxtNombreCasaApuestas() {
		return txtNombreCasaApuestas;
	}


	public void setTxtNombreCasaApuestas(JTextField txtNombreCasaApuestas) {
		this.txtNombreCasaApuestas = txtNombreCasaApuestas;
	}


	public JTextField getTxtNumSedes() {
		return txtNumSedes;
	}


	public void setTxtNumSedes(JTextField txtNumSedes) {
		this.txtNumSedes = txtNumSedes;
	}


	public JTextField getTxtPresupuesto() {
		return txtPresupuesto;
	}


	public void setTxtPresupuesto(JTextField txtPresupuesto) {
		this.txtPresupuesto = txtPresupuesto;
	}


	public JLabel getLabNombreCasaApuestas() {
		return labNombreCasaApuestas;
	}


	public void setLabNombreCasaApuestas(JLabel labNombreCasaApuestas) {
		this.labNombreCasaApuestas = labNombreCasaApuestas;
	}


	public JLabel getLabNumSedes() {
		return labNumSedes;
	}


	public void setLabNumSedes(JLabel labNumSedes) {
		this.labNumSedes = labNumSedes;
	}


	public JLabel getLabPresupuesto() {
		return labPresupuesto;
	}


	public void setLabPresupuesto(JLabel labPresupuesto) {
		this.labPresupuesto = labPresupuesto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static String getCrearca1() {
		return CREARCA1;
	}


	public static String getActualizarca1() {
		return ACTUALIZARCA1;
	}


	public static String getBuscarca1() {
		return BUSCARCA1;
	}
	}