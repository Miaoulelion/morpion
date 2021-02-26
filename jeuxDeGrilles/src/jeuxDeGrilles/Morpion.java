package jeuxDeGrilles;

public class Morpion extends JeuxDeGrilles {
	
	public Morpion() {
		super(3, 3);
	}


	public boolean estAligmenet(int numCol, int numLig) {
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
	

}
