package Carte;


public class Carta_Oro extends Carta {
private final int punti;
private final int[] costo;
private final Moltiplicatore moltiplicatore;
/**
 * permette di costruire una carta oro che essendo sottoclasse di carta riceve i campi necessari al super per costruire una carta e in piu alcuni
 * paramentri specifici della carta oro 
 * @param simbolo
 * @param SiNordOvest
 * @param SiSudOvest
 * @param SiNordEst
 * @param SiSudEst
 * @param punti numero di punti che conferisce la carta 
 * @param costo_afip array che indica il costo in termine di simboli della carta i numeri della array di simboli rappresenta il numero di simboli
 * necessari per piazzare la carta in ordine alfabetico per i primi 4:Animale,Fungo,Insetto,Pianta 
 * @param moltiplicatore Simbolo che rappresenta la condizione che una volta soddisfatta moltiplica il punteggio della carta in accordo
 * con le regole del gioco
 * @param FileFronte
 * @param FileRetro
 */
	public Carta_Oro(Simbolo simbolo, Simbolo SiNordOvest, Simbolo SiSudOvest, Simbolo SiNordEst, Simbolo SiSudEst,
			int punti,int[] costo_afip,Moltiplicatore moltiplicatore,String FileFronte,String FileRetro) {
		super(simbolo, SiNordOvest, SiSudOvest, SiNordEst, SiSudEst,FileFronte,FileRetro);
		this.costo=new int[4];
		this.punti=punti;
		for(int i=0;i<4;i++) {
			this.costo[i]=costo_afip[i];
		}
		this.moltiplicatore=moltiplicatore;
	}
	public Moltiplicatore getMoltiplicatore() {
		return moltiplicatore;
	}
	/**
	 * riscrittura del metodo per il caso carta oro restituisce l'oridnale dell moltiplicatore+ il punteggio conferito dalla cata 
	 */

	public int getPunti() { 
		if (fronte == true) //super.fronte
		return 	this.punti;
		else
			return 0;
	}


	/**
	 * resituisce l'array di interi che indica il costo della carta nel ordine ANIMALE,FUNGO,INSETTO,PIANTA,PIUMA,BOCCETTA,PERGAMENA,VUOTO,
	 * @return
	 */
	public int[] getcosto() {
		return costo;
	}
	
/**
 * restituisce il singolo costo specificicato dal parametro in input 
 * @param costo specifica quale elemento dell array costo vogliamo 
 */
	public int requisiti(int costo) {
	return this.costo[costo];
	}	
	/**
	 * restituisce la stringa corrispondente alla carta oro su cui viene chiamato il metodo 
	 * con le sue caratteristiche a seconda che sia di fronte o di retro
	 */
	public String toString() {
		String s[]=new String[4];
		String msg;
		for(int i=0;i<4;i++) {
			s[i]=this.angoli[i].ToString(); //da super classe
		}
	
		if (fronte == true)
		   msg = "Carta Oro "+this.simbolo+"|angoli:"+s[0]+""+s[1]+""+s[2]+""+s[3]+"|costo "+costo[0]+","+costo[1]+","+costo[2]+","+costo[3]+"|punti "+Integer.toString(getPunti() & 0xF)
				+"|moltiplicatore "+ this.moltiplicatore  +"|fronte attivo " + Boolean.toString(fronte) + "||";
		else
		   msg = "Carta Oro "+this.simbolo+"|angoli:"+s[0]+""+s[1]+""+s[2]+""+s[3]+"|punti "+Integer.toString(getPunti() & 0xF)
				+" |fronte attivo " + Boolean.toString(fronte) + "||";		
		
		return msg;
	}
}
