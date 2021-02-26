package jeuxDeGrilles;

import joueurs.Symbole;

public abstract class JeuxDeGrilles implements Jeux {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private Symbole [][] Grille;
	private int [] DirX = {-1,0,1,-1,0,1,-1,0,1};
	private int [] DirY = {1,1,1,0,0,0,-1,-1,-1};
	
	
	public JeuxDeGrilles(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
		this.FinDePartie=false;
		this.Grille=new Symbole[nbLig][nbCol];
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
		if(EstAutorisé(numCol,numLig)) {
			throw new IllegalArgumentException("Hors des limites de la grilles ou coup déjà joué.");
		}
		this.Grille[numLig-1][numCol-1]=Joueur;
	}
	
	
	public boolean EstAutorisé(int numCol, int numLig) {
		if(EstOccupé(numCol,numLig) || !EstDansGrille(numCol,numLig)) {
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
	
	
	public int [] getDirX() {
		return this.DirX;
	}
	
	
	public int [] getDirxY() {
		return this.DirY;
	}

}
