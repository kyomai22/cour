package vecteur;

import java.util.Random;

public class VecteurAl�at {

	public static void main(String[] args) {
		int []tab=new int[10];
		Random r=new Random();
		int nb, cpt=0;
		
		
		
		for(cpt=0;cpt<10;cpt++){
			nb=r.nextInt(30);
			tab[cpt]=nb;
			System.out.print(" ");
			System.out.print(tab[cpt]);
		}
		
		

	}

}
