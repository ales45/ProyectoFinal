package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaValorTotalApuestas extends JFrame {

		private PanelPrincipal panelPrincipal;
		private PanelValorApuestas panelValorApuestas;
		private PanelBotonRegresarM5 panelBotonRegresarM5;

		
		private static final long serialVersionUID = 1L;
		
	public VentanaValorTotalApuestas(Controller control) 	{
			
			setSize(800,600);                                             
			setResizable(false);                                         
			setTitle("Ventana Principal");                   
			setDefaultCloseOperation(EXIT_ON_CLOSE);                    
			setLocationRelativeTo(null);                                
			
			
			setLayout(new BorderLayout());
		
			
			panelPrincipal = new PanelPrincipal();
			add(panelPrincipal,BorderLayout.NORTH);
			
			panelValorApuestas = new PanelValorApuestas();
			add(panelValorApuestas,BorderLayout.CENTER);
			
			panelBotonRegresarM5 = new PanelBotonRegresarM5();
			add(panelBotonRegresarM5,BorderLayout.SOUTH);
			

			panelBotonRegresarM5.getBtnregresarM5().addActionListener(control);

			
}



	public PanelValorApuestas getPanelValorApuestas() {
		return panelValorApuestas;
	}



	public void setPanelValorApuestas(PanelValorApuestas panelValorApuestas) {
		this.panelValorApuestas = panelValorApuestas;
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

