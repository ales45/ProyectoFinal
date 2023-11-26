package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelTotalApuestas extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbTotalApuestas;
	private JTextArea txtTotalApuestas;
	private JTextArea txtTotalApuestas2;

	private JScrollPane ScrollTotalApuestas;
	private JScrollPane ScrollTotalApuestas2;

	
	public PanelTotalApuestas() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		lbTotalApuestas = new JLabel("TOTAL APUESTAS POR SEDE");
		lbTotalApuestas.setBorder(border);
		
		txtTotalApuestas = new JTextArea();
		txtTotalApuestas.setForeground(Color.BLACK);
		txtTotalApuestas.setBackground(Color.WHITE);
		
		txtTotalApuestas2 = new JTextArea();
		txtTotalApuestas2.setForeground(Color.BLACK);
		txtTotalApuestas2.setBackground(Color.WHITE);
		
		ScrollTotalApuestas = new JScrollPane(txtTotalApuestas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ScrollTotalApuestas2 = new JScrollPane(txtTotalApuestas2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
		
		add(lbTotalApuestas);
		add(new JLabel("TOTAL APUESTAS POR JUEOGO"));
		add(ScrollTotalApuestas);
		add(ScrollTotalApuestas2);
		
	}

	public JTextArea getTxtTotalApuestas() {
		return txtTotalApuestas;
	}

	public void setTxtTotalApuestas(JTextArea txtTotalApuestas) {
		this.txtTotalApuestas = txtTotalApuestas;
	}

	public JTextArea getTxtTotalApuestas2() {
		return txtTotalApuestas2;
	}

	public void setTxtTotalApuestas2(JTextArea txtTotalApuestas2) {
		this.txtTotalApuestas2 = txtTotalApuestas2;
	}
	
	
}
