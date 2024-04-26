package ElementiDiBase;

import Carte.*;

import java.util.Scanner;
import java. util.ArrayList;
import java.util.Random;
import java.util.*;
import java.io.IOException;

public class Codex {

	//Cards to initialize	
	static ArrayList<CartaRisorsa> CarteRisorsa = new ArrayList<CartaRisorsa>();
	static ArrayList<CartaOro> CarteOro = new ArrayList<CartaOro>();
	static ArrayList<CartaObiettivo> CarteObbiettivo = new ArrayList<CartaObiettivo>();
	static ArrayList<CartaStarter> CarteStarter = new ArrayList<CartaStarter>();
	static ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	static int Nplayer;
	
	static void InitCards()
	{
		////////////////INIZIALIZZAZIONE CARTE RISORSA//////////////////////////////////////////////////////////////////////////////
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.BOCCETTA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.INSETTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.INSETTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.PIUMA,Simbolo.INSETTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.FUNGO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.NO_ANGOLO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.INSETTO,0));

		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.INSETTO,Simbolo.ANIMALE,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.PERGAMENA,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.PIUMA,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.FUNGO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.ANIMALE,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.ANIMALE,0));
		
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PERGAMENA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIANTA,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.PIANTA,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.INSETTO,Simbolo.PIANTA,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.BOCCETTA,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.VUOTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,0));
		
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.PIUMA,Simbolo.FUNGO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.ANIMALE,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.PERGAMENA,Simbolo.INSETTO,Simbolo.NO_ANGOLO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,1));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.VUOTO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,0));
		CarteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.FUNGO,0));
		
		///////////////INIZIALIZZAZIONE CARTE ORO//////////////////////////////////////////////////////////////////////////////
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{0,0,1,3},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{1,0,0,2},Moltiplicatore.BOCCETTA));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.VUOTO,1,new int[]{0,1,0,2},Moltiplicatore.PERGAMENA));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.PIUMA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{0,0,1,2},Moltiplicatore.PIUMA));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,1,0,3},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{1,0,0,3},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,5,new int[]{0,0,0,5},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.VUOTO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO));

		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.VUOTO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,5,new int[]{0,5,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{0,3,0,1},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,3,1,0},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.PIUMA,1,new int[]{1,2,0,0},Moltiplicatore.PIUMA));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.VUOTO,1,new int[]{0,2,0,1},Moltiplicatore.BOCCETTA));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.PERGAMENA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{0,2,1,0},Moltiplicatore.PERGAMENA));
		CarteOro.add(new CartaOro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{1,3,0,0},Moltiplicatore.ANGOLO));
		
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{3,0,1,0},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{2,1,0,0},Moltiplicatore.PIUMA));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.PERGAMENA,1,new int[]{2,1,0,0},Moltiplicatore.PERGAMENA));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.BOCCETTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{2,0,1,0},Moltiplicatore.BOCCETTA));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{3,0,0,1},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{3,1,0,0},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,5,new int[]{5,0,0,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIUMA,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO));		
		
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{1,0,2,0},Moltiplicatore.PERGAMENA));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.VUOTO,1,new int[]{0,0,2,1},Moltiplicatore.PIUMA));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,1,3,0},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{0,0,3,1},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{1,0,3,0},Moltiplicatore.ANGOLO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.BOCCETTA,1,new int[]{1,0,2,0},Moltiplicatore.BOCCETTA));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,5,new int[]{0,0,5,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO));
		CarteOro.add(new CartaOro(Simbolo.INSETTO,Simbolo.BOCCETTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO));
		
		///////////////INIZIALIZZAZIONE CARTE STARTER//////////////////////////////////////////////////////////////////////////////
		Simbolo s1_ang_fronte[] = new Simbolo[]{Simbolo.FUNGO,Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.ANIMALE};
		Simbolo s1_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.VUOTO};
		CarteStarter.add(new CartaStarter(Simbolo.INSETTO, Simbolo.VUOTO, Simbolo.VUOTO, s1_ang_fronte,s1_ang_retro));
		Simbolo s2_ang_fronte[] = new Simbolo[]{Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.ANIMALE,Simbolo.INSETTO};
		Simbolo s2_ang_retro[] = new Simbolo[]{Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.FUNGO};
		CarteStarter.add(new CartaStarter(Simbolo.FUNGO, Simbolo.VUOTO, Simbolo.VUOTO, s2_ang_fronte,s2_ang_retro));
		Simbolo s3_ang_fronte[] = new Simbolo[]{Simbolo.PIANTA,Simbolo.ANIMALE,Simbolo.INSETTO,Simbolo.FUNGO};
		Simbolo s3_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO};
		CarteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.INSETTO, Simbolo.VUOTO, s3_ang_fronte,s3_ang_retro));
		Simbolo s4_ang_fronte[] = new Simbolo[]{Simbolo.INSETTO,Simbolo.FUNGO,Simbolo.ANIMALE,Simbolo.PIANTA};
		Simbolo s4_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO};
		CarteStarter.add(new CartaStarter(Simbolo.FUNGO, Simbolo.PIANTA, Simbolo.VUOTO, s4_ang_fronte,s4_ang_retro));
		Simbolo s5_ang_fronte[] = new Simbolo[]{Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.ANIMALE};
		Simbolo s5_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO};
		CarteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.INSETTO, Simbolo.PIANTA, s5_ang_fronte,s5_ang_retro));
		Simbolo s6_ang_fronte[] = new Simbolo[]{Simbolo.FUNGO,Simbolo.PIANTA,Simbolo.ANIMALE,Simbolo.INSETTO};
		Simbolo s6_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO};
		CarteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.FUNGO, Simbolo.PIANTA, s6_ang_fronte,s6_ang_retro));		
		//CartaStarter(Simbolo simbolo, Simbolo simbolo2, Simbolo simbolo3, Angolo[] angoli,Angolo[] angoliretro)
		
		
		///////////////INIZIALIZZAZIONE CARTE OBBIETTIVO//////////////////////////////////////////////////////////////////////////////
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.SCALA_DISCENDENTE ,Simbolo.INSETTO));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.SCALA_ASCENDENTE ,Simbolo.ANIMALE));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.TRIO ,Simbolo.FUNGO));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.TRIO ,Simbolo.PIANTA));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.TRIO ,Simbolo.INSETTO));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.TRIO, Simbolo.ANIMALE));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.SCALA_ASCENDENTE ,Simbolo.FUNGO));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.SCALA_DISCENDENTE ,Simbolo.PIANTA));
		CarteObbiettivo.add(new CartaObiettivo(3,Obiettivo.SETTE, Simbolo.INSETTO));
		CarteObbiettivo.add(new CartaObiettivo(3,Obiettivo.SETTE_ROVESCIO, Simbolo.ANIMALE));
		CarteObbiettivo.add(new CartaObiettivo(3,Obiettivo.L ,Simbolo.FUNGO));
		CarteObbiettivo.add(new CartaObiettivo(3,Obiettivo.LROVESCIO ,Simbolo.PIANTA));
		CarteObbiettivo.add(new CartaObiettivo(3,Obiettivo.TRIO_UNICO ,Simbolo.PIUMA));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.COPPIA ,Simbolo.BOCCETTA));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.COPPIA, Simbolo.PERGAMENA));
		CarteObbiettivo.add(new CartaObiettivo(2,Obiettivo.COPPIA ,Simbolo.PIUMA));
		
					
	}
	
	static void MostraCarteSulTavolo() 
	{
		System.out.println("///////////////NUOVE CARTE DISPONIBILI (TAVOLO)///////////////////////");
		System.out.println("CARTE RISORSA");
		for (int i = 0;i < 2; i++)
		{	
			System.out.println(i+">>>"+CarteRisorsa.get(i).toString());
		}
		System.out.println("2>>>"+CarteRisorsa.get(2).toString());
		System.out.println("CARTE ORO");
		for (int i = 0;i < 2; i++)
		{	
			System.out.println(i+">>>"+CarteOro.get(i).toString());
		}
		System.out.println("2>>>"+CarteOro.get(2).toStringSimbolo());
		System.out.println("//////////////////////////////////////////////////////////////////////");
	}

	static void MostraPunteggio() 
	{	
	   System.out.print("PUNTEGGIO : ");	
	   for(int i=0;i<Nplayer;i++) {		  
		  System.out.print(giocatori.get(i).getNome() + " " + giocatori.get(i).getPunti() + "|");
		}
	   System.out.println(" ");
	}
	
	static int angoloComplementare(int indice_angolo_da_giocare){
		int risultato = 0;
		switch (indice_angolo_da_giocare) {
		case 1:
			risultato = 4;
			break;
		case 2:
			risultato = 3;
			break;
		case 3:
			risultato = 2;
			break;	
		case 4:
			risultato = 1;
			break;
		default:
		}
		
		return risultato;
		
	}
	
	static boolean GiocataRegolare(Carte Cmano, Carte Cgiocata,int angolo_in_mano,int angolo_a_tavolo,int simbolBoard[])
	{
		boolean risultato = true;
		int requisiti = 0;
		
		//Primo test di compatibilita' angoli
		switch (angolo_in_mano) {
		case 1:
		    if (angolo_a_tavolo != 4) {
		    	risultato = false;
		    	System.out.println("L'angolo 1 dev'essere connesso al 4 di una carta a terra");
		    }
			break;
		case 2:
		    if (angolo_a_tavolo != 3) {
				risultato = false;
				System.out.println("L'angolo 2 dev'essere connesso al 3 di una carta a terra");
		    }
			break;
		case 3:
		    if (angolo_a_tavolo != 2) {
				risultato = false;
				System.out.println("L'angolo 3 dev'essere connesso al 2 di una carta a terra");
		    }
			break;
		case 4:
		    if (angolo_a_tavolo != 1) {
				risultato = false;
				System.out.println("L'angolo 4 dev'essere connesso al 1 di una carta a terra");
		    }	
			break;
		default:
		}
		
		if ((risultato == true) && (Cgiocata.angoli[angolo_a_tavolo - 1].getSimbolo() == Simbolo.NO_ANGOLO)) {
			risultato = false;
		}
		
		//Se nessun fallimento e' avvenuto sopra verifica se l'angolo della carta a tavolo e' gia' connesso
		if ((risultato == true) && (Cgiocata.angoli[angolo_a_tavolo - 1].connesso != -1)) {
			risultato = false;
			System.out.println("L'angolo " + Integer.toString(angolo_a_tavolo) +  "della carta a tavolo scelta è gia connesso");
		}

	    requisiti = Cmano.requisiti();
	    if ((risultato == true) && (Cmano.getClass().getName().contains("Oro")) && Cmano.isFronte()) {
    		risultato = (((requisiti & 0xF) <= simbolBoard[0]) && (((requisiti>>4) & 0xF) <= simbolBoard[1]) && (((requisiti>>8) & 0xF) <= simbolBoard[2]) && (((requisiti>>12) & 0xF) <= simbolBoard[3]));
    		if (!risultato)
    			System.out.println("Risorse non sufficienti per abilitare la giocabilità della carta oro");	    	
	    }
			
	     return risultato;

	}	
	
Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	//Inizializza i mazzi di carte
	InitCards();
	
	//Mischia i quattro mazzi di carte
	/*
	Collections.shuffle(CarteRisorsa, new Random(System.currentTimeMillis()));
	Collections.shuffle(CarteOro, new Random(System.currentTimeMillis()));
	Collections.shuffle(CarteStarter, new Random(System.currentTimeMillis()));
	Collections.shuffle(CarteObbiettivo, new Random(System.currentTimeMillis()));
	*/
	
	Scanner sc=new Scanner(System.in);
	String playerName;
		do {
			System.out.println("inserisci 2 o 4 giocatori"+"\n");
			Nplayer=sc.nextInt();			
		//	System.out.println(Nplayer); mostra il numero di giocatore immesso 
			if(Nplayer!=2 && Nplayer!=4) {
			System.out.println("Hai inserito un numero di giocatori diverso da quello consentito"+"\n");
			}
		}while(Nplayer!=2 && Nplayer!=4);
		
		for(int i=0;i<Nplayer;i++) {
		do {
			System.out.println("inserisci il Nome del giocatore "+(i+1)+"\n");	
			playerName=sc.next();
		}while(String.class.isInstance(playerName)!=true);
			giocatori.add(new Giocatore(i,playerName));
		}
			int cartObb=0;	
		//Iizializza carte in mano ai giocatori
		for(int i=0;i<Nplayer;i++) {
		  giocatori.get(i).setMazzoGiocato(CarteStarter.remove(0));
		  giocatori.get(i).setMazzoMano(CarteRisorsa.remove(0));
		  giocatori.get(i).setMazzoMano(CarteRisorsa.remove(0));
		  giocatori.get(i).setMazzoMano(CarteOro.remove(0));
		  System.out.println("scegli la cata obbiettivo da prendere 1 o 2");
		  cartObb=sc.nextInt();
		  if(cartObb==1) {
			  giocatori.get(i).setObbiettivoPersonale(CarteObbiettivo.remove(i)); 
		  }
		  if(cartObb==2) {
			  giocatori.get(i).setObbiettivoPersonale(CarteObbiettivo.remove(i+1)); 
		  }
		  
		}	
		
		boolean punteggio20Raggiunto = false;
		int turno = 0;
		int giocatore_di_turno = 0;
		int input = 0;
		int input2;
		int input3;
		
		while ( (!(punteggio20Raggiunto && (giocatore_di_turno==0))) && (input != 8)  ){
		   do {	   
			   MostraPunteggio();
			   System.out.println("***************************************************************************");
			   System.out.println("MENU GIOCATORE di turno ("+ giocatori.get(giocatore_di_turno).getNome()+")");
			   
			   System.out.println("1-Visualizza carte in mano"); //
			   System.out.println("2-Flip carte in mano");
			   System.out.println("3-Mostra carte giocate"); //
			   System.out.println("4-Gioca carta");
			   System.out.println("5-Visualizza carte disponibili sul tavolo"); //
			   System.out.println("6-Prendi carta da tavolo"); //
			   System.out.println("7-Passa al prossimo giocatore");//
			   System.out.println("8-Termina partita");
			   System.out.println("***************************************************************************");
			   
			   input = sc.nextInt();
			   /////Queste due linee qui' sotto servono per provare a ripulire lo schermo////
			   //System.out.print("\033[H\033[2J");
			   //System.out.flush();
			   ////////////////////////////////////////////////////////////////////
	           switch (input) {
	           case 1:
	        	   System.out.println("*****N carte IN MANO = " + giocatori.get(giocatore_di_turno).getSizeMazzoMano()+"*****");
	        	   giocatori.get(giocatore_di_turno).printMazzoMano();
	        	   break;
	           case 2:
	        	   do {
	        		   System.out.println("Seleziona la posizione della carta in mano da girare (0.."+(giocatori.get(giocatore_di_turno).getSizeMazzoMano()-1));
	        		   input2 = sc.nextInt();
	               } while((input2<0) && (input2>=giocatori.get(giocatore_di_turno).getSizeMazzoMano()));
	        		   giocatori.get(giocatore_di_turno).getMazzoMano(input2).flip(); 	   
	        	   break;
	           case 3:
	        	   System.out.println("*****N carte GIOCATE = " + giocatori.get(giocatore_di_turno).getSizeMazzoGiocato()+"*****");
	        	   giocatori.get(giocatore_di_turno).printMazzoGiocato();
	        	   giocatori.get(giocatore_di_turno).printScoreboardSimboli();
	        	   break;
	           case 4:
	        	   int indice_carta_da_giocare,indice_angolo_da_giocare, indice_carta_giocata, indice_angolo_carta_giocata;
	        	   int size_mazzo_mano = giocatori.get(giocatore_di_turno).getSizeMazzoMano();
	        	   int size_mazzo_giocato = giocatori.get(giocatore_di_turno).getSizeMazzoGiocato();
	        	   
	        	   do {
		        	   do {
		        	     System.out.println("inserire l'indice della carta in mano da giocare (da 0 a " + (size_mazzo_mano-1) + ")");
		        	     indice_carta_da_giocare = sc.nextInt();
		        	   } while((indice_carta_da_giocare<0) || (indice_carta_da_giocare >= size_mazzo_mano) );
		        	   
		        	   do {
			        	     System.out.println("inserire l'indice dell'angolo delle precedente carta : 1)Angolo Nord-Ovest;2)Sud-Ovest;3)Nord-Est;4)Sud-Est");
			        	     indice_angolo_da_giocare = sc.nextInt();
			        	} while((indice_angolo_da_giocare<1) || (indice_angolo_da_giocare > 4) );
		        	   
		        	   ///
		        	   do {
			        	     System.out.println("inserire l'indice della carta su cui giocare a tavolo (da 0 a " + (size_mazzo_giocato-1) + ")");
			        	     indice_carta_giocata = sc.nextInt();
			        	   } while((indice_carta_giocata<0) || (indice_carta_giocata >= size_mazzo_giocato) );
			        	   
			         
			           indice_angolo_carta_giocata = angoloComplementare(indice_angolo_da_giocare);
			           System.out.println("Angolo carta destinazione = " + indice_angolo_carta_giocata);
	        	   
	        	   } while(!GiocataRegolare(giocatori.get(giocatore_di_turno).getMazzoMano(indice_carta_da_giocare),
	        			                    giocatori.get(giocatore_di_turno).getMazzoGiocato(indice_carta_giocata),
	        			                    indice_angolo_da_giocare,indice_angolo_carta_giocata,giocatori.get(giocatore_di_turno).gettabSimboli())); //check connessione angoli, check indici angoli src/dest, //se si tratta di carta oro verifica il costo
	        	   
	        	   //Trasferisci carta in coda al mazzo giocato
	        	   giocatori.get(giocatore_di_turno).GiocaCartaInMano(indice_carta_da_giocare,indice_carta_giocata,indice_angolo_da_giocare,indice_angolo_carta_giocata);
	        	   break;
	           case 5:
	        	   MostraCarteSulTavolo();
	        	   break;	        	   
	           case 6:
	        	   //Carta C;
	        		   System.out.println("Seleziona : 1 per prelevare carta risorsa, altro per carta oro");
	        		   input2 = sc.nextInt();
	        	   do {
	        		   System.out.println("Seleziona la posizione della carta 0,1,2 ");
	        		   input3 = sc.nextInt();
	        	   } while ((input3<0) && (input3>2));
	        	 
	        	   if (input2 == 1) {
	        		   giocatori.get(giocatore_di_turno).setMazzoMano(CarteRisorsa.remove(input3));
	        	   	   
	        	   } else {
	        		   giocatori.get(giocatore_di_turno).setMazzoMano(CarteOro.remove(input3));
	        	       
	        	   }    
	        	   break;
	           case 7:
	        	   break;
	           default:
	           }
		    } while(((input>0) && (input<7)) );
		   
		   turno++;
		   giocatore_di_turno = turno%Nplayer;
		   		   
		}
		
		if (input != 8) {
			System.out.println("ORA AGGIUGERE PUNTI OBBIETTIVO AI MAZZI GIOCATI E DECRETARE IL VINCITORE !!!");
			for(int i=0;i<Nplayer;i++) {
				giocatori.get(i).CalcoloObiettivo();
			}
				
			MostraPunteggio();	
		} 
			else {
			System.out.println("Partita terminata");
		}

		
	}
}
