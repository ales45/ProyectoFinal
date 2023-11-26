package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo1Casa extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelParametrizacionCasa panelParametrizacionCasa;
		private PanelBotonRegresarM1 panelBotonRegresarM1;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo1Casa(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelParametrizacionCasa = new PanelParametrizacionCasa();
			add(panelParametrizacionCasa,BorderLayout.CENTER);
			
			panelBotonRegresarM1 = new PanelBotonRegresarM1();
			add(panelBotonRegresarM1,BorderLayout.SOUTH);
			
			panelParametrizacionCasa.getBtnCrear().addActionListener(control);
			panelParametrizacionCasa.getBtnActualizar().addActionListener(control);
			panelParametrizacionCasa.getBtnBuscar().addActionListener(control);

			
			panelBotonRegresarM1.getBtnregresarM1().addActionListener(control);

			
}



	public PanelParametrizacionCasa getPanelParametrizacionCasa() {
		return panelParametrizacionCasa;
	}



	public void setPanelParametrizacionCasa(PanelParametrizacionCasa panelParametrizacionCasa) {
		this.panelParametrizacionCasa = panelParametrizacionCasa;
	}



	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}



	public PanelBotonRegresarM1 getPanelBotonRegresarM1() {
		return panelBotonRegresarM1;
	}



	public void setPanelBotonRegresarM1(PanelBotonRegresarM1 panelBotonRegresarM1) {
		this.panelBotonRegresarM1 = panelBotonRegresarM1;
	}


	
}

