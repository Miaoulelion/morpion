package appliJeu;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Puissance4;
import joueurs.Symbole;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jeux Jeu = new Puissance4();
		Jeu.PlacerPion(2, 2, Symbole.J1);
		Jeu.PlacerPion(4, 1, Symbole.J2);
		
		System.out.println(Jeu.toString());
		/*
		while(Jeu.getFinDePartie()) {
			
			
			
		}*/
		
		
	}

}
