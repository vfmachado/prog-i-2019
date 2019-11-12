package Simulado03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10];
		
		System.out.println("Informe os 10 valores: ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		
		System.out.println("Qual o número escolhido? ");
		int escolhido = in.nextInt();
		
		int qtdMenores = 0, qtdMaiores = 0, qtdIguais = 0;
		
		for (int i = 0; i < 10; i++) {
			if (vetor[i] < escolhido) {
				qtdMenores++;
			} else if (vetor[i] == escolhido) {
				qtdIguais++;
			} else {
				qtdMaiores++;
			}
		}
			
		System.out.println("Existem " + qtdMenores + " valores menores que " + escolhido);
		System.out.println(qtdIguais + " valores são iguais");
		System.out.println("Existem " + qtdMaiores + " valores maiores que " + escolhido);
		
	}

}
