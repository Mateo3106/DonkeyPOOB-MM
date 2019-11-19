package Aplicacion;

import java.util.ArrayList;
/**
 * clase principal DonkeyKong donde se generan el resto de clases
 */
public class DonkeyKong {
	ArrayList<piso>lpisos;
	ArrayList<rescatadores> lrescatadores;
	ArrayList<barriles> lbarriles;
	
	/**
	 * creador de la clase DonkeyKong
	 */
	public DonkeyKong() {
		lpisos=new ArrayList<piso>();
		lrescatadores=new ArrayList<rescatadores>();
	}
	
	/**
	 * genera pisos
	 * @param x coordenada x1 del piso
	 * @param y coordenada y1 del piso
	 * @param z coordenada x2 del piso 
	 * @param w coordenada y2 del piso
	 */
	public void  crearPiso(int x,int y,int z,int w) {
		lpisos.add(new piso(x,y,z,w) );	
	}
	/**
	 * genera un jugador
	 * @param posX coordenada x del jugador
	 * @param posY coordenada y del jugador
	 */
	public void agregarJugador(int posX,int posY) {
		lrescatadores.add(new jugador(posX,posY) );
	}
	
	/**
	 * @return lpisos el array de pisos
	 */
	public ArrayList<piso> getpisos() {
		return lpisos;
	}
	/**
	 * genera un barril
	 * @param x coordenada x del barril
	 * @param y coordenada y del barril
	 * @param dk un DonkeyKong con la informacion de los array de los objetos creados
	 */
	public void agregarbarril(int x,int y,DonkeyKong dk) {
		lbarriles.add(new barriles( x,y,dk));
	}
	
}
