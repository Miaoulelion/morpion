package jeuxDeGrilles;

import joueurs.Joueur;
import joueurs.Symbole;

public abstract class JeuxDeGrilles implements Jeux {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private Symbole [][] Grille;
	final private int [] DirX = {0,1,1,1};
	final private int [] DirY = {-1,-1,0,1};
	private Joueur J1;
	private Joueur J2;
	private Joueur JoueurActuel;
	private boolean estVictoire;
	
	
	public JeuxDeGrilles(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
		this.FinDePartie=false;
		this.Grille=new Symbole[nbLig][nbCol];
		this.J1=new Joueur(Symbole.J1);
		this.JoueurActuel=this.J1;
		this.J2=new Joueur(Symbole.J2);

		this.estVictoire=false;
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
	
	public boolean estRemplie() {
		for(int i=0;i<this.nbCol;++i) {
			for(int j=0;j<this.nbLig;++j) {
				if(this.Grille[j][i]!=Symbole.Vide) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public boolean getVictoire() {
		return this.estVictoire;
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
	
	//attention compte par avance le pion placé
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
	
	
	
	protected void EstFinDePartie(int numLig, int numCol, int nbr, Symbole symbole) {
		if(this.estAlignement(numLig, numCol, nbr, symbole)) {
			this.estVictoire=true;
			this.FinDePartie=true;
		}
		else if(this.estRemplie()) {
			this.estVictoire=false;
			this.FinDePartie=true;
		}
	}
	
	public int getNbLig() {
		return this.nbLig;
	}
	
	
	public Joueur getJoueurActuel() {
		return this.JoueurActuel;
	}
	
	public void ChangerJoueur() {
		if(this.JoueurActuel.getSymbole()==Symbole.J1) {
			this.JoueurActuel=this.J2; //J2
		}
		else if(this.JoueurActuel.getSymbole()==Symbole.J2) {
			this.JoueurActuel=this.J1; //J1
		}
	}
	
	public Symbole getSymboleJoueurActuel() {
		return this.JoueurActuel.getSymbole();
	}

}
