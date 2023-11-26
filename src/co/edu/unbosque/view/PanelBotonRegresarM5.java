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

public class PanelBotonRegresarM5 extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnregresarM5;
	
	public static final String REGRESARM5 = "RegresarM5";


	public PanelBotonRegresarM5() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(1,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		btnregresarM5 = new JButton("REGRESAR");
		btnregresarM5.setActionCommand(REGRESARM5);
		btnregresarM5.setForeground(Color.BLACK);
		btnregresarM5.setBackground(Color.WHITE);
		
		add(btnregresarM5);
	}


	public JButton getBtnregresarM5() {
		return btnregresarM5;
	}


	public void setBtnregresarM5(JButton btnregresarM5) {
		this.btnregresarM5 = btnregresarM5;
	}
	
}