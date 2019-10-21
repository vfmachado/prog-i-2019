package Trimestre_3.RevisaoAvaliacao.t101;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		//14:04
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int[20];
		System.out.println("Informe os 20 valores para preenchimento do vetor");
		for (int i = 0; i < 20; i++) {
			vet[i] = in.nextInt();
		}
		
		
		while (true) {
			
			int posA;
			int posB;
			int valor;
			
			System.out.println("Informe as duas posicoes para troca");
			posA = in.nextInt();
			posB = in.nextInt();
			
			valor = vet[posA];
			vet[posA] = vet[posB];
			vet[posB] = valor;
			
			for (int i = 0; i < 20; i++) {
				System.out.println(vet[i] + "\t");
			}
			
		}
		//14:11
		
	}

}
