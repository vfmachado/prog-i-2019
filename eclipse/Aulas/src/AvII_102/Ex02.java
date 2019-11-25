package AvII_102;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		//preenchendo o vetor
		System.out.println("Informe os valores");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		
		//trocar os valores pares por 1 e ímpares por -1
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				vetor[i] = 1;
			} else {
				vetor[i] = -1;
			}
		}
		
		//mostrando o vetor
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		
	}
	
}
