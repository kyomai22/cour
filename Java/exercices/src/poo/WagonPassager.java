package poo;

public class WagonPassager extends Wagon {
	private boolean doubleEtage=true;
	private int nbPlaces=98;
	public boolean getDoubleEtage() {
		return doubleEtage;
	}
	public void setDoubleEtage(boolean doubleEtage) {
		this.doubleEtage = doubleEtage;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		if(nbPlaces<0){
			nbPlaces=50;
		}
		this.nbPlaces = nbPlaces;
	}
	public void affiche(){
		System.out.println("Wagon passager");
		if(getBiDirection())
			System.out.println("bidirectionnel");
		else
			System.out.println("pas bidirectionnel");
		if(getDoubleEtage())
			System.out.println("double ?tages");
		else
			System.out.println("pas double ?tage");
		System.out.println(nbPlaces+" places assises");
		System.out.println(doubleEtage?"double ?tage" : "pas d'?tage");
		int nb=nbPlaces==100?4:5;
	}

}
