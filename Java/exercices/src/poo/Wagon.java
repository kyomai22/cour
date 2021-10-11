package poo;

public class Wagon {
	private int nbEssieux;
	private boolean biDirection=false;
	public int getNbEssieux() {
		return nbEssieux;
	}
	public void setNbEssieux(int nbEssieux) {
		if(nbEssieux<=0)
			nbEssieux=6;
		this.nbEssieux=nbEssieux;
	}
	public boolean getBiDirection() {
		return biDirection;
	}
	public void setBiDirection(boolean biDirection) {
		this.biDirection = biDirection;
	}
	public void affiche(){
		System.out.println();
	}


}
