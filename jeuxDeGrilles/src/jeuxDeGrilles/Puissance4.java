package jeuxDeGrilles;

public class Puissance4 extends JeuxDeGrilles {
	

	public Puissance4() {
		super(7, 6);
	}


	public boolean estAlignement(int numCol, int numLig) {
		return super.estAlignement(numLig, numCol, this.getTailleAlign(), getSymboleJoueurActuel());
	}
	
	@Override
	public boolean JouerCoup(int...numCol) {
		if(numCol.length!=1) {
			throw new IllegalArgumentException("La méthode JouerCoup() demande un seul argument pour un P4");
		}
		int numLig=super.getNbLig();//faire une nouvelle méthode pour retrouver la ligne
		while(super.EstDansGrille(numCol[0], numLig) 
				&& super.EstOccupé(numCol[0], numLig)) {
			--numLig;
		}//Si le coup n'est pas autorisé, on renvoie false
		if(!this.EstAutorisé(numCol[0], numLig)) {
			return false;
		}//Si le coup est autorisé on place le pion.
		else {
			super.PlacerPion(numCol[0], numLig, super.getSymboleJoueurActuel());
			super.EstFinDePartie(numLig,numCol[0],this.getTailleAlign(), super.getJoueurActuel().getSymbole());
			super.ChangerJoueur();
			return true;
		}
	}


	@Override
	public int getTailleAlign() {
		return 4;
	}

}
