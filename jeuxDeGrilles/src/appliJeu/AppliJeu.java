package appliJeu;

import java.util.Scanner;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Puissance4;
import joueurs.Joueur;
import joueurs.Symbole;

public class AppliJeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur J1=new Joueur(Symbole.J1);
		Puissance4 Jeu = new Puissance4();
		System.out.println(Jeu.toString());
		
		while(!Jeu.getFinDePartie()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indiquez la colonne jouée : ");
			int [] Coup= {sc.nextInt()};
			Jeu.JouerCoup(Coup);
			System.out.println(Jeu.toString());

			
			
		}
		
		
		
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
