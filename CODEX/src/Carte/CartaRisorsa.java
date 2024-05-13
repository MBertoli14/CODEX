package Carte;

public class CartaRisorsa extends Carta {
private int punti;
	/**
	 * costruttore carta risorsa sottoclasse di carta usa gli stessi parametri della carta aggingendo il campo punti
	 * @param simbolo
	 * @param Sang1_NordOvest
	 * @param Sang2_SudOvest
	 * @param Sang3_NordEst
	 * @param Sang4_SudEst
	 * @param punti punti che conferisce questa carta 
	 * @param filefronte
	 * @param fileretro
	 */
	public CartaRisorsa(Simbolo simbolo, Simbolo Sang1_NordOvest, Simbolo Sang2_SudOvest, Simbolo Sang3_NordEst, Simbolo Sang4_SudEst,int punti,String filefronte, String fileretro) {
		super(simbolo, Sang1_NordOvest, Sang2_SudOvest, Sang3_NordEst, Sang4_SudEst,filefronte,fileretro);
		this.punti=punti;
		//this.punti_fronte=punti;
	}
	/**
	 * override di getpunti per il caso carta risorsa se la carta è di fronte restituisce il numero di punti della carta altrimenti
	 * restituisce 0
	 */
	@Override
	public int getPunti() { 
		if (fronte == true) 
			return punti;
		else
			return 0;
	}
	/**
	 * ovrride di flip imposta il campo fornte a true o false a seconda del caso e aggiorna i relativ angoli della carta 
	 */
	@Override
	public void flip() {
		if (super.fronte == false){
			super.fronte=true;
			setFronte();
		} else {
			super.fronte=false;
			setRetro();
		}
	}	
	/**
	 * Restituisce la stringa che rappresenta la carta risorsa su cui viene chiamato il metodo 
	 */
	public String toString() {
	String s[]=new String[4];
	for(int i=0;i<4;i++) {
		s[i]=this.angoli[i].ToString(); //da superclasse
	}
		return "Carta Risorsa "+this.simbolo+"|angoli:"+s[0]+""+s[1]+""+s[2]+""+s[3]+"|punti "+Integer.toString(getPunti())+" |fronte attivo " + Boolean.toString(fronte) + "||";

	}
	
}