package Aplicacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
/**
 * Clase de los barriles que tira DonkeyPOOB
 *
 */
public class barriles {
	public int x;
	public int y;
	DonkeyKong dk;
	private ArrayList<piso> pisos;
	
/**
 * creador de barriles
 * @param x coordenada x donde sale el barril
 * @param y coordenada y donde sale el barril
 * @param dk atributo para usar el  los array de los suelos y los personajes
 */
	public barriles(int x,int y,DonkeyKong dk){
	this.x=x;
	this.y=y;
	this.dk=dk;
	
	}
/**
 * movimiento final del barril
 */
	public void movimientoFinal() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		for(int i =0;i>pantalla.width;i++) {
			movimientoenY();
			movimientoenX(x);
		}
	}
	
	/**
	 * movimiento vertical del barril	
	 */
	public void movimientoenY() {
			y=y-10;	
		}			
	
	/**
	 * movimiento horizontal del barril
	 * @param valor en x del movimiento del barril
	 */
	public void movimientoenX(int x) {
		pisos = dk.getpisos();
		for (int i = 0; i < pisos.size(); i++) {
			piso p = pisos.get(i);
			if(p.rango(x)) {
				if ((p.getFactor()==y)&&(p.negativa())){
					x--;
				}else if ((p.getFactor()==y)&&(p.positiva()))
					x++;
				}
				
			}
		}
				
		
}
	