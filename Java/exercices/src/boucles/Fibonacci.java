package boucles;

public class Fibonacci {

	public static void main(String[] args) {
		int fib=0, nb1=1, nb2=0, cpt=0;
		
		System.out.println("La suite de Fibonacci");
		
		while (cpt<20) {
			nb2=fib+nb1;
			System.out.println(nb2);
			fib=nb1;
			nb1=nb2;
			cpt++;

	}

}
}
