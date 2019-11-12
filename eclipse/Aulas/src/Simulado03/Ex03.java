package Simulado03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int mat[][] = new int[5][5];
		
		
		System.out.println("Vamos colocar os valores na matriz");
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				
				if (linha == coluna) {
					System.out.println("Diagonal principal, vc nao precisa dizer nada...");
					mat[linha][coluna] = 0;
				} else {
					System.out.print("Informe o valor para (" + linha + ", " + coluna + "): ");
					mat[linha][coluna] = in.nextInt();
				}
			}
		}
		
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(mat[linha][coluna] + "  ");
			}
			System.out.println();
		}
		
		
	}
	
}
