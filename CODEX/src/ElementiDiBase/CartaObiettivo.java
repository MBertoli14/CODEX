package ElementiDiBase;

import Carte.Simbolo;

public class CartaObiettivo {
	private final int punti;
	private final Obiettivo obiettivo;
	private final Simbolo simbolo;
	
	public CartaObiettivo(int punti, Obiettivo obiettivo, Simbolo simbolo) {
		this.punti = punti;
		this.obiettivo = obiettivo;
		this.simbolo = simbolo;
	}
	
	public int getPunti() {
		return punti;
	}
	
	public Obiettivo getObiettivo() {
		return obiettivo;
	}
	
	public Simbolo getSimbolo() {
		return simbolo;
	}
}
