package Simulado02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10];
		
		System.out.println("Informe 10 números");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		
		//valores pares
		System.out.println("Os números pares são: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\nOs números ímpares são: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 1) {
				System.out.print(vetor[i] + " ");
			}
		}
	}

}
