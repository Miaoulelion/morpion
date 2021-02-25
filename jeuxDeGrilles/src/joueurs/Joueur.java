package joueurs;

public class Joueur implements IJoueur {
	private String SymboleJoueur;
	private int Score;
	private boolean vainqueur;
	
	
	
	public Joueur(String Symbole) {
		if(Symbole.length()!=1) {
			throw new IllegalArgumentException("Un joueur a un symbole d'un caractère.");
		}
		this.SymboleJoueur=Symbole;
		this.Score=0;
		this.vainqueur=false;
	}
	
	public void AugmenterScore() {
		++this.Score;
	}
	
	public int getScore() {
		return this.Score;
	}
	
	public void AGagné() {
		this.vainqueur=true;
	}
	
	public boolean getVainqueur() {
		return this.vainqueur;
	}
	
	public String getSymbole() {
		return this.SymboleJoueur;
	}
	
	

}
