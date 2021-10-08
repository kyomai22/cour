package tab2D;

import java.util.Scanner;

public class TableauDiagonale {

	public static void main(String[] args) {
		
//		Ecrivez un programme qui demande � l�utilisateur � Nombre de lignes/colonnes �. Cr�ez un tableau 
//		avec ce nombre de lignes et colonnes (matrice carr�e). Vous devez remplir les cellules du tableau 
//		avec ce nombre. Vous affichez le tableau. Ensuite, vous devez mettre 0 dans chaque cellule de la diagonale secondaire et principale du tableau 
//		et affichez le r�sultat.
		
		int tab[][];
		int nb=0;
		
		System.out.println("Nombre de lignes/colonnes");
		nb=(new Scanner(System.in)).nextInt();
		
		tab=new int [nb][nb];
		
		for(int i=0;i<tab.length;i++){
			for(int y=0;y<tab[0].length;y++){
				tab[i][y]=tab[i][y]+nb;
			}
		}
		for(int i=0;i<tab.length;i++){
			tab[i][i]=0;
			tab[i][tab.length-1-i]=0;
		}
		for(int i=0;i<tab.length;i++){
			System.out.println("");
			System.out.println("");
			System.out.println("");
			for(int y=0;y<tab[0].length;y++){
				System.out.print(tab[i][y]+"\t");
			}
		}
		
		

	}

}
