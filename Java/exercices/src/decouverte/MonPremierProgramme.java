package decouverte; //dossier découverte

public class MonPremierProgramme { // une classe = programme
	// convention java : nom d'une classe ainsi que les mots dans  ce nom
	// doivent commencer par une majuscule

	public static void main(String[] args) {
		// ici on écrit le code java
		
		// var : nb:Num<-10
		int nb=10; // déclaration d'une variable entière
		
		System.out.print("Bonjour, j'aime java");
		// afficher "il fait soleil!" sans retour a la ligne
		System.out.print("il fait soleil");
		// afficher "bonjour j'aime java"
		System.out.println("Bonjour, j'aime java");
		// afficher "il fait soleil!"
		System.out.println("il fait soleil");
		// afficher "bonjour j'aime java" sans retour a la ligne

		
		System.out.println("\nnb=" + nb); // \najoute un retour à laligne
		
		// le + concatène la chaine sz caractères au contenu
		// de la variable converti en String
		// syso avec CTRL et barre d'espace pour génerer System.out.println();
		System.out.println();
	}

}
