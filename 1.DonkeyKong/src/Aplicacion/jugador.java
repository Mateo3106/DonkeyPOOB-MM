package Aplicacion;
/**
 * clase del jugador real 
 *
 */
public class jugador extends rescatadores {
	public int posX;
	public int posY;
	public boolean vida;
	/**
	 * creador del jugador real
	 * @param posX posicion en X de inicio del jugador
	 * @param posY posicion en Y de inicio del jugador
	 */
	public jugador(int posX, int posY) {
		super(posX, posY);
		vida=true;
		// TODO Auto-generated constructor stub	
	}
	/**
	 * el jugador realiza un salto 
	 */
	public void jump() {
		posY=posY++;		
	}
	/**
	 * el jugador se desplaza a la derecha
	 */
	public void derecha() {
		posX=posX++;		
	}
	
	/**
	 * el jugador se desplaza a la izquierda
	 */
	public void izquierda() {
		posX=posX--;		
	}
	
	/**
	 * indica si el jugador esta vivo o no 
	 * @return vida con la comprobacion si esta vivo o no 
	 */
	public boolean miVida() {
		if(vidas==0) {
			vida=false;
		}
		return vida;
	}
	
}
