package boucles;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		//Ecrire le programme qui demande d�entrer des nombres et lit chaque nombre. Le programme 
		//s�arr�te quand l�utilisateur entre 0.  A la fin, le programme affiche la moyenne des nombres.
		
		int nb1=1,nb2=0,cpt=0;
		double moy;
		
		System.out.println("Entrez des nombres pour calculer leur moyenne");
		System.out.println("Finissez par 0");
		
		while (nb1!=0){
            nb1=1;
            nb1=(new Scanner(System.in)).nextInt();
            nb2=nb2+nb1;
            
            cpt++;
		}
		if (cpt!=1){
		moy=(double)nb2/(cpt-1);
		System.out.println("La moyenne est de "+moy);
		}

	}

}
