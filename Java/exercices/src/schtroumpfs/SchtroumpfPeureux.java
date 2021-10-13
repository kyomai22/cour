package schtroumpfs;

public class SchtroumpfPeureux extends Schtroumpfs {
	
	public void peur(){
		System.out.println("Il est pas vraiment du genre courageux");
	}
	public SchtroumpfPeureux(String nom){
		this.setNom(nom);
	}
	public SchtroumpfPeureux(){
		
	}
}
