package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelLoteria extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbNombreLoteria;
	private JLabel lbNumero;
	private JLabel lbSerie;
	private JLabel lbValorApuesta;
	
	private JTextField txtNombreLoteria;
	private JTextField txtNumero;
	private JTextField txtSerie;
	private JTextField txtValorApuesta;
	
	private JButton btnCrear;
	private JButton btnactualizar;
	private JButton btnborrar;
	private JButton btnBuscar;
	
	public static final String CREARMLOTERIA = "CrearLoteria";
	public static final String ACTUALIZARLOTERIA = "ActualizarLoteria";
	public static final String BORRARLOTERIA = "BorrarLoteria";
	public static final String BUSCARLOTERIA = "BuscarLoteria";
	
	public PanelLoteria() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(6,2) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//creacion de botones
		btnCrear = new JButton("CREAR APUESTA");
		btnCrear.setActionCommand(CREARMLOTERIA);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);
		
		btnactualizar = new JButton("ACTUALIZAR APUESTA");
		btnactualizar.setActionCommand(ACTUALIZARLOTERIA);
		btnactualizar.setForeground(Color.BLACK);
		btnactualizar.setBackground(Color.WHITE);
		
		btnBuscar = new JButton("BUSCAR APUESTA");
		btnBuscar.setActionCommand(BUSCARLOTERIA);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);
		
		btnborrar = new JButton("BORRAR APUESTA");
		btnborrar.setActionCommand(BORRARLOTERIA);
		btnborrar.setForeground(Color.BLACK);
		btnborrar.setBackground(Color.WHITE);
		
		//creacion de labels
		lbNombreLoteria = new JLabel("NOMBRE DE LOTERIA");
		lbNombreLoteria.setBorder(border);
		
		lbNumero = new JLabel("NUMERO");
		lbNumero.setBorder(border);
		
		lbSerie = new JLabel("SERIE");
		lbSerie.setBorder(border);
		
		lbValorApuesta = new JLabel("VALOR APUESTA");
		lbValorApuesta.setBorder(border);
		
		//creacion de txt
		txtNombreLoteria = new JTextField("");
		txtNombreLoteria.setForeground(Color.BLACK);
		txtNombreLoteria.setBackground(Color.WHITE);
		txtNombreLoteria.setBorder(border);
		
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBorder(border);
		
		txtSerie = new JTextField("");
		txtSerie.setForeground(Color.BLACK);
		txtSerie.setBackground(Color.WHITE);
		txtSerie.setBorder(border);
		
		txtValorApuesta = new JTextField("");
		txtValorApuesta.setForeground(Color.BLACK);
		txtValorApuesta.setBackground(Color.WHITE);
		txtValorApuesta.setBorder(border);
		
		add(lbNombreLoteria);
		add(txtNombreLoteria);
		add(lbNumero);
		add(txtNumero);
		add(lbSerie);
		add(txtSerie);
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

	public JTextField getTxtNombreLoteria() {
		return txtNombreLoteria;
	}

	public void setTxtNombreLoteria(JTextField txtNombreLoteria) {
		this.txtNombreLoteria = txtNombreLoteria;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtSerie() {
		return txtSerie;
	}

	public void setTxtSerie(JTextField txtSerie) {
		this.txtSerie = txtSerie;
	}

	public JTextField getTxtValorApuesta() {
		return txtValorApuesta;
	}

	public void setTxtValorApuesta(JTextField txtValorApuesta) {
		this.txtValorApuesta = txtValorApuesta;
	}
	
}
