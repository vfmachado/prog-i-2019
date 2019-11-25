package AvII_101;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		//ler os dados para o vetor
		System.out.println("Informe 10 valores");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			
			if (vetor[i] % 2 == 0) {
				vetor[i] = 1;
			} else {
				vetor[i] = -1;
			}
			
			System.out.println(vetor[i]);
		}
		
		
		
	}

}
