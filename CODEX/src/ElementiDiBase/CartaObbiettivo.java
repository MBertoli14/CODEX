package ElementiDiBase;

import Carte.Simbolo;

public class CartaObbiettivo {
	private final int punti;
	private final Obbiettivo obbiettivo;
	private final Simbolo simbolo;

	/**
 	* Costruttore del metodo CartaObbiettivo
 	* @param simbolo    	simbolo presente nella cartaObbiettivo
 	* @param obbiettivo   	obbiettivo presente nella cartaObbiettivo
 	* @param punti   		quanti punti vale ogni cartaObbiettivo
 	*/
	public CartaObbiettivo (Simbolo simbolo,Obbiettivo obbiettivo,int punti) {
		this.punti=punti;
		this.obbiettivo=obbiettivo;
		this.simbolo=simbolo;
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
}

