package AvII_102;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[10];
		
		// ler/preencher o vetor
		System.out.println("Informe 10 valores:");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		//é o mesmo que
//		vetor[0] = in.nextInt();
//		vetor[1] = in.nextInt();
//		vetor[2] = in.nextInt();
//		vetor[3] = in.nextInt();
//		vetor[4] = in.nextInt();
//		vetor[5] = in.nextInt();
//		vetor[6] = in.nextInt();
//		vetor[7] = in.nextInt();
//		vetor[8] = in.nextInt();
//		vetor[9] = in.nextInt();
		
		
		
		//c representa o indice no vetor do valor a ser comparado
		for (int c = 0; c < 10; c++) {
			
			int valorBuscado = vetor[c];
		
			for (int outrasPos = c + 1; outrasPos < 10; outrasPos++) {
				
				if (valorBuscado == vetor[outrasPos]) {
					System.out.println(valorBuscado);
				}
				
			}
			
		}
		

	}

}
