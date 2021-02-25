package jeuxDeGrilles;

import joueurs.Symbole;

public abstract class GrillesAbstraites implements IGrilles {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private Symbole [][] Grille;
	
	public GrillesAbstraites(int nbCol, int nbLig) {
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
		if(numCol<1 || numLig<1 || numCol>this.nbCol || numLig>this.nbLig) {
			throw new IllegalArgumentException("Hors des limites de la grilles.");
		}
		this.Grille[numLig-1][numCol-1]=Joueur;
	}
	
	
	public boolean getFinDePartie() {
		return this.FinDePartie;
	}

}
