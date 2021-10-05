package boucles;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		int nb=0,cpt=0;
		
		System.out.println("Entrez un nombre");
		nb=(new Scanner(System.in)).nextInt();
		
		while (nb!=0){
			cpt++;
			nb=(new Scanner(System.in)).nextInt();
		}
		System.out.println("Vous avez entrer autre chose que 0 "+cpt+" fois.");
			
		}
	}


