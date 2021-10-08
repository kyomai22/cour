package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {
		int choix1=0, choix2=0, sortir=1;

		while(sortir==1){
			choix1=0;
			choix2=0;

			while ((choix1!=1)&&(choix1!=2)&&(choix1!=3)){
				System.out.println("1er choix");
				System.out.println("	1.Mademoiselle");
				System.out.println("	2.Madame");
				System.out.println("	3.Monsieur");
				choix1=(new Scanner(System.in)).nextInt();
			}

			while ((choix2!=1)&&(choix2!=2)&&(choix2!=3)){
				System.out.println("2eme choix");
				System.out.println("	1.Matin");
				System.out.println("	2.Après-midi");
				System.out.println("	3.Soirée");
				choix2=(new Scanner(System.in)).nextInt();
			}

			if (choix2==1){
				System.out.print("Bonjour ");
			}
			if (choix2==2){
				System.out.print("Bon apès-midi ");
			}
			if (choix2==3){
				System.out.print("Bonsoir ");
			}
			if (choix1==1){
				System.out.print("Mademoiselle");
			}
			if (choix1==2){
				System.out.print("Madame");
			}
			if (choix1==3){
				System.out.print("Monsieur");
			}
			System.out.println("");
			System.out.println("Continuer?");
			System.out.println("1. Oui");
			System.out.println("2. Non");
			sortir=(new Scanner(System.in)).nextInt();
		}
		System.out.println("Aurevoir alors!");
	}

}
