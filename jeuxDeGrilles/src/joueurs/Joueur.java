package joueurs;

public enum Joueur {
	
	Vide(' '), J1('X'), J2('O');
	
	private char value;
	private int score;
	private boolean vainqueur;

	Joueur(char Symbole) {
		this.value=Symbole;
		initJoueur();
	}
	
	public void initJoueur() {
		this.vainqueur=false;
		this.score=0;
	}
	
	public char getValue() {
		return this.value;
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
