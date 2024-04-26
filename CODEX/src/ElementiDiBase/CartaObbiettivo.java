package ElementiDiBase;

import Carte.Simbolo;

public class CartaObbiettivo {
private final int punti;
private final Obbiettivo obbiettivo;
private final Simbolo simbolo;

public CartaObbiettivo (Simbolo simbolo,Obbiettivo obbiettivo,int punti) {
	this.punti=punti;
	this.obbiettivo=obbiettivo;
	this.simbolo=simbolo;
}

public int getPunti() {
	return punti;
}

public Obbiettivo getObbiettivo() {
	return obbiettivo;
}

public Simbolo getSimbolo() {
	return simbolo;
}

public String toString() {

return "Carta Obbiettivo "+this.simbolo+","+this.obbiettivo+" punti:"+ this.punti + "||";

}	

}

