package vecteur;

import java.util.Random;
import java.util.Scanner;

public class VerifieNombre {

	public static void main(String[] args) {
		
		//Ecrire un programme qui cr?e un tableau de 10 ?l?ments entiers et initialise ce tableau avec 10 
		//nombres entiers entr?s par l?utilisateur. 
		//Demander ? l?utilisateur ? Entrez un nombre ?, si le nombre est pr?sent dans le tableau, afficher 
		//? vrai ? ainsi que la position de ce nombre dans le tableau sinon afficher ? faux ?, si c?est faux 
		//demander un nouveau nombre .
		
		int []tab=new int[10];
		Random r=new Random();
		int nb=0, cpt=0;
		boolean trouve;	
		for(cpt=0;cpt<10;cpt++){
			nb=r.nextInt(30);
			tab[cpt]=nb;
			System.out.print(tab[cpt]);
			System.out.print(" ");
			
		}
		System.out.println("");
		System.out.println("Entrez un nombre");
		nb=(new Scanner(System.in)).nextInt();
		
		cpt=0;
		trouve=false;
		while(cpt!=10 && !trouve){
			if(tab[cpt]==nb){
				System.out.println("Vrai");
				trouve=true;
			} 
			if(tab[cpt]!=nb){
				System.out.println("Faux");
				nb=(new Scanner(System.in)).nextInt();
				cpt++;
			}	
			
		}
	}

}
