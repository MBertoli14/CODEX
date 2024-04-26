package Carte;

public class Carte {
	//private byte id;
	protected Simbolo simbolo;
	public Angoli angoli[]; //per accesso classe derivata o usare metodo ?
	protected Simbolo simboli_fronte[];
	protected int Nsimboli_esposti[];
	protected boolean fronte;
	public int Xrel;
	public int Yrel;
	//private Carta connessione; //> da rivedere dopo 
	
    //Da richiamare solo dopo ogni aggiornamento nei simboli degli angoli
	protected void AggiornaSimboliEsposti() {	
		for(int i=0;i<7;i++)
			Nsimboli_esposti[i]=0;
			
		
		if (fronte) {
		    
				for (Simbolo s : Simbolo.values()) {
					   if (s==Simbolo.VUOTO)
						   break;
					   
					   for(int i = 0; i<4; i++) {
						   if(angoli[i].simbolo == s)
							   Nsimboli_esposti[s.ordinal()]++;	   
					   }
					}
		} else {
			    int idx = simbolo.ordinal();
			    if (idx<7)
			    	Nsimboli_esposti[idx]++;
		}
	}	
	
	public Carte(Simbolo simbolo,Simbolo SiNordOvest, Simbolo SiSudOvest, Simbolo SiNordEst, Simbolo SiSudEst) {
		this.simbolo=simbolo;
		this.angoli=new Angoli[4];
		this.simboli_fronte=new Simbolo[4];
		this.angoli[0]= new Angoli(SiNordOvest);
		this.angoli[1]= new Angoli(SiSudOvest);
		this.angoli[2]= new Angoli(SiNordEst);
		this.angoli[3]= new Angoli(SiSudEst);
		this.simboli_fronte[0]=SiNordOvest;
		this.simboli_fronte[1]=SiSudOvest;
		this.simboli_fronte[2]=SiNordEst;
		this.simboli_fronte[3]=SiSudEst;
		Nsimboli_esposti = new int[7];
		this.fronte = true;
		AggiornaSimboliEsposti();
		

		Xrel=0; 
		Yrel=0;
	}
	

	
/*	//da rivedere dopo
	public Carta Connetticarta(Carta carta,Angoli connettore,Angoli angoloConnesso) {
		if(connettore.getSimbolo()==null||angoloConnesso.getSimbolo()==null){
		return null;	
		}
		this.connessione=carta;
		connettore.setVisibilita(false);
		connettore.setSimbolo(null);
		angoloConnesso.setVisibilita(true);
		return carta;
	}
*/

	protected void setFronte(){
		
		for(int i = 0; i<4; i++) {
			   angoli[i].simbolo = simboli_fronte[i];	    
		}
		AggiornaSimboliEsposti();
	}

	protected void setRetro(){
		for(int i = 0; i<4; i++) {
		   angoli[i].simbolo = Simbolo.VUOTO;	    
		}
		AggiornaSimboliEsposti();
	}
	
	public void flip() {
		if (fronte == false){
			fronte=true;
			setFronte();
		} else {
			fronte=false;
			setRetro();
		}
	}
	
	public int getPunti() {
		return 0;
	}
	
	public int requisiti() {
		return 0;
	}


/*  //da rivedere dopo	
	public Carta getConnessione() {
		return connessione;
	}
*/	
	public boolean isFronte() {
		return fronte;
	}
	
	
	public Angoli getAngolo(int angolo) {
		return angoli[angolo];
	}
	
	public int[] getSimboliVisibili() {
		return Nsimboli_esposti;
	}

	public void setXrel(int x) {
		Xrel=x; 		
	}
	
	public void setYrel(int y) {
		Yrel=y;		
	}
	
	public int getXrel() {
		return Xrel; 		
	}
	
	public int getYrel() {
		return Yrel;		
	}	
		
	public String toStringSimbolo() {
		return "Carta di simbolo "+this.simbolo+"||";
	}
	
}
