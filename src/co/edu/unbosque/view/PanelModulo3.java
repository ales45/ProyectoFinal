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

public class PanelModulo3 extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnCrear;
	private JButton btnBuscar;
	private JButton btnActualizar;
	private JButton btnBorrar;
	
	
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtSede;
	private JTextField txtDirrecion;
	private JTextField txtCelular;


	private JLabel labNombre;
	private JLabel labCedula;
	private JLabel labSede;
	private JLabel labDirrecion;
	private JLabel labCelular;
	
	public static final String CREARM3 = "Crearm3";
	public static final String ACTUALIZARM3 = "Actualizarm3";
	public static final String BORRARM3 = "Borrarm3";
	public static final String BUSCARM3 = "Buscarm3";

	
	public PanelModulo3() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(7,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
			
		btnCrear = new JButton("CREAR APOSTADOR");
		btnCrear.setActionCommand(CREARM3);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);

		btnBuscar = new JButton("BUSCAR APOSTADOR");
		btnBuscar.setActionCommand(BUSCARM3);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);

		btnActualizar = new JButton("ACTUALIZAR APOSTADOR");
		btnActualizar.setActionCommand(ACTUALIZARM3);
		btnActualizar.setForeground(Color.BLACK);
		btnActualizar.setBackground(Color.WHITE);
		
		btnBorrar = new JButton("BORRAR APOSTADOR");
		btnBorrar.setActionCommand(BORRARM3);
		btnBorrar.setForeground(Color.BLACK);
		btnBorrar.setBackground(Color.WHITE);
		
		

		//labels
		
		labNombre = new JLabel("Nombre");
		labNombre.setBorder(border);
		
		labCedula = new JLabel("Cedula");
		labCedula.setBorder(border);

		labSede = new JLabel("Sede");
		labSede.setBorder(border);
		
		labDirrecion = new JLabel("Dirrecion");
		labDirrecion.setBorder(border);
		
		labCelular = new JLabel("Celular");
		labCelular.setBorder(border);
		//txt
		
		txtNombre = new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setBorder(border);
		
		txtCedula = new JTextField("");
		txtCedula.setForeground(Color.BLACK);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setBorder(border);

		txtSede = new JTextField("");
		txtSede.setForeground(Color.BLACK);
		txtSede.setBackground(Color.WHITE);
		txtSede.setBorder(border);
		
		txtDirrecion = new JTextField("");
		txtDirrecion.setForeground(Color.BLACK);
		txtDirrecion.setBackground(Color.WHITE);
		txtDirrecion.setBorder(border);
		
		txtCelular = new JTextField("");
		txtCelular.setForeground(Color.BLACK);
		txtCelular.setBackground(Color.WHITE);
		txtCelular.setBorder(border);
		
		
		//labels y txt
		add(txtNombre);
		add(labNombre);
		add(txtCedula);
		add(labCedula);
		add(txtSede);
		add(labSede);
		add(txtDirrecion);
		add(labDirrecion);
		add(txtCelular);
		add(labCelular);
		//Btn
		add(btnCrear);
		add(btnBuscar);
		add(btnActualizar);
		add(btnBorrar);
		
	

	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtCedula() {
		return txtCedula;
	}


	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}


	public JTextField getTxtSede() {
		return txtSede;
	}


	public void setTxtSede(JTextField txtSede) {
		this.txtSede = txtSede;
	}


	public JTextField getTxtDirrecion() {
		return txtDirrecion;
	}


	public void setTxtDirrecion(JTextField txtDirrecion) {
		this.txtDirrecion = txtDirrecion;
	}


	public JTextField getTxtCelular() {
		return txtCelular;
	}


	public void setTxtCelular(JTextField txtCelular) {
		this.txtCelular = txtCelular;
	}


	public JLabel getLabNombre() {
		return labNombre;
	}


	public void setLabNombre(JLabel labNombre) {
		this.labNombre = labNombre;
	}


	public JLabel getLabCedula() {
		return labCedula;
	}


	public void setLabCedula(JLabel labCedula) {
		this.labCedula = labCedula;
	}


	public JLabel getLabSede() {
		return labSede;
	}


	public void setLabSede(JLabel labSede) {
		this.labSede = labSede;
	}


	public JLabel getLabDirrecion() {
		return labDirrecion;
	}


	public void setLabDirrecion(JLabel labDirrecion) {
		this.labDirrecion = labDirrecion;
	}


	public JLabel getLabCelular() {
		return labCelular;
	}


	public void setLabCelular(JLabel labCelular) {
		this.labCelular = labCelular;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
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


	public JButton getBtnBorrar() {
		return btnBorrar;
	}


	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}


	public static String getCrearm3() {
		return CREARM3;
	}


	public static String getActualizarm3() {
		return ACTUALIZARM3;
	}


	public static String getBorrarm3() {
		return BORRARM3;
	}


	public static String getBuscarm3() {
		return BUSCARM3;
	}



	


	
	}