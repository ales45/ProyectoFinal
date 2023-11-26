package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentanaPrincipal extends JFrame {

	private PanelPrincipal panelPrincipal;
	private PanelPrincipalBotones panelPrincipalBotones;

	private static final long serialVersionUID = 1L;
	
public VentanaPrincipal(Controller control) 	{
		
		setSize(800,600);                                             
		setResizable(false);                                         
		setTitle("Ventana Principal");                   
		setDefaultCloseOperation(EXIT_ON_CLOSE);                    
		setLocationRelativeTo(null);                                
		
		
		setLayout(new BorderLayout());
	
		
		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal,BorderLayout.NORTH);
		
		panelPrincipalBotones = new PanelPrincipalBotones();
		add(panelPrincipalBotones,BorderLayout.CENTER);
		
		panelPrincipalBotones.getModulo1().addActionListener(control);
		panelPrincipalBotones.getModulo2().addActionListener(control);
		panelPrincipalBotones.getModulo3().addActionListener(control);
		panelPrincipalBotones.getModulo4().addActionListener(control);
		panelPrincipalBotones.getModulo5().addActionListener(control);

}

public PanelPrincipal getPanelPrincipal() {
	return panelPrincipal;
}

public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
	this.panelPrincipal = panelPrincipal;
}

public PanelPrincipalBotones getPanelPrincipalBotones() {
	return panelPrincipalBotones;
}

public void setPanelPrincipalBotones(PanelPrincipalBotones panelPrincipalBotones) {
	this.panelPrincipalBotones = panelPrincipalBotones;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
}
