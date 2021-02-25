package appliJeu;

import jeuxDeGrilles.JeuxDeGrilles;
import jeuxDeGrilles.Morpion;
import joueurs.Symbole;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JeuxDeGrilles Jeu = new Morpion(6,6);
		Jeu.PlacerPion(2, 2, Symbole.J1);
		Jeu.PlacerPion(4, 1, Symbole.J2);
		
		System.out.println(Jeu.toString());
		/*
		while(Jeu.getFinDePartie()) {
			
			
			
		}*/
		
		
	}

}
