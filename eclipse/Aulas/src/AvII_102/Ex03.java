package AvII_102;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float[][] mat = new float[5][5];
		
		System.out.println("Informe os valores da matriz");
		for (int lin = 0; lin < 5; lin++) {
			for (int col = 0; col < 5; col++) {
				mat[lin][col] = in.nextFloat();
			}
		}
		
		System.out.println("Informe os valores da linha e coluna desejados");
		int linha = in.nextInt();
		int coluna = in.nextInt();
		
		float soma = 0;
		
//		for (int a = 0; a < 5; a++) {
//			soma += mat[linha][a] + mat[a][coluna];
//		}

		//soma os elementos da mesma linha
		for (int c = 0; c < 5; c++) {
			soma = soma + mat[linha][c];
		}
		
		//soma os elementos da mesma coluna
		for (int l = 0; l < 5; l++) {
			soma = soma + mat[l][coluna];
		}

		
		System.out.println(soma);
	}

}
