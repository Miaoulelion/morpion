package jeuxDeGrilles;

public interface Jeux {
	
	//public void PlacerPion(int numCol, int numLig, Symbole Joueur);
	public boolean JouerCoup(int... coord);
	public boolean getFinDePartie();
	public int getTailleAlign();
	

}
