package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelModulo1 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnParametrizacionJuego;
	private JButton btnParametrizacionCasa;

	public static final String PARAMETRIZACIONCASA = "Parametrizacioncasa";
	public static final String PARAMETRIZACIONJUEGO = "Parametrizacionjuego";


	
	public PanelModulo1() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(1,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
			
		btnParametrizacionJuego = new JButton("PARAMETIZACION JUEGOS");
		btnParametrizacionJuego.setActionCommand(PARAMETRIZACIONJUEGO);
		btnParametrizacionJuego.setForeground(Color.BLACK);
		btnParametrizacionJuego.setBackground(Color.WHITE);

		btnParametrizacionCasa = new JButton("PARAMETRIZACION CASA DE APUESTAS");
		btnParametrizacionCasa.setActionCommand(PARAMETRIZACIONCASA);
		btnParametrizacionCasa.setForeground(Color.BLACK);
		btnParametrizacionCasa.setBackground(Color.WHITE);
		
		//labels
				
		//labels y txt
		add(btnParametrizacionCasa);
		add(btnParametrizacionJuego);
		
	


	}



	public JButton getBtnParametrizacionJuego() {
		return btnParametrizacionJuego;
	}



	public void setBtnParametrizacionJuego(JButton btnParametrizacionJuego) {
		this.btnParametrizacionJuego = btnParametrizacionJuego;
	}



	public JButton getBtnParametrizacionCasa() {
		return btnParametrizacionCasa;
	}



	public void setBtnParametrizacionCasa(JButton btnParametrizacionCasa) {
		this.btnParametrizacionCasa = btnParametrizacionCasa;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public static String getParametrizacioncasa() {
		return PARAMETRIZACIONCASA;
	}



	public static String getParametrizacionjuego() {
		return PARAMETRIZACIONJUEGO;
	}	
}