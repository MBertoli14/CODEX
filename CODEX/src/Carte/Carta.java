package Carte;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Carta {
	protected Simbolo simbolo;
	public Angolo angoli[]; //per accesso classe derivata o usare metodo ?
	protected Simbolo simboli_fronte[];
	int nSimboli_esposti[];
	protected boolean fronte;
	int xRel;
	int yRel;
	String filefronte; //GR
	BufferedImage immagineFronte; //GR
    String fileretro; //
    BufferedImage immagineRetro; //	
	
    //Da richiamare solo dopo ogni aggiornamento nei simboli degli angoli
	
	
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
	
	public Simbolo getSimbolo() {
		return simbolo;
	}
	
	public int getPunti() {
		return 0;
	}

	
	public int requisiti(int costo) {
		return 0;
	}


	public boolean isFronte() {
		return fronte;
	}
	
	
	public Angolo getAngolo(int angolo) {
		return angoli[angolo];
	}
	
	public int[] getSimboliVisibili() {
		return nSimboli_esposti;
	}

	public void setXrel(int x) {
		xRel=x; 		
	}
	
	public void setYrel(int y) {
		yRel=y;		
	}
	
	public int getXrel() {
		return xRel; 		
	}
	
	public int getYrel() {
		return yRel;		
	}	
		
	public String toStringSimbolo() {
		return "Carta di simbolo "+this.simbolo+"||";
	}
	
	public void setImage(BufferedImage img) {
		if (this.isFronte())
		  this.immagineFronte=img;
		else
		  this.immagineRetro=img;
	}
	public BufferedImage getImage() {
		if (this.isFronte())
			  return this.immagineFronte;
			else
			  return this.immagineRetro;			
	}
	
	public String getImageFile() {
		if (this.isFronte())
			  return this.filefronte;
			else
			  return this.fileretro;			
	}	
}