package boucles;

import java.util.Scanner;

public class Intervales {

	public static void main(String[] args) {
		int nb1=0, nb2=0;
		
		System.out.println("Entrez deux nombres supérieur a 0");
		nb1=(new Scanner(System.in)).nextInt();
		nb2=(new Scanner(System.in)).nextInt();
		
		while (nb1==0 && nb2==0) {
			System.out.println("On a dit supérieur a 0");
			nb1=(new Scanner(System.in)).nextInt();
			nb2=(new Scanner(System.in)).nextInt();
		}
		System.out.println();

	}

}
