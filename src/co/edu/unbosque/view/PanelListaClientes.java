package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelListaClientes extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbclientesSede;
	private JTextArea txtAclientessede;
	private JScrollPane ScrollListaClientes;
	
	public PanelListaClientes() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(2,1) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		lbclientesSede = new JLabel("LISTADO CLIENTES X SEDE");
		lbclientesSede.setBorder(border);
		
		txtAclientessede = new JTextArea();
		txtAclientessede.setForeground(Color.BLACK);
		txtAclientessede.setBackground(Color.WHITE);
		txtAclientessede.setEditable(false);
		
		ScrollListaClientes = new JScrollPane(txtAclientessede,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(lbclientesSede);
		
		add(ScrollListaClientes);
		
	}

	public JTextArea getTxtAclientessede() {
		return txtAclientessede;
	}

	public void setTxtAclientessede(JTextArea txtAclientessede) {
		this.txtAclientessede = txtAclientessede;
	}

	public JScrollPane getScrollListaClientes() {
		return ScrollListaClientes;
	}

	public void setScrollListaClientes(JScrollPane scrollListaClientes) {
		ScrollListaClientes = scrollListaClientes;
	}
	
}
