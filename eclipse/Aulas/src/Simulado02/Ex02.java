package Simulado02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[8];
		
		System.out.println("Informe 8 números");
		for (int i = 0; i < 8; i++) {
			vetor[i] = in.nextInt();
		}
		
		
		while (true) {
			System.out.println("Valor de X procurado: ");
			int x = in.nextInt(); 
			
			if (x == -1) {
				break;
			}
			int achei = 0;
			for (int i = 0; i < 8; i++) {
				if (vetor[i] == x) {
					System.out.println("Encontrado na posição " + i);
					achei = 1;
				}
			}
			
			if (achei == 0) {
				System.out.println("Valor não encontrado");
			}
		}
		
		System.out.println("FIM");
	}

}
