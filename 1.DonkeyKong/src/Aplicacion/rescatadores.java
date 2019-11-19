package Aplicacion;

public abstract class rescatadores implements movimiento {
	protected int posX;
	protected int posY;
	protected int vidas;
	protected int puntos;
	/**
	 * creador de un rescatador sea maquina o jugador 
	 * @param posX del rescatador
	 * @param posY del rescatador
	 */
	public rescatadores(int posX,int posY) {
		vidas=3;
		puntos=0;
		this.posX=posX;
		this.posY=posY;
	}
	/**
	 * @return posicion en X
	 */
	public int getposX() {
		return posX;
	}
	/**
	 * @return posicion en y
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * 
	 * @param p la cantidad de puntos que quiero adicionar 
	 * @return mi nueva cantidad de puntos 
	 */
	public int puntos(int p) {
		return puntos+=p; 
	}
	/**
	 * metodo para restarle las vidas al rescatador
	 */
	public void perderVida() {
		vidas--;
	}
	/**
	 * @return la cantidad de vidas que tiene 
	 */
	public int getVidas() {
		return vidas;
	}
	@Override
	public void jump() {	
	}
	@Override
	public void derecha() {
	}
	@Override
	public void izquierda() {		
	}
	

}
