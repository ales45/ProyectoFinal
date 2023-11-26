package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaChance extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelChance panelChance;
	private PanelBotonRegresarM4 panelBotonRegresarM4;

	private static final long serialVersionUID = 1L;
	
public VentanaChance(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		

		panelChance = new PanelChance();
		add(panelChance,BorderLayout.CENTER);
		
		panelBotonRegresarM4 = new PanelBotonRegresarM4();
		add(panelBotonRegresarM4,BorderLayout.SOUTH);
		
		panelChance.getBtnCrear().addActionListener(control);
		panelChance.getBtnactualizar().addActionListener(control);
		panelChance.getBtnBuscar().addActionListener(control);
		panelChance.getBtnborrar().addActionListener(control);

		panelBotonRegresarM4.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}



public PanelChance getPanelChance() {
	return panelChance;
}

public void setPanelChance(PanelChance panelChance) {
	this.panelChance = panelChance;
}

public PanelBotonRegresarM4 getPanelBotonRegresarM4() {
	return panelBotonRegresarM4;
}

public void setPanelBotonRegresarM4(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}




}
