package fabriqueJeux;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Morpion;
import jeuxDeGrilles.Puissance4;

public class FabriqueJeux {
	
	public static Jeux FabriqueJeu(String [] arg) {
		int choix=Integer.parseInt(arg[0]);
		Jeux jeu = null;
		if(choix==1) {
			jeu = new Morpion();
		}
		else if(choix==2) {
			jeu = new Puissance4();
		}
		return jeu;
	}

}
