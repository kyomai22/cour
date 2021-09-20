package assignations;

import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		int nb1,nb2;
		
		System.out.println("Entrez la premiere valeur");
		nb1=(new Scanner(System.in)).nextInt();
		
		System.out.println("Entrez la deuxieme valeur");
		nb2=(new Scanner(System.in)).nextInt();
			//somme
		System.out.println("La somme est: ");
			System.out.println(nb1+"+"+nb2+"="+(nb1+nb2));
			//différece
		System.out.println("La différence est: ");
			System.out.println(nb1+"-"+nb2+"="+(nb1-nb2));
			//produit
		System.out.println("Le produit est: ");
			System.out.println(nb1+"."+nb2+"="+(nb1*nb2));

	}

}
