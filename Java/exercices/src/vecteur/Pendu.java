package vecteur;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pendu {
	public static final String ANSI_RESET = "\u001B[0m";	// ceci sert a avoir des "balises" de couleur pour l'affichage dans la console
	public static final String ANSI_RED = "\u001B[31m";		// on les places dans le print comme ca (ANSI_RED+"Mon joli texte"+ANSI_RESET)
	public static final String ANSI_GREEN = "\u001B[32m";	// RESET sert a revenir a la valeur par défaut de l'affichage, si on ne le met pas
	public static final String ANSI_YELLOW = "\u001B[33m";	// La boucle en court sera entierement dans la couleur de la derniere balise mais pas la suivante
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static void main(String[] args) {

		String[] fruit = {"pomme", "orange", "papaye", "kiwi", "poire", "banane", "mangue", "cerise", "prune", "nectarine", "peche", "citron","FruitDuDragon","melon","duran","lichi"};
		char[] tab, score;
		char lettre;
		String mot, under = "";
		Random r = new Random();
		int nb = 0, i = 0, vie = 6, victoire = 0, fin=0;
		boolean trouver = false;

		while(fin==0){
		nb = r.nextInt(fruit.length);                                                                //cette partie me permet de déterminer quel nom de fruit vas etre pris dans le tableau, et ensuite
		System.out.println(ANSI_BLUE + "Devinez un mot sur le theme des fruits : " + ANSI_RESET);    //conaitre la longueur du mot pour pouvoir faire l'affichage initial dans la boucle en
		mot = fruit[nb];                                                                            //dessous.
		tab = mot.toCharArray();
		score = new char[tab.length];
		//System.out.println((ANSI_YELLOW)+ Arrays.toString(tab) +(ANSI_RESET)); a supprimer pour les test uniquement
		for (i = 0; i < tab.length; i++) {
			score[i] = '_';
		}
		for (int b = 0; b < tab.length; b++) {
			System.out.print(score[b] + " ");
		}
		System.out.println("");
		victoire = i;
		System.out.println(victoire);
		while (vie != 0 && victoire != 0) {
			lettre = (new Scanner(System.in)).nextLine().charAt(0);

			for (int y = 0; y < tab.length; y++) {

				if (lettre == tab[y]) {			//cette partie sert a vérifier si lettre est contenue dans le tableau tab, si c'est le cas alors il va positionner la lettre entrée dans le tableau
					trouver = true;
					if(lettre !=score[y]) {
						score[y] = lettre;            //score, retire -1 a la variable score (la victoire est donnée quand le compteur arrive a 0) et fait passer trouver a TRUE
						victoire--;
					}

				}
			}
			for (int b = 0; b < tab.length; b++) {
				System.out.print(ANSI_PURPLE + score[b] + " ");

			}
			System.out.println("");

			if (!trouver) {						//ici si une bonne lettre n'a pas été trouvée la variable trouver reste false et donc enleve -1 a vie (il y'en a 6 de base) la partie
				if (vie == 6) {					// s'arrete si on arrive a 0 vie, et par niveau de vie restante on a un affichage du pendu différente
					System.out.println(ANSI_YELLOW + "__________________");
					System.out.println("|          |");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
				}


				if (vie == 5) {
					System.out.println(ANSI_YELLOW + "__________________        ");
					System.out.println("|          |              ");
					System.out.println("|        " + ANSI_CYAN + "______        " + ANSI_RESET);
					System.out.println(ANSI_YELLOW + "|       " + ANSI_CYAN + "|      |          " + ANSI_RESET);
					System.out.println(ANSI_YELLOW + "|       " + ANSI_CYAN + "|______|          " + ANSI_RESET);
					System.out.println(ANSI_YELLOW + "|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");


				}
				if (vie == 4) {
					System.out.println(ANSI_YELLOW + "__________________       ");
					System.out.println("|          |             ");
					System.out.println("|        " + ANSI_CYAN + "______" + ANSI_YELLOW + "          ");
					System.out.println("|       " + ANSI_CYAN + "|      |" + ANSI_YELLOW + "         ");
					System.out.println("|       " + ANSI_CYAN + "|______|" + ANSI_YELLOW + "         ");
					System.out.println("|           " + ANSI_CYAN + "|" + ANSI_YELLOW + "            ");
					System.out.println("|           " + ANSI_CYAN + "|_______" + ANSI_YELLOW + "     ");
					System.out.println("|");
					System.out.println("|");

				}
				if (vie == 3) {
					System.out.println(ANSI_YELLOW + "__________________       ");
					System.out.println("|          " + ANSI_CYAN + "|" + ANSI_YELLOW + "             ");
					System.out.println("|        " + ANSI_CYAN + "______" + ANSI_YELLOW + "          ");
					System.out.println("|       " + ANSI_CYAN + "|      |" + ANSI_YELLOW + "         ");
					System.out.println("|       " + ANSI_CYAN + "|______|" + ANSI_YELLOW + "         ");
					System.out.println("|           " + ANSI_CYAN + "|" + ANSI_YELLOW + "            ");
					System.out.println("|  " + ANSI_CYAN + "________ | _______" + ANSI_YELLOW + " ");
					System.out.println("|");
					System.out.println("|");
				}
				if (vie == 2) {
					System.out.println(ANSI_YELLOW + "__________________       ");
					System.out.println("|          " + ANSI_CYAN + "|" + ANSI_YELLOW + "             ");
					System.out.println("|        " + ANSI_CYAN + "______" + ANSI_YELLOW + "          ");
					System.out.println("|       " + ANSI_CYAN + "|      |" + ANSI_YELLOW + "         ");
					System.out.println("|       " + ANSI_CYAN + "|______|" + ANSI_YELLOW + "         ");
					System.out.println("|           " + ANSI_CYAN + "|" + ANSI_YELLOW + "            ");
					System.out.println("|   " + ANSI_CYAN + "_______ | _______" + ANSI_YELLOW + "    ");
					System.out.println("|          " + ANSI_CYAN + "_|_" + ANSI_YELLOW + "           ");
					System.out.println("|         " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");
					System.out.println("|         " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");
					System.out.println("|         " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");
					System.out.println("|         " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");
					System.out.println("|         " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");

				}
				if (vie == 1) {
					System.out.println(ANSI_YELLOW + "__________________");
					System.out.println("|          |             ");
					System.out.println("|        " + ANSI_CYAN + "______" + ANSI_YELLOW + "            ");
					System.out.println("|       " + ANSI_CYAN + "|      |" + ANSI_YELLOW + "           ");
					System.out.println("|       " + ANSI_CYAN + "|______|" + ANSI_YELLOW + "           ");
					System.out.println("|           " + ANSI_CYAN + "|" + ANSI_YELLOW + "              ");
					System.out.println("|    " + ANSI_CYAN + "______ | ______" + ANSI_YELLOW + "       ");
					System.out.println("|          " + ANSI_CYAN + "_|_" + ANSI_YELLOW + "             ");
					System.out.println("|         " + ANSI_CYAN + "|   |" + ANSI_YELLOW + "           ");
					System.out.println("|         " + ANSI_CYAN + "|   |" + ANSI_YELLOW + "            ");
					System.out.println("|         " + ANSI_CYAN + "|   |" + ANSI_YELLOW + "           ");
					System.out.println("|         " + ANSI_CYAN + "|   |" + ANSI_YELLOW + "         ");
					System.out.println("|         " + ANSI_CYAN + "|   |" + ANSI_YELLOW + "        ");
				}
				for (int b = 0; b < tab.length; b++) {
					System.out.print(ANSI_PURPLE + score[b] + " ");
				}
				System.out.println("");
				vie--;

			}
			trouver = false;
			if (victoire == 0) {
				System.out.println(ANSI_GREEN + "\n" +			// ceci est l'affichage de la victoire et la défaite
						"\n" +
						" _   _ _      _                     _ \n" +
						"| | | (_)    | |                   | |\n" +
						"| | | |_  ___| |_ ___  _ __ _   _  | |\n" +
						"| | | | |/ __| __/ _ \\| '__| | | | | |\n" +
						"\\ \\_/ / | (__| || (_) | |  | |_| | |_|\n" +
						" \\___/|_|\\___|\\__\\___/|_|   \\__, | (_)\n" +
						"                             __/ |    \n" +
						"                            |___/     \n" +
						"\n" + ANSI_RESET);
			}
			if (vie == 0) {
				System.out.println(ANSI_RED + "\n" +
						"\n" +
						" _____   ___  ___  ___ _____   _____  _   _ ___________ \n" +
						"|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\\n" +
						"| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /\n" +
						"| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    / \n" +
						"| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\ \n" +
						" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_|\n" +
						"                                                        \n" +
						"                                                        \n" +
						"\n" + ANSI_RESET);
			}
		}
		System.out.println(ANSI_RED+	" ____________________ ");	//ici on a le menu pour quitter ou rejouer
		System.out.println(ANSI_RED+	"|"+ANSI_PURPLE+"Voulez vous rejouer?"+ANSI_RED+"|");
		System.out.println(ANSI_RED+	"|____________________|");
		System.out.println(ANSI_CYAN+	"Oui : 0			  ");
		System.out.println(				"Non : 1			  ");
		System.out.println(ANSI_RED+	"______________________");
			fin=(new Scanner(System.in)).nextInt();
			if (fin==0){
				vie=6;
				victoire=i;
			}
	}
		System.out.println(ANSI_CYAN+"\n" +	//ceci est le message de fin avant la fermeture du programme
				"\n" +
				"    _       _   _        ____    U _____ u__     __    U  ___ u           ____          _    \n" +
				"U  /\"\\  uU |\"|u| |    U |  _\"\\ u \\| ___\"|/\\ \\   /\"/u    \\/\"_ \\/  ___   U |  _\"\\ u     U|\"|u  \n" +
				" \\/ _ \\/  \\| |\\| |     \\| |_) |/  |  _|\"   \\ \\ / //     | | | | |_\"_|   \\| |_) |/     \\| |/  \n" +
				" / ___ \\   | |_| |      |  _ <    | |___   /\\ V /_,-.-,_| |_| |  | |     |  _ <        |_|   \n" +
				"/_/   \\_\\ <<\\___/       |_| \\_\\   |_____| U  \\_/-(_/ \\_)-\\___/ U/| |\\u   |_| \\_\\       (_)   \n" +
				" \\\\    >>(__) )(        //   \\\\_  <<   >>   //            \\\\.-,_|___|_,-.//   \\\\_      |||_  \n" +
				"(__)  (__)   (__)      (__)  (__)(__) (__) (__)          (__)\\_)-' '-(_/(__)  (__)    (__)_) \n" +
				"\n");
	}

}
