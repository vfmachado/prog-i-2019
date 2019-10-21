package Trimestre_3.t102.aula_21_10;

import java.util.Scanner;

public class Matrizes02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][] campo = new int[10][8];
		
		while (true) {
		
		for (int linha = 0; linha < 10; linha++) {
			
			for (int coluna = 0; coluna < 8; coluna++) {
				if (campo[linha][coluna] == 0) {
					System.out.print("__ ");
				} else {
					System.out.print(campo[linha][coluna] + " ");
				}
				
			}
			System.out.println();
		}
		
			System.out.println("Informe duas posicoes (linha e coluna) e um valor");
			int linha = in.nextInt();
			int coluna = in.nextInt();
			int valor = in.nextInt();
			
			campo[linha][coluna] = valor;
			
			System.out.println("++++++++++++++++\n\n");
			
		}
		
	}

}
