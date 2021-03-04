package jeuxDeGrilles;

public class Morpion extends JeuxDeGrilles {
	
	public Morpion() {
		super(3, 3);
	}


	public boolean estAlignement(int numCol, int numLig) {
		return false;
	}
	

	public boolean estGagné(int numCol, int numLig) {
		return false;
	}
	
	public int getTailleAlign() {
		return 3;
	}
	
	public int getNbJoueurs() {
		return 2;
	}


	@Override
	public boolean JouerCoup(int... coord) {
		int numCol=coord[0];
		int numLig=coord[1];
		//si le coup est interdit on renvoie false.
		if(!this.EstAutorisé(numCol, numLig)) {
			return false;
		}//Si le coup est autorisé on place le pion.
		else {
			super.PlacerPion(numCol, numLig, super.getSymboleJoueurActuel());
			super.EstFinDePartie(numLig, numCol, this.getTailleAlign(), getSymboleJoueurActuel());
			return true;
		}
	}
	

}
