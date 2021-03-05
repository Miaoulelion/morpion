package appliJeu;

import java.util.Scanner;

import fabriqueJeux.FabriqueJeux;
import jeuxDeGrilles.Jeux;

public class AppliJeu {

	public static void main(String[] args) {

		Jeux Jeu=FabriqueJeux.FabriqueJeu(args);
		
		System.out.println(Jeu.toString());
		
		while(!Jeu.getFinDePartie()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indiquez la colonne jouée : ");
			String Input = sc.nextLine();
			while(!EstCorrectInputUtilisateur(args, Input)) {
				Input = sc.nextLine();
			}

			if(Integer.parseInt(args[0])==1) {
				int Coup []=ReturnInputUtilisateur(args, Input);
				Jeu.JouerCoup(Coup);
			}
			else if(Integer.parseInt(args[0])==2) {
				int Coup []=ReturnInputUtilisateur(args, Input);
				Jeu.JouerCoup(Coup);
			}
			
			//Jeu.JouerCoup(Coup);
			System.out.println(Jeu.toString());
			
		}

	}
	
	public static boolean EstCorrectInputUtilisateur(String[] args, String in) {
		if(Integer.parseInt(args[0])==1 && in.trim().matches("^[0-9]-[0-9]$")) {
			return true;
		}
		else if(Integer.parseInt(args[0])==2 && in.trim().matches("[0-9]")) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("null")
	public static int [] ReturnInputUtilisateur(String[] args, String in) {

		if(Integer.parseInt(args[0])==1 && (EstCorrectInputUtilisateur(args, in))) {
			int[] out = new int[2];
			out[0]=Character.getNumericValue(in.charAt(0));
			out[1]=(int) Character.getNumericValue(in.charAt(2));
			return out;
		}
		else if(Integer.parseInt(args[0])==2 && (EstCorrectInputUtilisateur(args, in))) {
			int[] out = new int[2];
			out[0]=Character.getNumericValue(in.charAt(0));
			return out;
		}
		return new int[1];
	}

}
