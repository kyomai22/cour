package decouverte;

import java.util.Scanner;

public class Comparaison {

	public static void main(String[] args) {
		int nb1, nb2;
		
		System.out.println("Entrez la premiere valeure a compar?");
		nb1=(new Scanner(System.in)).nextInt();
		
		System.out.println("Entrez la deuxieme valeure a compar?");
		nb2=(new Scanner(System.in)).nextInt();
		
		if (nb1==nb2){
			System.out.println(nb1+" et "+nb2+" sont ?gaux.");
		}
		else {
			if (nb1>nb2){
				System.out.println(nb1+" est plus grand que "+nb2);
			}
			else {
				System.out.println(nb2 +" est plus grand que "+nb1);
			}
		}

	}

}
