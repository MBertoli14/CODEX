package Carte;

public class CartaRisorsa extends Carte {
private int punti;

	public CartaRisorsa(Simbolo simbolo, Simbolo SiNordOvest, Simbolo SiSudOvest, Simbolo SiNordEst, Simbolo SiSudEst,int punti) {
		super(simbolo, SiNordOvest, SiSudOvest, SiNordEst, SiSudEst);
		this.punti=punti;
	}
	
	@Override
	public int getPunti() { //punti della carta da settare solo al costruttore
		if (fronte == true) 
			return punti;
		else
			return 0;
	}
	
	@Override
	public void flip() {
		if (super.fronte == false){
			super.fronte=true;
			setFronte();
		} else {
			super.fronte=false;
			punti=0;
			setRetro();
		}
	}	
	
	public String toString() {
	String s[]=new String[4];
	for(int i=0;i<4;i++) {
		s[i]=this.angoli[i].ToString(); //da superclasse
	}
		return "Carta Risorsa "+this.simbolo+"|angoli:"+s[0]+""+s[1]+""+s[2]+""+s[3]+"|punti "+Integer.toString(getPunti())+" |fronte attivo " + Boolean.toString(fronte) + "||";

	}
	
}