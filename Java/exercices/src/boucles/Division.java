package boucles;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// ?crire le programme qui effectue la division enti?re de deux nombres entiers sans utiliser 
		//l?instruction l?op?rateur de division / . 
		
		int nb1=0, nb2=0, cpt=0;
		
		System.out.println("__"+" divis? par "+"__");
		nb1=(new Scanner(System.in)).nextInt();
		nb2=(new Scanner(System.in)).nextInt();
		
		if (nb2!=0){		
			while ((nb1>0)&&(nb2!=0)) {
				nb1=nb1-nb2;
				cpt++;
			}
		System.out.println("Le r?sultat est "+cpt);
		}
	}

}
