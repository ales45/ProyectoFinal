package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo1 extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelModulo1 panelModulo1;
		private PanelBotonRegresarM1 panelBotonRegresarM1;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo1(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelModulo1 = new PanelModulo1();
			add(panelModulo1,BorderLayout.CENTER);
			
			panelBotonRegresarM1 = new PanelBotonRegresarM1();
			add(panelBotonRegresarM1,BorderLayout.SOUTH);
			
			panelModulo1.getBtnParametrizacionCasa().addActionListener(control);
			panelModulo1.getBtnParametrizacionJuego().addActionListener(control);

			
			panelBotonRegresarM1.getBtnregresarM1().addActionListener(control);

			
}



	public PanelModulo1 getPanelModulo1() {
		return panelModulo1;
	}
	public void setPanelModulo1(PanelModulo1 panelModulo1) {
		this.panelModulo1 = panelModulo1;
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

