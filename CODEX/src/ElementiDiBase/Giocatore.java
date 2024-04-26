package ElementiDiBase;

import Carte.*;

import java. util. ArrayList;

public class Giocatore {
	private int id;
	private String Nickname;
	private ArrayList<Carte> mazzoMano;		//List
	private ArrayList<Carte> MazzoGiocato;		//List
	private ArrayList<CartaObiettivo> obbiettivo;
	private int punti;
	private int ScoreboardSimboli[];

	public Giocatore(int id,String Nick) {
	this.id=id;
	this.Nickname=Nick;
	this.punti = 0;
	this.mazzoMano = new ArrayList<Carte>();		//List
	this.MazzoGiocato = new ArrayList<Carte>();		//List
	this.obbiettivo = new ArrayList<CartaObiettivo>();
	ScoreboardSimboli = new int[7];
	for(int i=1;i<7;i++)
		ScoreboardSimboli[i]=0;
	}

	public void setMazzoMano(Carte C) {
		mazzoMano.add(C);
	}

	public Carte getMazzoMano(int pos) {
		return mazzoMano.get(pos);
	}

	public Carte removeMazzoMano(int pos) {
		return mazzoMano.remove(pos);
	}	

	public int getSizeMazzoMano() {
		return mazzoMano.size();
	}

	public void printMazzoMano() {
		for(int i = 0; i<mazzoMano.size(); i++) {
			System.out.println(Integer.toString(i)+">>"+mazzoMano.get(i).toString());
			//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			//System.out.println(mazzoMano.get(i).getClass());
			//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			//class ElementiDiBase.Carta_Oro
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>	    
		}
	}

	/*
	public String toString() {
		String s[]=new String[4];
		for(int i=0;i<4;i++) {
			s[i]=this.angoli[i].ToString();
		}
		return "questa carta e' di "+this.simbolo+" e ha angoli "+s[0]+","+s[1]+","+s[2]+","+s[3];
	}
	 */

	public void setMazzoGiocato(Carte C) {
		MazzoGiocato.add(C);
		int simboli[] = C.getSimboliVisibili();
		for(int i=0;i<7;i++) {
			//System.out.println(">>>>>>>>>>>>>>>>"+simboli[i]);
			ScoreboardSimboli[i]+=simboli[i];
		}
	}

	public void GiocaCartaInMano(int pos_carta_A,int pos_carta_B, int angolo_A, int angolo_B) { //rimuove dalla mano la carta in pos e mette nel giocato
		//aggiungere tra i parametri : angolo della carta da giocare, carta dest, angolo carta dest
		//controllo di coerenza della posizione finale
		//dopo giocata aggiornare coordinate relative
		//aggiornare il punteggio e la tabella dei simboli
		int Xseconda_carta_coperta = 0;
		int Yseconda_carta_coperta = 0;
		int secondo_angolo_coperto = 0; 
	
		Carte C = mazzoMano.remove(pos_carta_A);
		C.angoli[angolo_A - 1].connesso = pos_carta_B;
		C.Xrel=MazzoGiocato.get(pos_carta_B).getXrel();
		C.Yrel=MazzoGiocato.get(pos_carta_B).getYrel();
		switch(angolo_A) {
			case 1:
				C.Xrel+=1;
				C.Yrel-=1;
				Xseconda_carta_coperta = C.Xrel-1;
				Yseconda_carta_coperta = C.Yrel-1;
				secondo_angolo_coperto = 3;
				break;
			case 2:
				C.Xrel+=1;
				C.Yrel+=1;
				Xseconda_carta_coperta = C.Xrel-1;
				Yseconda_carta_coperta = C.Yrel+1;
				secondo_angolo_coperto = 4;			
				break;
			case 3:
				C.Xrel-=1;
				C.Yrel-=1;
				Xseconda_carta_coperta = C.Xrel+1;
				Yseconda_carta_coperta = C.Yrel-1;
				secondo_angolo_coperto = 1;			
				break;
			case 4:
				C.Xrel-=1;
				C.Yrel+=1;
				Xseconda_carta_coperta = C.Xrel+1;
				Yseconda_carta_coperta = C.Yrel+1;
				secondo_angolo_coperto = 2;			
				break;			
			default:
		}
		MazzoGiocato.add(C);
		MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].connesso = MazzoGiocato.size()-1;
		MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].setVisibilita(false);
		int idx = MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].getSimbolo().ordinal();
		if (idx < 7)
			ScoreboardSimboli[idx]-=1;
	
		int angoli_connessi_in_giocata = 1; //Serve per punteggio carta oro
		int k;
		for(k = 0; k<MazzoGiocato.size(); k++) {
			if ((MazzoGiocato.get(k).getXrel() == Xseconda_carta_coperta) && (MazzoGiocato.get(k).getYrel() == Yseconda_carta_coperta)) {
				angoli_connessi_in_giocata++;
				break;
			}		
		}
		if (k<MazzoGiocato.size()) {
			MazzoGiocato.get(k).angoli[secondo_angolo_coperto - 1].connesso = MazzoGiocato.size()-1;
			MazzoGiocato.get(k).angoli[secondo_angolo_coperto - 1].setVisibilita(false);
			//if (MazzoGiocato.get(k).isFronte()) {
				idx = MazzoGiocato.get(k).angoli[secondo_angolo_coperto - 1].getSimbolo().ordinal();
				if (idx < 7)
						ScoreboardSimboli[idx]-=1;
			//}	
		}
	
		int cardSimb[] = C.getSimboliVisibili();
		for(int i=0;i<7;i++) {
			ScoreboardSimboli[i]+= cardSimb[i];
		}	
	
		if ((C.getClass().getName().contains("Oro"))) {
				
			int p = C.getPunti();
			int punteggio = p & 0x0F;
			int moltiplicatore = (p>>4) & 0x0F;
			int indice_moltiplicatore = 4 + moltiplicatore;
			if (indice_moltiplicatore < 7)
				punti += (punteggio * ScoreboardSimboli[indice_moltiplicatore]);
			else if (indice_moltiplicatore == 7)
				punti += (punteggio * angoli_connessi_in_giocata);
			else
				punti += punteggio;
			
		} else {
			punti += C.getPunti();///
		}
	}

	public Carte getMazzoGiocato(int pos) {
		return MazzoGiocato.get(pos);
	}

	public int getSizeMazzoGiocato() {
		return MazzoGiocato.size();
	}

	public void printMazzoGiocato() {
		for(int i = 0; i<MazzoGiocato.size(); i++)
			System.out.println(Integer.toString(i)+">>"+MazzoGiocato.get(i).toString());
	}

	public void printScoreboardSimboli() {
			System.out.println("SIMBOLI SCOPERTI per giocatore di turno: ANIMALI "+ScoreboardSimboli[0]+
						   " FUNGHI "+ScoreboardSimboli[1]+
						   " INSETTI "+ScoreboardSimboli[2]+
						   " PIANTE "+ScoreboardSimboli[3]+
						   " PIUME "+ScoreboardSimboli[4]+
						   " BOCCETTE "+ScoreboardSimboli[5]+
						   " PERGAMENE "+ScoreboardSimboli[6]);
	}

	public int[] gettabSimboli() {
		return ScoreboardSimboli;
	}

	public void setObbiettivoPersonale(CartaObiettivo C) {
		obbiettivo.add(C);
	}
	public Obiettivo getObbiettivoPersonale() {
		return obbiettivo.get(0).getObiettivo();
	}
	public int getSimboloObbiettivoPersonale() {
		return obbiettivo.get(0).getSimbolo().ordinal();
	}

	public String getNome() {
		return Nickname;
	}	

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}
	public void CalcoloObiettivo() {
		Obiettivo obiettivoGiocatore = obbiettivo.get(0).getObiettivo();
		switch(obiettivoGiocatore) {
			case COPPIA:
					if(ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]>2) {
						if((ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]%2)!=0) {
							int sottrazione = ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]%2;
							ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]-= sottrazione;
						}
						punti+= (ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]/2)*obbiettivo.get(0).getPunti();
					}
			break;
			case TRIO:
					if(ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]>3) {
						if((ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]%3)!=0) {
							int sottrazione = ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]%3;
							ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]-= sottrazione;
						}
						punti+= (ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()]/3)*obbiettivo.get(0).getPunti();
					}
			break;
			case TRIO_UNICO:
				int NPiume = ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()];
				int NBoccetta = ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()+1];
				int NPergamena = ScoreboardSimboli[obbiettivo.get(0).getSimbolo().ordinal()+2];
				if(NPiume>1 && NBoccetta>1 && NPergamena>1) {
					if(NPiume != NBoccetta && NBoccetta != NPergamena && NPergamena != NPiume) {
						int min = NPiume;
						int arr[] = {NPiume, NBoccetta, NPergamena};
						for(int i = 0; i < 3; i++) {
							if(arr[i]<min) {
								min=arr[i];
							}
						}
						punti+= min*obbiettivo.get(0).getPunti();
					}
					else {
						punti+= NPiume * obbiettivo.get(0).getPunti();
					}
					
				}
			break;
			case SCALA_ASCENDENTE:
				
			break;
			case L:
				
			break;
			case LROVESCIO:
				
			break;
			case SETTE:
				
			break;
			case SETTE_ROVESCIO:
				
			break;
			default:
		}
		
	}
}