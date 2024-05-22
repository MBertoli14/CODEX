package ElementiDiBase;

import Carte.*;

import java.util.Scanner;
import java. util.ArrayList;
import java.util.Random;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java. util.ArrayList;
import java.util.Random;
import java.util.*;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Codex {

	//Cards to initialize	

	private ArrayList<CartaRisorsa> carteRisorsa = new ArrayList<CartaRisorsa>();
	private ArrayList<Carta_Oro> carteOro = new ArrayList<Carta_Oro>();
	private ArrayList<CartaObbiettivo> carteObbiettivo = new ArrayList<CartaObbiettivo>();
	private ArrayList<CartaStarter> carteStarter = new ArrayList<CartaStarter>();
	private ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
	private int nPlayer;
	private String cart = "src/ElementiDiBase/immagini/";

	/**
	 * Inizializza le carte del gioco
	 */
	private void InitCards()
	{
		////////////////INIZIALIZZAZIONE CARTE RISORSA//////////////////////////////////////////////////////////////////////////////
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.BOCCETTA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_1.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_2.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.INSETTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_3.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_4.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_5.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.INSETTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_6.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.PIUMA,Simbolo.INSETTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_7.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.FUNGO,0,cart+"CarteRisorsa/carta_risorsa_fronte_8.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_9.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.INSETTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_10.jpg",cart+"CarteRisorsa/carta_risorsa_retro_insetti_41.jpg"));

		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,1,cart+"CarteRisorsa/carta_risorsa_fronte_11.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,1,cart+"CarteRisorsa/carta_risorsa_fronte_12.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.INSETTO,Simbolo.ANIMALE,0,cart+"CarteRisorsa/carta_risorsa_fronte_13.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.PERGAMENA,0,cart+"CarteRisorsa/carta_risorsa_fronte_14.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.PIUMA,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.FUNGO,0,cart+"CarteRisorsa/carta_risorsa_fronte_15.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_16.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_17.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.ANIMALE,0,cart+"CarteRisorsa/carta_risorsa_fronte_18.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_19.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,Simbolo.ANIMALE,0,cart+"CarteRisorsa/carta_risorsa_fronte_20.jpg",cart+"CarteRisorsa/carta_risorsa_retro_animali_42.jpg"));
		
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PERGAMENA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.ANIMALE,0,cart+"CarteRisorsa/carta_risorsa_fronte_21.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,cart+"CarteRisorsa/carta_risorsa_fronte_22.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,1,cart+"CarteRisorsa/carta_risorsa_fronte_23.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_24.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIANTA,0,cart+"CarteRisorsa/carta_risorsa_fronte_25.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIANTA,Simbolo.PIANTA,0,cart+"CarteRisorsa/carta_risorsa_fronte_26.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.INSETTO,Simbolo.PIANTA,0,cart+"CarteRisorsa/carta_risorsa_fronte_27.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.BOCCETTA,0,cart+"CarteRisorsa/carta_risorsa_fronte_28.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.VUOTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_29.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_30.jpg",cart+"CarteRisorsa/carta_risorsa_retro_piante_43.jpg"));
		
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_31.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,1,cart+"CarteRisorsa/carta_risorsa_fronte_32.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.PIANTA,Simbolo.PIUMA,Simbolo.FUNGO,0,cart+"CarteRisorsa/carta_risorsa_fronte_33.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.ANIMALE,0,cart+"CarteRisorsa/carta_risorsa_fronte_34.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.PERGAMENA,Simbolo.INSETTO,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_35.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,1,cart+"CarteRisorsa/carta_risorsa_fronte_36.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,0,cart+"CarteRisorsa/carta_risorsa_fronte_37.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,Simbolo.VUOTO,0,cart+"CarteRisorsa/carta_risorsa_fronte_38.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.FUNGO,0,cart+"CarteRisorsa/carta_risorsa_fronte_39.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		carteRisorsa.add(new CartaRisorsa(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.FUNGO,Simbolo.FUNGO,0,cart+"CarteRisorsa/carta_risorsa_fronte_40.jpg",cart+"CarteRisorsa/carta_risorsa_retro_funghi_44.jpg"));
		
		///////////////INIZIALIZZAZIONE CARTE ORO//////////////////////////////////////////////////////////////////////////////
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{0,0,1,3},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_45.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{1,0,0,2},Moltiplicatore.BOCCETTA,cart+"carteOro/carta_oro_fronte_46.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.VUOTO,1,new int[]{0,1,0,2},Moltiplicatore.PERGAMENA,cart+"carteOro/carta_oro_fronte_47.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.PIUMA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{0,0,1,2},Moltiplicatore.PIUMA,cart+"carteOro/carta_oro_fronte_48.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_49.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_50.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,1,0,3},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_51.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{1,0,0,3},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_52.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,5,new int[]{0,0,0,5},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_53.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.PIANTA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.VUOTO,3,new int[]{0,0,0,3},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_54.jpg",cart+"carteOro/carta_oro_retro_piante_87.jpg"));

		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.VUOTO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_55.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,5,new int[]{0,5,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_56.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{0,3,0,1},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_57.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,3,1,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_58.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_59.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,3,new int[]{0,3,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_60.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.PIUMA,1,new int[]{1,2,0,0},Moltiplicatore.PIUMA,cart+"carteOro/carta_oro_fronte_61.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.VUOTO,1,new int[]{0,2,0,1},Moltiplicatore.BOCCETTA,cart+"carteOro/carta_oro_fronte_62.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.PERGAMENA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{0,2,1,0},Moltiplicatore.PERGAMENA,cart+"carteOro/carta_oro_fronte_63.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.FUNGO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{1,3,0,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_64.jpg",cart+"carteOro/carta_oro_retro_funghi_88.jpg"));
		
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{3,0,1,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_65.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{2,1,0,0},Moltiplicatore.PIUMA,cart+"carteOro/carta_oro_fronte_66.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.PERGAMENA,1,new int[]{2,1,0,0},Moltiplicatore.PERGAMENA,cart+"carteOro/carta_oro_fronte_67.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.BOCCETTA,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,1,new int[]{2,0,1,0},Moltiplicatore.BOCCETTA,cart+"carteOro/carta_oro_fronte_68.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.BOCCETTA,Simbolo.NO_ANGOLO,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_69.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_70.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{3,0,0,1},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_71.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{3,1,0,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_72.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,5,new int[]{5,0,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_73.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.ANIMALE,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.PIUMA,3,new int[]{3,0,0,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_74.jpg",cart+"carteOro/carta_oro_retro_animali_85.jpg"));		
	
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,1,new int[]{1,0,2,0},Moltiplicatore.PERGAMENA,cart+"carteOro/carta_oro_fronte_75.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.VUOTO,1,new int[]{0,0,2,1},Moltiplicatore.PIUMA,cart+"carteOro/carta_oro_fronte_76.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,2,new int[]{0,1,3,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_77.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,2,new int[]{0,0,3,1},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_78.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,2,new int[]{1,0,3,0},Moltiplicatore.ANGOLO,cart+"carteOro/carta_oro_fronte_79.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.BOCCETTA,1,new int[]{1,0,2,0},Moltiplicatore.BOCCETTA,cart+"carteOro/carta_oro_fronte_80.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,5,new int[]{0,0,5,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_81.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.NO_ANGOLO,Simbolo.PIUMA,Simbolo.NO_ANGOLO,Simbolo.VUOTO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_82.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.PERGAMENA,Simbolo.NO_ANGOLO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_83.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
		carteOro.add(new Carta_Oro(Simbolo.INSETTO,Simbolo.BOCCETTA,Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.NO_ANGOLO,3,new int[]{0,0,3,0},Moltiplicatore.NESSUNO,cart+"carteOro/carta_oro_fronte_84.jpg",cart+"carteOro/carta_oro_retro_insetti_86.jpg"));
	
	
	
		///////////////INIZIALIZZAZIONE CARTE STARTER//////////////////////////////////////////////////////////////////////////////
		Simbolo s1_ang_fronte[] = new Simbolo[]{Simbolo.FUNGO,Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.ANIMALE};
		Simbolo s1_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.VUOTO};
		carteStarter.add(new CartaStarter(Simbolo.INSETTO, Simbolo.VUOTO, Simbolo.VUOTO, s1_ang_fronte,s1_ang_retro,cart+"CarteStarter/carta_starter_fronte_89.jpg",cart+"CarteStarter/carta_starter_retro_95.jpg"));
		Simbolo s2_ang_fronte[] = new Simbolo[]{Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.ANIMALE,Simbolo.INSETTO};
		Simbolo s2_ang_retro[] = new Simbolo[]{Simbolo.ANIMALE,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.FUNGO};
		carteStarter.add(new CartaStarter(Simbolo.FUNGO, Simbolo.VUOTO, Simbolo.VUOTO, s2_ang_fronte,s2_ang_retro,cart+"CarteStarter/carta_starter_fronte_90.jpg",cart+"CarteStarter/carta_starter_retro_96.jpg"));
		Simbolo s3_ang_fronte[] = new Simbolo[]{Simbolo.PIANTA,Simbolo.ANIMALE,Simbolo.INSETTO,Simbolo.FUNGO};
		Simbolo s3_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO};
		carteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.INSETTO, Simbolo.VUOTO, s3_ang_fronte,s3_ang_retro,cart+"CarteStarter/carta_starter_fronte_91.jpg",cart+"CarteStarter/carta_starter_retro_97.jpg"));
		Simbolo s4_ang_fronte[] = new Simbolo[]{Simbolo.INSETTO,Simbolo.FUNGO,Simbolo.ANIMALE,Simbolo.PIANTA};
		Simbolo s4_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO,Simbolo.VUOTO};
		carteStarter.add(new CartaStarter(Simbolo.FUNGO, Simbolo.PIANTA, Simbolo.VUOTO, s4_ang_fronte,s4_ang_retro,cart+"CarteStarter/carta_starter_fronte_92.jpg",cart+"CarteStarter/carta_starter_retro_98.jpg"));
		Simbolo s5_ang_fronte[] = new Simbolo[]{Simbolo.INSETTO,Simbolo.PIANTA,Simbolo.FUNGO,Simbolo.ANIMALE};
		Simbolo s5_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO};
		carteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.INSETTO, Simbolo.PIANTA, s5_ang_fronte,s5_ang_retro,cart+"CarteStarter/carta_starter_fronte_93.jpg",cart+"CarteStarter/carta_starter_retro_99.jpg"));
		Simbolo s6_ang_fronte[] = new Simbolo[]{Simbolo.FUNGO,Simbolo.PIANTA,Simbolo.ANIMALE,Simbolo.INSETTO};
		Simbolo s6_ang_retro[] = new Simbolo[]{Simbolo.VUOTO,Simbolo.NO_ANGOLO,Simbolo.VUOTO,Simbolo.NO_ANGOLO};
		carteStarter.add(new CartaStarter(Simbolo.ANIMALE, Simbolo.FUNGO, Simbolo.PIANTA, s6_ang_fronte,s6_ang_retro,cart+"CarteStarter/carta_starter_fronte_94.jpg",cart+"CarteStarter/carta_starter_retro_100.jpg"));		

		
		
		///////////////INIZIALIZZAZIONE CARTE OBBIETTIVO//////////////////////////////////////////////////////////////////////////////
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.INSETTO,Obbiettivo.SCALA_DISCENDENTE ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.ANIMALE,Obbiettivo.SCALA_ASCENDENTE ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.FUNGO,Obbiettivo.TRIO ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PIANTA,Obbiettivo.TRIO ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.INSETTO,Obbiettivo.TRIO ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.ANIMALE,Obbiettivo.TRIO,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.FUNGO,Obbiettivo.SCALA_ASCENDENTE ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PIANTA,Obbiettivo.SCALA_DISCENDENTE ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.INSETTO,Obbiettivo.SETTE ,3));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.ANIMALE,Obbiettivo.SETTE_ROVESCIO ,3));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.FUNGO,Obbiettivo.L ,3));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PIANTA,Obbiettivo.L_ROVESCIO ,3));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PIUMA,Obbiettivo.TRIO_UNICO ,3));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.BOCCETTA,Obbiettivo.COPPIA ,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PERGAMENA,Obbiettivo.COPPIA,2));
		carteObbiettivo.add(new CartaObbiettivo(Simbolo.PIUMA,Obbiettivo.COPPIA ,2));
	
					
	}
	/**
	 * gestisce l'input di interi dei giocatori non permettendo input di campi non int 
	 * @return
	 */
	public  int InputIntVerificato() {
		Scanner sc=new Scanner(System.in);
		int valoreVerificato=0;
			try {
					valoreVerificato=sc.nextInt();		
				}catch (InputMismatchException e) {
					System.out.println("il valore inserito e' invalido ");
					return -1;
				}
		return valoreVerificato;
		}
	/**
	 * mostra le carte disponibili da prendere sul tavolo 
	 */
	public void MostraCarteSulTavolo() 
	{
		int dim_cr, dim_co;
		dim_cr = Math.min(2,carteRisorsa.size());
		dim_co = Math.min(2,carteOro.size());
		
		System.out.println("///////////////NUOVE CARTE DISPONIBILI (TAVOLO)///////////////////////");
		System.out.println("CARTE RISORSA");
		for (int i = 0;i < dim_cr; i++)
		{	
			if (i<2)
				System.out.println(i+">>>"+carteRisorsa.get(i).toString());
			else
				System.out.println("2>>>"+carteRisorsa.get(2).toStringSimbolo());	
		}
		
		
		System.out.println("CARTE ORO");
		for (int i = 0;i < dim_co; i++)
		{	
			if (i<2)
				System.out.println(i+">>>"+carteOro.get(i).toString());
			else
				System.out.println("2>>>"+carteOro.get(2).toStringSimbolo());
		}
		
		System.out.println("CARTE OBBIETTIVO (OBBIETTIVI COMUNI)");
		for (int i = 0;i < 2; i++)
		{	
			System.out.println(i+">>>"+carteObbiettivo.get(i).toString());
		}		
		System.out.println("//////////////////////////////////////////////////////////////////////");
	}
	/**
	 * Mostra il puntiggio di tutti i giocatori
	 */
	public void MostraPunteggio() 
	{	
	   System.out.print("PUNTEGGIO : ");	
	   for(int i=0;i<nPlayer;i++) {		  
		  System.out.print(giocatori.get(i).getNome() + " " + giocatori.get(i).getPunti() + "|");
		}
	   System.out.println(" ");
	}
	
	/**
	 * Gestisce il posizinamento delle carte regolando:l'angolo a cui va conessa la carta a seconda del angolo
	 * scelto dal giocatore,e se la carta è oro controlla che il giocatore abbia i requisiti di simboli per 
	 * piazzarla. Il metodo viene implementato nella classe Codex
	 * @param Cmano carta da piazzare 
	 * @param Cgiocata carta sul tavolo 
	 * @param angolo_in_mano angolo della carta da giocare 
	 * @param angolo_a_tavolo angolo della carta sul tavolo
	 * @param simbolBoard 	scoreboard dei simboli del giocatore 
	 * @return
	 */
	public boolean GiocataRegolare(Carta Cmano, Carta Cgiocata,int angolo_in_mano,int angolo_a_tavolo,int simbolBoard[])
	{
		boolean risultato = true;
				
		//Primo test di compatibilita' angoli
		switch (angolo_in_mano) {
		case 1:
		    if (angolo_a_tavolo != 4) {
		    	risultato = false;
		    	System.out.println("L'angolo 1 dev'essere connesso al 4 di una carta a terra");
		    } else if (Cgiocata.getAngolo(3).getSimbolo() == Simbolo.NO_ANGOLO)
		    	System.out.println("L'angolo della carta a terra non puo' essere NO_ANGOLO ");
			break;
		case 2:
		    if (angolo_a_tavolo != 3) {
				risultato = false;
				System.out.println("L'angolo 2 dev'essere connesso al 3 di una carta a terra");
		    } else if (Cgiocata.getAngolo(2).getSimbolo() == Simbolo.NO_ANGOLO)
		    	System.out.println("L'angolo della carta a terra non puo' essere NO_ANGOLO ");
			break;
		case 3:
		    if (angolo_a_tavolo != 2) {
				risultato = false;
				System.out.println("L'angolo 3 dev'essere connesso al 2 di una carta a terra");
		    } else if (Cgiocata.getAngolo(1).getSimbolo() == Simbolo.NO_ANGOLO)
		    	System.out.println("L'angolo della carta a terra non puo' essere NO_ANGOLO ");
			break;
		case 4:
		    if (angolo_a_tavolo != 1) {
				risultato = false;
				System.out.println("L'angolo 4 dev'essere connesso al 1 di una carta a terra");
		    } else if (Cgiocata.getAngolo(0).getSimbolo() == Simbolo.NO_ANGOLO)
		    	System.out.println("L'angolo della carta a terra non puo' essere NO_ANGOLO ");	
			break;
		default:
			
		}
		
		if ((risultato == true) && (Cgiocata.getAngolo(angolo_a_tavolo - 1).getSimbolo() == Simbolo.NO_ANGOLO)) {
			risultato = false;
		}
		
		//Se nessun fallimento e' avvenuto sopra verifica se l'angolo della carta a tavolo e' gia' connesso
		if ((risultato == true) && (Cgiocata.getAngolo(angolo_a_tavolo - 1).getConnessione() != false)) {
			risultato = false;
			System.out.println("L'angolo " + Integer.toString(angolo_a_tavolo) +  "della carta a tavolo scelta e' gia connesso");
		}
	    if ((risultato == true) && (Cmano.getClass().getName().contains("Oro")) && Cmano.isFronte()) {
    		risultato = (Cmano.requisiti(0) <= simbolBoard[0] && (Cmano.requisiti(1) <= simbolBoard[1] && (Cmano.requisiti(2) <= simbolBoard[2] && (Cmano.requisiti(3) <= simbolBoard[3]))));
    		if (!risultato)
    			System.out.println("Risorse non sufficienti per abilitare la giocabilita' della carta oro");	   
   
	    }
			
	     return risultato;

	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * permette di definire un frame grafico specifico per il codex con l'immagine  del tavolo
	 e delle carte a ogni giocata*/
	    class MyPanel extends JPanel {
		    int x,y;
		    ArrayList<Carta> M;
		    public void setMazzo(ArrayList<Carta> Maz) {
		    	this.M=Maz;
		    }
		   
           @Override
           protected void paintComponent(Graphics g) {
               super.paintComponent(g);
               
               
   		    JTextArea labelW = new JTextArea("",0,900);
   		    labelW.setOpaque(false);
   		    labelW.setVisible(true);
   		    this.add(labelW);
   		    
   		    JTextArea labelH = new JTextArea("",900,1);
   		    labelH.setOpaque(false);
   		    labelH.setVisible(true);
   		    this.add(labelH);	        
               
               for (int i=0; i<M.size();i++) {
	                x = 450 + (M.get(i).getXrel()) * ((int)(160 * 0.76)) ;        
	                y = 450 - ((M.get(i).getYrel()) * ((int)(120 * 0.58))) ;
	                g.drawImage(M.get(i).getImage(),x,y,160,120,null);
	                g.drawString(Integer.toString(i), x+77, y);  //.drawString
               }
           }			        
	   };	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
 * Inizializza una partita di codex
 */
	   public void Play() {
	
	//Inizializza i mazzi di carte
	InitCards();
	
	JFrame frame = buildFrame();//GR
	MyPanel panel = new MyPanel();
    panel.setBackground(Color.gray); 
    JScrollPane scroller = new JScrollPane(panel); //NEW
    scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//NEW
    scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//NEW
    scroller.setSize(900, 900);
    scroller.setAutoscrolls(true);
    frame.add(scroller);	
	frame.setVisible(false);
	
	//Mischia i quattro mazzi di carte
	
	Collections.shuffle(carteRisorsa, new Random(System.currentTimeMillis()));
	Collections.shuffle(carteOro, new Random(System.currentTimeMillis()));
	Collections.shuffle(carteStarter, new Random(System.currentTimeMillis()));
	Collections.shuffle(carteObbiettivo, new Random(System.currentTimeMillis()));
	
	
	
	Scanner sc=new Scanner(System.in);
	String playerName;
		do {
			System.out.println("inserisci il numero di giocatori (da 2 a 4)"+"\n");
		
			nPlayer= InputIntVerificato();
			if(nPlayer<2 || nPlayer>4||nPlayer==-1) {
			System.out.println("Hai inserito un numero di giocatori diverso da quello consentito"+"\n");
			}
		}while(nPlayer<2 || nPlayer>4||nPlayer==-1);
		for(int i=0;i<nPlayer;i++) {
		System.out.println("inserisci il Nome del "+(i+1)+" giocatore "+"\n");	
		playerName=sc.next();
		giocatori.add(new Giocatore(playerName));
		}
				
		//Inizializza carte in mano ai giocatori
		int input = 0;
		for(int i=0;i<nPlayer;i++) {
		  System.out.println("Giocatore :" + giocatori.get(i).getNome());	
			
		  //Ogni giocatore riceve una carta starter casuale (i mazzi sono gi  stati mischiati)
		  giocatori.get(i).setMazzoMano(carteStarter.remove(0));
		  do {
			  System.out.println("Decidi con quale lato della carta starter iniziare il tuo tavolo (0=Flip,1=Conferma)");
			  System.out.println("CARTA STARTER>>>"+giocatori.get(i).getMazzoMano(0).toString());
			  input = InputIntVerificato();
			  if (input == 0) 
				  giocatori.get(i).getMazzoMano(0).flip();
		  } while (input != 1);
		  //Gioca la carta sul tavolo dopo averne scelto il lato iniziale
		  giocatori.get(i).setMazzoGiocato(giocatori.get(i).removeMazzoMano(0));
   	   	  panel.setMazzo(giocatori.get(i).getMazzoGiocato());
   	      frame.setVisible(true);		  
		  
		  do {
			  System.out.println("Decidi quale carta per obbiettivo individuale scegliere (0,1)");
			  System.out.println("0>>>"+carteObbiettivo.get(2).toString());
			  System.out.println("1>>>"+carteObbiettivo.get(3).toString());
			  input = InputIntVerificato();
		  } while ((input != 0) && (input != 1));
		  giocatori.get(i).setObbiettivo(carteObbiettivo.remove(2+input));
		  carteObbiettivo.remove(3 - input);
		  
		  //Ogni giocatore riceve due carte risorsa e una carta oro dal mazzo
		  giocatori.get(i).setMazzoMano(carteRisorsa.remove(0));
		  giocatori.get(i).setMazzoMano(carteRisorsa.remove(0));
		  giocatori.get(i).setMazzoMano(carteOro.remove(0));

		}

		for(int i=0;i<nPlayer;i++) {
			  giocatori.get(i).setObbiettivo(carteObbiettivo.get(0));
			  giocatori.get(i).setObbiettivo(carteObbiettivo.get(1));  
		}		
		
		
		
		boolean punteggio20Raggiunto = false;
		int turno = 0;
		int giocatore_di_turno = 0;
		int input2;
		int input3;
		int TotCarteGiocabili = 3 * nPlayer;
		
		while ( (!(punteggio20Raggiunto && (giocatore_di_turno==0))) && (TotCarteGiocabili > 0) &&(input != 9)  ){
     	   int size_mazzo_mano = giocatori.get(giocatore_di_turno).getSizeMazzoMano();
     	   int size_mazzo_giocato = giocatori.get(giocatore_di_turno).getSizeMazzoGiocato();
     	   boolean prelievo_sbloccato = false;//prima di prelevare una nuova carta bisogna giocare una carta
     	   boolean tiro_sbloccato = true;
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
			   System.out.println("7-Visualizza obbiettivi giocatore");//
			   System.out.println("8-Passa al prossimo giocatore");//
			   System.out.println("9-Termina partita");
			   System.out.println("***************************************************************************");
			   
			   input = InputIntVerificato();
	           switch (input) {
	           case 1:
	        	   System.out.println("*****N carte IN MANO = " + giocatori.get(giocatore_di_turno).getSizeMazzoMano()+"*****");
	        	   giocatori.get(giocatore_di_turno).printMazzoMano();
	        	   break;
	           case 2:
	        	   if (size_mazzo_mano >0) {
		        	   do {
		        		   System.out.println("Seleziona la posizione della carta in mano da girare (0.."+(giocatori.get(giocatore_di_turno).getSizeMazzoMano()-1)+")");
		        		   input2 = InputIntVerificato();
		               } while((input2<0) || (input2>=giocatori.get(giocatore_di_turno).getSizeMazzoMano())||input2==-1);
		        		   giocatori.get(giocatore_di_turno).getMazzoMano(input2).flip();
	        	   } else
	        		   System.out.println("Nessuna carta in mano");
	        	   break;
	           case 3:
	        	   System.out.println("*****N carte GIOCATE = " + giocatori.get(giocatore_di_turno).getSizeMazzoGiocato()+"*****");
	        	   giocatori.get(giocatore_di_turno).printMazzoGiocato();
	        	   giocatori.get(giocatore_di_turno).printScoreboardSimboli();
	        	   
	        	   panel.setMazzo(giocatori.get(giocatore_di_turno).getMazzoGiocato());
	        	   frame.setVisible(true);
	        	   break;
	           case 4:
	        	   if (tiro_sbloccato == true) {
		        	   int indice_carta_da_giocare,indice_angolo_da_giocare, indice_carta_giocata, indice_angolo_carta_giocata; 	   
		        	   if ((size_mazzo_mano > 0) && (giocatori.get(giocatore_di_turno).bloccoCarteOro() == false)) {
		        	   do {
			        	   do {
			        	     System.out.println("inserire l'indice della carta in mano da giocare (da 0 a " + (size_mazzo_mano-1) + ")");
			        	     indice_carta_da_giocare = InputIntVerificato();
			        	   } while((indice_carta_da_giocare<0) || (indice_carta_da_giocare >= size_mazzo_mano) );
			        	   
			        	   do {
				        	     System.out.println("inserire l'indice dell'angolo delle precedente carta : 1)Angolo Nord-Ovest;2)Sud-Ovest;3)Nord-Est;4)Sud-Est");
				        	     indice_angolo_da_giocare = InputIntVerificato();
				        	} while((indice_angolo_da_giocare<1) || (indice_angolo_da_giocare > 4) );
			        	   
			        	   ///
			        	   do {
				        	     System.out.println("inserire l'indice della carta su cui giocare a tavolo (da 0 a " + (size_mazzo_giocato-1) + ")");
				        	     indice_carta_giocata = InputIntVerificato();
				        	   } while((indice_carta_giocata<0) || (indice_carta_giocata >= size_mazzo_giocato) );
				        	   
			        	   Angolo g=new Angolo(Simbolo.VUOTO);
			        	   indice_angolo_carta_giocata = g.angoloComplementare(indice_angolo_da_giocare);
				           System.out.println("Angolo carta destinazione = " + indice_angolo_carta_giocata);
		        	   
		        	   } while(!GiocataRegolare(giocatori.get(giocatore_di_turno).getMazzoMano(indice_carta_da_giocare),
		        			                    giocatori.get(giocatore_di_turno).getMazzoGiocato(indice_carta_giocata),
		        			                    indice_angolo_da_giocare,indice_angolo_carta_giocata,giocatori.get(giocatore_di_turno).gettabSimboli())); //check connessione angoli, check indici angoli src/dest, //se si tratta di carta oro verifica il costo
		        	   
		        	   giocatori.get(giocatore_di_turno).GiocaCartaInMano(indice_carta_da_giocare,indice_carta_giocata,indice_angolo_da_giocare,indice_angolo_carta_giocata);
		        	   panel.setMazzo(giocatori.get(giocatore_di_turno).getMazzoGiocato());
		        	   frame.setVisible(true);
		        	   prelievo_sbloccato = true;
		        	   tiro_sbloccato = false;
		        	   } else {
		        		   System.out.println("O il mazzo in mano e' vuoto oppure e' composto da sole carte oro lato fronte vincolate da mancanza di risorse");
		        		   System.out.println("Verificare l'esistenza di carte nella mano (opzione 1) e giocare carte oro su faccia retro (tramite flip-opzione 2) se vincolate");
		        	   }
	        	   } else
	        		   System.out.println("Tiro gia' effettuato, per tirare di nuovo cedere il controllo al prossimo giocatore (opzione 8) e aspettare il prossimo turno");
	        	   break;
	           case 5:
	        	   MostraCarteSulTavolo();
	        	   break;	        	   
	           case 6:
	       		   int dim_cr = Math.min(2,carteRisorsa.size());
	       		   int dim_co = Math.min(2,carteOro.size());
	       		   int dim;
	       		   
	       		   if (prelievo_sbloccato == true) {
		        	   do {
		        		   System.out.println("Seleziona : 0 per prelevare carta risorsa, 1 per carta oro");
		        		   input2 = InputIntVerificato();
		        	   }while((input2<0) || (input2 > 1));
		        	   
		        	   dim = ((1 - input2)) * dim_cr + ((input2) * dim_co); //se input2 = 0 allora dim=dim_cr, se input2 = 1 allora dim=dim_co
		        	   
		        	   if (dim > 0) {
			        	   do {
			        		   System.out.println("Seleziona la posizione della carta 0.."+dim);
			        		   input3 = InputIntVerificato();
			        	   } while ((input3<0) || (input3>dim)|| (input3==-1));
			        	   	   
			        	   if (input2 == 0) {
			        		   giocatori.get(giocatore_di_turno).setMazzoMano(carteRisorsa.remove(input3));
			        	   	   
			        	   } else {
			        		   giocatori.get(giocatore_di_turno).setMazzoMano(carteOro.remove(input3));
			        	       
			        	   } 
		        	   } else 
		        		   System.out.println("Nessuna carta da prelevare sul tavolo");
		        	   
		        	   prelievo_sbloccato = false;
	       		   } else 
	       			   System.out.println("Se sei qui' il prelievo e' gia' stato effettuato oppure devi prima giocare la carta (opzione 4)");
	        	   break;
	           case 7:
	        	   System.out.println("*****OBBIETTIVI DEL GIOCATORE "+giocatori.get(giocatore_di_turno).getNome()+"*****");
	        	   giocatori.get(giocatore_di_turno).printObbiettivi();       	   
	        	   break;	        	   
	           case 8:
	        	   frame.setVisible(false);
	        	   //passa al prossimo giocatore superando il controllo al ciclo qui di seguito
	        	   if (tiro_sbloccato == true)
	        		   System.out.println("Per poter passare al concorrente successivo bisogna aver prima giocato la carta sul tavolo (opzione 4)");
	        	   if (prelievo_sbloccato == true)
	        		   System.out.println("Per poter passare al concorrente successivo bisogna aver prima prelevato una nuova carta (opzione 6)");	        	   
	        	   break;
	           default:
	           }
		    } while(((input>0) && (input<8) || input==-1) && ((tiro_sbloccato == true) || (prelievo_sbloccato == true)));
		   
		   turno++;
		   giocatore_di_turno = turno%nPlayer;
		   TotCarteGiocabili=0;
		   for (int i = 0; i < nPlayer; i++) {
				   TotCarteGiocabili+=(giocatori.get(i).getSizeMazzoMano()); //* (giocatori.get(i).bloccoCarteOro()? 0 : 1));
			       if (giocatori.get(i).getPunti() >= 20)
			    	   punteggio20Raggiunto = true;	   
		   } 		   
		  }
		
			System.out.println("ORA AGGIUGERE PUNTI OBBIETTIVO AI MAZZI GIOCATI E DECRETARE IL VINCITORE !!!");
			for(int i=0;i<nPlayer;i++) {
				  giocatori.get(i).CalcoloObbiettivo();
				}			
			
			int punteggioVincitore=giocatori.get(0).getPunti();
			int vincitore=0;
			int NobbiettiviVincitore=0;
			
			for(int i=0;i<nPlayer;i++) {
				 if(giocatori.get(i).getPunti()>punteggioVincitore) {
					 punteggioVincitore=giocatori.get(i).getPunti();
					 NobbiettiviVincitore=giocatori.get(i).getNumObbiettiviRaggiunti();
					 vincitore=i;
				 } else if((giocatori.get(i).getPunti() == punteggioVincitore)) {
					 if((giocatori.get(i).getNumObbiettiviRaggiunti() > NobbiettiviVincitore)) {
						 punteggioVincitore=giocatori.get(i).getPunti();
						 NobbiettiviVincitore=giocatori.get(i).getNumObbiettiviRaggiunti();
						 vincitore=i;					 
					 } else if ((giocatori.get(i).getNumObbiettiviRaggiunti() == NobbiettiviVincitore)){
					 }
				 }
			}
						
			
				System.out.println("Il vincitore "+giocatori.get(vincitore).getNome() +" con "+giocatori.get(vincitore).getPunti()+" punti! "+" obbiettivi raggiunti: "+giocatori.get(vincitore).getNumObbiettiviRaggiunti());
			System.out.println("/////////////////RIEPILOGO//////////////////");
			for(int i=0;i<nPlayer;i++) {
				System.out.println(giocatori.get(i).getNome()+" | Punti : "+giocatori.get(i).getPunti()+" | Obbiettivi raggiunti : "+giocatori.get(i).getNumObbiettiviRaggiunti());
			}
		
			
		
	}

	//GR
	   /**
	    * costruisce un frame per la rappresentazione del tavolo da gioco 
	    * @return
	    */
	private  JFrame buildFrame() {
	    JFrame frame = new JFrame("Codex");
	    frame.setSize(900, 900);
	    frame.setVisible(false);
	    return frame;
	}

}