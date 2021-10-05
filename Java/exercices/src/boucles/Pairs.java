package boucles;

public class Pairs {

	public static void main(String[] args) {
		int cpt=0;
		
		System.out.println("Les 20 premiers nombre pair sont : ");
		
		for (int i=1; cpt <=20; i++) {
			if (i%2 == 0) {
			System.out.println(i);
			cpt++;
			}
		}

	}

}
