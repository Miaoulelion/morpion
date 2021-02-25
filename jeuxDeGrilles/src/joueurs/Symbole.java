package joueurs;

public enum Symbole {
	Vide(' '), J1('X'), J2('O');
	
	private char value;


	Symbole(char Symbole) {
		this.value=Symbole;

	}
	
	public char getValue() {
		return this.value;
	}
}
