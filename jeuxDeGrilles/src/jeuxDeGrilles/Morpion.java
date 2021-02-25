package jeuxDeGrilles;

public class Morpion extends GrillesAbstraites {

	
	public Morpion() {
		super(3, 3);
	}


	public boolean estAligné(int numCol, int numLig) {
		return false;
	}
	

	public boolean estGagné(int numCol, int numLig) {
		return false;
	}
	

}
