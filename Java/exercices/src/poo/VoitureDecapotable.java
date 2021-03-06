package poo;

public class VoitureDecapotable extends Voiture {

	private boolean CapoteOuverte=false;
	private String couleur="gris";
	public void ouvre(){
		setCapoteOuverte(true);
	}
	public void ferme(){
		setCapoteOuverte(false);
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String coul) {
		if(coul.equalsIgnoreCase(""))
			coul = "rouge";
		couleur=coul;
	}
	public boolean getCapoteOuverte() {
		return CapoteOuverte;
	}
	public void setCapoteOuverte(boolean capoteOuverte) {
		CapoteOuverte = capoteOuverte;
	}
	public void affiche(){
		System.out.println("ma jolie voiture décapotable");
		System.out.println("Avec sa capote "+couleur);
		System.out.println("___________________________");
	}

}
