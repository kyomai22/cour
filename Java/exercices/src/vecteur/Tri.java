package vecteur;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		
		//Ecrivez un programme qui cr�e un tableau de 10 �l�ments entiers et initialise ce tableau avec 10 
		//nombres entiers entr�s par l�utilisateur. Affichez les �l�ments du tableau. Triez le tableau et r�affichez-le.
		
		int []tab=new int[10];
		int nb=0,cpt1=0,tmp=0;
		
		System.out.println("Entrez 10 nombres");
		
		for (int i=0;i<10;i++){
			nb=(new Scanner(System.in)).nextInt();
			tab[i]=nb;			
		}
		
		for(int cpt=0;cpt<10;cpt++){
			System.out.print(tab[cpt]);
			System.out.print(" ");
		}
		while(cpt1<10){
			if(tab[cpt1]<tmp){
				cpt1++;
			}
			if (tab[cpt1]>tmp){
				tmp=tab[cpt1];
			}
			System.out.print(tab[cpt1]+"\t");
		}
	}

}