package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo1Juego extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelModulo1Juego panelModulo1Juego;
		private PanelBotonRegresarM1 panelBotonRegresarM1;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo1Juego(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelModulo1Juego = new PanelModulo1Juego();
			add(panelModulo1Juego,BorderLayout.CENTER);
			
			panelBotonRegresarM1 = new PanelBotonRegresarM1();
			add(panelBotonRegresarM1,BorderLayout.SOUTH);
			
			panelModulo1Juego.getBtnCrear().addActionListener(control);
			panelModulo1Juego.getBtnBuscar().addActionListener(control);
			panelModulo1Juego.getBtnActualizar().addActionListener(control);
			panelModulo1Juego.getBtnGuardar().addActionListener(control);


			
			panelBotonRegresarM1.getBtnregresarM1().addActionListener(control);

			
}




	public PanelModulo1Juego getPanelModulo1Juego() {
		return panelModulo1Juego;
	}




	public void setPanelModulo1Juego(PanelModulo1Juego panelModulo1Juego) {
		this.panelModulo1Juego = panelModulo1Juego;
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

