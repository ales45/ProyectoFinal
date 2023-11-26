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

public class PanelModulo4TJ extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnLoteria;
	private JButton btnSuperastro;
	private JButton btnBaloto;
	private JButton btnBetplay;
	private JButton btnChance;

	
	public static final String LOTERIA = "Loteria";
	public static final String SUPERASTRO = "Superastro";
	public static final String BALOTO = "Baloto";
	public static final String BETPLAY = "Betplay";
	public static final String CHANCE = "Chance";



	public PanelModulo4TJ() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(3,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//boton loteria
		btnLoteria = new JButton("LOTERIA");
		btnLoteria.setActionCommand(LOTERIA);
		btnLoteria.setForeground(Color.BLACK);
		btnLoteria.setBackground(Color.WHITE);
		
		//boton superastro
		btnSuperastro = new JButton("SUPERASTRO");
		btnSuperastro.setActionCommand(SUPERASTRO);
		btnSuperastro.setForeground(Color.BLACK);
		btnSuperastro.setBackground(Color.WHITE);
		
		//boton baloto
		btnBaloto = new JButton("BALOTO");
		btnBaloto.setActionCommand(BALOTO);
		btnBaloto.setForeground(Color.BLACK);
		btnBaloto.setBackground(Color.WHITE);
		
		//boton betplay
		btnBetplay = new JButton("BETPLAY");
		btnBetplay.setActionCommand(BETPLAY);
		btnBetplay.setForeground(Color.BLACK);
		btnBetplay.setBackground(Color.WHITE);
		
		//boton baloto
		btnChance = new JButton("CHANCE");
		btnChance.setActionCommand(CHANCE);
		btnChance.setForeground(Color.BLACK);
		btnChance.setBackground(Color.WHITE);
		
		
		//se agregan los botones
		add(btnLoteria);
		add(btnSuperastro);
		add(btnBaloto);
		add(btnBetplay);
		add(btnChance);

		
	 }



	public JButton getBtnLoteria() {
		return btnLoteria;
	}



	public void setBtnLoteria(JButton btnLoteria) {
		this.btnLoteria = btnLoteria;
	}



	public JButton getBtnSuperastro() {
		return btnSuperastro;
	}



	public void setBtnSuperastro(JButton btnSuperastro) {
		this.btnSuperastro = btnSuperastro;
	}



	public JButton getBtnBaloto() {
		return btnBaloto;
	}



	public void setBtnBaloto(JButton btnBaloto) {
		this.btnBaloto = btnBaloto;
	}



	public JButton getBtnBetplay() {
		return btnBetplay;
	}



	public void setBtnBetplay(JButton btnBetplay) {
		this.btnBetplay = btnBetplay;
	}



	public JButton getBtnChance() {
		return btnChance;
	}



	public void setBtnChance(JButton btnChance) {
		this.btnChance = btnChance;
	}
	
	
	}