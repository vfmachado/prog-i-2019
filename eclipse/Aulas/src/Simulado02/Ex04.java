package Simulado02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int mat[][] = new int[5][5];
		
		for (int linha = 0; linha < 5; linha++) {
			System.out.println("Informe o valor da mat de tamanho 5 para linha " + linha);
			for (int coluna = 0; coluna < 5; coluna++) {
				mat[linha][coluna] = in.nextInt();
			}
		}
		
		System.out.println("SUA MATRIZ:");
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(mat[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Qual a soma desejada?");
		int valorProcurado = in.nextInt();
		
		for (int linha = 0; linha < 5; linha++) {
			
			int soma = 0;
			for (int coluna = 0; coluna < 5; coluna++) {
				soma = soma + mat[linha][coluna];
			}
			
			if (soma == valorProcurado) {
				System.out.println("Linha: " + linha);
			}
			
		}
		
	}

}
