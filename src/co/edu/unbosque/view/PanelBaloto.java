package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelBaloto extends JPanel{
	private static final long serialVersionUID = 1L;

	private JLabel lbNumero;
	private JLabel lbValorApuesta;

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtValorApuesta;
	
	private JButton btnCrear;
	private JButton btnactualizar;
	private JButton btnborrar;
	private JButton btnBuscar;
	
	public static final String CREARBALOTO = "CrearBaloto";
	public static final String ACTUALIZARBALOTO = "ActualizarBaloto";
	public static final String BORRARBALOTO = "BorrarBaloto";
	public static final String BUSCARBALOTO = "BuscarBaloto";
	
	public PanelBaloto() {
		setBackground(new Color(243, 229, 171));
		setLayout( new GridLayout(3,6) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		
		//creacion de botones
		btnCrear = new JButton("CREAR");
		btnCrear.setActionCommand(CREARBALOTO);
		btnCrear.setForeground(Color.BLACK);
		btnCrear.setBackground(Color.WHITE);
		
		btnactualizar = new JButton("ACTUALIZAR");
		btnactualizar.setActionCommand(ACTUALIZARBALOTO);
		btnactualizar.setForeground(Color.BLACK);
		btnactualizar.setBackground(Color.WHITE);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setActionCommand(BUSCARBALOTO);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);
		
		btnborrar = new JButton("BORRAR");
		btnborrar.setActionCommand(BORRARBALOTO);
		btnborrar.setForeground(Color.BLACK);
		btnborrar.setBackground(Color.WHITE);
		
		//creacion de labels
		lbNumero = new JLabel("*NUMERO1*");
		lbNumero.setBorder(border);
		
		lbValorApuesta = new JLabel("Valor Apueta");
		lbNumero.setBorder(border);

		//creacion de txt
		txtNum1 = new JTextField("");
		txtNum1.setForeground(Color.BLACK);
		txtNum1.setBackground(Color.WHITE);
		txtNum1.setBorder(border);
		
		txtNum2 = new JTextField("");
		txtNum2.setForeground(Color.BLACK);
		txtNum2.setBackground(Color.WHITE);
		txtNum2.setBorder(border);
		
		txtNum3 = new JTextField("");
		txtNum3.setForeground(Color.BLACK);
		txtNum3.setBackground(Color.WHITE);
		txtNum3.setBorder(border);
		
		txtNum4 = new JTextField("");
		txtNum4.setForeground(Color.BLACK);
		txtNum4.setBackground(Color.WHITE);
		txtNum4.setBorder(border);
		
		txtNum5 = new JTextField("");
		txtNum5.setForeground(Color.BLACK);
		txtNum5.setBackground(Color.WHITE);
		txtNum5.setBorder(border);
		
		txtNum6 = new JTextField("");
		txtNum6.setForeground(Color.BLACK);
		txtNum6.setBackground(Color.WHITE);
		txtNum6.setBorder(border);
		
		txtValorApuesta = new JTextField();
		txtValorApuesta.setForeground(Color.BLACK);
		txtValorApuesta.setBackground(Color.WHITE);
		txtValorApuesta.setBorder(border);
		
		
		add(lbNumero);
		add( new JLabel("*NUMERO2*"));
		add( new JLabel("*NUMERO3*"));
		add( new JLabel("*NUMERO4*"));
		add( new JLabel("*NUMERO5*"));
		add( new JLabel("*NUMERO6*"));
		
		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(txtNum4);
		add(txtNum5);
		add(txtNum6);

		add(btnCrear);
		add(btnactualizar);
		add(btnBuscar);
		add(btnborrar);
		add(lbValorApuesta);
		add(txtValorApuesta);
		
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

	public JTextField getTxtNum1() {
		return txtNum1;
	}

	public void setTxtNum1(JTextField txtNum1) {
		this.txtNum1 = txtNum1;
	}

	public JTextField getTxtNum2() {
		return txtNum2;
	}

	public void setTxtNum2(JTextField txtNum2) {
		this.txtNum2 = txtNum2;
	}

	public JTextField getTxtNum3() {
		return txtNum3;
	}

	public void setTxtNum3(JTextField txtNum3) {
		this.txtNum3 = txtNum3;
	}

	public JTextField getTxtNum4() {
		return txtNum4;
	}

	public void setTxtNum4(JTextField txtNum4) {
		this.txtNum4 = txtNum4;
	}

	public JTextField getTxtNum5() {
		return txtNum5;
	}

	public void setTxtNum5(JTextField txtNum5) {
		this.txtNum5 = txtNum5;
	}

	public JTextField getTxtNum6() {
		return txtNum6;
	}

	public void setTxtNum6(JTextField txtNum6) {
		this.txtNum6 = txtNum6;
	}

	public JTextField getTxtValorApuesta() {
		return txtValorApuesta;
	}

	public void setTxtValorApuesta(JTextField txtValorApuesta) {
		this.txtValorApuesta = txtValorApuesta;
	}
	
}
