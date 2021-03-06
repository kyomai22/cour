package poo;

public class WagonMarchandise extends Wagon {
	private boolean couvert=false;
	private boolean citerne=false;
	private int tare;
	public boolean getCouvert() {
		return couvert;
	}
	public void setCouvert(boolean couvert) {
		this.couvert = couvert;
	}
	public boolean getCiterne() {
		return citerne;
	}
	public void setCiterne(boolean citerne) {
		this.citerne = citerne;
	}
	public int getTare() {
		return tare;
	}
	public void setTare(int tare) {
		if(tare<=0)
			tare=200;
		this.tare = tare;
	}
	public void affiche() {
		System.out.println("mon super wagon de marchandise");
		if(couvert)
			System.out.println("couvert");
		else
			System.out.println("pas couvert");

		if(citerne)
			System.out.println("avec citerne");
		else
			System.out.println("pas de citerne");
		System.out.println("de tare "+tare);
		if(getBiDirection())
			System.out.println("bidirectionnel");
		else
			System.out.println("pas bidirectionnel");
	}
}
