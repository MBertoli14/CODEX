package ElementiDiBase;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import Carte.Simbolo;

public class CartaObbiettivo {
	private final int punti;
	private final Obbiettivo obbiettivo;
	private final Simbolo simbolo;
	private String filefronte;
	private BufferedImage immagineFronte;	

	/**
 	* Costruttore del metodo CartaObbiettivo
 	* @param simbolo    	simbolo presente nella cartaObbiettivo
 	* @param obbiettivo   	obbiettivo presente nella cartaObbiettivo
 	* @param punti   		quanti punti vale ogni cartaObbiettivo
 	*/
	public CartaObbiettivo (Simbolo simbolo,Obbiettivo obbiettivo,int punti, String file) {
		this.punti=punti;
		this.obbiettivo=obbiettivo;
		this.simbolo=simbolo;
		this.filefronte = file;
		
	    try { 
	    	  this.immagineFronte = ImageIO.read(new File(this.filefronte));
	    } catch (Exception e) {
		      	  System.out.println("Errore durante il caricamento dell immagine." + e);
		}		
	}

	/**
	* Restituisce i punti della cartaObbiettivo
 	* @return
 	*/
	public int getPunti() {
		return punti;
	}

	/**
	 * Restituisce l'obbiettivo della cartaObbiettivo
	 * @return
	 */
	public Obbiettivo getObbiettivo() {
		return obbiettivo;
	}

	/**
	 * Restituisce il simbolo della cartaObbiettivo
	 * @return
	 */
	public Simbolo getSimbolo() {
		return simbolo;
	}
	
	/**
	 * Stampa la cartaObbiettivo
	 */
	public String toString() {
		return "Carta Obbiettivo "+this.simbolo+","+this.obbiettivo+" punti:"+ this.punti + "||";
	}
	
	/**
	 * restituisce il buffer del immagine  fronte o retro a seconda dello stato attuale della carta della carta
	 * @return
	 */
	public BufferedImage getImage() {
			  return this.immagineFronte;
	}	
}

