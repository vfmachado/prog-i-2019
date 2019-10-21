package Trimestre_3.RevisaoAvaliacao.t102;

import java.util.Scanner;

public class Ex4 {

	//17:08
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int[20];
		System.out.println("Informe os 20 valores");
		for (int i = 0; i < 20; i++) {
			vet[i] = in.nextInt();
		}
		
		while (true) {
			
			//troca o valor de duas posições
			int posA;
			int posB;
			int aux;
			
			System.out.println("\n\nInforme as duas posicoes");
			posA = in.nextInt();
			posB = in.nextInt();
			
			aux = vet[posA];
			vet[posA] = vet[posB];
			vet[posB] = aux;
			
			
			//mostra o vetor
			for (int i = 0; i < 20; i++) {
				System.out.print(vet[i] + "\t");
			}
			
		}
		
	}
	//17:13
}
