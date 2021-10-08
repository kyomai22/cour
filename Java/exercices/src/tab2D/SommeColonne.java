package tab2D;

import java.util.Random;

public class SommeColonne {

	public static void main(String[] args) {

		//		Créez un tableau de 3 lignes et 4 colonnes. 
		//		Remplissez ce tableau avec des nombres aléatoires.
		//		Ensuite, affichez le contenu du tableau. 
		//		Ensuite calculer et afficher le total de chaque colonne

		//		Random r=new Random();
		//		int nb, cpt=0;
		//		
		//		
		//		
		//		for(cpt=0;cpt<10;cpt++){
		//			nb=r.nextInt(30);
		//			tab[cpt]=nb;
		//			System.out.print(" ");
		//			System.out.print(tab[cpt]);

		int [][]tab=new int[3][4];
		Random r=new Random();
		int nb=0,somme1=0,somme2=0,somme3=0,somme4=0;

		for (int i=0;i<tab.length;i++){
			for(int y=0;y<tab[0].length;y++){
				nb=r.nextInt();
				tab[i][y]=nb;
			}
		}
		for (int i=0;i<tab.length;i++){
			System.out.println("");
			System.out.println("");
			System.out.println("");
			for(int y=0;y<tab[0].length;y++){
				System.out.print(tab[i][y]+"\t");
			}
		}
		for(int y=0;y<tab.length;y++){
			somme1=tab[y][0]+tab[y][0];

		}
		for(int y=0;y<tab.length;y++){
			somme2=tab[y][1]+tab[y][1];

		}
		for(int y=0;y<tab.length;y++){
			somme3=tab[y][2]+tab[y][2];

		}
		for(int y=0;y<tab.length;y++){
			somme4=tab[y][3]+tab[y][3];

		}	
		System.out.println("");
		System.out.println("");
		System.out.print(somme1+"\t");
		System.out.print(somme2+"\t");
		System.out.print(somme3+"\t");
		System.out.print(somme4+"\t");
	}
}

