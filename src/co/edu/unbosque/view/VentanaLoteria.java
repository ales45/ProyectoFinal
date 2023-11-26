package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaLoteria extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelLoteria panelLoteria;
	private PanelBotonRegresarM4 panelBotonRegresarM4;

	private static final long serialVersionUID = 1L;
	
public VentanaLoteria(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		
		panelLoteria = new PanelLoteria();
		add(panelLoteria,BorderLayout.CENTER);
		
		panelBotonRegresarM4 = new PanelBotonRegresarM4();
		add(panelBotonRegresarM4,BorderLayout.SOUTH);
		
		panelLoteria.getBtnCrear().addActionListener(control);
		panelLoteria.getBtnactualizar().addActionListener(control);
		panelLoteria.getBtnBuscar().addActionListener(control);
		panelLoteria.getBtnborrar().addActionListener(control);
		
		panelBotonRegresarM4.getBtnregresar().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}




public PanelLoteria getPanelLoteria() {
	return panelLoteria;
}

public void setPanelLoteria(PanelLoteria panelLoteria) {
	this.panelLoteria = panelLoteria;
}

public PanelBotonRegresarM4 getPanelBotonRegresarM4() {
	return panelBotonRegresarM4;
}

public void setPanelBotonRegresarM4(PanelBotonRegresarM4 panelBotonRegresarM4) {
	this.panelBotonRegresarM4 = panelBotonRegresarM4;
}




}
