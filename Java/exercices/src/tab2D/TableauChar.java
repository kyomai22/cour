package tab2D;

import java.util.Scanner;

public class TableauChar {

	public static void main(String[] args) {
		String [][] tab={
				{"a","a","a","a"},
				{"b","a","b","a"},
				{"c","a","c","a"},
				{"d","a","d","a"},
				{"e","a","e","a"},
		};
		String input=("");

		input=(new Scanner(System.in)).nextLine();
		for(int i=0;i<tab[0].length;i++){
			tab[0][i]=input;
		}
			for(int y=0;y<tab.length;y++){
				tab[y][2]=input;
				tab[y][0]=input;

		}
		for(int i=0;i<tab.length;i++){
			System.out.println("");
			System.out.println("");
			for(int y=0;y<tab[0].length;y++){
				System.out.print(tab[i][y]+"\t");
			}
		}
	}

}
