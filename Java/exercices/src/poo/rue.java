package poo;

public class rue {

	public static void main(String[] args) {
		Voiture toto, choupette;
		
		System.out.println(Voiture.getNb());
		toto=new Voiture();
		System.out.println(Voiture.getNb());
		choupette=new Voiture();
		System.out.println(Voiture.getNb());
	}

}
