package jeuxDeGrilles;

import joueurs.Symbole;

public class Puissance4 extends JeuxDeGrilles {

	public Puissance4() {
		super(7, 6);
	}

	
	public void PlacerPion(int numCol, Symbole Joueur) {
		super.PlacerPion(numCol, numCol, Joueur);
	}
	
	
	@Override
	public boolean estGagné(int numCol, int numLig) {
		// TODO Auto-generated method stub
		return false;
	}

}
