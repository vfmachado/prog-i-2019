package Trimestre_3.RevisaoAvaliacao.t102;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//17:04
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int[10];
		
		System.out.println("Informe os 10 valores");
		for (int i = 9; i >= 0; i--) {
			vet[i] = in.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe uma posicao");
			int pos = in.nextInt();
			
			System.out.println("O valor nesta posicao é: " + vet[pos]);
		}
	}
	//17:06
}
