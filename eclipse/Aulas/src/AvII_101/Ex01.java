package AvII_101;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//	1 2 3 4 4
		
		// 1
			// 1 2 3 4 4
		
		// 2
			// 1 2 3 4 4
		
		// 3
			// 1 2 3 4 4

		Scanner in = new Scanner(System.in);
		int vetor[] = new int[10];
		
		//ler os dados para o vetor
		System.out.println("Informe 10 valores");
		
		// i começa com 0
		// 0 < 10 ? SIM ... se sim... executa tudo que está dentro
		
		//final do for i++ <=> i = i + 1
		//					   i = 0 + 1 = 1
		
		// i = 1; 1 < 10 ?
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
			//vetor[0] = in.nextInt();
			//vetor[1] = in.nextInt();
			//vetor[2] = in.nextInt();
			//vetor[3] = in.nextInt();
			//vetor[4] = in.nextInt();
			//vetor[5] = in.nextInt();
			//vetor[6] = in.nextInt();
			//vetor[7] = in.nextInt();
			//vetor[8] = in.nextInt();
			//vetor[9] = in.nextInt();
		} //terminou de executar... vai para o final do for
		
		
		for (int pos = 0; pos < 10; pos++) {
			
			//int valor = vetor[pos];
			
			for (int j = pos + 1; j < 10; j++) {
				if (vetor[pos] == vetor[j]) {
					System.out.println("Temos o valor " + vetor[pos] + " na posicao " + j);
				}
			}
			
		}
		
	}

}
