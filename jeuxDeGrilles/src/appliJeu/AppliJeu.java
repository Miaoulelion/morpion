package appliJeu;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Puissance4;
import joueurs.Joueur;
import joueurs.Symbole;

public class AppliJeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur J1=new Joueur(Symbole.J1);
		Puissance4 Jeu = new Puissance4();
		int [] Coup = {2};
		Jeu.JouerCoup(Coup);
		Jeu.JouerCoup(Coup);
		Jeu.JouerCoup(Coup);
		System.out.println(Jeu.NbrSymbolesAlignés(4, 3, 0, -1, Symbole.J1));
		

		//Jeu.JouerCoup(Coup);
		//Jeu.JouerCoup(Coup);
		//Jeu.JouerCoup(Coup);
		//Jeu.JouerCoup(Coup);

		System.out.println(Jeu.toString());
		/*
		while(Jeu.getFinDePartie()) {
			
			
			
		}*/
		
		
	}

}
