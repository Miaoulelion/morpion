package joueurs;

public class Joueur {
	private boolean vainqueur;
	private int score;
	private Symbole symbole;
	
	public Joueur(Symbole symbole) {
		if(symbole.getValue()==' ') {
			throw new IllegalArgumentException("Symbole vide ne représente pas un joueur");
		}
		this.symbole=symbole;
		initJoueur();
	}

	
	public void initJoueur() {
		this.vainqueur=false;
		this.score=0;
	}
	
	public Symbole getSymbole() {
		return this.symbole;
	}
	
	public void incrementScore() {
		++this.score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void estVainqueur() {
		this.vainqueur=true;
	}
	
	public boolean getVainqueur() {
		return this.vainqueur;
	}

}
