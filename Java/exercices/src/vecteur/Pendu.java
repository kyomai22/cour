package vecteur;

import java.util.Random;
import java.util.Scanner;

public class Pendu {

	public static void main(String[] args) {
		String []fruit={"pomme","orange","papaye","kiwi","poire","banane","mangue","cerise","prune","nectarine","peche"};
		char[] tab;
		char lettre;
		String mot;
		Random r=new Random();
		int nb=0, i=0, vie=8, victoire=0;
		boolean trouver=false;

		nb=r.nextInt(fruit.length);											//cette partie me permet de déterminer que nom de fruit vas etre pris dans le tableau, et ensuite 
		System.out.println("Devinez un mot sur le theme des fruits : ");	//conaitre la longueur du mot pour pouvoir faire l'affichage initial dans la boucle en
		mot=fruit[nb];														//dessous.
		tab=mot.toCharArray();
		System.out.println(tab);//a supprimer pour les test uniquement
		for(i=0;i<tab.length;i++){
		}
		System.out.print(".");
		System.out.println("");
		victoire=i;
		System.out.println(victoire);
		while(vie!=0 && victoire!=0){
			lettre=(new Scanner(System.in)).nextLine().charAt(0);

			for(int y=0;y<tab.length;y++){
				trouver=false;
				if(lettre==tab[y]){
					victoire--;
					trouver=true;
					System.out.println("yep");		
				}
			}
			if (trouver==false){
				vie--;
				System.out.println("AHAH");
			}
			if(victoire==0){
				System.out.println("V I C T O R Y !");
			}
			if(vie==0){
				System.out.println("G A M E  O V E R");
			}
		}

	}

}
