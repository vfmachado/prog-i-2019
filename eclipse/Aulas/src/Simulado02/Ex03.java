package Simulado02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int mat1[][] = new int[2][3];
		int mat2[][] = new int[2][3];
		
		int resultado[][] = new int[2][3];
		
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Informe o valor da mat1 para linha " + linha + " e coluna " + coluna);
				mat1[linha][coluna] = in.nextInt();
			}
		}

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Informe o valor da mat2 para linha " + linha + " e coluna " + coluna);
				mat2[linha][coluna] = in.nextInt();
			}
		}

		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				resultado[linha][coluna] = mat1[linha][coluna] + mat2[linha][coluna];
				System.out.print(resultado[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}

}
