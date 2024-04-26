package Carte;

public class Angoli {
	Simbolo simbolo;
	boolean visibile;
	public int connesso; //indice della carta connessa (probabilmente da togliere/usato per testing)
	//int angolo_connesso;
	//id
	public Angoli(Simbolo simbolo) { 
		this.simbolo=simbolo;
		this.visibile=true;
		this.connesso=-1;
	}
	public Simbolo getSimbolo() {
		return this.simbolo;
	}

	public void setVisibilita(boolean Visibilita) {
		this.visibile=Visibilita;
	}
	public boolean isVisibile() {
		return visibile;
	}
	public String ToString() {
		return "("+this.simbolo+"|visibile " + Boolean.toString(visibile)+ "|connesso " + Integer.toString(connesso) + ")";
	}
}
/*test*/
