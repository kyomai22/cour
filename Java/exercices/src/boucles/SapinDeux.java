package boucles;

import java.util.Scanner;

public class SapinDeux {

	public static void main(String[] args) {
		String[] sapin= {" ", "*"};
		int choix=0;
		
		System.out.println("Entrez la taille de l'arbre");
		choix=(new Scanner(System.in)).nextInt();
		
		
		for (int i=0;i<choix;i++){
			for(int i2=0;i2<choix-i-1;i2++) {
				System.out.print(" ");
			} for (int i2=0; i2<i*2-1; i2++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i=0; i<choix-3; i++) {
			System.out.print(" ");
		} 
		System.out.println("| |");

		
	}

}
