package vecteur;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		
		//Ecrivez un programme qui cr?e un tableau de 10 ?l?ments entiers et initialise ce tableau avec 10 
		//nombres entiers entr?s par l?utilisateur. Affichez les ?l?ments du tableau. Triez le tableau et r?affichez-le.
		
		int []tab=new int[10];
		int nb=0,cpt1=0,tmp=10;
		boolean estpetit= true;
		
		System.out.println("Entrez 10 nombres");
		
		for (int i=0;i<10;i++){
			nb=(new Scanner(System.in)).nextInt();
			//tmp=tmp-1;
			//nb=tmp;
			tab[i]=nb;	
			
		}
		
		for(int cpt=0;cpt!=10;cpt++){
			System.out.print(tab[cpt]);
			System.out.print(" ");
		}
		System.out.println("");
		while(estpetit){
			estpetit=false;
		for (int cpt=0;cpt<9 && !estpetit;cpt++){
			if (tab[cpt]>tab[cpt+1]){
				tmp=tab[cpt];
				tab[cpt]=tab[cpt+1];
				tab[cpt+1]=tmp;
				estpetit=true;
			}
		}
		
	}
		for(int i=0;i<10;i++){
			System.out.print(tab[i]);
			System.out.print(" ");
		}
	}
}
