package tab2D;

public class Tableau2D {

	public static void main(String[] args) {
		//Ecrire le programme qui initialise un tableau de 5 colonnes et 4 lignes avec des nombres compris 
		//entre 10 et 20 et qui affiche tous les ?l?ments du tableau.
		
		int [][]tab=new int[5][4];
		int nb=10;
		
		for(int i=0;i<tab.length;i++){
			for(int y=0;y<tab[0].length;y++){
				tab[i][y]=nb;
				nb++;
				if(nb>20){
					nb=10;
				}
			}
		}
		for(int i=0;i<tab.length;i++){
			System.out.println("");
			for(int y=0;y<tab[0].length;y++){
				System.out.print(tab[i][y]+" ");
			}
		}
	}

}
