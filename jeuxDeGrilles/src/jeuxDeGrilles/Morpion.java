package jeuxDeGrilles;

public class Morpion implements JeuxDeGrilles {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private String [][] Grille;
	
	
	public Morpion(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
		this.FinDePartie=false;
		this.Grille=new String[nbLig][nbCol];
		Initialisation();
	}
	
	public void Initialisation() {
		for(int i=0;i<this.nbLig;++i) {
			for(int j=0;j<this.nbCol;++j) {
				this.Grille[i][j]=".";
			}
		}
	}
	
	
	
	public String toString() {
		String s="";
		for(int i=0;i<this.nbLig;++i) {
			s+="[" + (i+1) + "]";
		}
		s+="\n";
		for(int i=0;i<this.nbLig;++i) {
			for(int j=0;j<this.nbCol;++j) {
				s+="[" + Grille[i][j] + "]";
			}
			s+="\n";
		}
		return s;
	}
	
	public void PlacerPion(int numCol, int numLig, String Joueur) {
		if(numCol<1 || numLig<1 || numCol>this.nbCol || numLig>this.nbLig) {
			throw new IllegalArgumentException("Hors des limites de la grilles.");
		}
		this.Grille[numLig-1][numCol-1]=Joueur;
	}
	
	
	public boolean estAligné(int numCol, int numLig) {
		return false;
	}
	

	
	
	public boolean getFinDePartie() {
		return this.FinDePartie;
	}



	@Override
	public boolean estGagné(int numCol, int numLig) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
