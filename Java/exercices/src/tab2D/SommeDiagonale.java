package tab2D;

import java.util.Random;

public class SommeDiagonale {

	public static void main(String[] args) {
		int [][]tab=new int[4][4];
		Random r=new Random();
		int somme1=0,somme2=0;
		
		for(int i=0;i<tab.length;i++){
			for(int y=0;y<tab[0].length;y++){
				tab[i][y]=r.nextInt();
			}
		}
		
		for(int i=0;i<tab.length;i++){
			System.out.println("");
			System.out.println("");
			System.out.println("");
			for(int y=0;y<tab[0].length;y++){
				System.out.print(tab[i][y]+"\t");
			}
		}
		for(int i=0;i<tab.length;i++){
			somme1=tab[i][i];
			somme2=tab[i][tab.length-1-i];
		}
		System.out.println("");
		System.out.println("");
		System.out.println("La somme de la premiere diagonale :"+"\t"+somme1);
		System.out.println("La somme de la deuxieme diagoale :"+"\t"+somme2);

	}

}
