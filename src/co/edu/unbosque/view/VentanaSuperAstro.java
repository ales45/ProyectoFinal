package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaSuperAstro extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelSuperAstro panelSuperAstro;
	private PanelBotonRegresarM4 panelBotonRegresarM4;

	private static final long serialVersionUID = 1L;
	
public VentanaSuperAstro(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		

		panelSuperAstro = new PanelSuperAstro();
		add(panelSuperAstro,BorderLayout.CENTER);
		
		panelBotonRegresarM4 = new PanelBotonRegresarM4();
		add(panelBotonRegresarM4,BorderLayout.SOUTH);
		
		panelSuperAstro.getBtnCrear().addActionListener(control);
		panelSuperAstro.getBtnactualizar().addActionListener(control);
		panelSuperAstro.getBtnBuscar().addActionListener(control);
		panelSuperAstro.getBtnborrar().addActionListener(control);

		
		panelBotonRegresarM4.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}



public PanelSuperAstro getPanelSuperAstro() {
	return panelSuperAstro;
}

public void setPanelSuperAstro(PanelSuperAstro panelSuperAstro) {
	this.panelSuperAstro = panelSuperAstro;
}

public PanelBotonRegresarM4 getPanelBotonRegresarM4() {
	return panelBotonRegresarM4;
}

public void setPanelBotonRegresar(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}




}
