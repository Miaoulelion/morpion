package appliJeu;

import jeuxDeGrilles.JeuxDeGrilles;
import jeuxDeGrilles.Morpion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JeuxDeGrilles Jeu = new Morpion(6,6);
		Jeu.PlacerPion(2, 2, "X");
		Jeu.PlacerPion(4, 1, "V");
		
		System.out.println(Jeu.toString());
		/*
		while(Jeu.getFinDePartie()) {
			
			
			
		}*/
		
		
	}

}
