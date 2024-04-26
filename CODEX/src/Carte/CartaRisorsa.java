package Carte;

public class CartaRisorsa extends Carta {
private int punti;

	public CartaRisorsa(Simbolo simbolo, Simbolo Sang1_NordOvest, Simbolo Sang2_SudOvest, Simbolo Sang3_NordEst, Simbolo Sang4_SudEst,int punti,String filefronte, String fileretro) {
		super(simbolo, Sang1_NordOvest, Sang2_SudOvest, Sang3_NordEst, Sang4_SudEst,filefronte,fileretro);
		this.punti=punti;
		//this.punti_fronte=punti;
	}
	
	@Override
	public int getPunti() { 
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