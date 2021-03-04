package jeuxDeGrilles;

import joueurs.Joueur;
import joueurs.Symbole;

public abstract class JeuxDeGrilles implements Jeux {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private Symbole [][] Grille;
	private int [] DirX = {0,1,1,1};
	private int [] DirY = {-1,-1,0,1};
	private Joueur JoueurActuel;
	
	
	public JeuxDeGrilles(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
		this.FinDePartie=false;
		this.Grille=new Symbole[nbLig][nbCol];
		this.JoueurActuel=new Joueur(Symbole.J1);
		InitialisationGrille();
	}
	
	
	public void InitialisationGrille() {
		for(int i=0;i<this.nbLig;++i) {
			for(int j=0;j<this.nbCol;++j) {
				this.Grille[i][j]=Symbole.Vide;
			}
		}
	}
	
	
	public String toString() {
		String s="";
		for(int i=0;i<this.nbCol;++i) {
			s+="[" + (i+1) + "]";
		}
		s+="\n";
		for(int i=0;i<this.nbLig;++i) {
			for(int j=0;j<this.nbCol;++j) {
				s+="[" + Grille[i][j].getValue() + "]";
			}
			s+="\n";
		}
		return s;
	}
	
	
	public void PlacerPion(int numCol, int numLig, Symbole Joueur) {
		this.Grille[numLig-1][numCol-1]=Joueur;
		//this.estAlignement(numLig, numCol, 10, Joueur);
	}
	
	
	public boolean EstAutorisé(int numCol, int numLig) {
		if(!EstDansGrille(numCol,numLig)) {
			return false;
		}
		else if(EstOccupé(numCol,numLig)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean EstDansGrille(int numCol, int numLig) {
		if(numCol<1 || numLig<1 || numCol>this.nbCol || numLig>this.nbLig) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public boolean EstOccupé(int numCol, int numLig) {
		if(this.Grille[numLig-1][numCol-1]!=Symbole.Vide) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean getFinDePartie() {
		return this.FinDePartie;
	}
	
	public Symbole getSymboleGrille(int numLig, int numCol) {
		return this.Grille[numLig-1][numCol-1];
	}
	
	
	//Renvoi sur une direction donnée le nombre de Symboles==Symboles en param alignés
	//Ne comptabilise pas le Symbole placé ni le sens opposé !
	public int NbrSymbolesAdjDir(int numLig, int numCol, int DirX, int DirY, Symbole symbole) {
		if(!(DirX==1 || DirX==-1 || DirX==0) && !(DirY==1 || DirY==-1 || DirY==0)) {
			throw new IllegalArgumentException("La direction donnée en paramètre est invalide : " + DirX + " " + DirY);
		}
		int nbSymbole=0;
		for(int j=1;(this.EstDansGrille(numCol + DirY*j, numLig + DirX*j)) 
				&& (this.Grille[numLig-1 + DirX*j][numCol-1 + DirY*j]==symbole);++j){
			++nbSymbole;
		}
		
		return nbSymbole;
	}
	
	public int NbrSymbolesAlignés(int numLig, int numCol, int DirX, int DirY, Symbole symbole) {
		int nbSymbole=NbrSymbolesAdjDir(numLig, numCol, DirX, DirY, symbole);
		nbSymbole+=NbrSymbolesAdjDir(numLig, numCol, -DirX, -DirY, symbole);
		return nbSymbole+1;
	}
	
	
	
	public boolean estAlignement(int numLig, int numCol, int nbr, Symbole symbole) {
		for(int i=0;i<this.DirX.length;++i) {
			int nbSymb=0;
			nbSymb=NbrSymbolesAlignés(numLig, numCol, this.DirX[i], this.DirY[i], symbole);
			if(nbSymb>=nbr) {
				return true;
			}
		}
		return false;
	}
	
	
	public int [] getDirection(int i) {
		int [] Direction= new int[2];
		Direction[0]=this.DirX[i];
		Direction[1]=this.DirY[i];
		return Direction;
	}
	
	public int getNbLig() {
		return this.nbLig;
	}
	
	
	public Joueur getJoueurActuel() {
		return this.JoueurActuel;
	}
	
	public Symbole getSymboleJoueurActuel() {
		return this.JoueurActuel.getSymbole();
	}

}
