package pileface;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		int choix=0, select=0,PoF=0,stat=0;
		
		System.out.println("\t"+"Pile ou face !");
		System.out.println("\t"+"1. Réinitialiser les statistiques ");
		System.out.println("\t"+"2. Jouer");
		System.out.println("\t"+"3. Afficher les statistiques");
		System.out.println("\t"+"4. Quitter le programme");
		
		
		
		while(choix!=4){
			choix=0;
			choix=(new Scanner(System.in)).nextInt();
			
			if(choix==1){
				stat=0;
			}
			if(choix==2){
				select=0;
				System.out.println("\t"+"Pile ou Face?");
				System.out.println("\t"+"1. Pile"+"\t"+"2. Face");
				select=(new Scanner(System.in)).nextInt();
				
			}
			if(choix==3){
				System.out.println(stat);
			}
		}

	}

}
