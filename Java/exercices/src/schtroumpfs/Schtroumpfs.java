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
		nb++;
	}
	public Schtroumpfs(String nom){
		this.setNom(nom);
		nb++;
	}
	public void parle(){
		System.out.println("Il parle normalement");
		System.out.println("____________________");
		System.out.println("");
	}
	public void dessine(){
		System.out.println("Un Schtroumpfs tout banal");
	}
}
