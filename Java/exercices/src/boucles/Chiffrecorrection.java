package boucles;

import java.util.Scanner;

public class Chiffrecorrection {

	public static void main(String[] args) {

	        int nb=0;
	        do{        
	        System.out.println("Entrez un chiffre");
	        System.out.println("Entrez 0, 1, 2 ou 3 pour sortir");
	        nb=(new Scanner(System.in)).nextInt();
	        

	        } while (nb!=0&&nb!=1&&nb!=2&&nb!=3 );
	        System.out.println("Au revoir");
	        
	    }

	}


