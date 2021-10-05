package vecteur;

public class VecteurIniit2SansVecteur {

	public static void main(String[] args) {
		int nb=0,cpt=0,cpt1=0, cpt2=0,mod=0;
		
		
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
				System.out.print(mod-2);
				System.out.print("	");
				cpt++;
			}
			System.out.println("");
			
			cpt1++;
		}
				
	}

}
