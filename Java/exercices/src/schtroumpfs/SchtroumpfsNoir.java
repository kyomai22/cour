package schtroumpfs;

public class SchtroumpfsNoir extends Schtroumpfs {
	public void dessine(){
		System.out.println("Il ressemble a un Schtroumpfs normal mais a la peau noire charbon");
	}
	public void parle(){
		System.out.println("Il parle pas vraiment, il crie aggressivement");
		System.out.println("_____________________________________________");
	}
	public void mord(){
		System.out.println("Il mord tout ce qui s'approche de lui");
	}
	public SchtroumpfsNoir(String nom){
		this.setNom(nom);
	}
	public SchtroumpfsNoir(){
		
	}
}
