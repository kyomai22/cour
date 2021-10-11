package poo;

public class Garage {

	public static void main(String[] args) {
		Voiture pupuce=new Voiture();
		VoitureDecapotable titine=new VoitureDecapotable();
		pupuce.setNbChevaux(-125);
		pupuce.affiche(4);
		titine.affiche(5);
		pupuce.demarre();

	}

}
