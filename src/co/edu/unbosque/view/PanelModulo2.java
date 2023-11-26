package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelModulo2 extends JPanel {
	
		private static final long serialVersionUID = 1L;
		
		private JButton btnCrear;
		private JButton btnBuscar;
		private JButton btnActualizar;
		
		private JTextField txtNombreSede;
		private JTextField txtUbicacion;
		private JTextField txtNumeroEmpleados;
		
		private JLabel labNombreSede;
		private JLabel labUbicacion;
		private JLabel labNumeroEmpleados;
		
		public static final String CREARM2 = "Crearm2";
		public static final String ACTUALIZARM2 = "Actualizarm2";
		public static final String BUSCARM2 = "Buscarm2";

		
		public PanelModulo2() {
			setBackground(new Color(243, 229, 171));
			setLayout( new GridLayout(5,2) );
			TitledBorder border = BorderFactory.createTitledBorder("");
			border.setTitleColor(Color.BLACK);
			setBorder(border);
				
			btnCrear = new JButton("CREAR SEDE");
			btnCrear.setActionCommand(CREARM2);
			btnCrear.setForeground(Color.BLACK);
			btnCrear.setBackground(Color.WHITE);

			btnBuscar = new JButton("BUSCAR SEDE");
			btnBuscar.setActionCommand(BUSCARM2);
			btnBuscar.setForeground(Color.BLACK);
			btnBuscar.setBackground(Color.WHITE);
			
			btnActualizar = new JButton("ACTUALIZAR SEDE");
			btnActualizar.setActionCommand(ACTUALIZARM2);
			btnActualizar.setForeground(Color.BLACK);
			btnActualizar.setBackground(Color.WHITE);
			
			//labels
			
			labNombreSede = new JLabel("Nombre de la sede");
			labNombreSede.setBorder(border);
			
			labUbicacion = new JLabel("Ubicacion de la sede");
			labUbicacion.setBorder(border);

			labNumeroEmpleados = new JLabel("Numero empleados");
			labNumeroEmpleados.setBorder(border);
			
			//txt
			
			txtNombreSede = new JTextField("");
			txtNombreSede.setForeground(Color.BLACK);
			txtNombreSede.setBackground(Color.WHITE);
			txtNombreSede.setBorder(border);
			
			txtUbicacion = new JTextField("");
			txtUbicacion.setForeground(Color.BLACK);
			txtUbicacion.setBackground(Color.WHITE);
			txtUbicacion.setBorder(border);

			txtNumeroEmpleados = new JTextField("");
			txtNumeroEmpleados.setForeground(Color.BLACK);
			txtNumeroEmpleados.setBackground(Color.WHITE);
			txtNumeroEmpleados.setBorder(border);
		
			
			//labels y txt
			add(labNombreSede);
			add(txtNombreSede);
			add(labUbicacion);
			add(txtUbicacion);
			add(labNumeroEmpleados);
			add(txtNumeroEmpleados);
			

			//Btn
			add(btnCrear);
			add(btnBuscar);
			add(btnActualizar);

		}


		public JButton getBtnCrear() {
			return btnCrear;
		}


		public void setBtnCrear(JButton btnCrear) {
			this.btnCrear = btnCrear;
		}


		public JButton getBtnBuscar() {
			return btnBuscar;
		}


		public void setBtnBuscar(JButton btnBuscar) {
			this.btnBuscar = btnBuscar;
		}


		public JButton getBtnActualizar() {
			return btnActualizar;
		}


		public void setBtnActualizar(JButton btnActualizar) {
			this.btnActualizar = btnActualizar;
		}


		public JTextField getTxtNombreSede() {
			return txtNombreSede;
		}


		public void setTxtNombreSede(JTextField txtNombreSede) {
			this.txtNombreSede = txtNombreSede;
		}


		public JTextField getTxtUbicacion() {
			return txtUbicacion;
		}


		public void setTxtUbicacion(JTextField txtUbicacion) {
			this.txtUbicacion = txtUbicacion;
		}


		public JTextField getTxtNumeroEmpleados() {
			return txtNumeroEmpleados;
		}


		public void setTxtNumeroEmpleados(JTextField txtNumeroEmpleados) {
			this.txtNumeroEmpleados = txtNumeroEmpleados;
		}


		public JLabel getLabNombreSede() {
			return labNombreSede;
		}


		public void setLabNombreSede(JLabel labNombreSede) {
			this.labNombreSede = labNombreSede;
		}


		public JLabel getLabUbicacion() {
			return labUbicacion;
		}


		public void setLabUbicacion(JLabel labUbicacion) {
			this.labUbicacion = labUbicacion;
		}


		public JLabel getLabNumeroEmpleados() {
			return labNumeroEmpleados;
		}


		public void setLabNumeroEmpleados(JLabel labNumeroEmpleados) {
			this.labNumeroEmpleados = labNumeroEmpleados;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		public static String getCrearm2() {
			return CREARM2;
		}


		public static String getActualizarm2() {
			return ACTUALIZARM2;
		}


		public static String getBuscarm2() {
			return BUSCARM2;
		}


	
}
