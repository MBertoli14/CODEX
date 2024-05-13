package ElementiDiBase;

public interface GiocataRegolare {	
	/**
	 * Gestisce il posizinamento delle carte regolando:l'angolo a cui va conessa la carta a seconda del angolo
	 * scelto dal giocatore,e se la carta è oro controlla che il giocatore abbia i requisiti di simboli per 
	 * piazzarla. Il metodo viene implementato nella classe Codex
	 * @param Cmano carta da piazzare 
	 * @param Cgiocata carta sul tavolo 
	 * @param angolo_in_mano angolo della carta da giocare 
	 * @param angolo_a_tavolo angolo della carta sul tavolo
	 * @param simbolBoard 	scoreboard dei simboli del giocatore 
	 * @return
	 */
	public default void GiocaCartaInMano(int pos_carta_A,int pos_carta_B, int angolo_A, int angolo_B) {}
}
