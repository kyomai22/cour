package tab2D;

import java.util.Scanner;

public class PuissanceQuatre {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        String[][] grid = new String[6][7];
        String remplissage = ANSI_BLUE +"O";
        String j1 = ANSI_RED + "X";
        String j2 = ANSI_YELLOW + "@";
        String test;
        int choix = 0, victoire = 0, equal = 0, cinq=5;

        for (int i = 0; i < grid[0].length; i++) {
            for (int y = 0; y < grid.length; y++)
                grid[y][i] = remplissage;
        }
        System.out.println("0" + "\t" + "\t" + "1" + "\t" + "\t" + "2" + "\t" + "\t" + "3" + "\t" + "\t" + "4" + "\t" + "\t" + "5" + "\t" + "\t" + "6" + "\t" + "\t");
        for (String[] item : grid) {
            System.out.println("");
            System.out.println("");
            for (int y = 0; y < grid[0].length; y++) {
                System.out.print(item[y] + "\t" + "\t");
            }
        }
        while (victoire == 0 || equal == 0) {
            System.out.println("");
            System.out.println(ANSI_RED + "Joueur Rouge entrez un chiffre de 0 a 6");
            choix = (new Scanner(System.in)).nextInt();
            while (!grid[cinq][choix].equals(ANSI_BLUE + "O")) {
                cinq--;
            }
            for (int i = 0; i < grid.length; i++) {
                for (int y = 0; y < grid[0].length; y++) {
                    //rajouter if ici
                    if (grid[cinq][choix].equals(ANSI_BLUE + "O")) {
                        grid[cinq][choix] = j1;
                        break;
                    }
                }

            }
            cinq=5;
            System.out.println("0" + "\t" + "\t" + "1" + "\t" + "\t" + "2" + "\t" + "\t" + "3" + "\t" + "\t" + "4" + "\t" + "\t" + "5" + "\t" + "\t" + "6" + "\t" + "\t");
            for (String[] value : grid) {
                System.out.println("");
                System.out.println("");
                for (int y = 0; y < grid[0].length; y++) {
                    System.out.print(value[y] + "\t" + "\t");
                }
            }
            System.out.println("");
            System.out.println(ANSI_YELLOW + "Joueur Jaune entrez un chiffre de 0 a 6");
            choix = (new Scanner(System.in)).nextInt();
            while (!grid[cinq][choix].equals(ANSI_BLUE + "O")) {
                cinq--;
            }
            for (int i = 0; i < grid.length; i++) {
                for (int y = 0; y < grid[0].length; y++) {

                    if (grid[cinq][choix].equals(ANSI_BLUE + "O")) {
                        grid[cinq][choix] = j2;
                    }
                }
                }
            for (String[] strings : grid) {
                System.out.println("");
                System.out.println("");
                for (int y = 0; y < grid[0].length; y++) {
                    System.out.print(strings[y] + "\t" + "\t");
                }
            }
            cinq=5;
            }
        }
    }