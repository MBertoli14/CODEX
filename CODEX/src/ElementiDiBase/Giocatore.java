package ElementiDiBase;

import Carte.*;

import java. util. ArrayList;
import java.util.Arrays;

public class Giocatore implements GiocataCartaInMano {
private String nickname;
private ArrayList<Carta> mazzoMano;		//List
private ArrayList<Carta> mazzoGiocato;		//List
private ArrayList<CartaObbiettivo> obbiettivi;
protected int punti;
protected int NumObbiettiviRaggiunti;
private int scoreboardSimboli[];
/**
 * Costruttore del giocatore
 * @param Nick nickname del giocatore 
 */
public Giocatore(String Nick) {
	this.nickname=Nick;
	this.punti = 0;
	this.NumObbiettiviRaggiunti = 0;
	this.mazzoMano = new ArrayList<Carta>();		//List
	this.mazzoGiocato = new ArrayList<Carta>();		//List
	this.obbiettivi = new ArrayList<CartaObbiettivo>();
	scoreboardSimboli = new int[7];
	for(int i=1;i<7;i++)
		scoreboardSimboli[i]=0;
	}

/**
 * Permette di aggiungere una carta al mazzoMano del giocatore
 * @param C carta inserita nel mazzoMano
 */
public void setMazzoMano(Carta C) {
	mazzoMano.add(C);
}

/**
 * Permette di ootenere la posizione di una carta specifica
 * @param pos posizione della carta restituita da mazzoMano
 * @return
 */
public Carta getMazzoMano(int pos) {
	return mazzoMano.get(pos);
}

/**
 * Restituisce l'array list del mazzoMano
 * @return
 */
public ArrayList<Carta> getMazzoMano() {
	return mazzoMano;
}

/**
 * Permette di rimuovere una carta dal mazzoMano
 * @param pos posizione della carta rimossa
 * @return
 */
public Carta removeMazzoMano(int pos) {
	return mazzoMano.remove(pos);
}

/**
 * Restituisce la dimensione di mazzoMano
 * @return
 */
public int getSizeMazzoMano() {
	return mazzoMano.size();
}

/**
 * Stampa tutte le carte contenute in mazzoMano
 */
public void printMazzoMano() {
	for(int i = 0; i<mazzoMano.size(); i++) {
		System.out.println(Integer.toString(i)+">>"+mazzoMano.get(i).toString());
	 
	}
}

/**
 * Permette di aggiungere una carta al mazzoGiocato
 * Modifica di conseguenza la scoreboard dei simoboli
 * @param C carta che viene giocata dal giocatore
 */
public void setMazzoGiocato(Carta C) {
	mazzoGiocato.add(C);
	int simboli[] = C.getSimboliVisibili();
	for(int i=0;i<7;i++) {
		scoreboardSimboli[i]+=simboli[i];
	}
}

/*metodo presente nell'interfaccia GiocataCartaInMano*/
public boolean GiocaCartaInMano(int pos_carta_A,int pos_carta_B, int angolo_A, int angolo_B) { //rimuove dalla mano la carta in pos e mette nel giocato
	//aggiungere tra i parametri : angolo della carta da giocare, carta dest, angolo carta dest
	//controllo di coerenza della posizione finale
	//dopo giocata aggiornare coordinate relative
	//aggiornare il punteggio e la tabella dei simboli
	int x_seconda_carta_coperta = 0;
	int y_seconda_carta_coperta = 0;
	int secondo_angolo_coperto = 0;
	int x_terza_carta_coperta = 0;
	int y_terza_carta_coperta = 0;
	int terzo_angolo_coperto = 0;
	int x_quarta_carta_coperta = 0;
	int y_quarta_carta_coperta = 0;
	int quarto_angolo_coperto = 0;
	int x_cartaGiocata = 0;
	int y_cartaGiocata = 0;
	boolean cartagiocabile = true;
		
	x_cartaGiocata = mazzoGiocato.get(pos_carta_B).getXrel(); //solo inizializzazione
	y_cartaGiocata = mazzoGiocato.get(pos_carta_B).getYrel(); //solo inizializzazione
	switch(angolo_A) {
		case 1:
			x_cartaGiocata = x_cartaGiocata + 1;
			y_cartaGiocata = y_cartaGiocata - 1;
			
			x_seconda_carta_coperta = (x_cartaGiocata-1);
			y_seconda_carta_coperta = (y_cartaGiocata-1);
			secondo_angolo_coperto = 3;
			
			x_terza_carta_coperta = (x_cartaGiocata+1);
			y_terza_carta_coperta = (y_cartaGiocata+1);
			terzo_angolo_coperto = 2;
			
			x_quarta_carta_coperta = (x_cartaGiocata+1);
			y_quarta_carta_coperta = (y_cartaGiocata-1);
			quarto_angolo_coperto = 1;			
			break;
		case 2:
			x_cartaGiocata = x_cartaGiocata + 1;
			y_cartaGiocata = y_cartaGiocata + 1;
			
			x_seconda_carta_coperta = (x_cartaGiocata-1);
			y_seconda_carta_coperta = (y_cartaGiocata+1);
			secondo_angolo_coperto = 4;
						
			x_terza_carta_coperta = (x_cartaGiocata+1);
			y_terza_carta_coperta = (y_cartaGiocata+1);
			terzo_angolo_coperto = 2;
			
			x_quarta_carta_coperta = (x_cartaGiocata+1);
			y_quarta_carta_coperta = (y_cartaGiocata-1);
			quarto_angolo_coperto = 1;			
			break;
		case 3:
			x_cartaGiocata = x_cartaGiocata - 1;
			y_cartaGiocata = y_cartaGiocata - 1;
			
			x_seconda_carta_coperta = (x_cartaGiocata-1);
			y_seconda_carta_coperta = (y_cartaGiocata+1);
			secondo_angolo_coperto = 4;
						
			x_terza_carta_coperta = (x_cartaGiocata-1);
			y_terza_carta_coperta = (y_cartaGiocata-1);
			terzo_angolo_coperto = 3;
			
			x_quarta_carta_coperta = (x_cartaGiocata+1);
			y_quarta_carta_coperta = (y_cartaGiocata-1);
			quarto_angolo_coperto = 1;			
			break;
		case 4:
			x_cartaGiocata = x_cartaGiocata - 1;
			y_cartaGiocata = y_cartaGiocata + 1;
			
			x_seconda_carta_coperta = (x_cartaGiocata-1);
			y_seconda_carta_coperta = (y_cartaGiocata+1);
			secondo_angolo_coperto = 4;
						
			x_terza_carta_coperta = (x_cartaGiocata-1);
			y_terza_carta_coperta = (y_cartaGiocata-1);
			terzo_angolo_coperto = 3;
			
			x_quarta_carta_coperta = (x_cartaGiocata+1);
			y_quarta_carta_coperta = (y_cartaGiocata+1);
			quarto_angolo_coperto = 2;			
			break;			
		default:
	}
	
	int k;
	for(k = 0; k<mazzoGiocato.size(); k++) {
		if ((mazzoGiocato.get(k).getXrel() == x_seconda_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_seconda_carta_coperta)){
			    cartagiocabile = !(mazzoGiocato.get(k).getAngolo(secondo_angolo_coperto - 1).getSimbolo() == Simbolo.NO_ANGOLO);
		} else if ((mazzoGiocato.get(k).getXrel() == x_terza_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_terza_carta_coperta)){
				cartagiocabile = !(mazzoGiocato.get(k).getAngolo(terzo_angolo_coperto - 1).getSimbolo() == Simbolo.NO_ANGOLO); 
		} else if ((mazzoGiocato.get(k).getXrel() == x_quarta_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_quarta_carta_coperta)){
				cartagiocabile = !(mazzoGiocato.get(k).getAngolo(quarto_angolo_coperto - 1).getSimbolo() == Simbolo.NO_ANGOLO);
		}		
		if (!cartagiocabile)
			break;
	}
	
	if (cartagiocabile) {
		Carta C = mazzoMano.remove(pos_carta_A);
		C.getAngolo(angolo_A - 1).setConnessione(true);
		C.setXrel(x_cartaGiocata);
		C.setYrel(y_cartaGiocata);
		
		mazzoGiocato.add(C);
		mazzoGiocato.get(pos_carta_B).getAngolo(angolo_B - 1).setConnessione(true);
		mazzoGiocato.get(pos_carta_B).getAngolo(angolo_B - 1).setVisibilita(false);
		int idx = mazzoGiocato.get(pos_carta_B).getAngolo(angolo_B - 1).getSimbolo().ordinal();
		if (idx < 7)
			scoreboardSimboli[idx]-=1;
		
		int angoli_connessi_in_giocata = 1; //Serve per punteggio carta oro
		int angolo_coperto = 0;
		//int k;
		for(k = 0; k<mazzoGiocato.size(); k++) {
			
			if ((mazzoGiocato.get(k).getXrel() == x_seconda_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_seconda_carta_coperta)) {
				angoli_connessi_in_giocata++;
				angolo_coperto = secondo_angolo_coperto;
			} else if ((mazzoGiocato.get(k).getXrel() == x_terza_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_terza_carta_coperta)) {
				angoli_connessi_in_giocata++;
				angolo_coperto = terzo_angolo_coperto;	
			} else if ((mazzoGiocato.get(k).getXrel() == x_quarta_carta_coperta) && (mazzoGiocato.get(k).getYrel() == y_quarta_carta_coperta)) {
				angoli_connessi_in_giocata++;
				angolo_coperto = quarto_angolo_coperto;
			}
			
			if (angolo_coperto != 0) {
				mazzoGiocato.get(k).getAngolo(angolo_coperto - 1).setConnessione(true);
				mazzoGiocato.get(k).getAngolo(angolo_coperto - 1).setVisibilita(false);
					idx = mazzoGiocato.get(k).getAngolo(angolo_coperto - 1).getSimbolo().ordinal();
					if (idx < 7)
						scoreboardSimboli[idx]-=1;
				angolo_coperto = 0;
		    }	
		}
		int cardSimb[] = C.getSimboliVisibili();
		for(int i=0;i<7;i++) {
			scoreboardSimboli[i]+= cardSimb[i];
		}	
		
		if ((C.getClass().getName().contains("Oro"))) {
					
			int punteggio = ((Carta_Oro)C).getPunti();  //downcast da Carta a Carta oro
			Moltiplicatore moltOro=((Carta_Oro)C).getMoltiplicatore(); //downcast da Carta a Carta oro
			if (moltOro!=Moltiplicatore.ANGOLO&&moltOro!=Moltiplicatore.NESSUNO)  {
				int indice_moltiplicatore=(moltOro.ordinal())+4;
				punti += (punteggio * scoreboardSimboli[indice_moltiplicatore]);
			    System.out.println("+"+(punteggio * scoreboardSimboli[indice_moltiplicatore])+" punti per "+this.getNome());// messaggio di test
			} else if (moltOro==Moltiplicatore.ANGOLO)  {
				punti += (punteggio * angoli_connessi_in_giocata);
				System.out.println("+"+(punteggio * angoli_connessi_in_giocata)+" punti per "+this.getNome());
			} else   {
				punti += punteggio;
				System.out.println("+"+punteggio+" punti per "+this.getNome());
			}	
				
		} else {
			punti += ((CartaRisorsa)C).getPunti(); //downcast da Carta a Carta Risorsa
			System.out.println("+"+((CartaRisorsa)C).getPunti()+" punti per "+this.getNome());
		}
		
	}
	return cartagiocabile;
}

/**
 * Restituisce una carta dal mazzoGiocato
 * @param pos posiozne della carta nel mazzoGiocato
 * @return
 */
public Carta getMazzoGiocato(int pos) {
	return mazzoGiocato.get(pos);
}

/**
 * Restituisce l'array list del mazzoGiocato
 * @return
 */
public ArrayList<Carta> getMazzoGiocato() {
	return mazzoGiocato;
}

/**
 * restituisce la dimensione del mazzoGiocato
 * @return
 */
public int getSizeMazzoGiocato() {
	return mazzoGiocato.size();
}

/**
 * Stampa il mazzoGiocato
 */
public void printMazzoGiocato() {
	for(int i = 0; i<mazzoGiocato.size(); i++)
		System.out.println(Integer.toString(i)+">>"+mazzoGiocato.get(i).toString());
}

/**
 * Stampa gli obbiettivi personali di ciascun giocatore in partita
 */
public void printObbiettivi() {
	for(int i = 0; i<obbiettivi.size(); i++) {
		
		System.out.print(Integer.toString(i)+">>");
		if (i==0)
	      System.out.println("Obbiettivo Personale :");
		else
		  System.out.println("Obbiettivo comune agli altri giocatori :");
	
		System.out.println(obbiettivi.get(i).toString());
	}	
		
}

/**
 * stampa la scoreboard dei simboli di ciascun giocatore in partita
 */
public void printScoreboardSimboli() {
		System.out.println("RISORSE DISPONIBILI per giocatore di turno: ANIMALI "+scoreboardSimboli[0]+
						   " FUNGHI "+scoreboardSimboli[1]+
						   " INSETTI "+scoreboardSimboli[2]+
						   " PIANTE "+scoreboardSimboli[3]+
						   " PIUME "+scoreboardSimboli[4]+
						   " BOCCETTE "+scoreboardSimboli[5]+
						   " PERGAMENE "+scoreboardSimboli[6]);
}

/**
 * Restituisce la scoreboard dei simboli
 * @return
 */
public int[] gettabSimboli() {
	return scoreboardSimboli;
}

/**
 * Aggiunge una cartaObbiettivo al giocatore
 * @param C Carta aggiunta al giocatore
 */
public void setObbiettivo(CartaObbiettivo C) {
	obbiettivi.add(C);
}

/**
 * ritorna il nickname del giocatore
 * @return
 */
public String getNome() {
	return nickname;
}	

/**
 * Ritorna i punti personali di ogni giocatore
 * @return
 */
public int getPunti() {
	return punti;
}

/**
 * Setta i punti del giocatore 
 * @param punti punti assegnati al giocatore
 */
public void setPunti(int punti) {
	this.punti = punti;
}
/**
 * Resitiuisce il numero di obbiettivi che il giocatore ha raggiunto durante il corso della pratita 
 */
public int getNumObbiettiviRaggiunti() {
	return NumObbiettiviRaggiunti;
}

/**
 * Restituisce l'array list degli obbiettivi
 * @return
 */
public ArrayList<CartaObbiettivo> getObbiettivi() {
	return obbiettivi;
}

/**
 * Calcola gli obbiettivi del giocatore aggiornando di volta in volta il punteggio singolo del giocatore
 */
	public void CalcoloObbiettivo() {
		int indice1 = 0;
		int indice2 = 0;
		int indice3 = 0;
		int NCarte = mazzoGiocato.size();
		boolean gia_in_tris[] = new boolean[NCarte];
		System.out.println("------------------------------------");
		System.out.println("Valutazione punti obbiettivo giocatore "+getNome());
		for (int i = 0;i<obbiettivi.size();i++) {
			int incremento = 0;
			int p = 0;
			switch(obbiettivi.get(i).getObbiettivo()) { 
				case COPPIA:
					System.out.println("Valutazione coppia");
					if(scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()]>=2) {
						p=(scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()]/2)*obbiettivi.get(i).getPunti();
						System.out.println("OK, punti coppie ="+p);
						this.punti+=p;
						this.NumObbiettiviRaggiunti++;
					}
					break;
				case TRIO:
					System.out.println("Valutazione trio");
					if(scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()]>=3) {
						p=(scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()]/3)*obbiettivi.get(i).getPunti();
						System.out.println("OK, punti trio ="+p);
						this.punti+=p;
						this.NumObbiettiviRaggiunti++;
					}
					break;
				case TRIO_UNICO:
					System.out.println("Valutazione trio unico");
					int NPiume=scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()];
					int NBoccette=scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()+1];
					int NPergamene=scoreboardSimboli[obbiettivi.get(i).getSimbolo().ordinal()+2];
					if((NPiume>=1) && (NBoccette>=1) && (NPergamene>=1)) {
						if((NPiume!=NBoccette) && (NBoccette!= NPergamene) && (NPergamene!= NPiume)) {
							int arr[] ={NPiume,NBoccette,NPergamene};
							int min=NPiume;
							for(int c=0;c<3;c++) {
								if(arr[c]<min) {
									min=arr[c];
								}
							}
							p=min*obbiettivi.get(i).getPunti();
							System.out.println("OK, punti trio unico ="+p);
							this.punti+=p;
						}
						else {
							this.punti+=(NPiume)*obbiettivi.get(i).getPunti();	
						}
						this.NumObbiettiviRaggiunti++;
					}
					break;
					case SCALA_ASCENDENTE:	
					System.out.println("Valutazione scala ascendente");
					Arrays.fill(gia_in_tris, false);
					if ((obbiettivi.get(i).getSimbolo() == Simbolo.FUNGO) || (obbiettivi.get(i).getSimbolo() == Simbolo.ANIMALE)) {
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;						
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()== obbiettivi.get(i).getSimbolo()) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
									
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1+1)&& (Y2==Y1+1)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2+1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;
												
											    p++; 
											    System.out.println("Numero di scale ascendenti "+p);
											    this.NumObbiettiviRaggiunti++;
											    
										     }
								        }
								    }
						        }
					     }
					 }
					incremento += p * obbiettivi.get(i).getPunti();
					punti+= incremento;
					if (incremento > 0) 
						System.out.println("+ " + incremento + " punti per obbiettivo SCALE ASCENDENTI");
					}	
					break;
				case SCALA_DISCENDENTE:
					System.out.println("Valutazione scala discendente");
					Arrays.fill(gia_in_tris, false);
					if ((obbiettivi.get(i).getSimbolo() == Simbolo.INSETTO) || (obbiettivi.get(i).getSimbolo() == Simbolo.PIANTA)) {
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()== obbiettivi.get(i).getSimbolo()) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) ) {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
									
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1+1)&& (Y2==Y1-1)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2-1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;
												
											    p++; 
											    System.out.println("Numero di scale discendenti "+p);
											    this.NumObbiettiviRaggiunti++;
										     }
								        }
								    }
						        }
					     }
					 }
					incremento += p * obbiettivi.get(i).getPunti();
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo SCALE DISCENDENTI");	
					}
					break;
				case L:	
					System.out.println("Valutazione L");
					Arrays.fill(gia_in_tris, false);
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;						
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()==Simbolo.FUNGO) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) ) {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							    
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
								    
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()==Simbolo.FUNGO)&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1-2)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()==Simbolo.PIANTA)&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2-1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;
												
											    p++; 
											    System.out.println("Numero di L "+p);
											    this.NumObbiettiviRaggiunti++;
										     }
								        }
								    }
						        }
					     }
					 }
					incremento += (p * obbiettivi.get(i).getPunti());
					this.punti+= incremento;
					if (incremento > 0)	
						System.out.println("+ " + incremento + " punti per obbiettivo L");
					break;
				case L_ROVESCIO:
					System.out.println("Valutazione L rovescio");
					Arrays.fill(gia_in_tris, false);
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;						
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()==Simbolo.PIANTA) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
									
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()==Simbolo.PIANTA)&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1-2)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()==Simbolo.INSETTO)&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2-1)&& (Y3==Y2-1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;
												
											    p++; 
											    System.out.println("Numero di L rovescio "+p);
											    this.NumObbiettiviRaggiunti++;
										     }
								        }
								    }
						        }
					     }
					 }
					incremento += (p* obbiettivi.get(i).getPunti());
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo L ROVESCIO");
					break;
				case SETTE:
					System.out.println("Valutazione sette");
					Arrays.fill(gia_in_tris, false);
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;						
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()==Simbolo.INSETTO) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
									
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()==Simbolo.INSETTO)&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1+2)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()==Simbolo.ANIMALE)&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2-1)&& (Y3==Y2+1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;												
												
											    p++;   
											    System.out.println("Numero di sette "+p);
											    this.NumObbiettiviRaggiunti++;
										     }
								        }
								    }
						        }
					     }
					 }
					
					incremento += (p* obbiettivi.get(i).getPunti()); 
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo SETTE");
					break;
				case SETTE_ROVESCIO:
					System.out.println("Valutazione sette rovescio");
					Arrays.fill(gia_in_tris, false);
					for (indice1=0;indice1<(NCarte);indice1++) {
						int prima = 0;
						int seconda = 0;
						int terza = 0;							
						
						if (!gia_in_tris[indice1] && (mazzoGiocato.get(indice1).getSimbolo()==Simbolo.ANIMALE) && (!mazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = mazzoGiocato.get(indice1).getXrel();
							    int Y1 = mazzoGiocato.get(indice1).getYrel();
							    
							    prima = indice1;//Indice prima carta candidata al tris
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = mazzoGiocato.get(indice2).getXrel();
								    int Y2 = mazzoGiocato.get(indice2).getYrel();
									
									if (!gia_in_tris[indice2] && (mazzoGiocato.get(indice2).getSimbolo()==Simbolo.ANIMALE)&& (!mazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1+2)) {
										
										seconda = indice2;//Indice seconda carta candidata al tris
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = mazzoGiocato.get(indice3).getXrel();
										    int Y3 = mazzoGiocato.get(indice3).getYrel();
											
											if (!gia_in_tris[indice3] && (mazzoGiocato.get(indice3).getSimbolo()==Simbolo.FUNGO)&& (!mazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2+1)) {
												terza = indice3;//Indice terza carta candidata al tris
												gia_in_tris[prima]=gia_in_tris[seconda]=gia_in_tris[terza]=true;
																								
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("Numero di sette rovescio "+p);
											    this.NumObbiettiviRaggiunti++;
										     }
								        }
								    }
						        }
					     }
					 }
					
					incremento += (p * obbiettivi.get(i).getPunti());
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo SETTE ROVESCIO");					
					break;
				default:
			}
			
		}
		

	}
	/**
	 * controlla che la carta generica possa essere usata; nel caso della carta oro verifica che le risorse correnti siano sufficenti
	 * se cio e vero restutiisce true 
	 */
	public boolean bloccoCarteOro() {
		boolean blocco = true;
		int i;
		Carta C;
		
		for (i = 0;i<mazzoMano.size();i++) {
		  C = mazzoMano.get(i);
		  
		  if ((C.getClass().getName().contains("Risorsa")) || 
			  ((C.getClass().getName().contains("Oro")) && (C.requisiti(0) <= scoreboardSimboli[0]) && (C.requisiti(1) <= scoreboardSimboli[1]) && (C.requisiti(2) <= scoreboardSimboli[2]) && (C.requisiti(3) <= scoreboardSimboli[3])) ||
			  (C.getClass().getName().contains("Oro") && C.isFronte()==false)) {
			  blocco = false;
			  break;
		  }  
		} 
		
		return blocco;
	}
	
}