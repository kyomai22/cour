package decouverte;

import java.util.Scanner;

public class Saisies {

	public static void main(String[] args) {
		int nb1,nb2,nb3;
		System.out.println("Bonjour, entrez une valeure eintère SVP");
		//saisir nb1
		nb1=(new Scanner(System.in)).nextInt(); //saisir un entier2
		//
		System.out.println("Entrez un deuxième nombre entier");
		nb2=(new Scanner(System.in)).nextInt();
		//
		System.out.println(nb1+ "+" + nb2 + "= ????");
		nb3=(new Scanner(System.in)).nextInt();
		//
		//si nb3=nb1+nb2
		//		alors afficher "bravo"
		//		sinon afficher "T'es nul !"
		//fin si
		
		if ( nb3==nb1+nb2) {
			//alors
			System.out.println("Bravo");
		}
		else{
			//sinon
			System.out.println("T'es nul, tout le monde sait que c'était "+(nb1+nb2));
		}

	}

}
