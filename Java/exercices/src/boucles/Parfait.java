package boucles;

import java.util.Scanner;

public class Parfait {

	public static void main(String[] args) {
		int a=2,b=0,cpt=0;
		
		System.out.println("Ins�rer un nombre"); //pour le test
		b=(new Scanner(System.in)).nextInt();
		System.out.println(Math.pow(a, b-1));
		System.out.println((Math.pow(a, b))-1);
		
	}

}
