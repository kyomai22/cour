package vecteur;

import java.util.Scanner;

public class DoubleNombre {

	public static void main(String[] args) {
		int []tab=new int[10];
		int nb=0,i=0,cpt=0;
		
		System.out.println("Entrez 10 nombres qui seront ensuite doubl?");

		for (i=0;i!=10;i++){
			nb=(new Scanner(System.in)).nextInt();
			tab[i]=nb;
		}
		while(cpt<10){	
		System.out.print(tab[cpt]+"\t");
		cpt++;
	}
		System.out.println("");
		cpt=0;
		while(cpt<10){
			tab[cpt]=tab[cpt]*2;				//ici
			System.out.print(tab[cpt]+"\t");
			cpt++;
		}
	}
}
