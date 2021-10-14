package schtroumpfs;

public class Village {

	public static void main(String[] args) {
		Schtroumpfs village[]=new Schtroumpfs[100];

		Schtroumpfs basique=new Schtroumpfs();
		System.out.println(basique.getNom());
		basique.dessine();
		System.out.println("nb de schtroumpf: "+Schtroumpfs.getNb());
		basique.parle();

		GrandSchtroumpfs grand=new GrandSchtroumpfs("Grand Schtroumpfs");
		System.out.println(grand.getNom());
		grand.dessine();
		grand.chef();
		System.out.println("nb de schtroumpf: "+Schtroumpfs.getNb());
		grand.parle();

		Schtroumpfette fille=new Schtroumpfette("Schtroumpfette");
		System.out.println(fille.getNom());
		fille.dessine();
		fille.shopping();
		System.out.println("nb de schtroumpf: "+Schtroumpfs.getNb());
		fille.parle();

		SchtroumpfPeureux peureux=new SchtroumpfPeureux("Schtroumpf Peureux");
		System.out.println(peureux.getNom());
		peureux.dessine();
		peureux.peur();
		System.out.println("nb de schtroumpf: "+Schtroumpfs.getNb());
		peureux.parle();

		SchtroumpfsNoir noir=new SchtroumpfsNoir("Schtroumpfs Noir");
		System.out.println(noir.getNom());
		noir.dessine();
		noir.mord();
		System.out.println("nb de schtroumpf: "+Schtroumpfs.getNb());
		noir.parle();

		//		village[0]=new GrandSchtroumpfs();
		//		village[1]=new Schtroumpfette();
		//		village[2]=new SchtroumpfPeureux();
		//		village[3]=new SchtroumpfsNoir();
		//
		//		for(int i=0;i<village.length;i++){
		//			village[i].dessine();
		//			village[i].parle();
		//			if(village[i]instanceof GrandSchtroumpfs){
		//				((GrandSchtroumpfs)village[1]).chef();
		//			}
		//		}
	}

}
