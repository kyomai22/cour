package vecteur;

import java.util.Scanner;

public class ZeroALaFin2 {

	public static void main(String[] args) {
		int []tab1=new int[10];
		int []tab2=new int[10];
		int cpt=0,nb=0,tmp=0;

		System.out.println("Entrez des chiffres entre 0 et 5");
		for(int i=0;i<10;i++){
			tab2[i]=0;
		}
		while(cpt<10){
			nb=(new Scanner(System.in)).nextInt();
			if(nb>5||nb<0){
				System.out.println("ENTRE 0 ET 5 BIESSE!");
			}else{
				tab1[cpt]=nb;
			}

			cpt++;
		}
		cpt=0;
		for(int i=0;i<10;i++){
		       if (tab1[i] !=0){   
		            tab2[cpt]=tab1[i];
		            cpt++;
		        }
		 }
		System.out.println("0 a droite: ");
		for(int i=0;i<10;i++){
			System.out.print(tab2[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("Tableau par d�faut: ");
		for(int i=0;i<10;i++){
			System.out.print(tab1[i]);
			System.out.print(" ");
		}
	}
}


