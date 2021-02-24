package jeuxDeGrilles;

public class Morpion implements JeuxDeGrilles {
	int nbLig;
	int nbCol;
	String [][] Grille=new String[nbLig][nbCol];
	
	
	public Morpion(int nbCol, int nbLig) {
		this.nbCol=nbCol;
		this.nbLig=nbLig;
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
	
	public boolean estGagné(int numCol, int numLig) {
		return false;
	}
	
	public boolean estAligné(int numCol, int numLig) {
		return false;
	}
	
	

}
