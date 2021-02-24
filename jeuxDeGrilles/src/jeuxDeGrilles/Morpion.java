package jeuxDeGrilles;

public class Morpion implements JeuxDeGrilles {
	private int nbLig;
	private int nbCol;
	private boolean FinDePartie;
	private String [][] Grille=new String[nbLig][nbCol];
	
	
	public Morpion(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
		this.FinDePartie=false;
	}
	
	
	
	public String ToString() {
		String s="";
		for(int i=0;i<nbCol;++i) {
			s+="[" + (i+1) + "]";
			for(int j=0;j<nbLig;++j) {
				s+="[" + Grille[i][j] + "]";
			}
		}
		return s;
	}
	
	public void PlacerPion(int numCol, int numLig) {
		
	}
	
	
	public boolean estAligné(int numCol, int numLig) {
		return false;
	}
	
	public boolean estGagné() {
		return false;
	}
	
	
	public boolean getFinDePartie() {
		return this.FinDePartie;
	}
	

}
