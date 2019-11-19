package Aplicacion;
/**
 * genera el piso por donde pasaran los barriles y los personajes
 *
 */
public class piso
{
	public  int xUno;
	public int xDos;
	public int yUno;
	public int yDos;
	private int pendiente;
	private int factor;
	/**
	 * creador de la clase piso 
	 * @param pos x1 del piso
	 * @param y pos y1 del piso
	 * @param z pos x2 del piso
	 * @param w pos y2 del piso 
	 */
	public piso(int x,int y,int z,int w) {
		setFactor(((-1*y)-(pendiente*x)));
		setPendiente((((-1*w)-(-1*y))/(z-x)));
		xUno=x;
		xDos=z;
		yUno=y;
		yDos=w;	
	}
/**
 * retorna valor de la pendiente
 * @ pendiente con el valor de la pendiente
 */
	public int getPendiente() {
		return pendiente;
	}
/**
 * inicializa el valor de la pendiente
 * @param pendiente int que indica el valor de la pendiente
 */
	public void setPendiente(int pendiente) {
		this.pendiente = pendiente;
	}
	
	/**
	 * para mirar si un objeto se encuentra en el rango del piso 
	 * @param x coordenada que quiero verificar el rango
	 * @return si se encuentra en el rango 
	 */
	 public boolean rango(int x){
		    boolean respuesta=false;
		    if (xUno>xDos){
		        respuesta=(xDos<=x && x<=xUno);
		    }else{
		        respuesta=(xUno<=x && x<=xDos);
		    }
		    return respuesta;
		   }
	 /** 
	  *  verifica si una pendiente es positiva
	  * @return true si la pendiente es positiva o false si no 
	  */
	 public boolean positiva() { 
		return pendiente>=0 ;
	 }
	 
	 /**
	  *  verifica si una pendiente es negativa
	  * @return true si la pendiente es negativa o false si no 
	  */
	 public boolean negativa() {
		 return pendiente<=0 ;
	 }
	 /**
	  * @return el valor del factor b
	  */
	public int getFactor() {
		return factor;
	}
	
	/**
	 * asigna a factor el valor de factor calculado
	 * @param factor el valor del factor b
	 */
	public void setFactor(int factor) {
		this.factor = factor;
	}

}
