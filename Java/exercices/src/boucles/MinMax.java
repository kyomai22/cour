package boucles;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        //Ecrire le programme qui lit une s?rie de nombres (la s?rie est termin?e lorsque l?on tape 0). Afficher 
        //le plus grand nombre lu ainsi que le nombre de fois que ce nombre a ?t? tap?. Idem avec le plus 
        //petit.
        int nb1=1,petit=0,grand=0,tmp=1;
        
        System.out.println("Entrez auntant de chiffres que vous voulez.");
        System.out.println("Finissez avec 0");
        
        while (nb1!=0){
            nb1=1;
            nb1=(new Scanner(System.in)).nextInt();
            
            if(nb1>tmp){
                grand=nb1;
            }
            if(nb1!=0){
            	if(nb1<=tmp){
            		petit=nb1;
            }}
            
            tmp=nb1;
            
        }
        System.out.println("Le plus petit nombre rentrer est: "+petit);
        System.out.println("Le plus grand nombre rentrer est: "+grand);
    }

}