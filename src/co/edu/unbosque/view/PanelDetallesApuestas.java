package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelDetallesApuestas extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbDetalleApuestas;
	private JTextArea txtDetalleApuestas;
	private JTextArea txtDetalleApuestas2;
	private JScrollPane ScrollDetalleApuestas;
	private JScrollPane ScrollDetalleApuestas2;

	
	public PanelDetallesApuestas() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(2,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		lbDetalleApuestas = new JLabel("DETALLE DE APUESTAS POR CLIENTES");
		lbDetalleApuestas.setBorder(border);
		
		txtDetalleApuestas = new JTextArea();
		txtDetalleApuestas.setForeground(Color.BLACK);
		txtDetalleApuestas.setBackground(Color.WHITE);
		
		txtDetalleApuestas2 = new JTextArea();
		txtDetalleApuestas2.setForeground(Color.BLACK);
		txtDetalleApuestas2.setBackground(Color.WHITE);
		
		ScrollDetalleApuestas = new JScrollPane(txtDetalleApuestas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ScrollDetalleApuestas2 = new JScrollPane(txtDetalleApuestas2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
		
		add(lbDetalleApuestas);
		add(new JLabel("DETALLE DE APUESTAS POR SEDES"));
		add(ScrollDetalleApuestas);
		add(ScrollDetalleApuestas2);

		
	}

	public JTextArea getTxtDetalleApuestas() {
		return txtDetalleApuestas;
	}

	public void setTxtDetalleApuestas(JTextArea txtDetalleApuestas) {
		this.txtDetalleApuestas = txtDetalleApuestas;
	}

	public JTextArea getTxtDetalleApuestas2() {
		return txtDetalleApuestas2;
	}

	public void setTxtDetalleApuestas2(JTextArea txtDetalleApuestas2) {
		this.txtDetalleApuestas2 = txtDetalleApuestas2;
	}
	
}