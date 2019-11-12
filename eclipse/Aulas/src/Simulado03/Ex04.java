package Simulado03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int mat[][] = new int[5][5];
		
		int lin = 2;
		int col = 2;
		mat[2][2] = 5;
		
		
		while (true) {
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(mat[linha][coluna] + "  ");
			}
			System.out.println();
		}
		
		char letra = in.next().charAt(0);
		
		switch(letra) {
		case 'w':
			mat[lin][col] = 0;
			lin--;
			mat[lin][col] = 5;
			break;
		
		case 'a':
			mat[lin][col] = 0;
			col--;
			mat[lin][col] = 5;
			break;
		
		case 's':
			mat[lin][col] = 0;
			lin++;
			mat[lin][col] = 5;
			break;
		
		case 'd':
			mat[lin][col] = 0;
			col++;
			mat[lin][col] = 5;
			break;
		
		}
		
		}
		
	}

}
