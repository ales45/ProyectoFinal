package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaDetalleApuestas extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelDetallesApuestas panelDetallesApuestas;
		private PanelBotonRegresarM5 panelBotonRegresarM5;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaDetalleApuestas(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelDetallesApuestas = new PanelDetallesApuestas();
			add(panelDetallesApuestas,BorderLayout.CENTER);
			
			panelBotonRegresarM5 = new PanelBotonRegresarM5();
			add(panelBotonRegresarM5,BorderLayout.SOUTH);
			
			panelBotonRegresarM5.getBtnregresarM5().addActionListener(control);

			
}



	public PanelDetallesApuestas getPanelDetallesApuestas() {
		return panelDetallesApuestas;
	}



	public void setPanelDetallesApuestas(PanelDetallesApuestas panelDetallesApuestas) {
		this.panelDetallesApuestas = panelDetallesApuestas;
	}



	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}



	public PanelBotonRegresarM5 getPanelBotonRegresarM5() {
		return panelBotonRegresarM5;
	}



	public void setPanelBotonRegresarM5(PanelBotonRegresarM5 panelBotonRegresarM5) {
		this.panelBotonRegresarM5 = panelBotonRegresarM5;
	}


	
}

