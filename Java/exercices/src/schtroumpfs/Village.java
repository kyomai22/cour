package schtroumpfs;

public class Village {

	public static void main(String[] args) {
		Schtroumpfs basique=new Schtroumpfs();
		GrandSchtroumpfs grand=new GrandSchtroumpfs("Grand Schtroumpfs");
		Schtroumpfette fille=new Schtroumpfette("Schtroumpfette");
		SchtroumpfPeureux peureux=new SchtroumpfPeureux("Schtroumpf Peureux");
		SchtroumpfsNoir noir=new SchtroumpfsNoir("Schtroumpfs Noir");
		Schtroumpfs village[]=new Schtroumpfs[100];


		//		System.out.println(basique.getNom());
		//		basique.dessine();
		//		basique.parle();
		//		
		//		System.out.println(grand.getNom());
		//		grand.dessine();
		//		grand.chef();
		//		grand.parle();
		//		
		//		System.out.println(fille.getNom());
		//		fille.dessine();
		//		fille.shopping();
		//		fille.parle();
		//		
		//		System.out.println(peureux.getNom());
		//		peureux.dessine();
		//		peureux.peur();
		//		peureux.parle();
		//		
		//		System.out.println(noir.getNom());
		//		noir.dessine();
		//		noir.mord();
		//		noir.parle();

		village[0]=new GrandSchtroumpfs();
		village[1]=new Schtroumpfette();
		village[2]=new SchtroumpfPeureux();
		village[3]=new SchtroumpfsNoir();

		for(int i=0;i<village.length;i++){
			village[i].dessine();
			village[i].parle();
			if(village[i]instanceof GrandSchtroumpfs){
				((GrandSchtroumpfs)village[1]).chef();
			}
		}
	}

}
