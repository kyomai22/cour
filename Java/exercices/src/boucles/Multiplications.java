package boucles;

import java.util.Scanner;

public class Multiplications {

	public static void main(String[] args) {
		int nb=0, i;
		
		System.out.println("Entrez un nombre");
		nb=(new Scanner(System.in)).nextInt();
		
		for (i =1; i <= 10; i++) 
			System.out.println("La table de multiplication de "+nb+" contient " +(nb*i)+" ("+nb+"*"+i+") ");

	}

}
