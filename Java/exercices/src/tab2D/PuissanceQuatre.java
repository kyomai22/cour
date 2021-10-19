package tab2D;

import java.util.Scanner;

public class PuissanceQuatre {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {

        String[][] grid = new String[6][7];
        String remplissage=ANSI_BLUE+"O";
        String j1=ANSI_RED+"X";
        String j2=ANSI_YELLOW+"@";
        int choix=0,victoire=0,equal=0;

        for (int i = 0; i < grid[0].length; i++) {
            for (int y = 0; y < grid.length; y++)
                grid[y][i] = remplissage;
        }
        System.out.println("1"+"\t"+"\t"+"2"+"\t"+"\t"+"3"+"\t"+"\t"+"4"+"\t"+"\t"+"5"+"\t"+"\t"+"6"+"\t"+"\t"+"7"+"\t"+"\t");
        for (int i = 0; i < grid.length; i++) {
            System.out.println("");
            System.out.println("");
            for (int y = 0; y < grid[0].length; y++) {
                System.out.print(grid[i][y] + "\t"+"\t");
            }
        }
        while (victoire==0 || equal==0) {
            System.out.println("");
            System.out.println(ANSI_RED+"Joueur Rouge entrez un chiffre de 1 a 7");
            choix=(new Scanner(System.in)).nextInt();
        }
    }
}