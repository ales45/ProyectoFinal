package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


 



public class PanelBetplay extends JPanel {
	 private JComboBox<String> cBOXlistaPartido;
	 private JRadioButton radio1,radio2,radio3;
	 
	 private JLabel lbvalorApuesta;
	 private JTextField txtvalorApuesta; 

	 private JButton btnGuardarApuesta;
	 private JButton btnCrearBetplay;
	 private JButton btnborrarBetplay;
	 private JButton btnBuscarBetplay	;

	 public static final String GUARDARBETPLAY = "GuardarBetplay";
	 public static final String CREARBETPLAY = "CrearBetplay";
	 public static final String BORRARBETPLAY = "BorrarBetplay";
	 public static final String BUSCARBETPLAY = "BuscarBetplay";
	
	 public PanelBetplay() {
			setBackground(new Color(243, 229, 171));
			setLayout( new GridLayout(3,4) );
			TitledBorder border = BorderFactory.createTitledBorder("");
			border.setTitleColor(Color.BLACK);
			setBorder( border );
		 
			cBOXlistaPartido = new JComboBox<String>();
			cBOXlistaPartido.setForeground(Color.BLACK);
			cBOXlistaPartido.setBackground(Color.WHITE);
			cBOXlistaPartido.addItem("Nacional vs Millonarios");
			cBOXlistaPartido.addItem("Tolima vs RealMadrid");
			cBOXlistaPartido.addItem("ChaparralFC vs Boca");
			cBOXlistaPartido.addItem("Tolima vs Millonarios");
			cBOXlistaPartido.addItem("Beitar Jerusalén vs Jabal al Mukaber");
			cBOXlistaPartido.addItem("FKShajtarDonetsk vs 	PFC CSKA Moscú");
			cBOXlistaPartido.addItem("Amnokgang vs Daegu");
			cBOXlistaPartido.addItem("F.C.Asdod vs Hapoel Tel Aviv");
			cBOXlistaPartido.addItem("TainanCityFC vs Shandong Taishan");
			cBOXlistaPartido.addItem("AlianzaPetrolera vs Barcelona");
			cBOXlistaPartido.addItem("RealSoachaCundinamarca vs PSG	");
			cBOXlistaPartido.addItem("FortalezaCEIF vs Corinthians");
			cBOXlistaPartido.addItem("Colombia vs Comoras");
			cBOXlistaPartido.addItem("tonga vs seychelles");
			
			radio1 = new JRadioButton("local");
			radio1.setForeground(Color.BLACK);
			radio1.setBackground(new Color(243, 229, 171));
			radio1.setBorder(border);
			
			
			radio2 = new JRadioButton("Visitante");
			radio2.setForeground(Color.BLACK);
			radio2.setBackground(new Color(243, 229, 171));
			radio2.setBorder(border);
			
			radio3 = new JRadioButton("empate");
			radio3.setForeground(Color.BLACK);
			radio3.setBackground(new Color(243, 229, 171));
			radio3.setBorder(border);
			
			btnCrearBetplay = new JButton("CREAR");
			btnCrearBetplay.setActionCommand(CREARBETPLAY);
			btnCrearBetplay.setForeground(Color.BLACK);
			btnCrearBetplay.setBackground(Color.WHITE);
			

			
			btnBuscarBetplay = new JButton("BUSCAR");
			btnBuscarBetplay.setActionCommand(BUSCARBETPLAY);
			btnBuscarBetplay.setForeground(Color.BLACK);
			btnBuscarBetplay.setBackground(Color.WHITE);
			
			btnborrarBetplay = new JButton("BORRAR");
			btnborrarBetplay.setActionCommand(BORRARBETPLAY);
			btnborrarBetplay.setForeground(Color.BLACK);
			btnborrarBetplay.setBackground(Color.WHITE);
			
			btnGuardarApuesta = new JButton("GUARDAR");
			btnGuardarApuesta.setActionCommand(GUARDARBETPLAY);
			btnGuardarApuesta.setForeground(Color.BLACK);
			btnGuardarApuesta.setBackground(Color.WHITE);
			
			lbvalorApuesta = new JLabel("VALOR APUESTA");
			
			txtvalorApuesta = new JTextField();
			txtvalorApuesta.setForeground(Color.BLACK);
			txtvalorApuesta.setBackground(Color.WHITE);
			txtvalorApuesta.setBorder(border);
			
			add(cBOXlistaPartido);
			add(radio1);
			add(radio2);
			add(radio3);
			add(lbvalorApuesta);
			add(txtvalorApuesta);
			add(new JLabel(""));
			add(new JLabel(""));

			add(btnGuardarApuesta);
			add(btnCrearBetplay);
			add(btnBuscarBetplay);
			add(btnborrarBetplay);

	 }

	public JComboBox<String> getcBOXlistaPartido() {
		return cBOXlistaPartido;
	}

	public void setcBOXlistaPartido(JComboBox<String> cBOXlistaPartido) {
		this.cBOXlistaPartido = cBOXlistaPartido;
	}

	public JRadioButton getRadio1() {
		return radio1;
	}

	public void setRadio1(JRadioButton radio1) {
		this.radio1 = radio1;
	}

	public JRadioButton getRadio2() {
		return radio2;
	}

	public void setRadio2(JRadioButton radio2) {
		this.radio2 = radio2;
	}

	public JRadioButton getRadio3() {
		return radio3;
	}

	public void setRadio3(JRadioButton radio3) {
		this.radio3 = radio3;
	}

	public JTextField getTxtvalorApuesta() {
		return txtvalorApuesta;
	}

	public void setTxtvalorApuesta(JTextField txtvalorApuesta) {
		this.txtvalorApuesta = txtvalorApuesta;
	}

	public JButton getBtnCrearBetplay() {
		return btnCrearBetplay;
	}

	public void setBtnCrearBetplay(JButton btnCrearBetplay) {
		this.btnCrearBetplay = btnCrearBetplay;
	}



	public JButton getBtnborrarBetplay() {
		return btnborrarBetplay;
	}

	public void setBtnborrarBetplay(JButton btnborrarBetplay) {
		this.btnborrarBetplay = btnborrarBetplay;
	}

	public JButton getBtnBuscarBetplay() {
		return btnBuscarBetplay;
	}

	public void setBtnBuscarBetplay(JButton btnBuscarBetplay) {
		this.btnBuscarBetplay = btnBuscarBetplay;
	}

	public JButton getBtnGuardarApuesta() {
		return btnGuardarApuesta;
	}

	public void setBtnGuardarApuesta(JButton btnGuardarApuesta) {
		this.btnGuardarApuesta = btnGuardarApuesta;
	}
	 
}
