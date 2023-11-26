package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelSuperAstro extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbNombreZodiaco;
	private JLabel lbNumero;
	private JLabel lbValorApuesta;
	
	private JTextField txtNombreZodiaco;
	private JTextField txtNumero;
	private JTextField txtValorApuesta;
	
	private JButton btnCrear;
	private JButton btnactualizar;
	private JButton btnborrar;
	private JButton btnBuscar;
	
	public static final String CREARMSUPERASTRO = "CrearSuperAtro";
	public static final String ACTUALIZARSUPERASTRO = "ActualizarSuperAstro";
	public static final String BORRARSUPERASTRO = "BorrarSuperAstro";
	public static final String BUSCARSUPERASTRO = "BuscarSuperAstro";
	
	public PanelSuperAstro() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(5,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//creacion de botones
		btnCrear = new JButton("CREAR APUESTA");
		btnCrear.setActionCommand(CREARMSUPERASTRO);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);
		
		btnactualizar = new JButton("ACTUALIZAR APUESTA");
		btnactualizar.setActionCommand(ACTUALIZARSUPERASTRO);
		btnactualizar.setForeground(Color.BLACK);
		btnactualizar.setBackground(Color.WHITE);
		
		btnBuscar = new JButton("BUSCAR APUESTA");
		btnBuscar.setActionCommand(BUSCARSUPERASTRO);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);
		
		btnborrar = new JButton("BORRAR APUESTA");
		btnborrar.setActionCommand(BORRARSUPERASTRO);
		btnborrar.setForeground(Color.BLACK);
		btnborrar.setBackground(Color.WHITE);
		
		//creacion de labels
		lbNombreZodiaco = new JLabel("SIGNO DEL ZODIACO");
		lbNombreZodiaco.setBorder(border);
		
		lbNumero = new JLabel("NUMERO");
		lbNumero.setBorder(border);
		
		lbValorApuesta = new JLabel("VALOR APUESTA");
		lbValorApuesta.setBorder(border);
		

		
		//creacion de txt
		txtNombreZodiaco = new JTextField("");
		txtNombreZodiaco.setForeground(Color.BLACK);
		txtNombreZodiaco.setBackground(Color.WHITE);
		txtNombreZodiaco.setBorder(border);
		
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBorder(border);
		
		txtValorApuesta = new JTextField();
		txtValorApuesta.setForeground(Color.BLACK);
		txtValorApuesta.setBackground(Color.WHITE);
		txtValorApuesta.setBorder(border);
		
		add(lbNombreZodiaco);
		add(txtNombreZodiaco);
		add(lbNumero);
		add(txtNumero);
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

	public JTextField getTxtNombreZodiaco() {
		return txtNombreZodiaco;
	}

	public void setTxtNombreZodiaco(JTextField txtNombreZodiaco) {
		this.txtNombreZodiaco = txtNombreZodiaco;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtValorApuesta() {
		return txtValorApuesta;
	}

	public void setTxtValorApuesta(JTextField txtValorApuesta) {
		this.txtValorApuesta = txtValorApuesta;
	}
	
	
}
