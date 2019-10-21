package Trimestre_3.RevisaoAvaliacao.t101;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		//14:00
		Scanner in = new Scanner(System.in);
		int vet[] = new int[10];
		
		System.out.println("Informe os 10 valores para preenchimento do vetor");
		for (int i = 0; i < 10; i++) {
			vet[i] = in.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe uma posição");
			int posicao = in.nextInt();
			System.out.println("O valor na posição é " + vet[posicao]);
		}
		
	}
	
	//14:02

}
