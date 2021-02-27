package jeuxDeGrilles;

import joueurs.Symbole;

public class Puissance4 extends JeuxDeGrilles {
	

	public Puissance4() {
		super(7, 6);
	}


	

	

	
	@Override
	public boolean estGagné(int numCol, int numLig) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void JouerCoup(int...numCol) {
		int numLig=super.getNbLig();
		while(super.EstOccupé(numCol[0], numLig)) {
			--numLig;
		}//mettre la méthode en boolean et utiliser est autorisé ?
		super.PlacerPion(numCol[0], numLig, super.getJoueurActuel().getSymbole());
	}

}
