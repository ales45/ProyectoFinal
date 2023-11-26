package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelValorApuestas extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbValorApuestas;
	private JTextArea txtValorApuestas;
	private JScrollPane ScrollValorApuesta;
	
	public PanelValorApuestas() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		lbValorApuestas = new JLabel("VALOR TOTAL DE APUESTAS");
		lbValorApuestas.setBorder(border);
		
		txtValorApuestas = new JTextArea();
		txtValorApuestas.setForeground(Color.BLACK);
		txtValorApuestas.setBackground(Color.WHITE);
		
		
		ScrollValorApuesta = new JScrollPane(txtValorApuestas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
		
		add(lbValorApuestas);
		add(ScrollValorApuesta);
		
	}

	public JTextArea getTxtValorApuestas() {
		return txtValorApuestas;
	}

	public void setTxtValorApuestas(JTextArea txtValorApuestas) {
		this.txtValorApuestas = txtValorApuestas;
	}


	
}
