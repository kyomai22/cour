package poo;

public class Voiture {
	private int nbChevaux=90;
	private static int nb=0;
	public Voiture(){
		nb++;
	}
	public Voiture(int nbC){
		nbChevaux=nbC;
		nb++;
	}

	public void setNbChevaux(int nb){
		if(nb<=0){
			nbChevaux=50;
		}
	}
	public int getNbChevaux(){
		return nbChevaux;
	}
	public void affiche(){
		System.out.println("Ma jolie voiture");
		System.out.println("Avec "+nbChevaux+" Chevaux");
	}
	public void affiche(int nb){
		for(int i=0;i<=nb;i++){
			System.out.println("Ma jolie voiture");
			System.out.println("Avec "+nbChevaux+" Chevaux");
			System.out.println("___________________________");
		}
	}
	public void demarre() {
		System.out.println("Je peux rouler tr?s vite");
		System.out.println("jusque "+nbChevaux*1.5+" km/h");
	}
	public static int getNb() {
		return nb;
	}
	public static void setNb(int nb) {
		Voiture.nb = nb;
	}

}
