package vecteur;

public class VecteurInit2 {

	public static void main(String[] args) {
		//Ecrire un programme qui remplit un vecteur de 20 ?l?ments  avec les nombres pairs de 0 ? 38 et qui 
		//l?affiche sur 4 lignes (5 ?l?ments par ligne)
		
		int []tab=new int[20];
		int nb=0,cpt=0,cpt1=0, cpt2=0,cpt3=0,mod=0;
		
		
		while (cpt3!=20){
		while (cpt1!=4){
			cpt=0;
			
			while (cpt!=5){
				cpt2=0;
					while (cpt2!=1){
						nb=mod%2-1;
						mod++;
						if(nb==0){
							cpt2++;
						}
					}
					tab[cpt3]=mod;
				System.out.print(tab[cpt3]-2);
				System.out.print("	");
				cpt++;
			}
			System.out.println("");
			
			cpt1++;
		}
		cpt3++;
		}
		
		
		
	}

}

