package vecteur;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		int []tab=new int[10];
		int cpt1=0,cpt2=0,nb=0,i=0;
		
		System.out.println("Entrez 10 nombres");
		
		for(cpt1=0;cpt1<10;cpt1++){
			nb=0;
			nb=(new Scanner(System.in)).nextInt();
			tab[cpt1]=nb;
		}
		while(cpt2<10){	
		System.out.print(tab[cpt2]+"\t");
		cpt2++;
	}
		System.out.println("");
		
		for(i=0; i< tab.length/2; i++){
	        int tmp = tab[i];
	        tab[i] = tab[tab.length-i-1];
	        tab[tab.length-i-1] = tmp;
	        
	    }
		cpt2=0;
		while(cpt2<10){	
			System.out.print(tab[cpt2]+"\t");
			cpt2++;
		}
			
			}
		

	}
