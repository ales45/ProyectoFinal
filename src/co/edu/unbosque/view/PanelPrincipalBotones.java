package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPrincipalBotones extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton modulo1;
	private JButton modulo2;
	private JButton modulo3;
	private JButton modulo4;
	private JButton modulo5;
	public static final String CAMBIARMODULO1 = "Cambiarmodulo1";
	public static final String CAMBIARMODULO2 = "Cambiarmodulo2";
	public static final String CAMBIARMODULO3 = "Cambiarmodulo3";
	public static final String CAMBIARMODULO4 = "Cambiarmodulo4";
	public static final String CAMBIARMODULO5 = "Cambiarmodulo5";

	
	public PanelPrincipalBotones() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(3,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
			
		modulo1 = new JButton("PARAMETRIZACIÓN DE LA CASA DE APUESTAS");
		modulo1.setActionCommand(CAMBIARMODULO1);
		modulo1.setForeground(Color.BLACK);
		modulo1.setBackground(Color.WHITE);

		modulo2 = new JButton("GESTIÓN DE SEDES DE LA CASA DE APUESTAS");
		modulo2.setActionCommand(CAMBIARMODULO2);
		modulo2.setForeground(Color.BLACK);
		modulo2.setBackground(Color.WHITE);

		modulo3 = new JButton("GESTIÓN DE APOSTADORES");
		modulo3.setActionCommand(CAMBIARMODULO3);
		modulo3.setForeground(Color.BLACK);
		modulo3.setBackground(Color.WHITE);
		
		modulo4 = new JButton("GESTIÓN DE APUESTAS");
		modulo4.setActionCommand(CAMBIARMODULO4);
		modulo4.setForeground(Color.BLACK);
		modulo4.setBackground(Color.WHITE);
		
		modulo5 = new JButton("CONSULTAS");
		modulo5.setActionCommand(CAMBIARMODULO5);
		modulo5.setForeground(Color.BLACK);
		modulo5.setBackground(Color.WHITE);
		
		add(modulo1);
		add(modulo2);
		add(modulo3);
		add(modulo4);
		add(modulo5);


	}


	public JButton getModulo1() {
		return modulo1;
	}


	public void setModulo1(JButton modulo1) {
		this.modulo1 = modulo1;
	}


	public JButton getModulo2() {
		return modulo2;
	}


	public void setModulo2(JButton modulo2) {
		this.modulo2 = modulo2;
	}


	public JButton getModulo3() {
		return modulo3;
	}


	public void setModulo3(JButton modulo3) {
		this.modulo3 = modulo3;
	}


	public JButton getModulo4() {
		return modulo4;
	}


	public void setModulo4(JButton modulo4) {
		this.modulo4 = modulo4;
	}


	public JButton getModulo5() {
		return modulo5;
	}


	public void setModulo5(JButton modulo5) {
		this.modulo5 = modulo5;
	}


	public static String getCambiarmodulo1() {
		return CAMBIARMODULO1;
	}


	public static String getCambiarmodulo2() {
		return CAMBIARMODULO2;
	}


	public static String getCambiarmodulo3() {
		return CAMBIARMODULO3;
	}


	public static String getCambiarmodulo4() {
		return CAMBIARMODULO4;
	}


	public static String getCambiarmodulo5() {
		return CAMBIARMODULO5;
	}
}
