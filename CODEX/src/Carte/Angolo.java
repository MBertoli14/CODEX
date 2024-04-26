package Carte;

public class Angolo {
	Simbolo simbolo;
	private boolean visibile;
	protected boolean connesso; //indice della carta connessa (probabilmente da togliere/usato per testing)
	
	public Angolo(Simbolo simbolo) {
		this.simbolo=simbolo;
		this.visibile=true;
		this.connesso=false;
	}
	public Simbolo getSimbolo() {
		return this.simbolo;
	}

	public void setVisibilita(boolean Visibilita) {
		this.visibile=Visibilita;
	}
	public void setConnessione(boolean Connessione) {
		this.connesso=Connessione;
	}
	public boolean getConnessione() {
		return this.connesso;
	}
	
	public boolean isVisibile() {
		return visibile;
	}
	public String ToString() {
		return "("+this.simbolo+"|visibile " + Boolean.toString(visibile)+ "|connesso " + Boolean.toString(connesso) + ")";
	}
	public int angoloComplementare(int indice_angolo_da_giocare){
		int risultato = 0;
		switch (indice_angolo_da_giocare) {
		case 1:
			risultato = 4;
			break;
		case 2:
			risultato = 3;
			break;
		case 3:
			risultato = 2;
			break;	
		case 4:
			risultato = 1;
			break;
		default:
		}
		
		return risultato;
		
	}
}
/*test*/
