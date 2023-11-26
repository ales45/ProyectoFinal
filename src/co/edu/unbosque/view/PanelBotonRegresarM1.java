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

public class PanelBotonRegresarM1 extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnregresarM1;
	
	public static final String REGRESARM1 = "RegresarM1";


	public PanelBotonRegresarM1() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(1,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		btnregresarM1 = new JButton("REGRESAR");
		btnregresarM1.setActionCommand(REGRESARM1);
		btnregresarM1.setForeground(Color.BLACK);
		btnregresarM1.setBackground(Color.WHITE);
		
		add(btnregresarM1);
	}


	public JButton getBtnregresarM1() {
		return btnregresarM1;
	}


	public void setBtnregresarM1(JButton btnregresarM1) {
		this.btnregresarM1 = btnregresarM1;
	}



	
	
}

