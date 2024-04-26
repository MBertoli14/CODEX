package Carte;

public class CartaOro extends Carte {
private final int punti;
private final Integer[] costo;
private final Moltiplicatore moltiplicatore;
	public CartaOro(Simbolo simbolo, Simbolo SiNordOvest, Simbolo SiSudOvest, Simbolo SiNordEst, Simbolo SiSudEst,
			int punti,int[] costo_afip,Moltiplicatore moltiplicatore) {
		super(simbolo, SiNordOvest, SiSudOvest, SiNordEst, SiSudEst);
		this.costo=new Integer[4];
		this.punti=punti;
		for(int i=0;i<4;i++) {
			this.costo[i]=costo_afip[i];
		}
		this.moltiplicatore=moltiplicatore;
	}
	public Moltiplicatore getMoltiplicatore() {
		return moltiplicatore;
	}
	
	@Override
	public int getPunti() { 
		if (fronte == true) //super.fronte
			return  (moltiplicatore.ordinal() <<4) + punti;
		else
			return 0;
	}


    	
	public Integer[] getcosto() {
		return costo;
	}
	
	@Override
	public int requisiti() {
		return ((costo[3] & 0xF) << 12) + ((costo[2] & 0xF) << 8) + ((costo[1] & 0xF) << 4) + ((costo[0] & 0xF));
	}	
	
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
