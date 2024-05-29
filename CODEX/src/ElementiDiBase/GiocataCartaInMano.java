package ElementiDiBase;

public interface GiocataCartaInMano {	
	/**
	 * Gioca una carta scelta dal giocatore, aggiorna la scoreboard dei simboli in corrispondenza del risultato, lo stato degli angoli collegati e le coordinate della carta giocata
	 * @param pos_carta_A posizione della carta giocata dall'utente
	 * @param pos_carta_B posizione della carta sulla quale l'utente posiziona la propria
	 * @param angolo_A angolo che si collega dopo la giocata dell'utente
	 * @param angolo_B angolo a cui si collega la carta giocata dall'utente
	 */
	public boolean GiocaCartaInMano(int pos_carta_A,int pos_carta_B, int angolo_A, int angolo_B);
}
