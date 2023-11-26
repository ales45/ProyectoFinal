package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo5E extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelModulo5El panelModulo5El;
		private PanelBotonRegresar panelBotonRegresar;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaModulo5E(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelModulo5El = new PanelModulo5El();
			add(panelModulo5El,BorderLayout.CENTER);
			
			panelBotonRegresar = new PanelBotonRegresar();
			add(panelBotonRegresar,BorderLayout.SOUTH);
			
			panelModulo5El.getBtnListadoClientesSede().addActionListener(control);
			panelModulo5El.getBtnValorTotalApuesta().addActionListener(control);
			panelModulo5El.getBtnDetalleApuestasXclientesYSede().addActionListener(control);
			panelModulo5El.getBtnTotalApuestasXSedeyTipoJuego().addActionListener(control);
			
			panelBotonRegresar.getBtnregresar().addActionListener(control);

			
}



	public PanelModulo5El getPanelModulo5El() {
		return panelModulo5El;
	}
	public void setPanelModulo5El(PanelModulo5El panelModulo5El) {
		this.panelModulo5El = panelModulo5El;
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

