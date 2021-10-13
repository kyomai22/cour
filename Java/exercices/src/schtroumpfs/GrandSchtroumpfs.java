package schtroumpfs;

public class GrandSchtroumpfs extends Schtroumpfs {
	
	public static Object[] village;
	public void chef(){
		System.out.println("Lui c'est le chef");
	}
	public void dessine(){
		System.out.println("Il a un bonnet rouge et un belle barbe");
	}
	
	public GrandSchtroumpfs(String nom){
		this.setNom(nom);
	}
	public GrandSchtroumpfs(){
		
	}
}
