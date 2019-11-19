package presentacion;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;


public class ImagenFondo extends JPanel{
	
	ImageIcon imagen;
	private String imagenF;

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		Dimension tam = getSize();
		imagen = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/"+imagenF+".jpg")).getImage());
		g.drawImage(imagen.getImage(),0,0,tam.width,tam.height,null);
	} 
	
	public  ImagenFondo (String imagen){
		imagenF = imagen;
	}
	
	public void setImagen(String imagen) {
		imagenF = imagen;
	}
	
}



