package ElementiDiBase;

import Carte.*;

import java. util. ArrayList;

public class Giocatore {
private int id;
private String Nickname;
public ArrayList<Carta> mazzoMano;		//List
public ArrayList<Carta> MazzoGiocato;		//List
public ArrayList<CartaObbiettivo> obbiettivi;
private int punti;
private int ScoreboardSimboli[];

public Giocatore(int id,String Nick) {
	this.id=id;
	this.Nickname=Nick;
	this.punti = 0;
	this.mazzoMano = new ArrayList<Carta>();		//List
	this.MazzoGiocato = new ArrayList<Carta>();		//List
	this.obbiettivi = new ArrayList<CartaObbiettivo>();
	ScoreboardSimboli = new int[7];
	for(int i=1;i<7;i++)
		ScoreboardSimboli[i]=0;
	}

public void setMazzoMano(Carta C) {
	mazzoMano.add(C);
}

public Carta getMazzoMano(int pos) {
	return mazzoMano.get(pos);
}

public Carta removeMazzoMano(int pos) {
	return mazzoMano.remove(pos);
}

public int getSizeMazzoMano() {
	return mazzoMano.size();
}

public void printMazzoMano() {
	for(int i = 0; i<mazzoMano.size(); i++) {
		System.out.println(Integer.toString(i)+">>"+mazzoMano.get(i).toString());
	 
	}
}


public void setMazzoGiocato(Carta C) {
	MazzoGiocato.add(C);
	int simboli[] = C.getSimboliVisibili();
	for(int i=0;i<7;i++) {
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
	int Xterza_carta_coperta = 0;
	int Yterza_carta_coperta = 0;
	int terzo_angolo_coperto = 0;
	int Xquarta_carta_coperta = 0;
	int Yquarta_carta_coperta = 0;
	int quarto_angolo_coperto = 0;
	
	Carta C = mazzoMano.remove(pos_carta_A);
	C.angoli[angolo_A - 1].setConnessione(true); 
	C.setXrel(MazzoGiocato.get(pos_carta_B).getXrel());
	C.setYrel(MazzoGiocato.get(pos_carta_B).getYrel());
	switch(angolo_A) {
		case 1:
			C.setXrel((C.getXrel()+1));
			C.setYrel((C.getYrel()-1));
			
			Xseconda_carta_coperta = (C.getXrel()-1);
			Yseconda_carta_coperta = (C.getYrel()-1);
			secondo_angolo_coperto = 3;
			
			Xterza_carta_coperta = (C.getXrel()+1);
			Yterza_carta_coperta = (C.getYrel()+1);
			terzo_angolo_coperto = 2;
			
			Xquarta_carta_coperta = (C.getXrel()+1);
			Yquarta_carta_coperta = (C.getYrel()-1);
			quarto_angolo_coperto = 1;			
			break;
		case 2:
			C.setXrel((C.getXrel()+1));
			C.setYrel((C.getYrel()+1));
			
			Xseconda_carta_coperta = (C.getXrel()-1);
			Yseconda_carta_coperta = (C.getYrel()+1);
			secondo_angolo_coperto = 4;
						
			Xterza_carta_coperta = (C.getXrel()+1);
			Yterza_carta_coperta = (C.getYrel()+1);
			terzo_angolo_coperto = 2;
			
			Xquarta_carta_coperta = (C.getXrel()+1);
			Yquarta_carta_coperta = (C.getYrel()-1);
			quarto_angolo_coperto = 1;			
			break;
		case 3:
			C.setXrel((C.getXrel()-1));
			C.setYrel((C.getYrel()-1));
			
			Xseconda_carta_coperta = (C.getXrel()-1);
			Yseconda_carta_coperta = (C.getYrel()+1);
			secondo_angolo_coperto = 4;
						
			Xterza_carta_coperta = (C.getXrel()-1);
			Yterza_carta_coperta = (C.getYrel()-1);
			terzo_angolo_coperto = 3;
			
			Xquarta_carta_coperta = (C.getXrel()+1);
			Yquarta_carta_coperta = (C.getYrel()-1);
			quarto_angolo_coperto = 1;			
			break;
		case 4:
			C.setXrel((C.getXrel()-1));
			C.setYrel((C.getYrel()+1));
			
			Xseconda_carta_coperta = (C.getXrel()-1);
			Yseconda_carta_coperta = (C.getYrel()+1);
			secondo_angolo_coperto = 4;
						
			Xterza_carta_coperta = (C.getXrel()-1);
			Yterza_carta_coperta = (C.getYrel()-1);
			terzo_angolo_coperto = 3;
			
			Xquarta_carta_coperta = (C.getXrel()+1);
			Yquarta_carta_coperta = (C.getYrel()+1);
			quarto_angolo_coperto = 2;			
			break;			
		default:
	}
	MazzoGiocato.add(C);
	MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].setConnessione(true);;
	MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].setVisibilita(false);
	int idx = MazzoGiocato.get(pos_carta_B).angoli[angolo_B - 1].getSimbolo().ordinal();
	if (idx < 7)
		ScoreboardSimboli[idx]-=1;
	
	int angoli_connessi_in_giocata = 1; //Serve per punteggio carta oro
	int angolo_coperto = 0;
	int k;
	for(k = 0; k<MazzoGiocato.size(); k++) {
		
		if ((MazzoGiocato.get(k).getXrel() == Xseconda_carta_coperta) && (MazzoGiocato.get(k).getYrel() == Yseconda_carta_coperta)) {
			angoli_connessi_in_giocata++;
			angolo_coperto = secondo_angolo_coperto;
		} else if ((MazzoGiocato.get(k).getXrel() == Xterza_carta_coperta) && (MazzoGiocato.get(k).getYrel() == Yterza_carta_coperta)) {
			angoli_connessi_in_giocata++;
			angolo_coperto = terzo_angolo_coperto;	
		} else if ((MazzoGiocato.get(k).getXrel() == Xquarta_carta_coperta) && (MazzoGiocato.get(k).getYrel() == Yquarta_carta_coperta)) {
			angoli_connessi_in_giocata++;
			angolo_coperto = quarto_angolo_coperto;
		}
		
		if (angolo_coperto != 0) {
			MazzoGiocato.get(k).angoli[angolo_coperto - 1].setConnessione(true);
			MazzoGiocato.get(k).angoli[angolo_coperto - 1].setVisibilita(false);
				idx = MazzoGiocato.get(k).angoli[angolo_coperto - 1].getSimbolo().ordinal();
				if (idx < 7)
					ScoreboardSimboli[idx]-=1;
			angolo_coperto = 0;
	    }	
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
			if (indice_moltiplicatore < 7)  {
				punti += (punteggio * ScoreboardSimboli[indice_moltiplicatore]);
			    System.out.println("+"+(punteggio * ScoreboardSimboli[indice_moltiplicatore])+" punti per "+this.getNome());// messaggio di test
			} else if (indice_moltiplicatore == 7)  {
				punti += (punteggio * angoli_connessi_in_giocata);
				System.out.println("+"+(punteggio * angoli_connessi_in_giocata)+" punti per "+this.getNome());
			} else   {
				punti += punteggio;
				System.out.println("+"+punteggio+" punti per "+this.getNome());
			}	
			
	} else {
		punti += C.getPunti();///
		System.out.println("+"+C.getPunti()+" punti per "+this.getNome());
	}
}

public Carta getMazzoGiocato(int pos) {
	return MazzoGiocato.get(pos);
}

public ArrayList<Carta> getMazzoGiocato() {
	return MazzoGiocato;
}

public int getSizeMazzoGiocato() {
	return MazzoGiocato.size();
}

public void printMazzoGiocato() {
	for(int i = 0; i<MazzoGiocato.size(); i++)
		System.out.println(Integer.toString(i)+">>"+MazzoGiocato.get(i).toString());
}

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

public void setObbiettivo(CartaObbiettivo C) {
	obbiettivi.add(C);
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
	
	
	public int aggiornaPunteggioConObbiettivo() {
		int indice1 = 0;
		int indice2 = 0;
		int indice3 = 0;
		int p = 0;
		int NCarte = MazzoGiocato.size();
		System.out.println("Valutazione punti obbiettivo giocatore "+this.getNome());
		for (int i = 0;i<obbiettivi.size();i++) {
			int incremento = 0;
			switch(obbiettivi.get(i).getObbiettivo()) { 
				case COPPIA:
					if(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]>2) {
						if(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]%2!=0) {
							int sottrazione =ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]%2;
							ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]-=sottrazione;
						}
						punti+=(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]/2)*obbiettivi.get(0).getPunti();
					}
					break;
				case TRIO:
					if(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]>3) {
						if(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]%3!=0) {
							int sottrazione =ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]%3;
							ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]-=sottrazione;
						}
						punti+=(ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()]/3)*obbiettivi.get(0).getPunti();
					}
					break;
				case TRIO_UNICO:
					int NPiume=ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()];
					int NBoccette=ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()+1];
					int NPergamene=ScoreboardSimboli[obbiettivi.get(0).getSimbolo().ordinal()+2];
					if(NPiume>1&&NBoccette>1&&NPergamene>1) {
						if(NPiume!=NBoccette&& NBoccette!= NPergamene&& NPergamene!= NPiume ) {
							int arr[] ={NPiume,NBoccette,NPergamene};
							int min=NPiume;
							for(int c=0;i<3;c++) {
								if(arr[i]<min) {
									min=arr[c];
								}
							}
							punti+=min*obbiettivi.get(0).getPunti();
						}
						else {
							punti+=(NPiume)*obbiettivi.get(0).getPunti();	
						}
		}
					break;
				case SCALA_ASCENDENTE:
					System.out.println("Selettore scala ascendente");
					
					
					System.out.println("Valutazione scala scendente");
					
					if ((obbiettivi.get(i).getSimbolo() != Simbolo.FUNGO) && (obbiettivi.get(i).getSimbolo() != Simbolo.ANIMALE))
						return 0;
					
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()== obbiettivi.get(i).getSimbolo()) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1+1)&& (Y2==Y1+1)) {
										
										System.out.println("secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2+1)) {
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("terzo livello OK, numero di scale ascendenti "+p);
										     }
								        }
								    }
						        }
					     }
					 }
					incremento += p * obbiettivi.get(i).getPunti();
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo SCALE ASCENDENTI");
					break;
				case SCALA_DISCENDENTE:
					System.out.println("Valutazione scala discendente");
					
					if ((obbiettivi.get(i).getSimbolo() != Simbolo.INSETTO) && (obbiettivi.get(i).getSimbolo() != Simbolo.PIANTA))
						return 0;		
					
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()== obbiettivi.get(i).getSimbolo()) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) ) {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1+1)&& (Y2==Y1-1)) {
										
										System.out.println("secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()== obbiettivi.get(i).getSimbolo())&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2-1)) {
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("terzo livello OK, numero di scale discendenti "+p);
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
					break;
				case L:
					System.out.println("Selettore L");
					
					System.out.println("Valutazione L");
					
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()==Simbolo.FUNGO) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) ) {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()==Simbolo.FUNGO)&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1-2)) {
										
										System.out.println("secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()==Simbolo.PIANTA)&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2-1)) {
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("terzo livello OK, numero di L "+p);
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
					System.out.println("Selettore L rovecio");
					System.out.println("Valutazione L rovescio");
					
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()==Simbolo.PIANTA) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()==Simbolo.PIANTA)&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1-2)) {
										
										System.out.println("secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()==Simbolo.INSETTO)&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2-1)&& (Y3==Y2-1)) {
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("terzo livello OK, numero di L rovesci "+p);
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
					System.out.println("Selettore sette");
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()==Simbolo.INSETTO) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()==Simbolo.INSETTO)&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1+2)) {
										
										System.out.println("Secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()==Simbolo.ANIMALE)&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2-1)&& (Y3==Y2+1)) {
												
											    p++; //Target raggiunto, incrementa punti
											    
											    System.out.println("terzo livello OK, numero di sette "+p);
										     }
								        }
								    }
						        }
					     }
					 }
					
					incremento += (p* obbiettivi.get(i).getPunti()); //puntiSette e gli altri dovrebbero essere private ?
					this.punti+= incremento;
					if (incremento > 0)
						System.out.println("+ " + incremento + " punti per obbiettivo SETTE");					
					break;
				case SETTE_ROVESCIO:
					System.out.println("Selettore sette rovescio");
					for (indice1=0;indice1<(NCarte);indice1++) {
						
						if ((MazzoGiocato.get(indice1).getSimbolo()==Simbolo.ANIMALE) && (!MazzoGiocato.get(indice1).getClass().getName().contains("Starter")) )  {
							
							    int X1 = MazzoGiocato.get(indice1).getXrel();
							    int Y1 = MazzoGiocato.get(indice1).getYrel();
							    
							    System.out.println("primo livello OK");
							
								for (indice2=0;indice2<(NCarte);indice2++) {
									
								    int X2 = MazzoGiocato.get(indice2).getXrel();
								    int Y2 = MazzoGiocato.get(indice2).getYrel();
									
									if ((MazzoGiocato.get(indice2).getSimbolo()==Simbolo.ANIMALE)&& (!MazzoGiocato.get(indice2).getClass().getName().contains("Starter")) &&
								        (indice2!=indice1)&& (X2==X1)&& (Y2==Y1+2)) {
										
										System.out.println("secondo livello OK");
										
										for (indice3=0;indice3<(NCarte);indice3++) {
											
										    int X3 = MazzoGiocato.get(indice3).getXrel();
										    int Y3 = MazzoGiocato.get(indice3).getYrel();
											
											if ((MazzoGiocato.get(indice3).getSimbolo()==Simbolo.FUNGO)&& (!MazzoGiocato.get(indice3).getClass().getName().contains("Starter")) &&
											        (indice3!=indice2)&& (X3==X2+1)&& (Y3==Y2+1)) {
											    p++; //Target raggiunto, incrementa punti
											    System.out.println("terzo livello OK, numero di sette rovesci "+p);
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
		
		return this.punti;
	}
	
}