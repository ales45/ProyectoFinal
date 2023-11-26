package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo3 extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelModulo3 panelModulo3;
		private PanelBotonRegresar panelBotonRegresar;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo3(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			panelModulo3 = new PanelModulo3();
			add(panelModulo3,BorderLayout.CENTER);
			panelBotonRegresar = new PanelBotonRegresar();
			add(panelBotonRegresar,BorderLayout.SOUTH);
			panelModulo3.getBtnCrear().addActionListener(control);
			panelModulo3.getBtnBuscar().addActionListener(control);
			panelModulo3.getBtnActualizar().addActionListener(control);
			panelModulo3.getBtnBorrar().addActionListener(control);
			panelBotonRegresar.getBtnregresar().addActionListener(control);

			
}

	public PanelModulo3 getPanelModulo3() {
		return panelModulo3;
	}

	public void setPanelModulo3(PanelModulo3 panelModulo3) {
		this.panelModulo3 = panelModulo3;
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

