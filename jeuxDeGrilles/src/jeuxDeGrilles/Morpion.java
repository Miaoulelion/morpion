package jeuxDeGrilles;

public class Morpion extends JeuxDeGrilles {
	
	public Morpion() {
		super(3, 3);
	}

	
	public int getTailleAlign() {
		return 3;
	}
	

	@Override
	public boolean JouerCoup(int... coord) {
		int numCol=coord[0];
		int numLig=coord[1];
		//si le coup est interdit on renvoie false.
		if(!this.EstAutorisť(numCol, numLig)) {
			return false;
		}//Si le coup est autorisť on place le pion.
		else {
			super.PlacerPion(numCol, numLig, super.getSymboleJoueurActuel());
			super.EstFinDePartie(numLig, numCol, this.getTailleAlign(), getSymboleJoueurActuel());
			super.ChangerJoueur();
			return true;
		}
	}
	

}
