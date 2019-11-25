package AvII_101;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float[][] mat = new float[5][5];
		float soma = 0;
		
		System.out.println("Informe os elementos da matriz");
		for (int lin = 0; lin < 5; lin++) {
			for (int col = 0; col < 5; col++) {
				mat[lin][col] = in.nextFloat();
			}
		}
		
		System.out.println("Informe uma Linha e uma Coluna");
		int linEscolhida = in.nextInt();
		int colEscolhida = in.nextInt();
		
		//soma da linha e coluna
		//for (int a = 0; a < 5; a++) {
		//	soma = soma + mat[linEscolhida][a] + mat[a][colEscolhida];
		//}
		
		//soma da linha
		for (int a = 0; a < 5; a++) {
			soma = soma + mat[linEscolhida][a];
		}
			
		//soma da coluna
		for (int a = 0; a < 5; a++) {
			soma = soma + mat[a][colEscolhida];
		}
		
		System.out.println("A soma é: " + soma);
	}

}
