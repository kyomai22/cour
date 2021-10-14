package schtroumpfs;

public class Schtroumpfs {

	private static int nb=0;
	private String nom="Schtroumpfs";

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Schtroumpfs(){
		setNb(getNb() + 1);
	}
	public Schtroumpfs(String nom){
		this.setNom(nom);
		setNb(getNb() + 1);
	}
	public void parle(){
		System.out.println("Il parle normalement");
		System.out.println("____________________");
		System.out.println("");
	}
	public void dessine(){
		System.out.println("Un Schtroumpfs tout banal");
	}
	public static int getNb() {
		return nb;
	}
	public static void setNb(int nb) {
		Schtroumpfs.nb = nb;
	}
}
