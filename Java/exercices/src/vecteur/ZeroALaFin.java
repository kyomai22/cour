package vecteur;

import java.util.Scanner;

public class ZeroALaFin {

	public static void main(String[] args) {
		//Ecrire un programme qui demande 10 fois ? l?utilisateur d?entrer un chiffre compris entre 0 et 5. 
		//V?rifiez que le chiffre est bien compris entre 0 et 5. Cr?ez et initialisez un tableau de 10 ?l?ments 
		//avec les chiffres que l?utilisateur a entr?s. Ensuite triez le tableau en mettant tous les z?ros ? la fin du 
		//tableau.

		int []tab=new int[10];
		int nb=0,nbV=0,cpt=0,zero=0;
		boolean ok=false;

		System.out.println("Etrez un chiffre en 0 et 5");

		while(cpt<10){
			nb=(new Scanner(System.in)).nextInt();
			if(nb>5||nb<0){
				System.out.println("ENTRE 0 ET 5 BIESSE!");
			}
			else{
				tab[cpt]=nb;
				if(tab[cpt]==zero){
					nbV=nbV+1;
				}

				cpt++;

				//for(int i=0;i<10;i++){
				
			}

		}

		for(int i=0;i<10;i++){
			System.out.print(tab[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Nombre de 0: "+nbV);
	}

}
