package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPrincipal extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private ImageIcon logoEmpresa;
	private ImageIcon logoApuesta;
	private JLabel logoEmpresaLabel;
	private JLabel logoApuestaLabel;
	
	public PanelPrincipal() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		logoEmpresa = new ImageIcon("src/co/edu/unbosque/resource/LOGOEMPRESA.jpg");
		logoApuesta = new ImageIcon("src/co/edu/unbosque/resource/LOGOAPUESTAS.jpg");
		
		Image imageEmpresa = logoEmpresa.getImage(); 
		Image newimgEmpresa = imageEmpresa.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH);
		logoEmpresa = new ImageIcon(newimgEmpresa);  
		
		Image imageApuesta = logoApuesta.getImage(); 
		Image newimgApuesta = imageApuesta.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH);
		logoApuesta = new ImageIcon(newimgApuesta);  
		
		logoEmpresaLabel = new JLabel(logoEmpresa);
		logoApuestaLabel = new JLabel(logoApuesta);

		
		
		add(logoEmpresaLabel);
		add(logoApuestaLabel);
		

	}
	
}
