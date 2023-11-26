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

public class PanelBotonRegresar extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnregresar;
	
	public static final String REGRESAR = "Regresar";


	public PanelBotonRegresar() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(1,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		btnregresar = new JButton("REGRESAR");
		btnregresar.setActionCommand(REGRESAR);
		btnregresar.setForeground(Color.BLACK);
		btnregresar.setBackground(Color.WHITE);
		
		add(btnregresar);
	}


	public JButton getBtnregresar() {
		return btnregresar;
	}


	public void setBtnregresar(JButton btnregresar) {
		this.btnregresar = btnregresar;
	}
	
	
}
