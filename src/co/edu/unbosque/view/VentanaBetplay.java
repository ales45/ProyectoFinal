package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaBetplay extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelBetplay panelBetplay;
	private PanelBotonRegresarM4 panelBotonRegresarM4;

	private static final long serialVersionUID = 1L;
	
public VentanaBetplay(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		

		panelBetplay = new PanelBetplay();
		add(panelBetplay,BorderLayout.CENTER);
		
		panelBotonRegresarM4 = new PanelBotonRegresarM4();
		add(panelBotonRegresarM4,BorderLayout.SOUTH);
		
		panelBetplay.getBtnCrearBetplay().addActionListener(control);
		panelBetplay.getBtnBuscarBetplay().addActionListener(control);
		panelBetplay.getBtnborrarBetplay().addActionListener(control);
		panelBetplay.getBtnGuardarApuesta().addActionListener(control);
		
		panelBotonRegresarM4.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}



public PanelBetplay getPanelBetplay() {
	return panelBetplay;
}

public void setPanelBetplay(PanelBetplay panelBetplay) {
	this.panelBetplay = panelBetplay;
}

public void setPanelBotonRegresarM4(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}

public PanelBotonRegresarM4 getPanelBotonRegresarM4() {
	return panelBotonRegresarM4;
}

public void setPanelBotonRegresar(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}




}
