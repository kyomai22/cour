package decouverte;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int nb1, nb2, nb3;
		//
		System.out.println("Bonjour, entrez une valeure ? divis?");
		nb1=(new Scanner(System.in)).nextInt();
		
		System.out.println("Entrez le diviseur");
		nb2=(new Scanner(System.in)).nextInt();
		
		System.out.println("Quel est la r?ponse?");
		nb3=(new Scanner(System.in)).nextInt();
		
		if(nb2==0){
			System.out.println("0 n'est pas une entr?e valide");
			
		}
		else {
			if (nb1/nb2==nb3){
				System.out.println("Bravo !");
			}
			else{
				System.out.println("Non la bonne r?ponse est "+(nb1/nb2));
			}
		}
		

	}
}
