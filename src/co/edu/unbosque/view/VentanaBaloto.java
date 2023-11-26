package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaBaloto extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelBaloto panelBaloto;
	private PanelBotonRegresarM4 panelBotonRegresarM4;

	private static final long serialVersionUID = 1L;
	
public VentanaBaloto(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		

		panelBaloto = new PanelBaloto();
		add(panelBaloto,BorderLayout.CENTER);
		
		panelBotonRegresarM4 = new PanelBotonRegresarM4();
		add(panelBotonRegresarM4,BorderLayout.SOUTH);
		
		panelBaloto.getBtnCrear().addActionListener(control);
		panelBaloto.getBtnactualizar().addActionListener(control);
		panelBaloto.getBtnBuscar().addActionListener(control);
		panelBaloto.getBtnborrar().addActionListener(control);
		

		
		panelBotonRegresarM4.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}
public PanelBaloto getPanelBaloto() {
	return panelBaloto;
}

public void setPanelBaloto(PanelBaloto panelBaloto) {
	this.panelBaloto = panelBaloto;
}

public PanelBotonRegresarM4 getPanelBotonRegresarM4() {
	return panelBotonRegresarM4;
}

public void setPanelBotonRegresarM4(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}




}
