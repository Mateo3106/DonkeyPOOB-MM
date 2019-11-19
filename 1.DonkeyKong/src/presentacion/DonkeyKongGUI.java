
package presentacion;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class DonkeyKongGUI extends JFrame{
	
	private JPanel tablero;
	private JComboBox combo;
	private JButton controles,jugar,salir,volver;
	private ImagenFondo fondo;
	
	private DonkeyKongGUI(){
		prepareElementos();
		prepareElementosTablero();
		
	}
	
	public void prepareElementos() {
		
		setTitle("DONKEY KONG");
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		tablero = new JPanel();
		setSize(700,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fondo = new ImagenFondo("inicio");
		
		setVisible(true);
		
	}
	public void prepareElementosTablero() {
		
		tablero.setLayout(new GridLayout(1,3,5,10));
		
		controles = new JButton("CONTROLES");
		
		jugar = new JButton("JUGAR");
		salir = new JButton("SALIR");
		
		controles.setBackground(Color.black);
		jugar.setBackground(Color.black);
		salir.setBackground(Color.black);
		
		controles.setForeground(Color.white);
		jugar.setForeground(Color.white);
		salir.setForeground(Color.white);
		
		controles.setBorderPainted(false);
		jugar.setBorderPainted(false);
		salir.setBorderPainted(false);
		
		tablero.add(controles);
		tablero.add(jugar);
		tablero.add(salir);
		
		tablero.setBounds(185,560,350,50);
		tablero.setBackground(new Color(0,0,0));
		add(tablero);
		add(fondo);
		prepareAcciones();
		this.revalidate();
		this.repaint();
		
	}
	
	public void prepareElementosAjustes() {
		
		tablero.removeAll();
		this.remove(fondo);
		add(fondo);
		fondo.setImagen("controles");
		volver = new JButton("VOLVER");
		volver.setBackground(Color.black);
		volver.setForeground(Color.white);
		volver.setBorderPainted(false);
		tablero.setBounds(300, 590, 100, 50);
		tablero.add(volver);
		prepareAccionesVolver();
		refresh();
		
	}
	public void prepareElementosTableroInicial() {
		tablero.removeAll();
		this.remove(fondo);
		add(fondo);
		tablero.setLayout(new GridLayout(1,3,5,10));
		combo = new JComboBox();
		combo.setBackground(Color.black);
		combo.setForeground(Color.white);
		combo.addItem("1JUGADOR");
		combo.addItem("2JUGADORES");
		combo.addItem("1JUGADOR vs MAQUiNA");
		combo.addItem("MAQUINA vs MAQUiNA");
		
		volver = new JButton("VOLVER");
		volver.setBackground(Color.black);
		volver.setForeground(Color.white);
		volver.setBorderPainted(false);
		
		
		jugar = new JButton("JUGAR");
		jugar.setBackground(Color.black);
		jugar.setForeground(Color.white);
		jugar.setBorderPainted(false);

		tablero.setBounds(140, 555, 400, 50);
		
		tablero.add(combo);
		tablero.add(jugar);
		tablero.add(volver);
		
		prepareAccionesVolver();

		refresh();
		
		
		
	}
	
	
	public void prepareAcciones() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				accion ("salga");
			}
		});
		
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				accion("salir");
			}
		});
		
		jugar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				accion("jugar");
			}
		});
		
		controles.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				accion("ajuste");
			}
		});
		
		
	}
	
	
	public void prepareAccionesVolver() {
		volver.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				accion("volverMenu");
			}
		});
	}
	
	
	public void refresh() {
		this.revalidate();
		this.repaint();
	}
	
	
	public void accion(String accion) {
		if (accion.equals("jugar")) {
			juegoNuevo();
		}
		else if (accion.equals("ajuste")) {
			ajustes();
		}
		else if (accion.equals("salir")) {
			salir();
		}
		else if (accion.equals("volverMenu")) {
			volverMenu();
		}
	}
	
	public void juegoNuevo() {
		prepareElementosTableroInicial();
		
	}
	
	public void volverMenu() {
		tablero.removeAll();
		this.remove(fondo);
		add(fondo);
		fondo.setImagen("inicio");
		prepareElementosTablero();

	}
	
	public void ajustes() {
		prepareElementosAjustes();
		
	}
	
	public void salir(){
		int input = JOptionPane.showConfirmDialog(null  , 
                "Estas seguro?", "Atencion",JOptionPane.YES_NO_CANCEL_OPTION);
		if(input==0){
			setVisible(false);
			System.exit(0);
		}
		else{
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		}
	}
	
	public static void main(String args[]){
	       DonkeyKongGUI donkey=new DonkeyKongGUI();
	       donkey.setVisible(true);
	} 
}