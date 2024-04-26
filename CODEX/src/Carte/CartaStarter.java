package Carte;

public class CartaStarter extends Carta {
private Simbolo simboli_retro[];

private Simbolo simbolo2;
private Simbolo simbolo3;

//@Override
protected void AggiornaSimboliEsposti_Extra() {	
	
	 if (fronte == false) {
		    int idx; 
		    idx = simbolo2.ordinal();
		    if (idx<7)
		    	Nsimboli_esposti[idx]++;
		    idx = simbolo3.ordinal();
		    if (idx<7)
		    	Nsimboli_esposti[idx]++;
	} 
}    

	public CartaStarter(Simbolo simbolo, Simbolo simbolo2, Simbolo simbolo3, Simbolo[] simboli_fronte, Simbolo[] simboli_retro, String filefronte, String fileretro) {	
		super(simbolo, simboli_fronte[0],simboli_fronte[1],simboli_fronte[2],simboli_fronte[3], filefronte, fileretro);
		this.simboli_retro=new Simbolo[4];
		for(int i=0;i<4;i++) {
			this.simboli_retro[i]=simboli_retro[i];
		}
		this.simbolo2=simbolo2;
		this.simbolo3=simbolo3;
	}
	
	public Simbolo getSimbolo2() {
		return simbolo2;
	}
	public Simbolo getSimbolo3() {
		return simbolo3;
	}
	
    @Override
	protected void setRetro(){
		
		for(int i = 0; i<4; i++) {
			   angoli[i].simbolo = simboli_retro[i];	    
		}
		AggiornaSimboliEsposti();
		AggiornaSimboliEsposti_Extra();
	}	
    
/*	
	
	}
*/
	public String toString() {
	String s[]=new String[4];
	for(int i=0;i<4;i++) {
		s[i]=this.angoli[i].ToString(); //da super classe
	}
	return "Carta Starter, simboli retro (fuori dagli angoli) "+this.simbolo+","+this.simbolo2+","+this.simbolo3+","
			+"|angoli:"+s[0]+""+s[1]+""+s[2]+""+s[3]+"|fronte attivo " + Boolean.toString(fronte) + "||";
	
	
	
	}	

}