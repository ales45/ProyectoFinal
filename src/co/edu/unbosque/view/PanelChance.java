package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelChance extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbSignoDelZodiaco;
	private JLabel lbNumeroChance;
	private JLabel lbValorApuesta;

	
	private JTextField txtSignoDelZodiaco;
	private JTextField txtNumeroChance;
	private JTextField txtValorApuesta;

	
	private JButton btnCrear;
	private JButton btnactualizar;
	private JButton btnborrar;
	private JButton btnBuscar;
	
	public static final String CREARMCHANCE = "CrearChance";
	public static final String ACTUALIZARCHANCE = "ActualizarChance";
	public static final String BORRARCHANCE = "BorrarChance";
	public static final String BUSCARCHANCE = "BuscarChance";
	
	public PanelChance() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(5,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//creacion de botones
		btnCrear = new JButton("CREAR APUESTA");
		btnCrear.setActionCommand(CREARMCHANCE);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);
		
		btnactualizar = new JButton("ACTUALIZAR APUESTA");
		btnactualizar.setActionCommand(ACTUALIZARCHANCE);
		btnactualizar.setForeground(Color.BLACK);
		btnactualizar.setBackground(Color.WHITE);
		
		btnBuscar = new JButton("BUSCAR APUESTA");
		btnBuscar.setActionCommand(BUSCARCHANCE);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);
		
		btnborrar = new JButton("BORRAR APUESTA");
		btnborrar.setActionCommand(BORRARCHANCE);
		btnborrar.setForeground(Color.BLACK);
		btnborrar.setBackground(Color.WHITE);
		
		//creacion de labels
		lbSignoDelZodiaco = new JLabel("Nombre Loteria");
		lbSignoDelZodiaco.setBorder(border);
		
		lbNumeroChance = new JLabel("Numero");
		lbNumeroChance.setBorder(border);
		
		lbValorApuesta = new JLabel("Valor Apuesta");
		lbValorApuesta.setBorder(border);
		
		
		//creacion de txt
		txtSignoDelZodiaco = new JTextField("");
		txtSignoDelZodiaco.setForeground(Color.BLACK);
		txtSignoDelZodiaco.setBackground(Color.WHITE);
		txtSignoDelZodiaco.setBorder(border);
		
		txtNumeroChance = new JTextField("");
		txtNumeroChance.setForeground(Color.BLACK);
		txtNumeroChance.setBackground(Color.WHITE);
		txtNumeroChance.setBorder(border);
		
		txtValorApuesta = new JTextField("");
		txtValorApuesta.setForeground(Color.BLACK);
		txtValorApuesta.setBackground(Color.WHITE);
		txtValorApuesta.setBorder(border);
		
		
		add(lbSignoDelZodiaco);
		add(txtSignoDelZodiaco);
		add(lbNumeroChance);
		add(txtNumeroChance);
		add(lbValorApuesta);
		add(txtValorApuesta);
		add(btnCrear);
		add(btnactualizar);
		add(btnBuscar);
		add(btnborrar);
		
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnactualizar() {
		return btnactualizar;
	}

	public void setBtnactualizar(JButton btnactualizar) {
		this.btnactualizar = btnactualizar;
	}

	public JButton getBtnborrar() {
		return btnborrar;
	}

	public void setBtnborrar(JButton btnborrar) {
		this.btnborrar = btnborrar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JTextField getTxtSignoDelZodiaco() {
		return txtSignoDelZodiaco;
	}

	public void setTxtSignoDelZodiaco(JTextField txtSignoDelZodiaco) {
		this.txtSignoDelZodiaco = txtSignoDelZodiaco;
	}

	public JTextField getTxtNumeroChance() {
		return txtNumeroChance;
	}

	public void setTxtNumeroChance(JTextField txtNumeroChance) {
		this.txtNumeroChance = txtNumeroChance;
	}

	public JTextField getTxtValorApuesta() {
		return txtValorApuesta;
	}

	public void setTxtValorApuesta(JTextField txtValorApuesta) {
		this.txtValorApuesta = txtValorApuesta;
	}
	
}