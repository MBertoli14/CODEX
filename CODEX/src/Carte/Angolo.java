package Carte;

public class Angolo {
	protected Simbolo simbolo;
	private boolean visibile;
	protected boolean connesso; //indice della carta connessa (probabilmente da togliere/usato per testing)
	/**
	 * Costruisce un angolo con un simbolo dato
	 * @param simbolo simbolo da assegnare al angolo
	 */
	public Angolo(Simbolo simbolo) {
		this.simbolo=simbolo;
		this.visibile=true;
		this.connesso=false;
	}
	/**
	 * restituisce il simbolodel angolo
	 * @return 
	 */
	public Simbolo getSimbolo() {
		return this.simbolo;
	}
/**
 * permette di impostare la visibilità del angolo
 * @param Visibilita se true scoperto se false coperto
 */
	public void setVisibilita(boolean Visibilita) {
		this.visibile=Visibilita;
	}/**
	 * permette di impostare se l'angolo è connesso a un altro del angolo
	 * @param Visibilita se true connesso se false non connesso 
	 */
	public void setConnessione(boolean Connessione) {
		this.connesso=Connessione;
	}
	/**
	 * retstituisce la conessione corrente del angolo
	 * @return
	 */
	public boolean getConnessione() {
		return this.connesso;
	}
	/**
	 * restituisce la visibilità del angolo
	 * @return
	 */
	public boolean isVisibile() {
		return visibile;
	}
	/**
	 * permette di visualizzare tutti i campi inerenti al angolo
	 * @return
	 */
	public String ToString() {
		return "("+this.simbolo+"|visibile " + Boolean.toString(visibile)+ "|connesso " + Boolean.toString(connesso) + ")";
	}
	/**
	 * gestisce la logica di giocata di un angolo dando il corrispondente angolo di destinazione dato una angolo da giocare in int  
	 * @param indice_angolo_da_giocare angolo che viene giocato
	 * @return
	 */
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
}/**/
