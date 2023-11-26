package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo2 extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelModulo2 panelModulo2;
		private PanelBotonRegresar panelBotonRegresar;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo2(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelModulo2 = new PanelModulo2();
			add(panelModulo2,BorderLayout.CENTER);
			
			panelBotonRegresar = new PanelBotonRegresar();
			add(panelBotonRegresar,BorderLayout.SOUTH);
			
			panelModulo2.getBtnCrear().addActionListener(control);
			panelModulo2.getBtnBuscar().addActionListener(control);
			panelModulo2.getBtnActualizar().addActionListener(control);

			
			panelBotonRegresar.getBtnregresar().addActionListener(control);

			
}



	public PanelModulo2 getPanelModulo2() {
		return panelModulo2;
	}



	public void setPanelModulo2(PanelModulo2 panelModulo2) {
		this.panelModulo2 = panelModulo2;
	}



	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public PanelBotonRegresar getPanelBotonRegresar() {
		return panelBotonRegresar;
	}

	public void setPanelBotonRegresar(PanelBotonRegresar panelBotonRegresar) {
		this.panelBotonRegresar = panelBotonRegresar;
	}
	
}

