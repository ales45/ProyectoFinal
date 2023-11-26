package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaModulo4TJ extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelModulo4TJ panelModulo4TJ;
	private PanelBotonRegresar panelBotonRegresar;

	private static final long serialVersionUID = 1L;
	
public VentanaModulo4TJ(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		

		panelModulo4TJ = new PanelModulo4TJ();
		add(panelModulo4TJ,BorderLayout.CENTER);
		
		panelBotonRegresar = new PanelBotonRegresar();
		add(panelBotonRegresar,BorderLayout.SOUTH);
		
		panelModulo4TJ.getBtnLoteria().addActionListener(control);
		panelModulo4TJ.getBtnSuperastro().addActionListener(control);
		panelModulo4TJ.getBtnBaloto().addActionListener(control);
		panelModulo4TJ.getBtnBetplay().addActionListener(control);
		panelModulo4TJ.getBtnChance().addActionListener(control);
		
		panelBotonRegresar.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}

public PanelModulo4TJ getPanelModulo4TJ() {
	return panelModulo4TJ;
}

public void setPanelModulo4TJ(PanelModulo4TJ panelModulo4TJ) {
	this.panelModulo4TJ = panelModulo4TJ;
}

public PanelBotonRegresar getPanelBotonRegresar() {
	return panelBotonRegresar;
}

public void setPanelBotonRegresar(PanelBotonRegresar panelBotonRegresar) {
	this.panelBotonRegresar = panelBotonRegresar;
}




}
