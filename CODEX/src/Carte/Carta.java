package Carte;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Carta {
	protected Simbolo simbolo;
	public Angolo angoli[]; //per accesso classe derivata o usare metodo ?
	protected Simbolo simboli_fronte[];
	protected int nSimboli_esposti[];
	protected boolean fronte;
	private int xRel;
	private int yRel;
	private String filefronte; //GR
	private BufferedImage immagineFronte; //GR
    private String fileretro; //
    private BufferedImage immagineRetro; //	
	
    //Da richiamare solo dopo ogni aggiornamento nei simboli degli angoli
	
	/**
	 * Costruttore della carta standard nota bene questo costruttore viene usato fisicamente solo dalle sottoclassi della carta 
	 * @param simbolo Simbolo principale della carta puo essere Animale,Fungo,Insetto,Pianta,Piuma,Boccetta,Pergamena
	 * @param Sang1_NordOvest angolo 1 appartenete alla carta
	 * @param Sang2_SudOvest angolo 2 appartenete alla carta
	 * @param Sang3_NordEst angolo 3 appartenete alla carta
	 * @param Sang4_SudEst angolo 4 appartenete alla carta
	 * @param filefronte percorso del file .jpg del fronte della carta 
	 * @param fileretro  percorso del file .jpg del retro della carta 
	 */
	public Carta(Simbolo simbolo,Simbolo Sang1_NordOvest, Simbolo Sang2_SudOvest, Simbolo Sang3_NordEst, Simbolo Sang4_SudEst,String filefronte, String fileretro) {
		this.simbolo=simbolo;
		this.angoli=new Angolo[4];
		this.simboli_fronte=new Simbolo[4];
		this.angoli[0]= new Angolo(Sang1_NordOvest);
		this.angoli[1]= new Angolo(Sang2_SudOvest);
		this.angoli[2]= new Angolo(Sang3_NordEst);
		this.angoli[3]= new Angolo(Sang4_SudEst);
		this.simboli_fronte[0]=Sang1_NordOvest;
		this.simboli_fronte[1]=Sang2_SudOvest;
		this.simboli_fronte[2]=Sang3_NordEst;
		this.simboli_fronte[3]=Sang4_SudEst;
		nSimboli_esposti = new int[7];
		this.filefronte = filefronte;
		this.fileretro = fileretro;
		this.fronte = true;
		AggiornaSimboliEsposti();
		xRel=0; 
		yRel=0;
		
	    try { 
	    	  immagineFronte = ImageIO.read(new File(filefronte));
	    } catch (Exception e) {
		      	  System.out.println("Errore durante il caricamento dell immagine." + e);
		}
	    try { 
		      immagineRetro = ImageIO.read(new File(fileretro));
		    } catch (Exception e) {
			      System.out.println("Errore durante il caricamento dell immagine." + e);
		}	    
	}
	/**
	 * permette di aggiornare i simboli della carta impostando quelli frontali
	 */
	protected void setFronte(){
		
		for(int i = 0; i<4; i++) {
			   angoli[i].simbolo = simboli_fronte[i];	    
		}
		AggiornaSimboliEsposti();
	}
	/**
	 * permette di aggiornare i simboli della carta impostando quelli del retro
	 */
	protected void setRetro(){
		for(int i = 0; i<4; i++) {
		   angoli[i].simbolo = Simbolo.VUOTO;	    
		}
		AggiornaSimboliEsposti();
	}
	/**
	 * permette di girare la carta 
	 */
	public void flip() {
		if (fronte == false){
			fronte=true;
			setFronte();
		} else {
			fronte=false;
			setRetro();
		}
	}
	/**
	 * aggiorna i simboli presenti sul fronte della carta 
	 */
	protected void AggiornaSimboliEsposti() {
		for(int i=0;i<7;i++)
			nSimboli_esposti[i]=0;
			
		
		if (fronte) {
		    
				for (Simbolo s : Simbolo.values()) {
					   if (s==Simbolo.VUOTO)
						   break;
					   
					   for(int i = 0; i<4; i++) {
						   if(angoli[i].simbolo == s)
							   nSimboli_esposti[s.ordinal()]++;	   
					   }
					}
		} else {
			    int idx = simbolo.ordinal();
			    if (idx<7)
			    	nSimboli_esposti[idx]++;
		}
	}	
	/**
	 * restituisce il simbolo principale della carta
	 * @return
	 */
	public Simbolo getSimbolo() {
		return simbolo;
	}
	/**
	 * funzione necessaria per generalizzazione per la classe Carta restituisce 0
	 * @return
	 */
	public int getPunti() {
		return 0;
	}

/**
 * 	funzione necessaria per generalizzazione per la classe Carta restituisce 0
 * @param costo
 * @return
 */
	public int requisiti(int costo) {
		return 0;
	}

/**
 * restituisce il campo fronte che true se la carta ha il fronte scoperto in caso contrario false
 * @return
 */
	public boolean isFronte() {
		return fronte;
	}
	
	/**
	 * resitutisce un angolo sepcifico della carta 
	 * @param angolo indice angolo richiesto che varia da 0-3
	 * @return
	 */
	public Angolo getAngolo(int angolo) {
		return angoli[angolo];
	}
	/**
	 * restituisce l'array simboli esposti interno della carta 
	 * @return
	 */
	public int[] getSimboliVisibili() {
		return nSimboli_esposti;
	}
	/**
	 * permette d impostare l'ascissa relativa della carta 
	 * @param x coordinata da inserire 
	 */
	public void setXrel(int x) {
		xRel=x; 		
	}
	/**
	 * permette d impostare l'ordinata relativa della carta 
	 * @param y coordinata da inserire 
	 */
	public void setYrel(int y) {
		yRel=y;		
	}
	/**
	 * restituisce l'ascissa della carta 
	 * @return
	 */
	public int getXrel() {
		return xRel; 		
	}
	/**
	 * restituisce l'ordinata della carta 
	 * @return
	 */
	public int getYrel() {
		return yRel;		
	}	
	/**
	 * Restituisce la stringa che descrive la carta restituendo solo il simbolo principale della carta 	
	 * @return
	 */
	public String toStringSimbolo() {
		return "Carta di simbolo "+this.simbolo+"||";
	}
	/**
	 * permette di impostare il buffer del immagine fronte o retro a seconda dello stato attuale della carta della carta
	 * @param img duffer da inseire 
	 */
	public void setImage(BufferedImage img) {
		if (this.isFronte())
		  this.immagineFronte=img;
		else
		  this.immagineRetro=img;
	}
	/**
	 * restituisce il buffer del immagine  fronte o retro a seconda dello stato attuale della carta della carta
	 * @return
	 */
	public BufferedImage getImage() {
		if (this.isFronte())
			  return this.immagineFronte;
			else
			  return this.immagineRetro;			
	}
	/**
	 * restituisce il la stringa che indica il percorso della immagine carta fronte o retro a seconda dello stato attuale della carta della carta
	 * @return
	 */
	public String getImageFile() {
		if (this.isFronte())
			  return this.filefronte;
			else
			  return this.fileretro;			
	}	
}