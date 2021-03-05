package fabriqueJeux;

import jeuxDeGrilles.Jeux;
import jeuxDeGrilles.Morpion;
import jeuxDeGrilles.Puissance4;

public class FabriqueJeux {
	
	public static Jeux FabriqueJeu(String [] arg) {
		int choix=Integer.parseInt(arg[0]);
		if(choix==1) {
			return new Morpion();
		}
		else if(choix==2) {
			return new Puissance4();
		}//Par défaut on renvoie un Morpion();
		return new Morpion();
	}

}
